package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * Todo情報 リクエストデータ
 */
@Data
public class TodoRequest implements Serializable {
  /**
   * タイトル
   */
  @NotEmpty(message = "タイトルを入力してください")
  @Size(max = 100, message = "タイトルは100桁以内で入力してください")
  private String title;
  /**
   * 詳細
   */
  @NotEmpty(message = "詳細を入力してください")
  @Size(max = 255, message = "詳細は255桁以内で入力してください")
  private String description;
  /**
   * 完了状況
   */
  private Boolean completed;
}