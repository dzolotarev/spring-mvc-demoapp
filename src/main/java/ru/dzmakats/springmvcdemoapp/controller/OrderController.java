package ru.dzmakats.springmvcdemoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.dzmakats.springmvcdemoapp.entity.Order;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Controller
@RequestMapping("/order")
@SessionAttributes("order")
public class OrderController {

    @GetMapping
    public String showForm() {
        return "order";
    }

    @PostMapping
    public String makeOrder(Order order) {
        System.out.println(order);
        return "redirect:/index";
    }
}
