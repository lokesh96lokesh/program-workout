package com.jar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AutoAws {
	@GetMapping(value="/getall")
	public String get() {
		return "hi";
	}

}


