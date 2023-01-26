package com.mongodbservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Contr {

	@Autowired
	MongoRepo mongoRepo;
	
	@GetMapping
	public String get() {
		return mongoRepo.save(new User()).toString();
	}
	
}
