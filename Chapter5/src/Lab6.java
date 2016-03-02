import java.util.Scanner;
public class Lab6{
public static void main(String[] args)
{

       @SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);
            final int MIN_START = 2;   
            final int MIN_PERCENT = 0;
            int animal; 
            int increase;
            int day;
            int total; 
          

 

            System.out.println("How many orgranism?");    

             do 
             {
            	System.out.println("The number needs to be at least 2. ");
                animal = keyboard.nextInt();
             }

            while (animal < MIN_START);
             System.out.println("What is the average daily increase?");    

             do   
                {
                System.out.println("The number needs to be greater than 0.");
                increase = keyboard.nextInt();
             }


           while(increase < MIN_PERCENT);    
            System.out.println("How many days will they multiply?");
            day = keyboard.nextInt();
           total = increase / 10 * (day *animal) ;

            System.out.println("Total number is " + total);

    }

}
