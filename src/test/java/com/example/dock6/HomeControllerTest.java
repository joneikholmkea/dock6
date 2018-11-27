package com.example.dock6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControllerTest {


    MockMvc mockMvc;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();

    }

    @Test
    public void index() throws Exception{
        mockMvc.perform(get("/"))
                .andExpect(view().name("index4"))
                .andExpect(status().isOk());
    }

//    @Test
//    public void page2() throws Exception{ // this gives "Circular view path" error
//        mockMvc.perform(get("/page2"))
//                .andExpect(view().name("page2"))
//                .andExpect(status().isOk());
//    }
}