
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
     private TextField maizetextField = new TextField();
     private TextField  soyatextField = new TextField();
     private  TextField groundNuttextFields = new TextField();
     private TextField salttextField = new TextField();
     private TextArea resulttextArea = new TextArea();
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
        maizetextField.setAlignment(Pos.BOTTOM_RIGHT);
        soyatextField.setAlignment(Pos.BOTTOM_RIGHT);
        groundNuttextFields.setAlignment(Pos.BOTTOM_RIGHT);
        salttextField.setAlignment(Pos.BOTTOM_RIGHT);
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
        //adding nodes into the gridPane
        gridPane.add(getBorderPane(),1,0);
        gridPane.add(maize,0,1);
        gridPane.add(maizetextField,1,1);
        gridPane.add(soya,0,3);
        gridPane.add(soyatextField,1,3);
        gridPane.add(groundNuts,0,4);
        gridPane.add(groundNuttextFields,1,4);
        gridPane.add(salt,0,5);
        gridPane.add(salttextField,1,5);
        gridPane.add(calculate,1,7);
        gridPane.add(resulttextArea,1,10);
        //setting size of the Text Area
        resulttextArea.setMaxSize(270,200);
        resulttextArea.setStyle("-fx-border: inset");


        ///creating a scene
        Scene scene = new Scene(gridPane,400,500);
        //setting stage title
        primaryStage.setTitle("Animal Feed Calculator");
        //adding scene into a stage
        primaryStage.setScene(scene);
        //display a stage
        primaryStage.show();

    }
    //bierdePane method that contains a text
    private BorderPane getBorderPane(){
    	//borderPane instance
        BorderPane borderPane = new BorderPane();
        //creating a text intstance and adding font
        Text text = new Text(20, 20, "Enter Ingredients Amounts in Kilograms (Kg)");
        text.setFont(Font.font("New Times Roman", FontWeight.BOLD,
                FontPosture.REGULAR, 12));
        //adding text into borderPne
        borderPane.setTop(text);
        borderPane.setStyle("-fx-background-color: white");
        return  borderPane;
    }
    //feed calculation method
    private void calculateAnimalFeed(){
        //getting maize kgs entered by the user on text field
        double maizekgs = Double.parseDouble(maizetextField.getText());

        //getting groundnuts kgs entered by the user on text field
        double groundnutskgs = Double.parseDouble(groundNuttextFields.getText());

        //getting soya kgs entered by the user on text field
        double soyakgs = Double.parseDouble(soyatextField.getText());

        //getting salt kgs entered by the user on text field
        double saltkgs = Double.parseDouble(salttextField.getText());

        //creating an instance for Animal feed class
        AnimalFeeds animalFeed = new AnimalFeed(maizekgs,groundnutskgs,soyakgs,saltkgs);

        //setting the results on the Text Area
        resulttextArea.setText(animalFeed.getAnimalFeedResults());

    }
    //EventHandler interface class
    class CalculateHandler implements EventHandler<ActionEvent>{
    	//Overriding a handle method
        @Override
        public void handle(ActionEvent e){
            calculateAnimalFeed();
        }


    }
} 