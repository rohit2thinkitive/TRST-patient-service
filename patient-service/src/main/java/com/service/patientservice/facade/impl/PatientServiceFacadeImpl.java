package com.service.patientservice.facade.impl;

import com.service.patientservice.facade.interf.PatientServiceFacade;
import com.service.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class PatientServiceFacadeImpl implements PatientServiceFacade {
    @Autowired
    PatientService patientService;
    @Override
    public Map getPatients() {
        return patientService.getPatients();
    }
}
