package com.example.digestcare;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
    @RequestMapping("/first")
    public String showFirstStep(){
        return "pages/stepOne";
    }
    @RequestMapping("/second")
    public String showSecondStep(){
        return "pages/stepTwo";
    }
    @RequestMapping("/third")
    public String showThirdStep(){
        return "pages/stepThree";
    }
    @RequestMapping("/video")
    public String showVideo(){
        return "redirect:https://www.youtube.com/watch?v=dwPW3hi5O8w&list=LLk-1SeX4TZAPNXv07ebplrw&index=15&t=5s&ab_channel=WonderLife";
    }
}
