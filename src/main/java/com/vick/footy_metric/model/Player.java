package com.vick.footy_metric.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
    private int age;
    private String country;

    @ManyToOne // Many players to one team
    @JoinColumn(name = "team_id")
    private Team team;

    public Player() {
    }
}
