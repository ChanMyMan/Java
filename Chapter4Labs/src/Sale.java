import java.util.Scanner;
public class Sale {
	public static void main (String[] args){
		
		 
		  double number;
		 
		  
		  SoftwareSales s1 = new SoftwareSales();
		  
		  
		 
		  
		  @SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			System.out.println("How many packages do you want?");
			number = keyboard.nextInt();
			s1.setNumberOfPackages(number);
			
			if(number < 10)
			{
				double price = number * 99;
				System.out.println(price + "$");
			}
			else if(number > 10 && number <= 19)
			{
				double price = 0.8 * (number * 99);
				System.out.println(price + "$");
			}
			else if(number >= 20 && number <= 49)
			{
				double price = (number * 99) * .2;
				System.out.println(price + "$");
			}
			else if(number >= 50 && number <= 99)
			{
				double price = (number * 99) * .3;
				System.out.println(price + "$");
			}
			else if (number >= 100)
			{
				double price = (number * 99) * .5;
				System.out.println(price + "$");
			}
			
	}

}