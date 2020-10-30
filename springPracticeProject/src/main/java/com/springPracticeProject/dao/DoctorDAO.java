package com.springPracticeProject.dao;

import java.util.List;

import com.springPracticeProject.model.Doctor;

public interface DoctorDAO {
	
	public String addDoctorDetails(Doctor doctor);
	List<Doctor> getAllDoctors();
	Doctor getDoctorByID(int id);
	String updateDoctor(int id,int salary);
	String deleteDoctor(int id);
}
