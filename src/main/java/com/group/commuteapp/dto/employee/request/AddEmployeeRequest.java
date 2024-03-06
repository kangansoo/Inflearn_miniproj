package com.group.commuteapp.dto.employee.request;

import com.group.commuteapp.domain.employee.Role;

import java.time.LocalDate;

public class AddEmployeeRequest {
    private String name;
    //teamRepository.findByName()에서 매개 변수가 String 타입이어야 하기 때문에 teamName으로 변경
    private String teamName;
    private Role role;
    private LocalDate birthday;
    private LocalDate workStartDate;

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
