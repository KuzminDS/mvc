package com.ssu.kuzmin.mvc.dao;


import com.ssu.kuzmin.mvc.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDoctorDao extends JpaRepository<Doctor, Integer> {
}
