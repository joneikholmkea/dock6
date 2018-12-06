package com.example.dock6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    //@ResponseBody
    //@RequestMapping(value = "/")
    public String index(){

        return "index";
    }

    @RequestMapping(value = "/page2")
    public String page2(){

        return "page2";
    }

    @RequestMapping("/")
    public ModelAndView getIndex(){
        return new ModelAndView("index");
    }
}
