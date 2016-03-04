package app3;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
public class NameController 
{
	@FXML
	private  Label outPrint;
	
	@FXML
	private  TextField first;
	
	@FXML
	private  TextField middle;
	
	@FXML
	private  TextField last;
	
	@FXML
	private  TextField title;
	
	@FXML
	private  Button one;
	
	@FXML
	private  Button two;
	
	@FXML
	private  Button three;
	
	@FXML
	private  Button four;
	
	@FXML
	private  Button five;
	
	@FXML
	private  Button six;
	
	public void initialize()
	{
	
	}
	
	
	public void convertButtonOne()
	{
		String str = first.getText();
		String str2 = middle.getText();
		String str3 = last.getText();
		String str4 = title.getText();
		
		outPrint.setText(str4 + str + " " + str2 + " " + str3);
	}
	public void convertButtonTwo()
	{
		String str = first.getText();
		String str2 = middle.getText();
		String str3 = last.getText();
		String str4 = title.getText();
		
		outPrint.setText(str + " " + str2 + " " + str3);
	}
	public void convertButtonThree()
	{
		String str = first.getText();
		String str2 = middle.getText();
		String str3 = last.getText();
		String str4 = title.getText();
		
		outPrint.setText(str + " " + str3);
	}
	public void convertButtonFour()
	{
		String str = first.getText();
		String str2 = middle.getText();
		String str3 = last.getText();
		String str4 = title.getText();
		
		outPrint.setText(str3 + ", " + str + " " + str2);
	}
	public void convertButtonFive()
	{
		String str = first.getText();
		String str2 = middle.getText();
		String str3 = last.getText();
		String str4 = title.getText();
		
		outPrint.setText(str4 + str + str2 + str3);
	}
	public void convertButtonSix()
	{
		String str = first.getText();
		String str2 = middle.getText();
		String str3 = last.getText();
		String str4 = title.getText();
		
		outPrint.setText(str4 + str + str2 + str3);	
	}
	
}
