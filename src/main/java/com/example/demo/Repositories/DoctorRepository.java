package com.example.demo.Repositories;

import com.example.demo.entities.Doctor;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class DoctorRepository {
   HashMap<Integer, Doctor> DoctorMap = new HashMap<>();
   private int idCounter = 1;

   public List<Doctor> getAllDoctor(){
       return new ArrayList<>(DoctorMap.values());
   }

   public Doctor getDoctorById(int id){
       return DoctorMap.get(id);
   }
   public Doctor addDoctor(Doctor doctor){
       doctor.setId(idCounter++);
       DoctorMap.put(doctor.getId(),doctor);
       return doctor;
   }
   public Doctor updateDoctor(Doctor doctor){
       return DoctorMap.put(doctor.getId(),doctor);
   }
   public void deleteDoctor(int id){
       DoctorMap.remove(id);
   }
}
