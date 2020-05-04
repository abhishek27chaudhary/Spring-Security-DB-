package com.abhishek.secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return ("<h1> Wlecome</h1>" );
	}
}
