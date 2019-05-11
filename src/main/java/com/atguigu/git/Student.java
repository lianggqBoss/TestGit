package com.atguigu.git;

public class Student {

	private String id;
	private String name;
	private int age;
	private String school;

	public Student(String id, String name, int age, String school) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", school=" + school + "]";
	}
}
