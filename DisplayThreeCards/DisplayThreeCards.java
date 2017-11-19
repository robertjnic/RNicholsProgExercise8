/** Program: Display Three Cards
* File: DisplayThreeCards.java
* Summary: Displays three random cards to the UI using images of cards.
* Author: Robert J. Nichols
* Date: November 17, 2017 
**/

//Importing all of the necessary components for the application.
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class DisplayThreeCards extends Application {
       
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new HBox(15);//Creating the HBox for the cards to be listed
    
        ArrayList<Image> cardsList = new ArrayList(); //Image arraylist

        //for loop is used to assign each card to the number
        for (int j = 1; j < 53; j++){
            //Doubled the size of the cards in order to see the cards outlines. Original size would have been 68x100.
            cardsList.add(new Image("Image/cards/" + j + ".png", 136, 200, false, false)); 
        }
        
        java.util.Collections.shuffle(cardsList); //shuffle the cards
        
        Image card1 = cardsList.get(0); //Set the image to the index in the array
        Image card2 = cardsList.get(1); //Set the image to the index in the array
        Image card3 = cardsList.get(2); //Set the image to the index in the array
        pane.getChildren().add(new ImageView(card1)); //Add each card to the pane
        pane.getChildren().add(new ImageView(card2)); //Add each card to the pane
        pane.getChildren().add(new ImageView(card3)); //Add each card to the pane
               
        Scene scene = new Scene(pane, 438, 200); //Creat the Scene
        
        primaryStage.setTitle("Display Three Cards"); //Title of the application
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
