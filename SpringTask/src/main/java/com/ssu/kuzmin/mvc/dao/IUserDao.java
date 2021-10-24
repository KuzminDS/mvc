package com.ssu.kuzmin.mvc.dao;

import com.ssu.kuzmin.mvc.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserDao extends JpaRepository<User, Integer> {
}
