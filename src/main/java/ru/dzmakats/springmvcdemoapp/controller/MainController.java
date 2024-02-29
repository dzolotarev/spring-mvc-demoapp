package ru.dzmakats.springmvcdemoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Controller
public class MainController {

    @GetMapping(" ")
    public String index() {
        return "index";
    }
}
