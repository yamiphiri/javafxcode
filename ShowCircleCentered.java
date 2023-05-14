/* this code demostrate the concept of dynamic binding */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class ShowCircleCentered extends Application {
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane(); 

        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        // bind the x center properter of the the circle to the width of the circe, oncw thw width of window shange due to maximising or minimising the window
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        // bind the y center properter of the the circle to the width of the circe, oncw thw width of window shange due to maximising or minimising the window
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        pane.getChildren().add(circle); 

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Show Circle Centered"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }   
	public static void main(String[] args) {
        Application.launch(args);
    }
}