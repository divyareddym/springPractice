package com.springPracticeProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springPracticeProject.model.Doctor;
import com.springPracticeProject.service.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	Doctor doctor;

	@Autowired
	DoctorService doctorservice;

	@RequestMapping("/")
	public String showDetails() {
		
		return "doctordetails";
	}

	@RequestMapping("/search")
	public String doctorSearchForm(){
		return "savedetails";
	}

	@PostMapping("/save")
	@ResponseBody String addDoctorDetails(@RequestParam Integer DOCTORID,@RequestParam String DOCTORNAME,@RequestParam Integer DOCTORSALARY) {
		System.out.println(DOCTORID+""+DOCTORNAME+""+ DOCTORSALARY);
		doctor.setId(DOCTORID);
		doctor.setName(DOCTORNAME);
		doctor.setSlary(DOCTORSALARY);
		return doctorservice.addDoctorDetails(doctor);
	}

	@GetMapping("/getAllDoctors")
	@ResponseBody 
	String getAllDoctors() throws JsonProcessingException{
		System.out.println(" reached controller to fetch all doctors informattion >>> ");
		List<Doctor> listOfDoctors = doctorservice.getAllDoctors();
		System.out.println("doctors "+listOfDoctors);
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(listOfDoctors);
		return jsonString;
	}
	
	@GetMapping("/getDoctorByID")
	@ResponseBody 
	String getDoctorByID(@RequestParam int id) throws JsonProcessingException{
		System.out.println("reached controller to fetch doctors by ID"+id);
		Doctor doctor = doctorservice.getDoctorByID(id);
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(doctor);
		return jsonString;
	}
	
	@PutMapping("/doctorUpdate")
	@ResponseBody String updateDoctor(@RequestParam int id,@RequestParam int salary){
		return doctorservice.updateDoctor(id, salary);
	}
	@DeleteMapping("/doctorDelete")
	@ResponseBody String deleteDoctor(@RequestParam int id){
		return doctorservice.deleteDoctor(id);
	}
	
	//TODO below is testing please do not consider this code
	
	/*
	 * @PostMapping("/request") public ResponseEntity postController( @RequestBody
	 * LoginForm loginForm) { System.out.println("login form"); return
	 * ResponseEntity.ok(HttpStatus.OK); }
	 */
	
	@PostMapping("/save1")
	@ResponseBody String addDoctorDetails1(@RequestBody Doctor doctor) {
		System.out.println(doctor.getId()+" "+doctor.getName()+" "+ doctor.getSlary());
		return doctorservice.addDoctorDetails(doctor);
	}
}
