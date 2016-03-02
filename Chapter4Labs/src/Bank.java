import java.util.Scanner;
public class Bank {
public static void main (String[] args){
		 double number;
		 double check;
		 
		 @SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			System.out.println("How many checks did you use?");
			check = keyboard.nextDouble();

			System.out.println("How much is in your account?");
			number = keyboard.nextDouble();

			if(number < 400 && check < 20)
			{
				double total = 25 + (check * .10);
				System.out.println("$" + total);
				
			}
			if(number > 400 && check < 20)
			{
				double total = 10 + (check * .10);
				System.out.println("$" + total);
				
			}
			
			//Checks over 20
			if (number > 400 && check < 39 && check > 20)
			{
				double total = 10 + (check * .08);
				System.out.println("$" + total);
				
			}
			if (number < 400 && check < 39 && check > 20)
			{
				double total = 25 + (check * .08);
				System.out.println("$" + total);
				
			}
			
			//Checks over 40
			if (number > 400 && check < 59 && check > 39)
			{
				double total = 10 + (check * .06);
				System.out.println("$" + total);
				
			}
			if (number < 400 && check < 59 && check > 39)
			{
				double total = 25 + (check * .06);
				System.out.println("$" + total);
				
			}
			
			// Checks over 60
			if (number > 400 && check > 60)
			{
				double total = 10 + (check * .04);
				System.out.println("$" + total);
				
			}
			if (number < 400 && check > 60)
			{
				double total = 25 + (check * .04);
				System.out.println("$" + total);
				
			}
	}
}

