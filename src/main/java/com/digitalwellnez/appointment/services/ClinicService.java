package com.digitalwellnez.appointment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalwellnez.appointment.repositories.ClinicRepository;

@Service
public class ClinicService {
	
	@Autowired 
	private ClinicRepository clinicRepository;
	
	public String hospitalDesc(int id) {
		return clinicRepository.hospitalDesc(id);
		
	}

}
