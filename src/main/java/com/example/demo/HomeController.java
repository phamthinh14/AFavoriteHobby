package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Home";
    }

    @RequestMapping("/history")
    public String historyPage() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "HistoryPage";
    }
}
