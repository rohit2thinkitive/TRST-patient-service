package com.service.patientservice.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class PatientServiceImpl implements PatientService{
    @Override
    public Map getPatients() {
        return new HashMap<String,Object>(){{
            put("patient_id","sdj87263724jdsdsj");
            put("Patient_name", "FirstName + LastName");
            put("contact",988990228);
            put("gender","male");
            put("provider_name", "assigned Provider");
        }};
    }
}
