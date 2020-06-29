
package com.sxm.agriculture.config;


import com.sxm.agriculture.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("index.html").setViewName("login");
//        registry.addViewController("main.html").setViewName("dashboard");
    }

    //不拦截的请求
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/dashboard.html", "/", "/login.html", "/webjars/**", "/asserts/**", "/css", "/images", "/img", "/js" );
    }
}

