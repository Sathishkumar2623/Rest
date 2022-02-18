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

	public boolean postUser(AdminModel user) {
		return AdminDao.insertUser(user);
	}

	public boolean forgotPassword(AdminModel user) {
		return this.AdminDao.forgotPassword(user);
	}

	public boolean postUserPassword(AdminModel user) {
		return this.AdminDao.updatePassword(user);
	}

	public String getUserId(AdminModel user) {
		return this.AdminDao.userId(user);
	}

}
