package com.example.dock6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    //@ResponseBody
    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }
}
