/* this code will demostrate different layouts
 * Please uncomment some indicated line to check different layout
 * TODO please implement gridpane and borderpane
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// nodes that will be put on the scene to be displyed on the stage(window)
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
// layouts
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class TestLayouts extends Application {
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {       
       
        /*componets to add on the stage */
        Circle circle = new Circle();
        circle.setRadius(200);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        Rectangle rectangle  = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.GREEN);

        Polygon traingle = new Polygon();
        traingle.getPoints().addAll(new Double[]{
            0.0, 0.0,
            0.0, 100.0,
            100.0, 0.0 });

        /* layouts 
        to test the layouts comment on the uncommented layout and uncomment the layout you want to see
        */                

        Pane pane = new Pane(); 
        // FlowPane pane = new FlowPane(); 
        // StackPane pane = new StackPane();
        // HBox pane = new HBox();
        // VBox pane = new VBox();
        // TODO implement borderpane and grid pane

        pane.getChildren().add(circle); 
        pane.getChildren().add(rectangle); 
        pane.getChildren().add(traingle); 

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Show Circle Centered"); 
        primaryStage.setScene(scene);
        
        primaryStage.show(); 
    }   
	public static void main(String[] args) {
        Application.launch(args);
    }
}
