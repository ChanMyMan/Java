import java.util.Scanner;
public class FatGram {
   static double fat;
   static double calories;


	public static void main (String[] args){
		 
		
		@SuppressWarnings({ "resource"})
			Scanner keyboard = new Scanner(System.in);
			System.out.println("How many calories on in it?");
			calories = keyboard.nextDouble();
			
			System.out.println("How much fat grams are in it?");
			fat = keyboard.nextDouble();
			
		 //math 
			double calorieFat = fat * 9;			
			double total = calorieFat / calories;
			
		//If
			if (calorieFat < total * .3)
			{
				System.out.println("This is low in fat!!");
				System.out.println(total);
			}
			else if (fat > calories)
			{
			System.out.println("Error");
			}
			else 
		System.out.println(total);
			
			

}
}
