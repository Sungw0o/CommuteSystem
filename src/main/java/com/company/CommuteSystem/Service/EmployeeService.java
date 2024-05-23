package com.company.CommuteSystem.Service;

import com.company.CommuteSystem.domain.Employee;
import com.company.CommuteSystem.domain.Team;
import com.company.CommuteSystem.Repository.EmployeeRepository;
import com.company.CommuteSystem.Repository.TeamRepository;
import com.company.CommuteSystem.dto.Request.EmployeeRegistRequest;
import com.company.CommuteSystem.dto.Response.EmployeeResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final TeamRepository teamRepository;

    public EmployeeService(EmployeeRepository employeeRepository, TeamRepository teamRepository) {
        this.employeeRepository = employeeRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void registEmployee(EmployeeRegistRequest request){
        Team team = teamRepository.findByName(request.getTeamName())
                .orElseThrow(IllegalArgumentException::new);
        employeeRepository.save(new Employee(team,request.getName(),request.getismanager(),request.getBirthday(),request.getWorkStartDate()));
    }

    @Transactional
    public List<EmployeeResponse> getEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeResponse> employlist = employees.stream().map(employee -> new EmployeeResponse())
                .collect(Collectors.toList());
        return employlist;
    }
}