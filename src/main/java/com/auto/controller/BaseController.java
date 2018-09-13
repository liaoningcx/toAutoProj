package com.auto.controller;

import com.auto.common.CommonResponse;
import com.auto.common.Page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 的Controller实现
 * User: 
 * DateTime: 
 **/
@Controller
@RequestMapping("/")
public class BaseController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model, HttpServletResponse response) {
        return "index";
    }

}