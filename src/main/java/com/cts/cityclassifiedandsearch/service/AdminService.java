package com.cts.cityclassifiedandsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.cityclassifiedandsearch.dao.AdminDao;
import com.cts.cityclassifiedandsearch.model.AdminModel;

@Service
public class AdminService {

	@Autowired
	private AdminDao AdminDao;
	
	public String checkLogin(AdminModel user) {
		return this.AdminDao.checkLogin(user);
	}

	
	public List<AdminModel> getAllUser() {
		return AdminDao.getAllUsers();
	}

	//public boolean postUser(AdminModel user) {
	//	return AdminDao.insertUser(user);
	//}
}

