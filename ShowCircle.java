/* this code will a circle on the stages
 * 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class ShowCircle extends Application {
	@Override 
    public void start(Stage primaryStage) {
        // Create a pane to hold the circle
        Pane pane = new Pane(); 

        /*the will be the componet that will be displayed on the window */    
        // Create a circle and set its properties
        Circle circle = new Circle();        
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(8);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setFill(Color.RED);

        
        // you can check what is added on the pane
        System.out.println("the pane without childer or components or node "+pane.getChildren());
        // Add commponent (circle) to the pane
        pane.getChildren().add(circle); 
        // you can check what is added on the pane
        System.out.println("the pane after adding a childer or components or node in this cae a circle "+pane.getChildren());

       
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("ShowCircleCentered"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }   
	public static void main(String[] args) {
        Application.launch(args);
    }
}
