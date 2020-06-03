package com.webdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdev.model.Individuals;

@Repository
public interface IndivudualRepository extends JpaRepository<Individuals, Integer> {

}
