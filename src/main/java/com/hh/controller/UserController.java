package com.hh.controller;

import com.hh.pojo.Users;
import com.hh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public ModelAndView login(Users users){
        System.out.println(users);
        ModelAndView mv=new ModelAndView("/welcome.jsp");
        Users loginuser = userService.login(users);
        System.out.println(loginuser);
        mv.addObject("loginuser",loginuser);
        System.out.println("进入了Contller");
        return mv;
    }

    @RequestMapping("/loginOut")
    public ModelAndView login(HttpSession session,Users users){
        ModelAndView mv=new ModelAndView("/index.jsp");
       session.removeAttribute("users");
       session.invalidate();
       mv.addObject("loginOut","请登陆");
        return mv;
    }

    @RequestMapping("/saleProduct")//销售商品
    public ModelAndView saleProduct(){
        ModelAndView mv=new ModelAndView("saleProduct.jsp");

        return mv;
    }



}
