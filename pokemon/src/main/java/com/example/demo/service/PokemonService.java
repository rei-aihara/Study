package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.PokemonEntity;

@Service
public class PokemonService {

    private List<PokemonEntity> list = new ArrayList<>();

    // 一覧取得
    public List<PokemonEntity> getList() {
        return list;
    }

    // 登録
    public void add(PokemonEntity pokemon) {
        list.add(pokemon);
    }
}