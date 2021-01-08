package com.digitalwellnez.appointment.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalwellnez.appointment.entities.Clinics;
import com.digitalwellnez.appointment.entities.Doctors;
import com.digitalwellnez.appointment.repositories.DrRepository;

@Service
public class DrService {
	
	
@Autowired
private DrRepository drRepository;

public ArrayList<Doctors> findDoctor(String Speciality, int min,int max,Float lat,Float lng) {
return drRepository.findDoctor(Speciality,min,max,lat,lng);
}
public ArrayList<Doctors> findNearestDoctor(String Speciality, int min,int max,Float lat,Float lng) {
return drRepository.findNearestDoctor(Speciality, min, max,lat,lng);
}

}
