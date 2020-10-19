package com.rptech.hmservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "Appointment")
public class Appointment {

    @Id
    @Column(name = "Id")
    private Integer aId;

    @Column(name = "PATIENT_NAME")
    private String pName;

    @Column(name = "APPOINTMENT_DATE")
    private Date appointmentDate;

    @Column(name = "APPOINTMENT_STATUS")
    private String appointmentStatus;//CANCELLED,CHECKED,IN-QUEUE

    @Column(name = "PHONE")
    private String phoneNumber;

    @Column(name = "VILLAGELOCALITY")
    private String villageLocality;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_AT")
    private Date createdAt;

    @Column(name = "UPDATE_AT")
    private Date updatedAt;

}