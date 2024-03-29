package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(ChuckController.CHUCK)
public class ChuckController {
    public static final String CHUCK = "/chuck";
    @Autowired
    NBAService greetingService;
    @GetMapping
    public String getChuckQuote(Model model){
        ChuckQuote.Dada q = greetingService.getChuckQuote();
        model.addAttribute("nba", q.data());
        return "chuck";
    }
}