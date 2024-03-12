package com.sp.jdbc.dao;

import java.util.List;

import com.sp.jdbc.entities.Student;

public interface StudentDao {
	
	public int insertData(Student st);
	
	public int changeData(Student st);
	
	public int deleteData(Student st);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();
}
