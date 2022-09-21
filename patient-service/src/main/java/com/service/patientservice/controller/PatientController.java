package com.service.patientservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/trst/patient")
public class PatientController extends AbstractController{

    // api to get list of patient

    @GetMapping("")
    public ResponseEntity<Map> getPatients(){
        return new ResponseEntity(patientServiceFacade.getPatients(), HttpStatus.OK);

    }
}
