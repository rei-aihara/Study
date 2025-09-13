package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * アニメ情報 リクエストデータ
 */
@Data
public class AnimeRequest implements Serializable {
  /**
   * タイトル
   */
  @NotEmpty(message = "タイトルを入力してください")
  @Size(max = 100, message = "タイトルは100文字以内で入力してください")
  private String title;
  /**
   *年
   */
  @NotEmpty(message = "年を入力してください")
  @Pattern(regexp = "^[0-9]{4}$", message = "西暦4桁で入力してください")
  private String year;
  /**
   * ジャンル
   */
  @NotEmpty(message = "ジャンルを入力してください")
  @Size(max = 50, message = "ジャンルは50文字以内で入力してください")
  private String genre;
}