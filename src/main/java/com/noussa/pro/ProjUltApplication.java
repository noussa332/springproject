package com.noussa.pro;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.noussa.pro.controller.ArticleController;

@SpringBootApplication
public class ProjUltApplication {

	public static void main(String[] args) {
		
		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(ProjUltApplication.class, args);

			

	}

}
