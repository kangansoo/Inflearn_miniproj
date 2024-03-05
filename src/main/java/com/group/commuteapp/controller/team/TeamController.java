package com.group.commuteapp.controller.team;

import com.group.commuteapp.dto.team.AddTeamRequest;
import com.group.commuteapp.repository.team.TeamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
    @PostMapping("/team")
    public void addTeam(@RequestBody AddTeamRequest request){
        teamService.addTeam(request);
    }
}
