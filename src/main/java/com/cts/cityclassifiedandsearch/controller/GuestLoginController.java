package com.cts.cityclassifiedandsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cityclassifiedandsearch.service.GuestLoginService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class GuestLoginController {

	@Autowired
	private GuestLoginService GuestLoginService;
	
	@PutMapping("/getInformation")
	public ResponseEntity<Object> getInformation() {
		return ResponseEntity.ok(GuestLoginService.getInformation());
	}
}

