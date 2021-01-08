package com.digitalwellnez.appointment.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.digitalwellnez.appointment.entities.Doctors;

@Repository
public interface DrRepository extends JpaRepository<Doctors, Integer>{

/*SELECT doctors.ID, doctors.Name
FROM doctors
right JOIN clinics
ON doctors.ID = clinics.DOC_ID
WHERE doctors.Speciality='Cardiology' && doctors.Fees between 10 and 1000 && (

   3959 *
   COS(RADIANS(a.Latitude))
         * COS(RADIANS(b.Latitude))
         * COS(RADIANS(a.Longitude - b.Longitude))
         + SIN(RADIANS(a.Latitude))
         * SIN(RADIANS(b.Latitude)))))
*/
	
	
	@Query(value= "Select  * FROM doctors a right JOIN clinics c ON a.ID = c.DOC_ID "
			+ "WHERE a.Speciality = :speciality "
			+ "&& a.Fees between :min and :max order by" +  
			" (   6378.8 * acos(cos(radians(c.lat)) * " + 
			"   cos(radians(:lat)) * " + 
			"   cos(radians(c.lng) - " + 
			"   radians(:lng)) + " + 
			"   sin(radians(c.lat)) * " + 
			"   sin(radians(:lat )))" + 
			") "
			,nativeQuery=true)
	public ArrayList<Doctors> findDoctor(@Param(value = "speciality")String Speciality ,
			@Param(value = "min")int min,
			@Param(value = "max")int max,
			@Param(value = "lat")Float lat,
			@Param(value = "lng")Float lng);
	
	@Query(value= "Select  * FROM doctors a right JOIN clinics c ON a.ID = c.DOC_ID "
			+ "WHERE a.Speciality = :speciality "
			+ "&& a.Fees between :min and :max &&" +  
			" (   6378.8 * acos(cos(radians(c.lat)) * " + 
			"   cos(radians(:lat)) * " + 
			"   cos(radians(c.lng) - " + 
			"   radians(:lng)) + " + 
			"   sin(radians(c.lat)) * " + 
			"   sin(radians(:lat )))" + 
			") >5"
			,nativeQuery=true)
	public ArrayList<Doctors> findNearestDoctor(@Param(value = "speciality")String Speciality ,
			@Param(value = "min")int min,
			@Param(value = "max")int max,
			@Param(value = "lat")Float lat,
			@Param(value = "lng")Float lng);
	 
	
	
   
}

   

