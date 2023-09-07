package com.newproject.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to my world";
	}

//	echo "# github-action-ex" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/niteshdhumal/github-action-ex.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
