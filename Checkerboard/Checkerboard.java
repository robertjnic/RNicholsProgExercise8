/** Program: Checkerboard Program
* File: Checkerboard.java
* Summary: Displays an 8x8 checkerboard.
* Author: Robert J. Nichols
* Date: November 17, 2017 
**/

//Importing all of the necessary components for the application.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application {
    
    int rowNum = 8; //Set the row number
    int colNum = 8; //Set the col number
    int gridHeight = 10; //Set the grid height (rectangle)
    int gridWidth = 10; //Set the grid width (rectangle)
    int x, y; //Top left of the pane
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane(); //Instantiate new grid
        
        //loop used to generate the rectangles
        for (int row = 0; row < rowNum; row++) {
            for (int col = 0; col < colNum; col++) {
                Rectangle rec = new Rectangle();
                rec.setWidth(30);
                rec.setHeight(30);
                x = col * 20;
                y = col * 20;
                if((row % 2) == (col %2))
                    rec.setFill(Color.BLACK);
                else
                    rec.setFill(Color.WHITE);
                grid.setRowIndex(rec, row);
                grid.setColumnIndex(rec, col);
                grid.getChildren().addAll(rec);
            }
        }   
        
        Scene scene = new Scene(grid, 240,240); //Creating the scene 240x240
        
        primaryStage.setTitle("Checkboard"); //Title for the application
        primaryStage.setScene(scene); 
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
