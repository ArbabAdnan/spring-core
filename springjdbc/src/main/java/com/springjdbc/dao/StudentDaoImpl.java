package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		//insert query
        String query="insert into student (id,name,city) value(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int change(Student student) {
		// updating data 
		String query="update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int delete(int studentId) {
		// delete operation
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	public Student getStudent(int studentId) {
		// Select single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}
	
	public List<Student> getAllStudent() {
		// get all student
		
		String query="select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new  RowMapperImp());
		return students;
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	

}
