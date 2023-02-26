package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("getAll")
	public List<Student> getAll()
	{
		return (List<Student>)this.studentRepository.findAll();
	}
	
	@GetMapping("getOnlyA")
	public List<Student> getOnlyA(@RequestParam("sabu") String name)
	{
		return this.studentRepository.rraj(name);
	}
	
}
