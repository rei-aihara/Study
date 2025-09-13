package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * アニメ情報 Entity
 */
@Data
@Entity
@Table(name = "anime", schema = "public")
public class AnimeEntity  {

  /**
   * ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  /**
   * タイトル
   */
  @Column(name = "title")
  private String title;

  /**
   * 年
   */
  @Column(name = "year")
  private Integer year;

  /**
   * ジャンル
   */
  @Column(name = "genre")
  private String genre;
}