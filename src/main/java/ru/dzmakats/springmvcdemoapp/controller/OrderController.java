package ru.dzmakats.springmvcdemoapp.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import ru.dzmakats.springmvcdemoapp.entity.Order;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Slf4j
@Controller
@RequestMapping("/order")
@SessionAttributes("order")
public class OrderController {

    @GetMapping
    public String showForm(HttpSession session) {
        log.info("Show order from session: {}", session.getAttribute("order"));
        return "order";
    }

    @PostMapping
    public String makeOrder(Order order, SessionStatus sessionStatus) {
        log.info("Make order: {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
