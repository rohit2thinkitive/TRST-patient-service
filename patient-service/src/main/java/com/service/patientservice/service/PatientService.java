package com.service.patientservice.service;

import com.service.patientservice.entities.Patient;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PatientService {
    List getPatients();

    String addPatient(Patient p);
}
