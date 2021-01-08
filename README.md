# AppointmentSys
there are 3 APIs
1- doctor/{Speciality}/{min}/{max}/{lat}/{lng}
   this API return a list of doctor according on (doctor Speciality,doctors rang of fees and distance)
   it ordered by distance between doctor and patient by using Latitude and Longitude of clinic location and patient location as we sorted lat,lng of clinic in DB
   and lat,lng of patient will be path in the paramter from front-end by select patient location.
2- doctor/nearest/{Speciality}/{min}/{max}/{lat}/{lng}
   this API return a list of doctor according on (doctor Speciality,doctors rang of fees and distance that is less than 5 Km).
3- hospital/{id}
   this API return hospital description of selected doctor by using doctor ID.
