package com.daishuai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private IndexService indexService;

	public UserService() {
		System.out.println("UserService Constructor....");
	}
}
