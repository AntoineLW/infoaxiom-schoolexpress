package com.infoaxiom.schoolexpress.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/Hello")
    public String HelloWorld(Model model){
        logger.info("Hello");
        model.addAttribute("message","Hello World!!!");
        return "HelloWorld";
    }

    public static void main(String[] args) {
        logger.error("111");

    }
}
