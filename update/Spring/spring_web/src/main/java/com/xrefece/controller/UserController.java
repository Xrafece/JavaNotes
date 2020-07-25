package com.xrefece.controller;

import com.xrefece.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xrafece
 */
@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("a")
    public void helloWorld() {
        System.out.println("sss");
        userServiceImpl.listAllUser();
    }
}
