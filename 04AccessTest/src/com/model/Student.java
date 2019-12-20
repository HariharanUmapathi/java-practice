package com.model;

public class Student {
	private int id;
	private String name;
	private double gpa;
	public static final String collegeName="JNU";
	
	
	public Student(int id, String name, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString() {
		String details = String.format("%-4d %-10s %.1f %-10s", id,name,gpa,collegeName);
		return details;
	}
	
	public static Student createStudent(String line) {
		//line = "102,Bubble,9.34"
		
		String v[]=line.split(",");
		//v[] = {"102","Bubble","9.34"}
		
		int id = Integer.parseInt(v[0]);
		String name = v[1];
		double gpa = Double.parseDouble(v[2]);
		Student s= new Student(id, name, gpa);
		
		return s;
	}
}







