package com.service.patientservice.facade.interf;

import com.service.patientservice.entities.Patient;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface PatientDaoFacade {

    List getPatients();

    String addPatient(Patient patient);
}
