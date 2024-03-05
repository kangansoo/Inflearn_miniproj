package com.group.commuteapp.repository.employee;

import com.group.commuteapp.domain.employee.Employee;
import com.group.commuteapp.domain.employee.EmployeeRepository;
import com.group.commuteapp.domain.employee.Role;
import com.group.commuteapp.domain.team.Team;
import com.group.commuteapp.domain.team.TeamRepository;
import com.group.commuteapp.dto.employee.AddEmployeeRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    public final EmployeeRepository employeeRepository;
    public final TeamRepository teamRepository;
    public EmployeeService(EmployeeRepository employeeRepository, TeamRepository teamRepository){
        this.employeeRepository = employeeRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void addEmployee(AddEmployeeRequest request){
        Team team = teamRepository.findByName(request.getTeamName())
                .orElseThrow(()->new IllegalArgumentException("팀이 존재하지 않습니다."));
        employeeRepository.save(new Employee(request.getName(), team, request.getRole(), request.getBirthday(), request.getWorkStartDate()));
        if (request.getRole()== Role.MANAGER){
            team.setManager(request.getName());
        }
        team.addMember();
    }
}
