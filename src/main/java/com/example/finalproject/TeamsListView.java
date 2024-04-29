package com.example.finalproject;

import javafx.scene.control.ListView;
public class TeamsListView extends ListView<String> {
    public TeamsListView() {
        setVisible(false);
        setStyle("-fx-control-inner-background: #d0d0d0; " +
                    "-fx-border-color: #000000; " +
                    "-fx-border-width: 5px; " +
                    "-fx-border-radius: 10px; " +
                    "-fx-font-family: 'Arial'; " +
                    "-fx-font-size: 18px; " +
                    "-fx-text-fill: #000000; " +
                    "-fx-selection-bar: #c08c8c; " +
                    "-fx-focus-color: transparent; " +
                    "-fx-faint-focus-color: transparent;");
        }
    }

