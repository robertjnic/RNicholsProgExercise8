/** Program: Color To Font
* File: ColorToFont.java
* Summary: Displays 5 words vertically, with randomized opacity and color.
* Author: Robert J. Nichols
* Date: November 17, 2017 
**/

//Importing all of the necessary components for the application.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class ColorToFont extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane(); //Instantiate new Pane
               
        //Loop used to generate the 5 randomized "Java" texts. 
        for(int i = 0; i < 5; i++){
            Text r = new Text(i * 50, 50, "Java");//Position relative to the last text generated
            r.setRotate(90); //Set rotation to 90, allowing the font to be vertical
            r.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22)); //Set font, weight, and pixel size
            r.setFill(Color.color(Math.random(), Math.random(), Math.random())); //Set the color to random
            r.setOpacity(Math.random());//Set opacity to random
            pane.getChildren().add(r); //add to the stage
        }
        Scene scene = new Scene(pane, 250, 75); //created the Scene
        
        primaryStage.setTitle("Color to Font"); //title of the application
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
