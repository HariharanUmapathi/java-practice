package com.service;

import com.model.Student;

public class StudentService {

	private Student[] studList;
	private int lastIndex;
	
	public StudentService(int n) {
		studList = new Student[n];
		lastIndex=0;
	}
	
	public void addStudent(Student s) {
		studList[lastIndex]=s;
		lastIndex++;
	}
	
	public void displayAll() {
		for(int i=0;i<lastIndex;i++) {
			System.out.println(studList[i]);
		}
	}
}
