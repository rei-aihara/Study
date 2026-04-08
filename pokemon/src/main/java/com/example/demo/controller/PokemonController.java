package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.PokemonEntity;
import com.example.demo.service.PokemonService;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService service;

    // 一覧表示
    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("list", service.getList());
        return "list";
    }

    // 登録画面
    @GetMapping("/add")
    public String showAdd() {
        return "add";
    }

    // 登録処理
    @PostMapping("/add")
    public String add(PokemonEntity pokemon) {
        service.add(pokemon);
        return "redirect:/";
    }
}