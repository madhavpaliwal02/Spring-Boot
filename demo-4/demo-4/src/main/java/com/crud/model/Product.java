package com.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	private long price;

	public Product() {
		super(); // TODO Auto-generated constructor stub }

	}

	public Product(String name, String type, long price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public Product(int id, String name, String type, long price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return type;
	}

	public void setCity(String type) {
		this.type = type;
	}

	public long getSalary() {
		return price;
	}

	public void setSalary(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}

}
