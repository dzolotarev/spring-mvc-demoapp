package ru.dzmakats.springmvcdemoapp.repository;

import org.springframework.stereotype.Repository;
import ru.dzmakats.springmvcdemoapp.entity.Ingredient;
import ru.dzmakats.springmvcdemoapp.entity.Type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Repository
public class IngredientsRepository implements Repo<Ingredient> {

    private final List<Ingredient> ingredientList;

    public IngredientsRepository() {
        this.ingredientList = Arrays.asList(
                new Ingredient("lv", "Лаваш", Type.BREAD),
                new Ingredient("bl", "Булочка", Type.BREAD),
                new Ingredient("kr", "Курица", Type.MEAT),
                new Ingredient("gv", "Говядина", Type.MEAT),
                new Ingredient("og", "Огурчики", Type.VEGETABLES),
                new Ingredient("sal", "Салатик", Type.VEGETABLES),
                new Ingredient("cap", "Капустка", Type.VEGETABLES),
                new Ingredient("isl", "1000 островов", Type.SAUCES),
                new Ingredient("kisl", "Кисло-сладкий", Type.SAUCES),
                new Ingredient("che", "Сырный", Type.SAUCES)
        );
    }

    @Override
    public Ingredient findById(String id) {
        return ingredientList.stream()
                .filter(ingredient -> ingredient.getId().equals(id))
                .findFirst().orElseThrow();
    }

    @Override
    public List<Ingredient> findAll() {
        return Collections.unmodifiableList(ingredientList);
    }

    @Override
    public void save(Ingredient ingredient) {

    }
}
