package com.company.CommuteSystem.Service;

import com.company.CommuteSystem.Repository.EmployeeRepository;
import com.company.CommuteSystem.Repository.TeamRepository;
import com.company.CommuteSystem.dto.Request.EmployeeRegistRequest;
import com.company.CommuteSystem.domain.Employee;
import com.company.CommuteSystem.domain.Team;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final TeamRepository teamRepository;

    public EmployeeService(EmployeeRepository employeeRepository, TeamRepository teamRepository) {
        this.employeeRepository = employeeRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void RegistEmployee(EmployeeRegistRequest request) {
        Team team = teamRepository.findByName(request.getTeamName())
                .orElseThrow(IllegalArgumentException::new);
        employeeRepository.save(new Employee(team, request.getName(), request.getRole(),request.getBirthday(),request.getWorkStartDate()));
    }
}
