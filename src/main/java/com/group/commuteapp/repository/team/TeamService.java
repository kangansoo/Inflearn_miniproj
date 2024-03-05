package com.group.commuteapp.repository.team;

import com.group.commuteapp.domain.team.Team;
import com.group.commuteapp.domain.team.TeamRepository;
import com.group.commuteapp.dto.team.AddTeamRequest;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    public final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public void addTeam(AddTeamRequest request){
        Team existTeam = teamRepository.findByName(request.getName())
                .orElse(null);
        if(existTeam!=null){
            throw new IllegalArgumentException("이미 존재하는 팀입니다.");
        }
        Team team = teamRepository.save(new Team(request.getName()));
    }
}
