package ru.dzmakats.springmvcdemoapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dzmakats.springmvcdemoapp.entity.Ingredient;
import ru.dzmakats.springmvcdemoapp.repository.IngredientsRepository;

import java.util.List;

/**
 * Created by Denis Zolotarev on 04.03.2024
 */

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/ingredients", produces = "application/json")
public class PrepareRestController {

    private final IngredientsRepository ingredientsRepository;

    @GetMapping("/{id}")
    public Ingredient getIngredient(@PathVariable("id") String id) {
        return ingredientsRepository.findById(id);
    }

    @GetMapping
    public List<Ingredient> getIngredients() {
        return ingredientsRepository.findAll();
    }
}
