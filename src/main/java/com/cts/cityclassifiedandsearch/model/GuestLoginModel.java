package com.cts.cityclassifiedandsearch.model;

public class GuestLoginModel {

	private String cityid;
	private String cityName;

	public GuestLoginModel(String cityid, String cityName) {
		super();
		this.cityid = cityid;
		this.cityName = cityName;
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
