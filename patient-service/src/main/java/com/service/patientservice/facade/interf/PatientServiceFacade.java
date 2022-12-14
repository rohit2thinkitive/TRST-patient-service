package com.service.patientservice.facade.interf;

import com.service.patientservice.entities.Patient;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public interface PatientServiceFacade {

    List getPatients();

    String addPatient(Patient p);
}
