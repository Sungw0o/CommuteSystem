package com.company.CommuteSystem.Repository;

import com.company.CommuteSystem.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}
