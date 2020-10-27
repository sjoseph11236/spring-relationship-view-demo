package com.wozu.day17.Controller;

import com.wozu.day17.Models.Library;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {


    /* I want to have a method that will
    * render a message using a thymeleaf template
    */
//    @GetMapping
//    public String message(Model model) {
//        model.addAttribute("message", "Hello world");
//        return "index";
//    }

//    @GetMapping("/library")
//    public String getOneLibrary(Model model){
//        model.addAttribute("library", new Library("Hartford Public"));
//        return "index";
//    }


}
