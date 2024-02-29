package ru.dzmakats.springmvcdemoapp.entity;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.dzmakats.springmvcdemoapp.repository.IngredientsRepository;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Component
@RequiredArgsConstructor
public class IngredientConverter implements Converter<String, Ingredient> {
    private final IngredientsRepository ingredientsRepository;

    @Override
    public Ingredient convert(@NonNull String source) {
        return ingredientsRepository.findById(source);
    }
}
