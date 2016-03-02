package app1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Retail extends Application {

	public void start(Stage stage) throws Exception
	{
		//Loads FXML File
		Parent parent = FXMLLoader.load(getClass().getResource("Retail.fxml"));
		
		//Build The scene
		Scene scene = new Scene(parent);
		
		//Display our windows
		stage.setTitle("Retail");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		//Run app
		launch(args);
	}
	
}
