package ru.dzmakats.springmvcdemoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Controller
@RequestMapping("/prepare")
public class PrepareController {

    @GetMapping
    public String prepare(){
        return "prepare";
    }

    @PostMapping
    public String makeOrder(){
        return "";
    }
}
