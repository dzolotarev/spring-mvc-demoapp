package ru.dzmakats.springmvcdemoapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.dzmakats.springmvcdemoapp.entity.Ingredient;
import ru.dzmakats.springmvcdemoapp.entity.Order;
import ru.dzmakats.springmvcdemoapp.entity.Shawarma;
import ru.dzmakats.springmvcdemoapp.entity.Type;
import ru.dzmakats.springmvcdemoapp.repository.IngredientsRepository;

import java.util.List;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Controller
@RequestMapping("/prepare")
@RequiredArgsConstructor
@SessionAttributes("order")
public class PrepareController {

    private final IngredientsRepository ingredientsRepository;

    @ModelAttribute
    public void addIngredients(Model model) {
        Type[] values = Type.values();
        for (Type value : values) {
            List<Ingredient> ingredients = ingredientsRepository.findAll().stream()
                    .filter(ingredient -> ingredient.getType().equals(value))
                    .toList();
            model.addAttribute(value.toString(), ingredients);
        }
    }

    @ModelAttribute("shawarma")
    public Shawarma shawarma() {
        return new Shawarma();
    }

    @ModelAttribute("order")
    public Order order() {
        return new Order();
    }


    @GetMapping
    public String prepare() {
        return "prepare";
    }

    @PostMapping
    public String makeOrder(Shawarma shawarma,
                            @ModelAttribute Order order) {
        order.addShawarma(shawarma);

        System.out.println(shawarma);
        System.out.println(order);

         return "redirect:/order";
    }
}
