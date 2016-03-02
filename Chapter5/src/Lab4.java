import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args)
{
   

        double pennies;      
        double totalPay;     
        double maxDays;     
        double day;         

        @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many days did you work?");
		maxDays  = keyboard.nextDouble();
		

          day = 1;
          pennies = 1;
          totalPay = 0;

          while (day <= maxDays)

          {

        	  System.out.println("Day:\t" + day + "\nPennies Earned:\t" + pennies);
             totalPay = totalPay + pennies;
             day++;
             pennies = pennies * 2;

          }

          System.out.println("Total pay: $" + totalPay / 100);

    }

 

}
