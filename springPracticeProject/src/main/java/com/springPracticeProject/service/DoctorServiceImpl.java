package com.springPracticeProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springPracticeProject.dao.DoctorDAO;
import com.springPracticeProject.model.Doctor;
@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorDAO doctordao;
	public String addDoctorDetails(Doctor doctor) {
		System.out.println("reached service layer:"+doctor.getId()+"  "+doctor.getName()+"  "+doctor.getSlary());
		return doctordao.addDoctorDetails(doctor);
	}
	public List<Doctor> getAllDoctors() {
		System.out.println("reached to service layer to fetch doctor details >>>");
		
		return doctordao.getAllDoctors();
	}
	public Doctor getDoctorByID(int id) {
		System.out.println("reached service to fetch doctors by ID"+id);
		return doctordao.getDoctorByID(id);
	}
	public String updateDoctor(int id, int salary) {
		return doctordao.updateDoctor(id, salary);
	}
	public String deleteDoctor(int id) {
		return doctordao.deleteDoctor(id);
	}


}
