package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Todo情報更新リクエストデータ
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class TodoUpdateRequest extends TodoRequest implements Serializable {

  /**
   * TodoID
   */
  @NotNull
  private Integer id;
}