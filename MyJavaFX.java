// this is a basic java fx application 

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStages){		
		Button btOK = new Button("OK");
		
		//  Create a scene and place a label in the scene
		Scene scene = new Scene(btOK,1500,233);	
		// Set the stage title	
		primaryStages.setTitle("MyJavaFX");
		// Place the scene in the stage
		primaryStages.setScene(scene);
		// Display the stage 
		primaryStages.show();
	}

public static void main(String[] args){
		Application.launch();
	}
}
// the result is a button that fills the whole page
