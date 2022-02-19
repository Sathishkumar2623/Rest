package com.cts.cityclassifiedandsearch.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.cityclassifiedandsearch.mapper.AdminMapper;
import com.cts.cityclassifiedandsearch.mapper.GuestLoginMapper;
import com.cts.cityclassifiedandsearch.model.AdminModel;
import com.cts.cityclassifiedandsearch.model.GuestLoginModel;

@Repository
public class GuestLoginDao {

	private final String SELECT = "select cityName from city;";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<GuestLoginModel> getAllCityName() {
		return jdbcTemplate.query(SELECT, new GuestLoginMapper());
	}
}
