import java.util.Scanner;
public class Lab7

{

    public static void main(String[] args)
    {
    	        @SuppressWarnings("resource")
				Scanner keyboard = new Scanner(System.in);
    	 
    	        int years;
    	        int months;
    	        double rainfall = 0;
    	        double totalRainfall = 0.0;
    	 
    	 
     System.out.println("Enter the number of years:");
    	        years = keyboard.nextInt();
    	 
    	        for(int count = 1; count<= years;count++)
    	        {
    	            for(months = 1; months<=12;months++)
    	            {
    	                System.out.println("Enter inches of rainfall for month "
    	                        + months);
    	                    rainfall = keyboard.nextDouble();
    	                    totalRainfall += rainfall;;
    	            }
    	 
    	    }
      System.out.println("Number of months: " + (years*12));
      System.out.println("Total inches of rainfall: " + totalRainfall);
      System.out.println("Average rainfall per month: " +
    	                (totalRainfall/(years * 12)));
    	    }
}