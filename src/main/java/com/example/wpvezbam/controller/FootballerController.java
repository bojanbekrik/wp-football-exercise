package com.example.wpvezbam.controller;

import org.springframework.ui.Model;
import com.example.wpvezbam.entity.Footballer;
import com.example.wpvezbam.service.FootballerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FootballerController {

    private final FootballerService footballerService;

    public FootballerController(FootballerService footballerService) {
        this.footballerService = footballerService;
    }

    @GetMapping("/home")
    public ModelAndView home () {
        List<Footballer> footballers = footballerService.getAll();
        return new ModelAndView("home","footballers",footballers);
    }

    @GetMapping("/register")
    public String register () {
        return "register";
    }

    @PostMapping("/save")
    public String addFootballer(String name) {
        Footballer f = new Footballer();
        f.setName(name);
        footballerService.save(f);
        return "redirect:/home";
    }

    @PostMapping("/edit")
    public String editFootballer(String name, Long id) {
        Footballer f = footballerService.getFootballerById(id);
        f.setName(name);
        footballerService.save(f);
        return "redirect:/home";
    }

    @RequestMapping("/deleteFootballer/{id}")
    public String deleteFootballer(@PathVariable("id") Long id) {
        footballerService.deleteById(id);
        return "redirect:/home";
    }

    @RequestMapping("/editFootballer/{id}")
    public String editFootballer(@PathVariable("id") Long id, Model model) {
        Footballer f = footballerService.getFootballerById(id);
        model.addAttribute("footballer",f);
        return "edit";
    }

}
