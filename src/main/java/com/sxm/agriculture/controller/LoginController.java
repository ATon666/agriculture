package com.sxm.agriculture.controller;

import com.sxm.agriculture.entity.User;
import com.sxm.agriculture.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/29 22:58
 * @description 专门用来登录用的Controller
 */

@Controller
public class LoginController {

    @Autowired(required = false)
    private LoginMapper loginMapper;


    @GetMapping("/submit")
    public String login(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password,
            Map<String, Object> model, HttpSession session) {
        User user = null;
        boolean a = true;
        try {
            user = loginMapper.getUserByName(username);
            if (password.equals(user.getPassword())) {
                System.out.println(1);
                session.setAttribute("loginUser", username);

            } else {
                a = false;
                return "login";
            }
        } catch (NullPointerException e) {
            System.out.println("ssss");
            a = false;
        }

        if (a) {
            return "redirect:/main.html";
        } else {
            return "login";
        }

    }
}
