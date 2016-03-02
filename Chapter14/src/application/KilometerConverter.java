package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class KilometerConverter extends Application {

	public void start(Stage stage) throws Exception
	{
		//Loads FXML File
		Parent parent = FXMLLoader.load(getClass().getResource("KilometerConverter.fxml"));
		
		//Build The scene
		Scene scene = new Scene(parent);
		
		//Display our windows
		stage.setTitle("Kilometer Converter");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		//Run app
		launch(args);
	}
	
}
