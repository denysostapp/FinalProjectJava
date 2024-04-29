package com.example.finalproject;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class HoverHBox extends HBox {

    public HoverHBox(String text, String imagePath) {
        // Создаем метку
        Label label = new Label(text);
        // Создаем изображение
        Image image = new Image(imagePath);
        ImageView imageView = new ImageView(image);
        // Устанавливаем размеры изображения (по желанию)
        imageView.setFitWidth(30);
        imageView.setFitHeight(25);
        // Добавляем метку и изображение в контейнер HBox
        getChildren().addAll(imageView, label);

        // Устанавливаем цвет фона по умолчанию и скругление углов
        setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10), null)));

        // Обработчик события при наведении курсора мыши
        setOnMouseEntered(e -> {
            setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(10), null))); // Изменяем цвет фона при наведении
        });

        // Обработчик события при уходе курсора мыши
        setOnMouseExited(e -> {
            setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10), null))); // Возвращаем цвет фона к обычному при уходе
        });
    }
}

