package com.company.CommuteSystem.Repository;

import com.company.CommuteSystem.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team,Long> {
    Optional<Team> findByName(String name);
}
