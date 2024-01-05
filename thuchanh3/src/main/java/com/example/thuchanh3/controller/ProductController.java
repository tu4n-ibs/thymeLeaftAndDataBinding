package com.example.thuchanh3.controller;

import com.example.thuchanh3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("")
    public ModelAndView showAll(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}
