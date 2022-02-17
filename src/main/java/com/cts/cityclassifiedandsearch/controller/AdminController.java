package com.cts.cityclassifiedandsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cityclassifiedandsearch.model.AdminModel;
import com.cts.cityclassifiedandsearch.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService AdminService;

	@GetMapping("/getUser")
	public ResponseEntity<Object> getAllCourses() {
		return ResponseEntity.ok(AdminService.getAllUser());
	}

	@PostMapping("/postUser")
	public ResponseEntity<Object> postStudent(@RequestBody AdminModel model) {
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
}
