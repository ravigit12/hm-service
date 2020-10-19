package com.rptech.hmservice.dao;

import com.rptech.hmservice.model.Appointment;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo  extends BaseRepository<Appointment, String> {


}