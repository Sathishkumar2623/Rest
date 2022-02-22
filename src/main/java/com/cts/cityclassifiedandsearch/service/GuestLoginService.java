package com.cts.cityclassifiedandsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.cityclassifiedandsearch.dao.GuestLoginDao;
import com.cts.cityclassifiedandsearch.model.GuestLoginModel;

@Service
public class GuestLoginService {

	@Autowired
	private GuestLoginDao GuestLoginDao;
	
	public List<GuestLoginModel> getAllCitiesInformation() {
		return GuestLoginDao.getAllCitiesInformation();
}
	public List<GuestLoginModel>getInformation(String cityName) {
		return this.GuestLoginDao.getInformation(cityName);
	}
}