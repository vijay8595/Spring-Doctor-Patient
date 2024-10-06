package com.example.demo.controler;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1/Patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/all")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatient();
    }
    @GetMapping("/{id}")
    public Patient getDoctorById(@PathVariable int id){
        return patientService.getPatientById(id);
    }
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }
    @PutMapping
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }
    @DeleteMapping
    public void deletePatient(int id){
        patientService.deletePatient(id);
    }
}
