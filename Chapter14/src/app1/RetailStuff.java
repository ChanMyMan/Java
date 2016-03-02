package app1;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RetailStuff 
{

	@FXML
	private Button submit;
	
	@FXML
	private  Label outPrint;
	
	@FXML
	private  TextField wholeSale;
	
	@FXML
	private TextField percent;
	
	
	public void initialize()
	{
	
	}
	
	
	public void convertButtonListener()
	{
	
String str = wholeSale.getText();
String str1 = percent.getText();
		
 double total = Double.parseDouble(str) + (Double.parseDouble(str) * ((Double.parseDouble(str1)/100)));
		
		outPrint.setText("The price is $" + total);
		
	}
}
