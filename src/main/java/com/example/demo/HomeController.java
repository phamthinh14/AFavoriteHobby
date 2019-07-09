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

    @RequestMapping("/dota1")
    public String dota1Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Dota1";
    }

    @RequestMapping("/dota2")
    public String dota2Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Dota2";
    }

    @RequestMapping("/achievement")
    public String achievementPage() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Achievement";
    }

    @RequestMapping("/contact")
    public String contactPage() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Contact";
    }
}
