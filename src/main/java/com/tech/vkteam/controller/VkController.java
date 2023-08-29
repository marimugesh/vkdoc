package com.tech.vkteam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VkController {
	@GetMapping(value="/name")
	public String getName() {
		return "*ViratKohli18*";
	}

}
