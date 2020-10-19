package com.rptech.hmservice.service;

import com.rptech.hmservice.dao.AppointmentRepo;
import com.rptech.hmservice.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepo appointmentRepo;

    public List<Appointment> getAppointmentDetails() {
       return appointmentRepo.findAll();
    }

    public Appointment createAppointment(Appointment appointment) {

        return appointmentRepo.save(appointment);
    }
}