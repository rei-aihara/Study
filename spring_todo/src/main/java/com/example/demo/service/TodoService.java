package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.TodoRequest;
import com.example.demo.dto.TodoUpdateRequest;
import com.example.demo.entity.TodoEntity;
import com.example.demo.repository.TodoRepository;
/**
 * Toso情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TodoService {
  /**
   * Todo情報 Repository
   */
  @Autowired
  private TodoRepository todoRepository;


  /**
   * Todo情報 全検索
   * @return 検索結果
   */
  public List<TodoEntity> searchAll() {
    return todoRepository.findAll();
  }
  
  /**
   * Todo情報 主キー検索
   * @return 検索結果
   */
  public TodoEntity findById(Integer id) {
    return todoRepository.getOne(id);
  }


  /**
   * Todo情報 新規登録
   * @param todo Todo情報
   */
  public void create(TodoRequest todoRequest) {
	    TodoEntity todo = new TodoEntity();
	    todo.setTitle(todoRequest.getTitle());
	    todo.setDescription(todoRequest.getDescription());
	    todo.setCompleted(todoRequest.getCompleted());
	    todoRepository.save(todo);
	}
  
  /**
   * Todo情報 更新
   * @param todo Todo情報
   */
  public void update(TodoUpdateRequest todoUpdateRequest) {
    TodoEntity todo = findById(todoUpdateRequest.getId());
    todo.setTitle(todoUpdateRequest.getTitle());
    todo.setDescription(todoUpdateRequest.getDescription());
    todo.setCompleted(todoUpdateRequest.getCompleted());
    todoRepository.save(todo);
  }
  
  /**
   * Todo情報 物理削除
   * @param id TodoID
   */
  public void delete(Integer id) {
      TodoEntity todo = findById(id);
      todoRepository.delete(todo);
  }
}