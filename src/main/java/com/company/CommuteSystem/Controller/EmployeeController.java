package com.company.CommuteSystem.Controller;

import com.company.CommuteSystem.dto.Request.EmployeeRegistRequest;
import com.company.CommuteSystem.Service.EmployeeService;
import com.company.CommuteSystem.dto.Response.EmployeeResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/regist")
    public void saveEmployee(@RequestBody EmployeeRegistRequest request) {
        employeeService.registEmployee(request);
    }

    @GetMapping("/show")
    public List<EmployeeResponse> getEmployees() {
        return employeeService.getEmployees();
    }

}
