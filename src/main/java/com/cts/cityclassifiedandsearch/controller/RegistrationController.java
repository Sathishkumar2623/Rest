package com.cts.cityclassifiedandsearch.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cityclassifiedandsearch.model.RegiatrationModel;
import com.cts.cityclassifiedandsearch.service.RegistrationService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class RegistrationController {

	@Autowired
	private RegistrationService AdminService;

	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody RegiatrationModel model) {
		String loginStatus = this.AdminService.checkLogin(model);
		if (loginStatus.equals("Password") || loginStatus.equals("UserId")) {
			Map<String, String> message = new HashMap<String, String>();
			message.put("role", loginStatus);
			return new ResponseEntity<Object>(message, HttpStatus.BAD_REQUEST);
		} else {
			String role = loginStatus.substring(9, loginStatus.length());
			Map<String, String> message = new HashMap<String, String>();
			message.put("role", role);
			return new ResponseEntity<Object>(message, HttpStatus.OK);
		}
	}

	@GetMapping("/getUser")
	public ResponseEntity<Object> getAllUsers() {
		return ResponseEntity.ok(AdminService.getAllUsers());
	}

	@PostMapping("/postUser")
	public ResponseEntity<Object> postUser(@RequestBody RegiatrationModel model) {
		try {
			boolean status = AdminService.postUser(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/forgotPassword")
	public ResponseEntity<Object> forgotPassword(@RequestBody RegiatrationModel model) {
		boolean status = this.AdminService.forgotPassword(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/Password")
	public ResponseEntity<Object> Password(@RequestBody RegiatrationModel model) {
		String userId = this.AdminService.getUserId(model);
		if (!userId.equals("")) {
			Map<String, String> message = new HashMap<String, String>();
			message.put("userId", userId);
			return ResponseEntity.ok(message);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/UserPassword")
	public ResponseEntity<Object> postPassword(@RequestBody RegiatrationModel model) {
		try {
			boolean status = AdminService.postUserPassword(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

}
