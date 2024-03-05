package com.group.commuteapp.domain.team;

import jakarta.persistence.*;

@Entity
public class Team {
    @Id
    @Column(nullable = false, unique = true)
    private String name;
    private String manager;
    private int memberCount;

    public Team(){}
    public Team(String name) {
        this.name = name;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void addMember(){
        this.memberCount++;
    }
}
