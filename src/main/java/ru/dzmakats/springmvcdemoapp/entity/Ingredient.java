package ru.dzmakats.springmvcdemoapp.entity;

import lombok.Data;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Data
public class Ingredient {
    private String id;
    private String name;
    private Type type;
}
