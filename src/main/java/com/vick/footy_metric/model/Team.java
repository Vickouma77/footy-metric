package com.vick.footy_metric.model;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private String league;
    private int yearFounded;
    private String stadium;
    private int capacity;
    private String manager;
    private int leaguePosition;
    private int leaguePoints;
    private String leagueGoals;
    private String leagueGoalsAgainst;
    private String leagueWins;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    public Team() {
    }
}
