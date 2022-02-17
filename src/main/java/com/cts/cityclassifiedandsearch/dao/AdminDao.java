package com.cts.cityclassifiedandsearch.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.cityclassifiedandsearch.mapper.AdminMapper;
import com.cts.cityclassifiedandsearch.model.AdminModel;

@Repository
public class AdminDao {

	private final String SELECT = "select * from user;";
	private final String INSERT = "insert into user (firstName,lastName,alternateNumber,email,contactNumber,user_Id,password,role,userName) values(?,?,?,?,?,?,?,?,?);";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<AdminModel> getAllUsers() {
		return jdbcTemplate.query(SELECT, new AdminMapper());
	}

	public boolean insertUser(AdminModel user) {
		if (jdbcTemplate.update(INSERT, user.getFirstName(), user.getLastName(), user.getAlternateNumber(),
				user.getContactNumber(), user.getUserId(), user.getPassword(), user.getEmail(), user.getRole(),
				user.getUserName()) != 0) {
			return true;
		}
			return false;
		}

	}

