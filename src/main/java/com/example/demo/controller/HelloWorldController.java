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
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Type HelloWorldController.java
 * @Desc 
 * @author huang
 * @date 2018年4月23日 下午4:54:44
 * @version 
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
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