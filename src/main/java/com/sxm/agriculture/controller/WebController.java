package com.sxm.agriculture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/29 15:33
 * @description 用来返回网页的Controller
 */

@Controller
public class WebController {

    @GetMapping(value = "/main")
    public String index() {
        return "dashboard";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }
}
