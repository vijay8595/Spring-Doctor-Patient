package com.example.demo.service;

import com.example.demo.Repositories.DoctorRepository;
import com.example.demo.Repositories.PatientRepository;
import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Patient> getAllPatient(){
        return patientRepository.getAllPatient();
    }
    public Patient getPatientById(int id){
        return patientRepository.getPatientById(id);
    }
    public Patient addPatient(Patient patient){
        Doctor doctor = doctorRepository.getDoctorById(patient.getDoctorId());
        if(doctor==null) return null;
        Patient patientEntity = patientRepository.addPatient(patient);
        if(doctor.getPatients()==null){
            doctor.setPatients(new ArrayList<Patient>());
            doctor.getPatients().add(patientEntity);
        }else{
            doctor.getPatients().add(patientEntity);
        }
        doctorRepository.updateDoctor(doctor);
        return patientEntity;
    }
    public Patient updatePatient(Patient patient){
        return patientRepository.updatePatient(patient);
    }
    public void deletePatient(int id){
        patientRepository.DeletePatient(id);
    }

}
