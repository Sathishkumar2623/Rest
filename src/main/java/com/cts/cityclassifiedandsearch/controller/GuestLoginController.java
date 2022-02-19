package com.cts.cityclassifiedandsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cityclassifiedandsearch.service.GuestLoginService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class GuestLoginController {

	@Autowired
	private GuestLoginService GuestLoginService;
	
	@GetMapping("/getCity")
	public ResponseEntity<Object> getAllCityName() {
		return ResponseEntity.ok(GuestLoginService.getAllCityName());
	}
}

