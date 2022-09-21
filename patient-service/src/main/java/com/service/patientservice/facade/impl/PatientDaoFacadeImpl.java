package com.service.patientservice.facade.impl;

import com.service.patientservice.dao.PatientDao;
import com.service.patientservice.entities.Patient;
import com.service.patientservice.facade.interf.PatientDaoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PatientDaoFacadeImpl implements PatientDaoFacade {
    @Autowired
    private PatientDao patientDao;


    //to get all patient from table
    public List<Patient> getPatients(){
       return (List<Patient>) patientDao.findAll();
    }

    //to save patient

    @Override
    public String addPatient(Patient patient) {
        return patientDao.save(patient).getId();
    }
}
