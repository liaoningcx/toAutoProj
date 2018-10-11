package com.auto.controller;

import com.alibaba.fastjson.JSON;
import com.auto.common.CommonResponse;
import com.auto.common.Page;

import com.auto.service.ThirdTestBy0Service;
import com.auto.domain. ThirdTestBy0;

import com.google.gson.Gson;
import net.sf.json.util.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 第三次测试表的Controller实现
 * User: 大胖子
 * DateTime: 2018/9/6 15:28
 **/
@Controller
@RequestMapping("/thirdTestBy0")
public class ThirdTestBy0Controller {

    @Autowired
    private ThirdTestBy0Service thirdTestBy0Service;

    @RequestMapping(value = "/thirdTestBy0View", method = RequestMethod.GET)
    public String thirdTestBy0View(Model model, HttpServletResponse response) {
        return "thirdTestBy0View";
    }

    /**
     * 查询所有第三次测试表
     * @param model
     * @param response
     * @return 第三次测试表结果
     */
    @ResponseBody
    @RequestMapping(value = "/testEasyuidg", method = {RequestMethod.GET,RequestMethod.POST})
    public String testEasyuidg(Model model, HttpServletResponse response) {
        System.out.println("76885685865");
//        return "{'total':28,'rows':[{'productid':'FI-SW-01','productname':'Koi','unitcost':10.00,'status':'P','listprice':36.50,'attr1':'Large','itemid':'EST-1'},{'productid':'K9-DL-01','productname':'Dalmation','unitcost':12.00,'status':'P','listprice':18.50,'attr1':'Spotted Adult Female','itemid':'EST-10'},{'productid':'RP-SN-01','productname':'Rattlesnake','unitcost':12.00,'status':'P','listprice':38.50,'attr1':'Venomless','itemid':'EST-11'},{'productid':'RP-SN-01','productname':'Rattlesnake','unitcost':12.00,'status':'P','listprice':26.50,'attr1':'Rattleless','itemid':'EST-12'},{'productid':'RP-LI-02','productname':'Iguana','unitcost':12.00,'status':'P','listprice':35.50,'attr1':'Green Adult','itemid':'EST-13'},{'productid':'FL-DSH-01','productname':'Manx','unitcost':12.00,'status':'P','listprice':158.50,'attr1':'Tailless','itemid':'EST-14'},{'productid':'FL-DSH-01','productname':'Manx','unitcost':12.00,'status':'P','listprice':83.50,'attr1':'With tail','itemid':'EST-15'},{'productid':'FL-DLH-02','productname':'Persian','unitcost':12.00,'status':'P','listprice':23.50,'attr1':'Adult Female','itemid':'EST-16'},{'productid':'FL-DLH-02','productname':'Persian','unitcost':12.00,'status':'P','listprice':89.50,'attr1':'Adult Male','itemid':'EST-17'},{'productid':'AV-CB-01','productname':'Amazon Parrot','unitcost':92.00,'status':'P','listprice':63.50,'attr1':'Adult Male','itemid':'EST-18'}]}".trim();
//        return "{\"total\":28,\"rows\":[{\"productid\":\"FI-SW-01\",\"productname\":\"Koi\",\"unitcost\":10.00,\"status\":\"P\",\"listprice\":36.50,\"attr1\":\"Large\",\"itemid\":\"EST-1\"}]}";
        List<Map<String, Object>> rows= new ArrayList<Map<String, Object>>();
        for (int i=0;i<5;i++){
            Map<String, Object> eachmap = new HashMap<String, Object>();
            eachmap.put("itemid","itemid"+String.valueOf(i));
            eachmap.put("productid","productid"+String.valueOf(i));
            eachmap.put("listprice","listprice"+String.valueOf(i));
            eachmap.put("unitcost","unitcost"+String.valueOf(i));
            eachmap.put("attr1","attr1"+String.valueOf(i));
            eachmap.put("status","status"+String.valueOf(i));
            rows.add(eachmap);
        }
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("total", 22);
        map.put("rows", rows);
        return JSON.toJSONString(map);
    }

