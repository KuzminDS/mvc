package com.ssu.kuzmin.mvc.dao;

import com.ssu.kuzmin.mvc.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface IAppointmentDao extends JpaRepository<Appointment, Integer> {
}
