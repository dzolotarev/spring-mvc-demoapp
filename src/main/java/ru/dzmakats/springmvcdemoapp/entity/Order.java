package ru.dzmakats.springmvcdemoapp.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */

@Data
public class Order {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Shawarma> shawarmaList = new ArrayList<>();

    public void addShawarma(Shawarma shawarma) {
        shawarmaList.add(shawarma);
    }

}
