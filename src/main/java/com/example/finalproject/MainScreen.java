package com.example.finalproject;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.*;

import static javafx.geometry.Pos.*;

public class MainScreen extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane mainPage = new Pane();
        mainPage.setStyle("-fx-background-color: #d0d0d0");

        VBox mainBox = new VBox();
        mainBox.setAlignment(CENTER);
        mainBox.setSpacing(10);

        HBox titleBox = new HBox();
        titleBox.setPrefSize(1200,80);
        titleBox.setBackground(Background.fill(Color.BLACK));

        Image logo = new Image("file:src/main/images/41Hsk2pRqKL.png");
        ImageView imageView = new ImageView(logo);
        imageView.setFitWidth(80);
        imageView.setFitHeight(80);

        Label title1 = new Label("Football Score");
        title1.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 48; -fx-font-weight: bold; -fx-text-fill: #d0d0d0");
        titleBox.setAlignment(CENTER_LEFT);
        titleBox.getChildren().addAll(imageView, title1);


        VBox leagues = new VBox();
        leagues.setAlignment(CENTER_LEFT);
        leagues.setPadding(new Insets(10, 0, 0, 10));
        leagues.setSpacing(10);

        Label PinnedLeagues = new Label("Pinned Leagues");
        PinnedLeagues.setStyle("-fx-font-family: 'Arial Rounded MT Bold'; -fx-font-size: 27; -fx-font-weight: bold; -fx-text-fill: #000000");
        PinnedLeagues.setPadding(new Insets(10,0,10,15));
        leagues.getChildren().add(PinnedLeagues);

        List<League> pinnedLeagues = Arrays.asList(
                new League("Premier League", "file:src/main/images/england.jpg", Arrays.asList(
                        new FootballTeam("Manchester United", "file:src/main/images/ManUnited.jpeg", "Old Trafford", "Eric tan Hag" ),
                        new FootballTeam("Manchester City", "file:src/main/images/ManCity.jpeg", "Etihad Stadium", "Pep Guardiola"),
                        new FootballTeam("Liverpool", "file:src/main/images/Liverpool.jpeg", "Anfield", "Jurgen Klopp"),
                        new FootballTeam("Chelsea", "file:src/main/images/44177a0cb8f73f4781a08bd7b400ca74.jpg", "Stamford Bridge", "Thomas Tuchel")
                )),
                new League("La League", "file:src/main/images/d0785240bb70d878a2cec6aeb30808a9.png", Arrays.asList(
                        new FootballTeam("Real Madrid", "file:src/main/images/fa4f0db883d36fbfcfe76c06d9012be0.jpg", "Santiago Bernabeu", "Carlo Ancelotti"),
                        new FootballTeam("Barcelona", "file:src/main/images/8065c9e0231029e8fda40e7eaeb0d933.jpg", "Camp Nou", "Xavi Hernandez"),
                        new FootballTeam("Atletico Madrid", "file:src/main/images/e6e3ef11313f0b8df3a2dec703a7d7de.jpg", "Wanda Metropolitano", "Diego Simeone"))),
                        //new FootballTeam("Sevilla", "file:src/main/images/Sevilla.jpeg", "Ramon Sanchez Pizjuan", "Julen Lopetegui"),
                        //new FootballTeam("Real Sociedad", "file:src/main/images/RealSociedad.jpeg", "Anoeta", "Imanol Alguacil"),
                        //new FootballTeam("Real Betis", "file:src/main/images/RealBetis.jpeg", "Benito Villamarin", "Manuel Pellegrini"),
                        //new FootballTeam("Villarreal", "file:src/main/images/Villarreal.jpeg", "Estadio de la Ceramica", "Unai Emery"))),
                new League("Seria A", "file:src/main/images/Flag_of_Italy_(1946–2003).png", Arrays.asList(
                        new FootballTeam("Inter Milan", "file:src/main/images/InterMilan.jpeg", "San Siro", "Simone Inzaghi"),
                        new FootballTeam("AC Milan", "file:src/main/images/ACMilan.jpeg", "San Siro", "Stefano Pioli"),
                        new FootballTeam("Napoli", "file:src/main/images/Napoli.jpeg", "Diego Armando Maradona", "Luciano Spalletti"),
                        new FootballTeam("Juventus", "file:src/main/images/Juventus.jpeg", "Allianz Stadium", "Massimiliano Allegri"),
                        new FootballTeam("Roma", "file:src/main/images/Roma.jpeg", "Stadio Olimpico", "Jose Mourinho"),
                        new FootballTeam("Lazio", "file:src/main/images/Lazio.jpeg", "Stadio Olimpico", "Maurizio Sarri"),
                        new FootballTeam("Atalanta", "file:src/main/images/Atalanta.jpeg", "Gewiss Stadium", "Gian Piero Gasperini"),
                        new FootballTeam("Fiorentina", "file:src/main/images/Fiorentina.jpeg", "Artemio Franchi", "Vincenzo Italiano"))),
                new League("Premiar League", "file:src/main/images/220302231734-01-ukrainedao-nft-flag.jpg", Arrays.asList(
                        new FootballTeam("Shakhtar Donetsk", "file:src/main/images/ShakhtarDonetsk.jpeg", "Donbass Arena", "Roberto De Zerbi"),
                        new FootballTeam("Dynamo Kyiv", "file:src/main/images/DynamoKyiv.jpeg", "NSC Olimpiyskiy", "Mircea Lucescu"),
                        new FootballTeam("Dnipro-1", "file:src/main/images/Dnipro-1.jpeg", "Dnipro-Arena", "Oleksandr Ishchenko"),
                        new FootballTeam("Zorya Luhansk", "file:src/main/images/ZoryaLuhansk.jpeg", "Slavutych-Arena", "Viktor Skrypnyk"),
                        new FootballTeam("Vorskla Poltava", "file:src/main/images/VorsklaPoltava.jpeg", "Butovsky Vorskla Stadium", "Vasyl Sachko"),
                        new FootballTeam("Kolos Kovalivka", "file:src/main/images/KolosKovalivka.jpeg", "Kolos Stadium", "Oleksandr Ishchenko"),
                        new FootballTeam("Desna Chernihiv", "file:src/main/images/DesnaChernihiv.jpeg", "Yunist Stadium", "Oleksandr Ryabokon"),
                        new FootballTeam("Oleksandriya", "file:src/main/images/Oleksandriya.jpeg", "KSK Nika", "Volodymyr Sharan"))),
                new League("League 1", "file:src/main/images/flag-of-france-flag-of-italy-national-flag-france.jpg", Arrays.asList(
                        new FootballTeam("Paris Saint-Germain", "file:src/main/images/ParisSaint-Germain.jpeg", "Parc des Princes", "Mauricio Pochettino"),
                        new FootballTeam("Marseille", "file:src/main/images/Marseille.jpeg", "Stade Velodrome", "Jorge Sampaoli"),
                        new FootballTeam("Lyon", "file:src/main/images/Lyon.jpeg", "Groupama Stadium", "Peter Bosz"),
                        new FootballTeam("Monaco", "file:src/main/images/Monaco.jpeg", "Stade Louis II", "Niko Kovac"),
                        new FootballTeam("Lille", "file:src/main/images/Lille.jpeg", "Stade Pierre-Mauroy", "Jocelyn Gourvennec"),
                        new FootballTeam("Nice", "file:src/main/images/Nice.jpeg", "Allianz Riviera", "Christophe Galtier"),
                        new FootballTeam("Rennes", "file:src/main/images/Rennes.jpeg", "Roazhon Park", "Bruno Genesio"),
                        new FootballTeam("Lens", "file:src/main/images/Lens.jpeg", "Stade Bollaert-Delelis", "Franck Haise"))),
                new League("Euro", "file:src/main/images/Снимок экрана 2024-04-29 в 12.55.21.png", Arrays.asList(
                        new FootballTeam("Germany", "file:src/main/images/Germany.jpeg", "Allianz Arena", "Hans-Dieter Flick"),
                        new FootballTeam("France", "file:src/main/images/France.jpeg", "Stade de France", "Didier Deschamps"),
                        new FootballTeam("Portugal", "file:src/main/images/Portugal.jpeg", "Estadio da Luz", "Fernando Santos"),
                        new FootballTeam("Belgium", "file:src/main/images/Belgium.jpeg", "King Baudouin Stadium", "Roberto Martinez"),
                        new FootballTeam("Spain", "file:src/main/images/Spain.jpeg", "Estadio Santiago Bernabeu", "Luis Enrique"),
                        new FootballTeam("Italy", "file:src/main/images/Italy.jpeg", "Stadio Olimpico", "Roberto Mancini"),
                        new FootballTeam("Netherlands", "file:src/main/images/Netherlands.jpeg", "Johan Cruyff Arena", "Louis van Gaal"),
                        new FootballTeam("England", "file:src/main/images/England.jpeg", "Wembley Stadium", "Gareth Southgate"))));
        ListView<FootballTeam> teamsListView = new ListView<>();
        for (League league : pinnedLeagues) {
            LeagueLabel leagueLabel = new LeagueLabel(league);
            leagueLabel.setOnMouseClicked(e -> {
                teamsListView.setItems(FXCollections.observableArrayList(league.getTeams()));
                teamsListView.setVisible(true);
            });
            leagues.getChildren().add(leagueLabel);
        }
        BorderPane leaguesandListView = new BorderPane();
        GridPane detailsPane = new GridPane();
        detailsPane.setAlignment(Pos.CENTER);
        detailsPane.setHgap(10);
        detailsPane.setVgap(10);
        detailsPane.setPadding(new Insets(25, 25, 25, 25));


        Label teamName = new Label();
        teamName.setId("team-name");
        Label stadiumLabel = new Label();
        stadiumLabel.setId("stadium-label");
        Label coachLabel = new Label();
        coachLabel.setId("coach-label");
        ImageView logoImageView = new ImageView();
        logoImageView.setFitWidth(100);
        logoImageView.setFitHeight(100);

        detailsPane.add(stadiumLabel, 0, 0);
        detailsPane.add(coachLabel, 0, 1);
        detailsPane.add(logoImageView, 0, 2);

        leaguesandListView.setCenter(detailsPane);

        teamsListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                teamName.setText(newValue.getName());
                stadiumLabel.setText(newValue.getStadium());
                coachLabel.setText(newValue.getCoach());
                logoImageView.setImage(new Image(newValue.getLogoPath()));
            }
        });


        leaguesandListView.setLeft(leagues);
        BorderPane.setMargin(teamsListView,new Insets(50, 10, 0, 0));
        leaguesandListView.setRight(teamsListView);
        mainBox.getChildren().addAll(titleBox, leaguesandListView);
        mainPage.getChildren().addAll(mainBox);
        Scene scene = new Scene(mainPage, 1200, 900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FootballScore");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
