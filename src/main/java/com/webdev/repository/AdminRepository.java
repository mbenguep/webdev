package com.webdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdev.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
