package com.service.patientservice.facade.impl;

import com.service.patientservice.entities.Patient;
import com.service.patientservice.facade.interf.PatientServiceFacade;
import com.service.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class PatientServiceFacadeImpl implements PatientServiceFacade {
    @Autowired
    PatientService patientService;
    @Override
    public List getPatients() {
        return patientService.getPatients();
    }

    @Override
    public String addPatient(Patient p) {
        return  patientService.addPatient(p);
    }
}
