package com.example.demo.controler;

import com.example.demo.entities.Doctor;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/v1/Doctor")
public class DocterControler {
    @Autowired
    private DoctorService doctorService;
    @GetMapping("/all")
    public List<Doctor> addDoctorById(){
       return doctorService.getAllDoctor();
    }
    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable int id){
        return doctorService.getDoctorById(id);
    }
    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }
    @PutMapping
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        return doctorService.update(doctor);
    }
    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable int id){
        doctorService.removeDoctor(id);
    }


}
