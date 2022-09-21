package com.service.patientservice.dao;

import com.service.patientservice.entities.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PatientDao extends CrudRepository<Patient, UUID> {
}
