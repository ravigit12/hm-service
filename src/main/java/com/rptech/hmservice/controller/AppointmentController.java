package com.rptech.hmservice.controller;

import com.rptech.hmservice.model.Appointment;
import com.rptech.hmservice.service.AppointmentService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hm-service")
public class AppointmentController {

    final Logger logger = Logger.getLogger(AppointmentController.class);

    @Autowired
    AppointmentService appointmentService;

    @GetMapping(value = "/getAppointmentDetails")
    public List<Appointment> getAppointmentDetails() throws Exception {
        logger.info("Exception Audit Details ");
        return appointmentService.getAppointmentDetails();
    }

    @PostMapping(value = "/createAppointment")
    public Appointment createAppointment( @RequestBody Appointment appointment) throws Exception {

        return appointmentService.createAppointment(appointment);
    }
}