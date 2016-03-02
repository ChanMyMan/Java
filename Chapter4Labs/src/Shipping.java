import java.util.Scanner;
public class Shipping {
  static double weight;
  static double miles;

	public static void main (String[] args){
		 
		
		@SuppressWarnings({ "resource"})
			Scanner keyboard = new Scanner(System.in);
			System.out.println("How heavy is your package (in kilogram)?");
			weight = keyboard.nextDouble();
			
			System.out.println("How many miles?");
			miles = keyboard.nextDouble();
			
			if (weight <= 2)
			{
			double price = (1.1 * miles) / 500;
			System.out.println("$" + price);
			}
			
			if (weight <= 6 && weight > 2)
			{
			double price = (2.2 * miles) / 500;
			System.out.println("$" + price);
			}
			if (weight <= 10 && weight > 6)
			{
			double price = (3.7 * miles) / 500;
			System.out.println("$" + price);
			}
			if (weight > 10)
			{
			double price = (4.8 * miles) / 500;
			System.out.println("$" + price);
			}
			

}
}