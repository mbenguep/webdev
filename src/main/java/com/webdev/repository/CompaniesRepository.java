package com.webdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdev.model.Companies;

@Repository
public interface CompaniesRepository extends JpaRepository<Companies, Integer> {

}
