package com.group.commuteapp.dto.team.response;

import com.group.commuteapp.domain.team.Team;

public class TeamListResponse {
    private String name;
    private String manager;
    private int memberCount;

    public TeamListResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManager();
        this.memberCount = team.getMemberCount();
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public int getMemberCount() {
        return memberCount;
    }
}
