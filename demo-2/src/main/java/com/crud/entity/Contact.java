package com.crud.entity;

public class Contact {

	private int id;
	private String city;
	private String country;
	private int userId;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(int id, String city, String country, int userId) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", city=" + city + ", country=" + country + ", userId=" + userId + "]";
	}

}
