package com.example.finalproject;

public class FootballTeam {
    private String name;
    private String logoPath;
    private String stadium;
    private String coach;
    public FootballTeam(String name, String logoPath, String stadium, String coach) {
        this.name = name;
        this.logoPath = logoPath;
        this.stadium = stadium;
        this.coach = coach;
    }
    public String getName() {
        return name;
    }
    public String getLogoPath() {
        return logoPath;
    }
    public String getStadium() {
        return stadium;
    }
    public String getCoach() {
        return coach;
    }

}
