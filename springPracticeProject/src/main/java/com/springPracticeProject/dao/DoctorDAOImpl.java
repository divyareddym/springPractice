package com.springPracticeProject.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springPracticeProject.model.Doctor;
import com.springPracticeProject.util.DoctorMapper;

@Repository
public class DoctorDAOImpl implements DoctorDAO{
	JdbcTemplate jdbcTemplate;
	@Autowired
	public DoctorDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("jdbc templete");
	}
	public String addDoctorDetails(Doctor doctor) {
		String retMsg = ""; 
		System.out.println("reached dao layer:"+doctor.getId()+"  "+doctor.getName()+"  "+doctor.getSlary());
		String sqlQuery ="insert into doctordetails values(?,?,?)";
		int isSaved = jdbcTemplate.update(sqlQuery,doctor.getId(),doctor.getName(),doctor.getSlary());
		System.out.println("issaved"+isSaved);
		if(isSaved==1) {
			retMsg="saved succesfully";
		}
		return retMsg;
	}
	
	
	public List<Doctor> getAllDoctors() {
		return jdbcTemplate.query( "select * from doctordetails",new DoctorMapper());
	}
	
	public Doctor getDoctorByID(int id) {
		System.out.println("reached dao to fetch doctors by ID"+id);
		return (Doctor) jdbcTemplate.queryForObject("select * from doctordetails where doctorid=?",	new Object[]{id},new DoctorMapper());
	}
	
	public String updateDoctor(int id,int salary) {
		String retMsg = ""; 
		String sqlQuery = "update doctordetails set doctorsalary=? where doctorid=?";
		int isSaved = jdbcTemplate.update(sqlQuery, new Object[] { salary, id });
		System.out.println("issaved"+isSaved);
		if(isSaved==1) {
			retMsg="updated succesfully";
		}
		return retMsg;
	}
	public String deleteDoctor(int id) {
		String retMsg = ""; 
		String sqlQuery = "delete doctordetails where doctorid=?";
		int isSaved = jdbcTemplate.update(sqlQuery, new Object[] { id });
		System.out.println("issaved "+isSaved);
		if(isSaved==1) {
			retMsg="deleted succesfully";
		}
		return retMsg;
	}

}
