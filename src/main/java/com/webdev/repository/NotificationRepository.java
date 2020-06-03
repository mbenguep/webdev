package com.webdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdev.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
