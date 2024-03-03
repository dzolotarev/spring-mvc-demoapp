package ru.dzmakats.springmvcdemoapp.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Data
public class Shawarma {

    @NotNull
    @Size(min = 3, message = "Имя должно содержать минимум три символа")
    private String name;

    @NotNull
    @Size(min = 2, message = "Необходимо выбрать минимум два ингредиента")
    private List<Ingredient> ingredients;
}
