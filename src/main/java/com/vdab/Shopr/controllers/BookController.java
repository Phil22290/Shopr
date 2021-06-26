package com.vdab.Shopr.controllers;


import com.vdab.Shopr.services.BookSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    
    @Autowired
    private BookSvc bookSvc;
    
    @GetMapping("/showFictionBooks")
    public String showFictionBooks(Model model){
        model.addAttribute("showFictionBooks", bookSvc.showFictionBooks());
        return "showFictionBooks";
    }
    
//    @GetMapping("/")
//    public String showNonFictionBooks(Model model){
//        model.addAttribute("showNonFictionBooks", bookSvc.showNonFictionBooks());
//        return "shownonfictionbooks";
//    }
    
}
