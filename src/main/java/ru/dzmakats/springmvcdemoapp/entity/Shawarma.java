package ru.dzmakats.springmvcdemoapp.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Data
public class Shawarma {
    private String name;
    private List<Ingredient> ingredients;
}
