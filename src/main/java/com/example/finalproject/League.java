package com.example.finalproject;

import java.util.List;

public class League {
    private String name;
    private String imagePath;
    private List<FootballTeam> teams;

    public League(String name, String imagePath, List<FootballTeam> teams) {
        this.name = name;
        this.imagePath = imagePath;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public List<FootballTeam> getTeams() {
        return teams;
    }
}
