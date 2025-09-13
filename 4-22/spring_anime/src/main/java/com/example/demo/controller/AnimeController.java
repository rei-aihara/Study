package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.AnimeRequest;
import com.example.demo.dto.AnimeUpdateRequest;
import com.example.demo.entity.AnimeEntity;
import com.example.demo.service.AnimeService;

/**
 * アニメ情報 Controller
 */
@Controller
public class AnimeController {

  /**
   * アニメ情報 Service
   */
  @Autowired
  AnimeService animeService;

  /**
   * アニメ情報一覧画面を表示
   * @param model Model
   * @return アニメ情報一覧画面のHTML
   */
  @RequestMapping("/anime/list")
  public String animeList(Model model) {
    List<AnimeEntity> animelist = animeService.searchAll();
    model.addAttribute("animelist", animelist);
    return "anime/list";
  }
  

  
  /**
   * アニメ新規登録画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @RequestMapping("/anime/add")
  public String animeRegister(Model model) {
    model.addAttribute("animeRequest", new AnimeRequest());
    return "anime/add";
  }
  
  /**
   * アニメ新規登録
   * @param animeRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @RequestMapping("/anime/create")
  public String animeCreate(@Validated @ModelAttribute AnimeRequest animeRequest, BindingResult result, Model model) {
    if (result.hasErrors()) {
      // 入力チェックエラーの場合
      List<String> errorList = new ArrayList<String>();
      for (ObjectError error : result.getAllErrors()) {
        errorList.add(error.getDefaultMessage());
      }
      //エラー判定後の画面遷移
      model.addAttribute("validationError", errorList);
      return "anime/add";
    }
    // アニメ情報の登録
    animeService.create(animeRequest);
    return "redirect:/anime/list";
  }

  
  /**
   * アニメ情報詳細画面を表示
   * @param id 表示するアニメID
   * @param model Model
   * @return アニメ情報詳細画面
   */
  @GetMapping("/anime/{id}")
  public String animeDetail(@PathVariable Integer id, Model model) {
    AnimeEntity anime = animeService.findById(id);
    model.addAttribute("animeData", anime);
    return "anime/view";

  }

  /**
   * アニメ編集画面を表示
   * @param id 表示するアニメID
   * @param model Model
   * @return アニメ編集画面
   */
  @GetMapping("/anime/{id}/edit")
  public String userEdit(@PathVariable Integer id, Model model) {
    /**
    * 編集対象のアニメ情報を取得
    */
    AnimeEntity anime = animeService.findById(id);
    // 編集画面用のDTOに格納
    AnimeUpdateRequest animeUpdateRequest = new AnimeUpdateRequest();
    animeUpdateRequest.setId(anime.getId());
    animeUpdateRequest.setTitle(anime.getTitle());
    animeUpdateRequest.setYear(String.valueOf(anime.getYear()));
    animeUpdateRequest.setGenre(anime.getGenre());
    model.addAttribute("animeUpdateRequest", animeUpdateRequest);
    return "anime/edit";
  }
  
  /**
   * アニメ更新
   * @param animeRequest リクエストデータ
   * @param model Model
   * @return アニメ情報詳細画面
   */
  @RequestMapping("/anime/update")
  public String animeUpdate(@Validated @ModelAttribute AnimeUpdateRequest animeUpdateRequest, BindingResult result, Model model) {
    if (result.hasErrors()) {
      List<String> errorList = new ArrayList<String>();
      for (ObjectError error : result.getAllErrors()) {
        errorList.add(error.getDefaultMessage());
      }
      model.addAttribute("validationError", errorList);
      return "anime/edit";
    }
    // アニメ情報の更新
    animeService.update(animeUpdateRequest);
    return String.format("redirect:/anime/%d", animeUpdateRequest.getId());
  }
  
  /**
   * アニメ情報削除
   * @param id 表示するアニメID
   * @param model Model
   * @return アニメ情報詳細画面
   */
  @GetMapping("/anime/{id}/delete")
  public String animeDelete(@PathVariable Integer id, Model model) {
      // アニメ情報の削除
      animeService.delete(id);
      return "redirect:/anime/list";
  }

  }

