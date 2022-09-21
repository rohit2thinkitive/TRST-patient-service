package com.service.patientservice.service;

import com.service.patientservice.entities.Patient;
import com.service.patientservice.facade.interf.PatientDaoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientDaoFacade patientDaoFacade;
    @Override
    public List getPatients() {
        return patientDaoFacade.getPatients();
    }

    @Override
    public String addPatient(Patient p) {
        return patientDaoFacade.addPatient(p);
    }
}
