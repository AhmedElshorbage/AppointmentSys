package com.digitalwellnez.appointment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.digitalwellnez.appointment.entities.Clinics;

@Repository
public interface ClinicRepository extends JpaRepository<Clinics, Integer> {
	
	@Query(value= "Select Description ,Address from Clinics where DOC_ID= :id",nativeQuery=true)
	public String hospitalDesc(@Param(value = "id"  ) int id);
}
