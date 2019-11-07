package com.wangzi.spring.ioc;

public class Wheel {
	@Override
	public String toString() {
		return "Wheel [brand=" + brand + ", specification=" + specification + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	private String brand;
	private String specification ;
	
}
