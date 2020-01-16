package com.lti.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.lti.model.Student;

public class StudentDaoJdbcImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	private static final String CREATE_STUDENT = "insert into student (Roll_Number,Student_Name,Student_Score) values(?,?,?)";

	@Override
	public int createStudent(Student student) {
		int inserted = jdbcTemplate.update(CREATE_STUDENT, student.getRollNumber(), student.getStudentName(), student.getStudentScore());
		return inserted;
	}

	@Override
	public Student readStudentByRollNumber(int rollNumber) {

		return null;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
