package com.sp.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sp.orm.entities.Student;

import jakarta.transaction.Transactional;

public class StudentDao {
	
	private HibernateTemplate hiberTemp;
	
	public HibernateTemplate getHiberTemp() {
		return hiberTemp;
	}

	public void setHiberTemp(HibernateTemplate hiberTemp) {
		this.hiberTemp = hiberTemp;
	}

	// to enable write operation we use @Transaction annotation
	@Transactional
	public int insert(Student st) {
		int res = (int) this.hiberTemp.save(st);
		return res;
	}
	
	// get the single object
	public Student getStudent(int id) {
		Student st = this.hiberTemp.get(Student.class, id);
		return st;
	}
	
	//get all students
	public List<Student> getAllStudents() {
		List<Student> list = this.hiberTemp.loadAll(Student.class);
		return list;
	}
	
	// delete record
	public void delete(int id) {
		Student st = this.hiberTemp.get(Student.class, id);
		this.hiberTemp.delete(st);
	}
	
	// update records
	public void updateData(Student st) {
		this.hiberTemp.update(st);
	}
}
