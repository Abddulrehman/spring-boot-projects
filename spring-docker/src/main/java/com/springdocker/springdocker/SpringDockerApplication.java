package com.springdocker.springdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringDockerApplication {

	@Autowired
	Repo repo;
	@GetMapping("/message")
	public String show() {
		return "ths is message in spring boot service";
	}
	
	@PostMapping("/add")
	 public  String Tutorial(@RequestBody User user) {
	     repo.save(user);
	      return "user saved ";
	    
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
