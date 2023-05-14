/** this code will solve the ploblem of having the button fill up the whole page by using pane
 * panes will have in positioning if items on the scene
 * in this instance we are to apply the following step
 * 1. import the layout stackpane
 * 2. create the stack pane object
 * 3. added the button on the pane
 * 4. add the pane 
 */
/* comment the code 
 * include the steps written in the comment above
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ContentStacked extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStages){	

		Button btOK = new Button("OK");
		btOK.setMaxSize(200, 20);

		StackPane pane = new StackPane();
		pane.getChildren().add(btOK);
		
		Scene scene = new Scene(pane);	
		primaryStages.setTitle("MyJavaFX");
		primaryStages.setScene(scene);
		primaryStages.show();
	}	
public static void main(String[] args){
		Application.launch();
	}
}
