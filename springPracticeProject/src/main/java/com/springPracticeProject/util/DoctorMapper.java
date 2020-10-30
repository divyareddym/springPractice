package com.springPracticeProject.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springPracticeProject.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor>{
	
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor= new Doctor();
		doctor.setId(rs.getInt("DOCTORID"));
		doctor.setName(rs.getString("DOCTORNAME"));
		doctor.setSlary(rs.getInt("DOCTORSALARY"));
		return doctor;
	}
}
