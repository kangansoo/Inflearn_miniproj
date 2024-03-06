package com.group.commuteapp.controller.employee;

import com.group.commuteapp.dto.employee.request.AddEmployeeRequest;
import com.group.commuteapp.dto.employee.response.EmployeeLIstResponse;
import com.group.commuteapp.service.employee.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/member")
    public List<EmployeeLIstResponse> getEmployeeList(){
        return employeeService.getEmployeeList();
    }
}
