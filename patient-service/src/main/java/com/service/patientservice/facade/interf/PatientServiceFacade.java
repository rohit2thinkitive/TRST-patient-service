package com.service.patientservice.facade.interf;

import com.service.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface PatientServiceFacade {

    Map getPatients();
}
