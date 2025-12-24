package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {
	@Autowired
	private UserService userService;
	
	@MockBean
	private UserRepository userRepository;
	
	@Test
	public void findById_指定したユーザーが返るか確認(){
		UserEntity user = new UserEntity();
		user.setId(1);
        user.setName("花子");
        
        when(userRepository.getOne(1)).thenReturn(user); 
        
        List<UserEntity> resultList = userService.searchAll();
        
        assertEquals("花子", resultList.get(0).getName());

	}

}