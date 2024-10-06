package com.example.demo.service;

import com.example.demo.Repositories.DoctorRepository;
import com.example.demo.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public List<Doctor> getAllDoctor(){
        return doctorRepository.getAllDoctor();
    }
    public Doctor getDoctorById(int id){
        return doctorRepository.getDoctorById(id);
    }
    public Doctor addDoctor(Doctor doctor){
        return doctorRepository.addDoctor(doctor);
    }
    public Doctor update(Doctor doctor){
        return doctorRepository.updateDoctor(doctor);
    }
    public void removeDoctor(int id){
        doctorRepository.deleteDoctor(id);
    }
}
