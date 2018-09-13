package com.auto.controller;

import com.auto.common.CommonResponse;
import com.auto.common.Page;

import com.auto.service.ThirdTestBy1Service;
import com.auto.domain. ThirdTestBy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 第三次测试表的Controller实现
 * User: 大胖子
 * DateTime: 2018/9/6 15:28
 **/
@Controller
@RequestMapping("/thirdTestBy1")
public class ThirdTestBy1Controller {

    @Autowired
    private ThirdTestBy1Service thirdTestBy1Service;

    @RequestMapping(value = "/thirdTestBy1View", method = RequestMethod.GET)
    public String thirdTestBy1View(Model model, HttpServletResponse response) {
        return "thirdTestBy1View";
    }

    /**
    * 查询所有第三次测试表
    * @param model
    * @param response
    * @return 第三次测试表结果
    */
    @ResponseBody
    @RequestMapping(value = "/queryThirdTestBy1", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse queryThirdTestBy1(Model model, HttpServletResponse response) {
        CommonResponse<List<ThirdTestBy1>> commonResponse = new CommonResponse<List<ThirdTestBy1>>();
        try {
            ThirdTestBy1 query = new ThirdTestBy1();
            List<ThirdTestBy1> thirdTestBy1List = thirdTestBy1Service.select(query);
            commonResponse.setData(thirdTestBy1List);
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
    @RequestMapping(value = "/findThirdTestBy1", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse findThirdTestBy1(Model model, HttpServletResponse response) {
        CommonResponse<Page<ThirdTestBy1>> commonResponse = new CommonResponse<Page<ThirdTestBy1>>();
        try {
            ThirdTestBy1 query = new ThirdTestBy1();
            Page<ThirdTestBy1> thirdTestBy1Page = thirdTestBy1Service.findThirdTestBy1Page(query);
            commonResponse.setData(thirdTestBy1Page);
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
    @RequestMapping(value = "/delThirdTestBy1", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse delThirdTestBy1(HttpServletRequest request) {
        CommonResponse<ThirdTestBy1> commonResponse = new CommonResponse<ThirdTestBy1>();
        try {
            ThirdTestBy1 thirdTestBy1 = new ThirdTestBy1();
            thirdTestBy1.setThirdid(Integer.valueOf(request.getParameter("thirdid")));
            thirdTestBy1Service.deleteByID(thirdTestBy1);
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
    @RequestMapping(value = "/showInsThirdTestBy1View", method = {RequestMethod.GET,RequestMethod.POST})
    public String showInsThirdTestBy1View(Model model, HttpServletResponse response) {
        return "thirdTestBy1ViewIns";
    }

    /**
    * 添加第三次测试表
    * @param request
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "/insertThirdTestBy1", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse insertThirdTestBy1(HttpServletRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        ThirdTestBy1 thirdTestBy1 = new ThirdTestBy1();
        try {
            thirdTestBy1.setTaTestNBA0(request.getParameter("thirdTestBy1[taTestNBA0]"));
            thirdTestBy1.setTaTestNBA1(request.getParameter("thirdTestBy1[taTestNBA1]"));
            thirdTestBy1.setTaTestNBA2(request.getParameter("thirdTestBy1[taTestNBA2]"));
            thirdTestBy1.setTaTestNBA3(request.getParameter("thirdTestBy1[taTestNBA3]"));
            thirdTestBy1.setTaTestNBA4(request.getParameter("thirdTestBy1[taTestNBA4]"));
            thirdTestBy1Service.insert(thirdTestBy1);
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
    @RequestMapping(value = "/showModThirdTestBy1View", method = {RequestMethod.GET,RequestMethod.POST})
    public String modThirdTestBy1(Model model, HttpServletResponse response,Integer id) {
        ThirdTestBy1 thirdTestBy1 = new ThirdTestBy1();
        thirdTestBy1.setThirdid(id);
        try {
            List<ThirdTestBy1> thirdTestBy1List = thirdTestBy1Service.select(thirdTestBy1);
            if(thirdTestBy1List!=null&&thirdTestBy1List.size()>0){
                thirdTestBy1 = thirdTestBy1List.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("thirdTestBy1",thirdTestBy1);
        return "thirdTestBy1ViewMod";
    }

    /**
    * 修改第三次测试表
    * @param request
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "/modifyThirdTestBy1", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse modifyThirdTestBy1(HttpServletRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        ThirdTestBy1 thirdTestBy1 = new ThirdTestBy1();
        try {
            thirdTestBy1.setThirdid(Integer.valueOf(request.getParameter("thirdid")));
                    thirdTestBy1.setTaTestNBA0(request.getParameter("thirdTestBy1[taTestNBA0]"));
                    thirdTestBy1.setTaTestNBA1(request.getParameter("thirdTestBy1[taTestNBA1]"));
                    thirdTestBy1.setTaTestNBA2(request.getParameter("thirdTestBy1[taTestNBA2]"));
                    thirdTestBy1.setTaTestNBA3(request.getParameter("thirdTestBy1[taTestNBA3]"));
                    thirdTestBy1.setTaTestNBA4(request.getParameter("thirdTestBy1[taTestNBA4]"));
                    thirdTestBy1Service.updateByID(thirdTestBy1);
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