package com.example.finalproject;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import static javafx.geometry.Pos.CENTER_LEFT;

public class LeagueLabel extends HBox {
    private League league;
    private boolean selected;

    public LeagueLabel(League league) {
        this.league = league;
        this.selected = false;

        Image logo = new Image(league.getImagePath());
        ImageView logoView = new ImageView(logo);
        logoView.setFitWidth(30);
        logoView.setFitHeight(25);

        HoverLabel leagueName = new HoverLabel(league.getName());

        setAlignment(CENTER_LEFT);
        getChildren().addAll(logoView, leagueName);
    }

    public League getLeague() {
        return league;
    }
    public boolean isSelected(){
        return selected;
    }
    public void setSelected(boolean selected){
        this.selected = selected;
    }
}
