package ru.dzmakats.springmvcdemoapp.repository;

import java.util.List;

/**
 * Created by Denis Zolotarev on 29.02.2024
 */
public interface Repo<T> {

    T findById(String id);

    List<T> findAll();

    void save(T t);
}
