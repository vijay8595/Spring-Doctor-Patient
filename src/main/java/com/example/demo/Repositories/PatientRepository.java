package com.example.demo.Repositories;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Repository
public class PatientRepository {
    HashMap<Integer, Patient> Patients = new HashMap<>();
    private int idCounter = 1;
    public List<Patient> getAllPatient(){
        return new ArrayList<>(Patients.values());
    }
    public Patient getPatientById(int id){
        return Patients.get(id);
    }
    public Patient addPatient(Patient patient){
        patient.setId(idCounter++);
        Patients.put(patient.getId(),patient);
        return patient;
    }
    public Patient updatePatient(Patient patient){//     is put method

        return Patients.put(patient.getId(),patient);
    }
    public Patient DeletePatient(int id){
        return Patients.remove(id);
    }

}
