package com.hibernate.hibernate.repository;

import com.hibernate.hibernate.model.Championship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChampionshipRepository extends JpaRepository<Championship, Long> {
    /**
     * Hibernate function to get Championship by teams id
     * The request like in sql => SELECT * FROM CHAMPIONSHIP WHERE TEAMS_ID = 100
     *
     * @param teamsId championship owner id
     * @return championship find by owner id
     */
    Optional<Championship> findByTeamsId(long teamsId);
}
