package com.cts.cityclassifiedandsearch.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cityclassifiedandsearch.model.AdminModel;
import com.cts.cityclassifiedandsearch.service.AdminService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class AdminController {

	@Autowired
	private AdminService AdminService;

	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody AdminModel model) {
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
	public ResponseEntity<Object> getAllCourses() {
		return ResponseEntity.ok(AdminService.getAllUser());
	}

	/*@PostMapping("/postUser")
	public ResponseEntity<Object> postStudent(@RequestBody AdminModel model) {
		try {
			boolean status = AdminService.postUser(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}*/
	}

