package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testAction {

    @RequestMapping(value="test")
    public String test(Model model){
        model.addAttribute("id", 1);
        model.addAttribute("name", "지용호");
        model.addAttribute("nickname","지돌스타");
        model.addAttribute("photo", "images/test.jpg");
        return "test1";
    }
}
