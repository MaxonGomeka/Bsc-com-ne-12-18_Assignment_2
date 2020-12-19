
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import  javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public  class AnimalFeedCalculator extends Application{
  //creating textFields
     private TextField textFieldmaize = new TextField();
     private TextField  textFieldsoya = new TextField();
     private  TextField textFieldgroundNuts = new TextField();
     private TextField textFieldsalt = new TextField();
    private TextArea textAreaResult = new TextArea();
     //overriding start method froma application class
    @Override
    public void start(Stage primaryStage){
        //creating gridPane
        GridPane gridPane = new GridPane();
        //creating calculation button
        Button calculate = new Button("Calculate");
        calculate.setMaxWidth(100);
        //Instance handler
        CalculateHandler calculateHandler = new  CalculateHandler();
        //registering a button to a handler
        calculate.setOnAction(calculateHandler);
        //setting all text fields to position bottom_center
        textFieldmaize.setAlignment(Pos.BOTTOM_RIGHT);
        textFieldsoya.setAlignment(Pos.BOTTOM_RIGHT);
        textFieldgroundNuts.setAlignment(Pos.BOTTOM_RIGHT);
        textFieldsalt.setAlignment(Pos.BOTTOM_RIGHT);
        //setting a background color for GridPane
        gridPane.setStyle("-fx-background-color: Aquamarine");
        //setting gaps between nodes
        gridPane.setHgap(6);
        gridPane.setVgap(6);
        //placing gridPane at the top center
        gridPane.setAlignment(Pos.TOP_CENTER);
        //making labels
        Label maize = new Label("Maize");
        Label soya = new Label("Soya");
        Label groundNuts = new Label("Groundnuts");
        Label salt = new Label("Salt");
        gridPane.setPadding(new Insets(30,25,59,20));
        gridPane.add(getBorderPane(),1,0);
        gridPane.add(maize,0,1);
        gridPane.add(textFieldmaize,1,1);
        gridPane.add(soya,0,3);
        gridPane.add(textFieldsoya,1,3);
        gridPane.add(groundNuts,0,4);
        gridPane.add(textFieldgroundNuts,1,4);
        gridPane.add(salt,0,5);
        gridPane.add(textFieldsalt,1,5);
        gridPane.add(calculate,1,7);
        gridPane.add(textAreaResult,1,10);
        textAreaResult.setMaxSize(200,200);
        textAreaResult.setStyle("-fx-border: inset");

        ///creating a scene
        Scene scene = new Scene(gridPane,400,500);
        primaryStage.setTitle("Animal Feed Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private BorderPane getBorderPane(){
        BorderPane borderPane = new BorderPane();

        Text text = new Text(20, 20, "Enter Ingredients Amounts in Kilograms (Kg)");
        text.setFont(Font.font("New Times Roman", FontWeight.BOLD,
                FontPosture.REGULAR, 12));
        borderPane.setTop(text);
        borderPane.setStyle("-fx-background-color: white");
        return  borderPane;
    }
    private void calculateAnimalFeed(){

        double maize1 = Double.parseDouble(textFieldmaize.getText());
        double groundnuts1 = Double.parseDouble(textFieldgroundNuts.getText());
        double soya1 = Double.parseDouble(textFieldsoya.getText());
        double salt1 = Double.parseDouble(textFieldsalt.getText());
        AnimalFeed animalFeed = new AnimalFeed(maize1,groundnuts1,soya1,salt1);
        textAreaResult.setText(animalFeed.getAnimaleFeed());
    }
    class CalculateHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            calculateAnimalFeed();
        }


    }
} 