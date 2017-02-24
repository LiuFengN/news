package com.ibeifeng.News.controller;

import com.ibeifeng.News.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/24.
 */
@Controller
public class admincontroller {
    @Autowired
    private IAdminService adminService;
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
}
