package com.group.commuteapp.dto.employee.response;

import com.group.commuteapp.domain.employee.Employee;
import com.group.commuteapp.domain.employee.EmployeeRepository;
import com.group.commuteapp.domain.employee.Role;

import java.time.LocalDate;

public class EmployeeLIstResponse {
    private String name;
    private String teamName;
    private Role role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    protected EmployeeLIstResponse(){}
    public EmployeeLIstResponse(Employee employee){
        this.name = employee.getName();
        this.teamName = employee.getTeam().getName();
        this.role = employee.getRole();
        this.birthday=employee.getBirthday();
        this.workStartDate=employee.getWorkStartDate();
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public Role getRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }
}
