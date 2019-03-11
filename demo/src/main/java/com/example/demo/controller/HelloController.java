 package com.example.demo.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HelloController {
	@Value("${props.name}")
	private String var;
	
	@GetMapping("/students")
	public Student allstudents() {
		//model.addAttribute("name", var);
		return buildStudent();
	}
	@GetMapping("/hello")
	public String get(Model model) {

		model.addAttribute("name", var);
		return "hello";
		
	}

	private Student buildStudent() {
		Student ss = new Student();
		ss.setGrade("A");
		ss.setName("ramu");
		ss.setSid(101);
		return ss;
	}
}
