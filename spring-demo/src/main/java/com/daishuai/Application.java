package com.daishuai;

import com.daishuai.config.AppConfig;
import com.daishuai.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService bean = context.getBean(UserService.class);
		System.out.println("Spring源码: " + bean);
	}
}
