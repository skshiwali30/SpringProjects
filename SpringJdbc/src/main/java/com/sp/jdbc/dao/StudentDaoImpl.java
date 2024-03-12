package com.sp.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sp.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate temp;
	
	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	@Override
	public int insertData(Student st) {
		//Insert query
        String query = "insert into student(id, full_name, city) values(?, ?, ?)";
        int res = this.temp.update(query, st.getId(), st.getName(), st.getCity());
		return res;
	}

	@Override
	public int changeData(Student st) {
		//updating data
		String query = "update student set full_name = ?, city = ? where id = ?";
		int res = this.temp.update(query, st.getName(), st.getCity(), st.getId());
		return res;
	}

	@Override
	public int deleteData(Student st) {
		// Delete data
		String query = "delete from student where id = ?";
		int res = this.temp.update(query, 999);
		return 0;
	}

	@Override
	public Student getStudent(int studentId) {
		// select one record of data
		String query = "select * from student where id = ?";
		RowMapper<Student> rm = new RowMapperImpl();
		Student st = this.temp.queryForObject(query, rm, studentId);
		return st;
	}

	@Override
	public List<Student> getAllStudents() {
		// select all records
		String query = "select * from student";
		List<Student> st = this.temp.query(query, new RowMapperImpl());
		return st;
	}
	
}
