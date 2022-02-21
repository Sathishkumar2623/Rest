package com.cts.cityclassifiedandsearch.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.cityclassifiedandsearch.mapper.RegistrationMapper;
import com.cts.cityclassifiedandsearch.model.RegiatrationModel;

@Repository
public class RegistrationDao {

	private final String SELECT = "select * from user;";
	private final String LOGIN = "select password from user where user_Id = ? ";
	private final String USERID = "select user_Id from security_question where ContactNumber =? and ans4 =? and ans5 =? and ans6 =? ";
	private final String INSERT_ANS = "insert into security_question (user_id,ans1,ans2,ans3) values(?,?,?,?);";
	private final String UPDATE_PASSWORD = "update user set password=? where user_Id=? ";
	private final String FORGOT_PASSWORD = "select user_Id from security_question where user_Id = ? and ans1 = ? and ans2 = ? and ans3 = ?;";
	private final String ROLE = "select role from user where user_Id = ?;";
	private final String INSERT = "insert into user (firstName,lastName,alternateNumber,email,contactNumber,user_Id,password,role,userName) values(?,?,?,?,?,?,?,?,?);";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<RegiatrationModel> getAllUsers() {
		return jdbcTemplate.query(SELECT, new RegistrationMapper());
	}

	public boolean insertUser(RegiatrationModel user) {
		boolean user_table = (jdbcTemplate.update(INSERT, user.getFirstName(), user.getLastName(),
				user.getAlternateNumber(), user.getEmail(), user.getContactNumber(), user.getUserId(),
				user.getPassword(), user.getRole(), user.getUserName()) != 0);
		boolean user_security_ans = (jdbcTemplate.update(INSERT_ANS, user.getUserId(), user.getAns1(), user.getAns2(),
				user.getAns3()) != 0);
		if (user_table && user_security_ans) {
			return true;
		}
		return false;
	}

	public String checkLogin(RegiatrationModel user) {
		String loginStatus;
		try {
			String password = this.jdbcTemplate.queryForObject(LOGIN, String.class, new Object[] { user.getUserId() });
			if (password.equals(user.getPassword())) {
				loginStatus = "Logged In";
				String role = this.jdbcTemplate.queryForObject(ROLE, String.class,
						new Object[] { user.getUserId() });
				loginStatus += role;
				System.out.println(loginStatus);
			} else {
				loginStatus = "Password";
			}
		} catch (Exception e) {
			loginStatus = "UserId";
		}
		return loginStatus;
	}

	public boolean forgotPassword(RegiatrationModel user) {
		boolean status;
		try {
			this.jdbcTemplate.queryForObject(FORGOT_PASSWORD, String.class,
					new Object[] { user.getUserId(), user.getAns1(), user.getAns2(), user.getAns3() });
			status = true;
		} catch (Exception e) {
			status = false;
		}
		return status;
	}

	public boolean updatePassword(RegiatrationModel user) {
		if (jdbcTemplate.update(UPDATE_PASSWORD, user.getPassword(), user.getUserId()) != 0) {
			return true;
		}
		return false;

	}

	public String userId(RegiatrationModel user) {
		System.out.println(user.toString());
		String userId = "";
		try {
			userId = this.jdbcTemplate.queryForObject(USERID, String.class,
					new Object[] { user.getContactNumber(),user.getAns4(), user.getAns5(), user.getAns6() });
		} catch (Exception e) {

		}

		return userId;
	}
}
