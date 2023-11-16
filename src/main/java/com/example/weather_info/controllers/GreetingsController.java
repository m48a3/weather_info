package com.example.weather_info.controllers;

import com.example.weather_info.domain.User;
import com.example.weather_info.repos.Users_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GreetingsController {
    private final Users_repo users_repo;

    public GreetingsController(Users_repo users_repo) {
        this.users_repo = users_repo;
    }

    @GetMapping("")
    public String greetingPage(){
        return "greetingPage";
    }
    @GetMapping("/register")
    public String registerPage(@RequestParam String name,
                               @RequestParam String password,
                               @RequestParam String city){
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setCity(city);
        return "registerPage";
    }
    @GetMapping("/admin")
    public String adminPage(Model model){
        List<User> users = (List<User>) users_repo.findAll();
        model.addAttribute("users",users);
        return "adminPage";
    }
}
