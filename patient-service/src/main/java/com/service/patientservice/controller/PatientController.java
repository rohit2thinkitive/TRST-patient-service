package com.service.patientservice.controller;

import com.service.patientservice.entities.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/trst/patient")
public class PatientController extends AbstractController{

    //------------------------GET  api to get list of patient
    @GetMapping("")
    public ResponseEntity<List> getPatients(){
        return new ResponseEntity(patientServiceFacade.getPatients(), HttpStatus.OK);

    }


    //-----------------------GET api to save the patient

    @PostMapping("")
    public ResponseEntity<String> addPatient(@RequestBody Patient patient){

        return new ResponseEntity(patientServiceFacade.addPatient(patient), HttpStatus.CREATED);
    }

}
