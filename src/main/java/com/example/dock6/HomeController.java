package com.example.dock6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String index(){
        return "<h2>hello world</h2>";
    }
}
