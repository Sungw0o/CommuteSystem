package com.company.empmanage.repository;

import com.company.empmanage.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team,String> {
    boolean existsByName(String name);

}
