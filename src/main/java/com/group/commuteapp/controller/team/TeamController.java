package com.group.commuteapp.controller.team;

import com.group.commuteapp.dto.team.request.AddTeamRequest;
import com.group.commuteapp.dto.team.response.TeamListResponse;
import com.group.commuteapp.service.team.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/team")
    public List<TeamListResponse> getTeamList(){
        return teamService.getTeamList();
    }
}