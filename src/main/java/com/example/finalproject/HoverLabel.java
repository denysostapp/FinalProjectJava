package com.example.finalproject;

import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class HoverLabel extends Label {
    public HoverLabel(String text) {
        super(text);
        setStyle("-fx-font-family:'Arial'; -fx-font-size: 21; -fx-font-weight: bold; -fx-text-fill: #1c1a1a");

        setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, null)));

        setOnMouseEntered(e -> {
            setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(10), null))); // Изменяем цвет фона при наведении
        });

        setOnMouseExited(e -> {
            setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, null))); // Возвращаем цвет фона к обычному при уходе
        });
    }
}
