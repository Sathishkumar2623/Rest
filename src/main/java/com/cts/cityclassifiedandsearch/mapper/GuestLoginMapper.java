package com.cts.cityclassifiedandsearch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.cityclassifiedandsearch.model.AdminModel;
import com.cts.cityclassifiedandsearch.model.GuestLoginModel;

public class GuestLoginMapper implements RowMapper<GuestLoginModel> {
	@Override
	public GuestLoginModel mapRow(ResultSet resultSet, int i) throws SQLException {
		
		GuestLoginModel login = new GuestLoginModel();
		login.setCityid(resultSet.getString("city_id"));
		login.setCityName(resultSet.getString("cityName"));
		return login;
}
	

}