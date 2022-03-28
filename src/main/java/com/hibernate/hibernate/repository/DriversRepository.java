package com.hibernate.hibernate.repository;

import com.hibernate.hibernate.model.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Driver;

@Repository
public interface DriversRepository extends JpaRepository<Drivers, Long> {
}
