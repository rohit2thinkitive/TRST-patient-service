package com.service.patientservice.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private String maritalStatus;
    private String emailId;
    private String primaryNo;
    private String secondaryNumber;
    private String bio;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