    /**
    * 查询所有第三次测试表
    * @param model
    * @param response
    * @return 第三次测试表结果
    */
    @ResponseBody
    @RequestMapping(value = "/queryThirdTestBy0", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse queryThirdTestBy0(Model model,ThirdTestBy0 thirdTestBy0, HttpServletResponse response) {
        CommonResponse<List<ThirdTestBy0>> commonResponse = new CommonResponse<List<ThirdTestBy0>>();
        try {
            ThirdTestBy0 query = new ThirdTestBy0();
//            List<ThirdTestBy0> thirdTestBy0List = thirdTestBy0Service.select(query);
            List<ThirdTestBy0> thirdTestBy0List = new ArrayList<ThirdTestBy0>();
            for(int i=0;i<6;i++){
                ThirdTestBy0 thirdTestBy0Entiries = new ThirdTestBy0();
                thirdTestBy0Entiries.setTaTestNBA0("aaa"+i);
                thirdTestBy0Entiries.setTaTestNBA1("fgfgn"+i);
                thirdTestBy0Entiries.setTaTestNBA2("aafhmtya"+i);
                thirdTestBy0Entiries.setTaTestNBA3("tyev"+i);
                thirdTestBy0Entiries.setTaTestNBA4("vnfh"+i);
                thirdTestBy0List.add(thirdTestBy0Entiries);
            }
            commonResponse.setData(thirdTestBy0List);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return commonResponse;
    }

    /**
    * 分页查询第三次测试表
    * @param model
    * @param response
    * @return 第三次测试表结果
    */
    @ResponseBody
    @RequestMapping(value = "/findThirdTestBy0", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse findThirdTestBy0(Model model, HttpServletResponse response) {
        CommonResponse<Page<ThirdTestBy0>> commonResponse = new CommonResponse<Page<ThirdTestBy0>>();
        try {
            ThirdTestBy0 query = new ThirdTestBy0();
            Page<ThirdTestBy0> thirdTestBy0Page = thirdTestBy0Service.findThirdTestBy0Page(query);
            commonResponse.setData(thirdTestBy0Page);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return commonResponse;
    }

    /**
    * 删除第三次测试表
    * @param request
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "/delThirdTestBy0", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse delThirdTestBy0(HttpServletRequest request) {
        CommonResponse<ThirdTestBy0> commonResponse = new CommonResponse<ThirdTestBy0>();
        try {
            ThirdTestBy0 thirdTestBy0 = new ThirdTestBy0();
            thirdTestBy0.setThirdid(Integer.valueOf(request.getParameter("thirdid")));
            thirdTestBy0Service.deleteByID(thirdTestBy0);
            commonResponse.setCode(CommonResponse.CODE_OK);
            commonResponse.setMessage(CommonResponse.MESSAGE_OK);
        }catch (Exception ex){
            commonResponse.setCode(CommonResponse.CODE_FAILED);
            commonResponse.setMessage(CommonResponse.MESSAGE_FAILED);
            ex.printStackTrace();
        }
        return commonResponse;
    }

    /**
    * 显示添加第三次测试表页面
    * @param model
    * @param response
    * @return
    */
    @RequestMapping(value = "/showInsThirdTestBy0View", method = {RequestMethod.GET,RequestMethod.POST})
    public String showInsThirdTestBy0View(Model model, HttpServletResponse response) {
        return "thirdTestBy0ViewIns";
    }

    /**
    * 添加第三次测试表
    * @param request
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "/insertThirdTestBy0", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse insertThirdTestBy0(HttpServletRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        ThirdTestBy0 thirdTestBy0 = new ThirdTestBy0();
        try {
            thirdTestBy0.setTaTestNBA0(request.getParameter("thirdTestBy0[taTestNBA0]"));
            thirdTestBy0.setTaTestNBA1(request.getParameter("thirdTestBy0[taTestNBA1]"));
            thirdTestBy0.setTaTestNBA2(request.getParameter("thirdTestBy0[taTestNBA2]"));
            thirdTestBy0.setTaTestNBA3(request.getParameter("thirdTestBy0[taTestNBA3]"));
            thirdTestBy0.setTaTestNBA4(request.getParameter("thirdTestBy0[taTestNBA4]"));
            thirdTestBy0Service.insert(thirdTestBy0);
            commonResponse.setCode(CommonResponse.CODE_OK);
            commonResponse.setMessage(CommonResponse.MESSAGE_OK);
        } catch (Exception e) {
            commonResponse.setCode(CommonResponse.CODE_EXCEPTION);
            commonResponse.setMessage(CommonResponse.MESSAGE_EXCEPTION);
            e.printStackTrace();
        }
        return commonResponse;
    }

    /**
    * 显示修改第三次测试表页面
    * @param model
    * @param response
    * @param id
    * @return
    */
    @RequestMapping(value = "/showModThirdTestBy0View", method = {RequestMethod.GET,RequestMethod.POST})
    public String modThirdTestBy0(Model model, HttpServletResponse response,Integer id) {
        ThirdTestBy0 thirdTestBy0 = new ThirdTestBy0();
        thirdTestBy0.setThirdid(id);
        try {
            List<ThirdTestBy0> thirdTestBy0List = thirdTestBy0Service.select(thirdTestBy0);
            if(thirdTestBy0List!=null&&thirdTestBy0List.size()>0){
                thirdTestBy0 = thirdTestBy0List.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("thirdTestBy0",thirdTestBy0);
        return "thirdTestBy0ViewMod";
    }

    /**
    * 修改第三次测试表
    * @param request
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "/modifyThirdTestBy0", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse modifyThirdTestBy0(HttpServletRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        ThirdTestBy0 thirdTestBy0 = new ThirdTestBy0();
        try {
            thirdTestBy0.setThirdid(Integer.valueOf(request.getParameter("thirdid")));
                    thirdTestBy0.setTaTestNBA0(request.getParameter("thirdTestBy0[taTestNBA0]"));
                    thirdTestBy0.setTaTestNBA1(request.getParameter("thirdTestBy0[taTestNBA1]"));
                    thirdTestBy0.setTaTestNBA2(request.getParameter("thirdTestBy0[taTestNBA2]"));
                    thirdTestBy0.setTaTestNBA3(request.getParameter("thirdTestBy0[taTestNBA3]"));
                    thirdTestBy0.setTaTestNBA4(request.getParameter("thirdTestBy0[taTestNBA4]"));
                    thirdTestBy0Service.updateByID(thirdTestBy0);
            commonResponse.setCode(CommonResponse.CODE_OK);
            commonResponse.setMessage(CommonResponse.MESSAGE_OK);
        } catch (Exception e) {
            commonResponse.setCode(CommonResponse.CODE_EXCEPTION);
            commonResponse.setMessage(CommonResponse.MESSAGE_EXCEPTION);
            e.printStackTrace();
        }
        return commonResponse;
    }

}