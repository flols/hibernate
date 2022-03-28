package com.hibernate.hibernate.repository;

import com.hibernate.hibernate.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamsRepository extends JpaRepository<Teams, Long> {
    /**
     * Hibernate function to get Teams by drivers id
     * The request like in sql => SELECT * FROM TEAMS WHERE DRIVERS_ID = 100
     *
     * @param driversId teams owner id
     * @return teams find by owner id
     */
    Optional<Teams> findByDriversId(long driversId);
}
