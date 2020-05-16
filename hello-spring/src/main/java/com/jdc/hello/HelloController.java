package com.jdc.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private HelloRepository helloRepository;
	
	@GetMapping
	public List<Hello> getAll(){
		return helloRepository.findAll();
	}
	
	@PostMapping
	public Hello create(@RequestBody Hello hello){
		helloRepository.save(hello);
		return hello;
	}
}
