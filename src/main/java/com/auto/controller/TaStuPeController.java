package com.auto.controller;

import com.auto.common.CommonResponse;
import com.auto.common.Page;

import com.auto.domain.TaStuPePageQueryCondition;
import com.auto.service.TaStuPeService;
import com.auto.domain. TaStuPe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试看看2020的Controller实现
 * User: 大胖子
 * DateTime: Thu Apr 30 07:58:28 CST 2020
 **/
@Controller
@RequestMapping("/taStuPe")
public class TaStuPeController {

    @Autowired
    private TaStuPeService taStuPeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model, HttpServletResponse response) {
        model.addAttribute("testAttr", "测试属性");
        return "TestBootStrap";
    }

    @RequestMapping(value = "/TestBootStrapEn", method = RequestMethod.GET)
    public String TestBootStrapEn(Model model, HttpServletResponse response) {
        model.addAttribute("testAttr", "测试属性");
        return "TestBootStrapEn";
    }

    @RequestMapping(value = "/taStuPeView", method = RequestMethod.GET)
    public String taStuPeView(Model model, HttpServletResponse response) {
        return "taStuPeView";
    }

    /**
    * 查询所有测试看看2020
    * @param model
    * @param response
    * @return 测试看看2020结果
    */
    @ResponseBody
    @RequestMapping(value = "/queryTaStuPe", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse queryTaStuPe(Model model, HttpServletResponse response) {
        CommonResponse<List<TaStuPe>> commonResponse = new CommonResponse<List<TaStuPe>>();
        try {
            TaStuPe query = new TaStuPe();
            List<TaStuPe> taStuPeList = taStuPeService.select(query);
            commonResponse.setData(taStuPeList);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return commonResponse;
    }

    /**
     * 分页查询测试看看2020
     * @param model
     * @param response
     * @return 测试看看2020结果
     */
    @ResponseBody
    @RequestMapping(value = "/findTaStuPe", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse findTaStuPe(HttpServletResponse response,Model model, @RequestBody TaStuPePageQueryCondition taStuPePageCondition) {
        CommonResponse<Page<TaStuPe>> commonResponse = new CommonResponse<Page<TaStuPe>>();
        try {
            Page<TaStuPe> taStuPePage = taStuPeService.findTaStuPePage(taStuPePageCondition);
            commonResponse.setData(taStuPePage);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return commonResponse;
    }

    /**
     * test bootstrap paging
     */
    @ResponseBody
    @RequestMapping(value = "/findTaStuPePage", method = {RequestMethod.GET,RequestMethod.POST})
    public Page<TaStuPe> findTaStuPePage(HttpServletResponse response,Model model, @RequestBody TaStuPePageQueryCondition taStuPePageCondition) {
        Page<TaStuPe> taStuPePage = null;
        try {
            taStuPePage = taStuPeService.findTaStuPePage(taStuPePageCondition);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return taStuPePage;
    }


    /**
     * test bootstrap paging
     */
    @ResponseBody
    @RequestMapping(value = "/findTaStuPePageServe", method = {RequestMethod.GET,RequestMethod.POST})
    public Map<String, Object> findTaStuPePageServe(HttpServletResponse response, Model model, @RequestBody TaStuPePageQueryCondition taStuPePageCondition) {
        Map<String, Object> resultmap = new HashMap<String, Object>();
        Page<TaStuPe> taStuPePage = null;
        try {
            taStuPePageCondition.setOffset((taStuPePageCondition.getPage()-1)*taStuPePageCondition.getPageSize());
            taStuPePage = taStuPeService.findTaStuPePage(taStuPePageCondition);
            resultmap.put("total", taStuPePage.getTotalRowCount());
            resultmap.put("data", taStuPePage.getResult());
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return resultmap;
    }

    /**
    * 删除测试看看2020
    * @param request
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "/delTaStuPeByVID", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse delTaStuPeByVID(HttpServletRequest request) {
        CommonResponse<TaStuPe> commonResponse = new CommonResponse<TaStuPe>();
        try {
            String VID = (String)request.getParameter("VID");
            taStuPeService.deleteByID(VID);
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
    * 显示添加测试看看2020页面
    * @param model
    * @param response
    * @return
    */
    @RequestMapping(value = "/showInsTaStuPeView", method = {RequestMethod.GET,RequestMethod.POST})
    public String showInsTaStuPeView(Model model, HttpServletResponse response) {
        return "taStuPeViewIns";
    }

    /**
    * 添加测试看看2020
    * @param request
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "/insertTaStuPe", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse insertTaStuPe(HttpServletRequest request,@RequestBody TaStuPe tttt) {
        System.out.println("111111111111111111");
        CommonResponse commonResponse = new CommonResponse();
        TaStuPe taStuPe = (TaStuPe)request.getAttribute("taStuPe");
        if(tttt!=null){
            System.out.println(tttt.getTaTestNBA0());
        }
        try {
            taStuPeService.insert(tttt);
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
    * 显示修改测试看看2020页面
    * @param model
    * @param response
    * @param id
    * @return
    */
    @RequestMapping(value = "/showModTaStuPeView", method = {RequestMethod.GET,RequestMethod.POST})
    public String modTaStuPe(Model model, HttpServletResponse response,String id) {
        TaStuPe taStuPe = new TaStuPe();
        taStuPe.setVID(id);
        try {
            List<TaStuPe> taStuPeList = taStuPeService.select(taStuPe);
            if(taStuPeList!=null&&taStuPeList.size()>0){
                taStuPe = taStuPeList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("taStuPe",taStuPe);
        return "taStuPeViewMod";
    }

    /**
    * 修改测试看看2020
    * @param request
    * @return
    */
    @ResponseBody
    @RequestMapping(value = "/modifyTaStuPe", method = {RequestMethod.GET,RequestMethod.POST})
    public CommonResponse modifyTaStuPe(HttpServletRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        TaStuPe taStuPe = new TaStuPe();
        try {
            taStuPe.setVID(request.getParameter("VID"));
                    taStuPe.setTaTestNBA0(request.getParameter("taStuPe[TaTestNBA0]"));
                    taStuPe.setTaTestNBA1(request.getParameter("taStuPe[TaTestNBA1]"));
                    taStuPe.setTaTestNBA2(request.getParameter("taStuPe[TaTestNBA2]"));
                    taStuPe.setTaTestNBA3(request.getParameter("taStuPe[TaTestNBA3]"));
                    taStuPe.setTaTestNBA4(request.getParameter("taStuPe[TaTestNBA4]"));
                    taStuPeService.updateByID(taStuPe);
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