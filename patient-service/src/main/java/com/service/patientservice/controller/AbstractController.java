package com.service.patientservice.controller;

import com.service.patientservice.facade.interf.PatientServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractController {
    @Autowired
    PatientServiceFacade patientServiceFacade;
}
