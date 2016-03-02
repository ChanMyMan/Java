import java.util.Scanner;
public class WidgetData {
	public static void main (String[] args){
		
	 
	  double number;
	 	  
	 
	  
	  @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many widgets need to be made?");
		number = keyboard.nextDouble();
		
		 Widget w1 = new Widget(number);
		
		System.out.println(w1.total() + " days for " + w1.getNumberOfWidgets() + " widgets to be made.");
		
		
		
	}
}
