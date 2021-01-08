package com.digitalwellnez.appointment.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalwellnez.appointment.entities.Clinics;
import com.digitalwellnez.appointment.entities.Doctors;
import com.digitalwellnez.appointment.services.DrService;


@RestController
@RequestMapping(value = "/doctor")
public class DrRestController {
	
	@Autowired 
	private DrService drService;
	
	@RequestMapping (value = "/{Speciality}/{min}/{max}/{lat}/{lng}")

	   public ArrayList<Doctors> findDoctor(@PathVariable String Speciality ,@PathVariable int min,
			   @PathVariable int max,@PathVariable Float lat,@PathVariable Float lng) {
			  return drService.findDoctor(Speciality,min,max,lat,lng); }
	
	@RequestMapping (value = "nearest/{Speciality}/{min}/{max}/{lat}/{lng}")

	   public ArrayList<Doctors> findNearestDoctor(@PathVariable String Speciality ,@PathVariable int min,
			   @PathVariable int max,@PathVariable Float lat,@PathVariable Float lng) {
			  return drService.findNearestDoctor(Speciality,min,max,lat,lng); }
	
	
     
}
