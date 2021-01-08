package com.digitalwellnez.appointment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalwellnez.appointment.services.ClinicService;

@RestController
@RequestMapping(value = "/hospital")
public class ClinicRestController {
	@Autowired
	private ClinicService clinicService;
	
	@RequestMapping (value = "/{id}")
    public String hospitalDesc(@PathVariable int id) {
		return clinicService.hospitalDesc(id);
	}

}
