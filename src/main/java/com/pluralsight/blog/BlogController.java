package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {


    @RequestMapping(value = "/")
    public String listPosts(ModelMap modelMap) {
        modelMap.put("title","Blog post1");
        return "home";
    }
}
