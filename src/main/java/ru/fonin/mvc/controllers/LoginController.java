package ru.fonin.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(path="/login", method = RequestMethod.POST)
    public ModelAndView authorization(ModelMap modelMap, HttpServletRequest request){

        ModelAndView modelAndView= new ModelAndView("/jsp/auth.ftl");
        if (request.getParameterMap().containsKey("error")){
            modelAndView.addObject("error",true);
        }

        return modelAndView;
    }

//    @GetMapping(path="/hello")
//    public String authorization(ModelMap modelMap, HttpServletRequest request){
//
//        return "hello";
//    }
}
