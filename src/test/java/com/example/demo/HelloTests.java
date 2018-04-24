/*
 * Project: demo
 * 
 * File Created at 2018年4月23日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.example.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.HelloWorldController;

/**
 * @Type HelloTests.java
 * @Desc 
 * @author huang
 * @date 2018年4月23日 下午5:01:17
 * @version 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {
    private MockMvc mvc;
    
    @Before
    public void setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }
    
    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().string(equalTo("Hello World")));
    }

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018年4月23日 huang creat
 */