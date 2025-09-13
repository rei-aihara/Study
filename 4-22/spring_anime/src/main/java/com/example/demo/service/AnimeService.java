package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.AnimeRequest;
import com.example.demo.dto.AnimeUpdateRequest;
import com.example.demo.entity.AnimeEntity;
import com.example.demo.repository.AnimeRepository;


/**
 * アニメ情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AnimeService {

  @Autowired
  private AnimeRepository animeRepository;


  /**
   * アニメ情報 全検索
   * @return 検索結果
   */
  public List<AnimeEntity> searchAll() {
    return animeRepository.findAll();
  }
  
  /**
   * アニメ情報 主キー検索
   * @return 検索結果
   */
  public AnimeEntity findById(Integer id) {
    return animeRepository.getOne(id);
  }


  /**
   * アニメ情報 新規登録
   * @param anime アニメ情報
   */
  public void create(AnimeRequest animeRequest) {
    AnimeEntity anime = new AnimeEntity();
    anime.setTitle(animeRequest.getTitle());
    anime.setYear(Integer.parseInt(animeRequest.getYear()));
    anime.setGenre(animeRequest.getGenre());
    animeRepository.save(anime);
  }
  
  /**
   * アニメ情報 更新
   * @param anime アニメ情報
   */    
    public void update(AnimeUpdateRequest animeUpdateRequest) {
        AnimeEntity anime = findById(animeUpdateRequest.getId());
        anime.setTitle(animeUpdateRequest.getTitle());
        anime.setYear(Integer.parseInt(animeUpdateRequest.getYear()));
        anime.setGenre(animeUpdateRequest.getGenre());
        animeRepository.save(anime);
    }
    
    /**
     * アニメ情報 物理削除
     * @param id アニメID
     */
    public void delete(Integer id) {
        AnimeEntity anime = findById(id);
        animeRepository.delete(anime);
    }
    
}