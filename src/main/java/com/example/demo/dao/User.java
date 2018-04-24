/*
 * Project: demo
 * 
 * File Created at 2018年4月24日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.example.demo.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @Type User.java
 * @Desc 
 * @author huang
 * @date 2018年4月24日 上午11:07:24
 * @version 
 */
@Entity
public class User implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018年4月24日 huang creat
 */