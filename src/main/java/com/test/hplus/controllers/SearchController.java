package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model) {
        System.out.println("in search");
        System.out.println("search param" + search);
        return "search";
    }


}
