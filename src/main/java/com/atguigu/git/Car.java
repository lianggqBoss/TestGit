package com.atguigu.git;

public class Car {

	private String brand;
	private String company;

	public Car(String brand, String company) {
		super();
		this.brand = brand;
		this.company = company;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public static void main(String[] args) {
		System.out.println("BMW...");
		System.out.println("BENZ");
		System.out.println("edit by TestGit");
		System.out.println("My name is TestGit2");
		System.out.println("My name is TestGit");
		System.out.println("Test Git hot_fix");
		System.out.println("I like COROLLA...");
		System.out.println("I like LEVIN...");
	}
}
