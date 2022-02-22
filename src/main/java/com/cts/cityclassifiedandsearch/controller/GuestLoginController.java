package com.cts.cityclassifiedandsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cityclassifiedandsearch.model.GuestLoginModel;
import com.cts.cityclassifiedandsearch.service.GuestLoginService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class GuestLoginController {

	@Autowired
	private GuestLoginService GuestLoginService;
	
	@GetMapping("/getInformation")
	public ResponseEntity<Object> getAllCitiesInformation() {
		return ResponseEntity.ok(GuestLoginService.getAllCitiesInformation());
	}
	@GetMapping("/getInfo/{cityName}")
	public ResponseEntity<Object> getInformation(@PathVariable String cityName) {
		List<GuestLoginModel> citiesInfo = this.GuestLoginService.getInformation(cityName);
		return new ResponseEntity(citiesInfo, HttpStatus.OK);
	}

}



