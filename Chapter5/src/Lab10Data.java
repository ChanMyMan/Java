import java.util.Scanner;

public class Lab10Data {
	public static void main (String[] args){
		
	 double amount;
	 double endOfMonth;
	 double month;
	 double deposited;
	 double withdrawn;
	 double total;
	 
	 Lab10 s1 = new Lab10();
	 
	 @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much is in your account?");
		amount  = keyboard.nextDouble();
		s1. setAmount(amount);
	
		System.out.println("How many months is you account going?");
		month  = keyboard.nextDouble();
		s1.setMonth(month);
		
	for(int count = 1; count<= month;)
	{
            System.out.println("Month " + count);
            System.out.println("Deposited? ");
            deposited  = keyboard.nextDouble();
            System.out.println("Withdraw? ");
            withdrawn  = keyboard.nextDouble();
            count++;
            int sum = 0;
            sum += deposited;
            withdrawn += withdrawn;
            System.out.println("Over the " + month + ". Your statement is here" + "\nWithdrawn ammount: " + withdrawn + "\nDeposited amount: "+ sum);
      
	
	}

}
}
