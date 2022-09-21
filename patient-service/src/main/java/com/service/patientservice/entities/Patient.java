package com.service.patientservice.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private String maritalStatus;
    private String emailId;
    private String primaryNumber;
    private String secondaryNumber;
    private String bio;

    public Patient(String firstName, String lastName, String middleName, String gender, String maritalStatus, String emailId, String primaryNumber, String secondaryNumber, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.emailId = emailId;
        this.primaryNumber = primaryNumber;
        this.secondaryNumber = secondaryNumber;
        this.bio = bio;

    }
}
