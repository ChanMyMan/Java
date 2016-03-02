import java.util.Scanner;
public class TempConvertion {

	@SuppressWarnings("resource")
	public static void main (String[] args){
		double fahrenheit; 
		
		

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the temperature in fahrenheit? ");
		fahrenheit = keyboard.nextDouble ();
		Temperature t1 = new Temperature(fahrenheit);
		
		
		
		System.out.println("Celsius: " + t1.getCelsius());
		System.out.println("Kelvin: " + t1.getKelvin());
		
	     
		}
	
	
}