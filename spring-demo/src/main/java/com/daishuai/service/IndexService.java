package com.daishuai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

	@Autowired
	private UserService userService;

	public IndexService() {
		System.out.println("IndexService Constructor....");
	}
}
