package com.wozu.day17.Controller;

import com.wozu.day17.Models.Library;
import com.wozu.day17.Service.LibraryService;
import com.wozu.day17.Service.LibraryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {

    private LibraryService libraryService;

    public LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }


    //get all libraries
    @GetMapping("/library")
    public String getAll(Model model){
        model.addAttribute("libraries", libraryService.getAll());
        return "index";
    }

}
