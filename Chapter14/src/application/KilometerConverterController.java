package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KilometerConverterController 
{

	@FXML
	private Button convertButton;
	
	@FXML
	private  TextField kilometerTextField;
	
	@FXML
	private  Label outputLabel;
	
	@FXML
	private Label promptLabel;
	
	
	public void initialize()
	{
	
	}
	
	
	public void convertButtonListener()
	{
		final double COVERSION_FACTORS = 0.6214;
		
		String str = kilometerTextField.getText();
		
		double miles = Double.parseDouble(str) * COVERSION_FACTORS;
		
		outputLabel.setText(str + " kilometer is " + miles + " miles.");
		
	}
}
