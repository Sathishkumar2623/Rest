package com.cts.cityclassifiedandsearch.model;

public class GuestLoginModel {

	private String cityid;
	private String cityName;
	private String subject;

	public GuestLoginModel(String cityid, String cityName, String subject) {
		super();
		this.cityid = cityid;
		this.cityName = cityName;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "GuestLoginModel [cityid=" + cityid + ", cityName=" + cityName + ", subject=" + subject + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public GuestLoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCityid() {
		return cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
