package Controller;

import com.company.CommuteSystem.Request.EmployeeRegistRequest;
import com.company.CommuteSystem.Service.EmployeeService;
import com.company.CommuteSystem.domain.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee/save")
    public void saveEmployee(@RequestBody EmployeeRegistRequest request) {
        employeeService.RegistEmployee(request);
    }
}
