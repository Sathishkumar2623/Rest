package com.cts.cityclassifiedandsearch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.cityclassifiedandsearch.model.RegiatrationModel;

public class RegistrationMapper implements RowMapper<RegiatrationModel> {
	@Override
	public RegiatrationModel mapRow(ResultSet resultSet, int i) throws SQLException {

		RegiatrationModel admin = new RegiatrationModel();
		admin.setFirstName(resultSet.getString("firstName"));
		admin.setLastName(resultSet.getString("lastName"));
		admin.setAlternateNumber(resultSet.getString("alternateNumber"));
		admin.setEmail(resultSet.getString("email"));
		admin.setUserId(resultSet.getString("user_Id"));
		admin.setContactNumber(resultSet.getString("contactNumber"));
		admin.setPassword(resultSet.getString("password"));
		admin.setRole(resultSet.getString("role"));
		admin.setUserName(resultSet.getString("userName"));
		return admin;

	}
}
