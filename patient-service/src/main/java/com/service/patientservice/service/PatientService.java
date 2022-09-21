package com.service.patientservice.service;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface PatientService {
    Map getPatients();
}
