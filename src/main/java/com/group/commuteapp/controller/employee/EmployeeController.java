package com.group.commuteapp.controller.employee;

import com.group.commuteapp.dto.employee.AddEmployeeRequest;
import com.group.commuteapp.repository.employee.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    public EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/member")
    public void addEmployee(@RequestBody AddEmployeeRequest request){
        employeeService.addEmployee(request);
    }
}
