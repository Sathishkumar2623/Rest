package com.cts.cityclassifiedandsearch.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.cityclassifiedandsearch.mapper.GuestLoginMapper;
import com.cts.cityclassifiedandsearch.model.GuestLoginModel;

@Repository
public class GuestLoginDao {

	private final String SELECT = "select * from information;";
	private final String INFO = "select * from information where cityName =?;";
	
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<GuestLoginModel> getAllCitiesInformation() {
		return jdbcTemplate.query(SELECT, new GuestLoginMapper());
	}

	public List<GuestLoginModel> getInformation(String cityName) {
		List<GuestLoginModel> citiesInfo=new ArrayList<GuestLoginModel>();
		try {
			citiesInfo=jdbcTemplate.query(INFO, new GuestLoginMapper(),cityName);
		}
		catch(Exception e) {
			
		}
		return citiesInfo;
	}
	}

