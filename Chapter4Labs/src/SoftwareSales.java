import java.util.Scanner;
public class SoftwareSales {
	public static void main (String[] args){
	 double number;
	 
	 @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many packages do you want?");
		number = keyboard.nextInt();

		if(number < 10)
		{
			double price = number * 99;
			System.out.println(price + "$");
		}
		else if(number > 10 && number <= 19)
		{
			double price =  (number * 99) -((number * 99) * .2);
			System.out.println(price + "$");
		}
		else if(number >= 20 && number <= 49)
		{
			double price = (number * 99) -((number * 99) * .3);
			System.out.println(price + "$");
		}
		else if(number >= 50 || number <= 99)
		{
			double price = (number * 99) -((number * 99) * .4);
			System.out.println(price + "$");
		}
		else if (number >= 100)
		{
			double price = (number * 99) / 2;
			System.out.println(price + "$");
		}
		
}

	public void setNumberOfPackages(double number) {
		// TODO Auto-generated method stub
		
	}
}