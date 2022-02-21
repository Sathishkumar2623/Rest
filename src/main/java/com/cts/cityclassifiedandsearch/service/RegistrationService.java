package com.cts.cityclassifiedandsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.cityclassifiedandsearch.dao.RegistrationDao;
import com.cts.cityclassifiedandsearch.model.RegiatrationModel;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationDao AdminDao;

	public String checkLogin(RegiatrationModel user) {
		return this.AdminDao.checkLogin(user);
	}

	public List<RegiatrationModel> getAllUsers() {
		return AdminDao.getAllUsers();
	}

	public boolean postUser(RegiatrationModel user) {
		return AdminDao.insertUser(user);
	}

	public boolean forgotPassword(RegiatrationModel user) {
		return this.AdminDao.forgotPassword(user);
	}

	public boolean postUserPassword(RegiatrationModel user) {
		return this.AdminDao.updatePassword(user);
	}

	public String getUserId(RegiatrationModel user) {
		return this.AdminDao.userId(user);
	}

}
