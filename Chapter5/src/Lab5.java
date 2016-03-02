import java.util.Scanner;
public class Lab5{
public static void main(String[] args)
{

       @SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);
            final int MIN_FLOORS = 1;   
            final int MIN_ROOMS = 10;  
            int floors; 
            int rooms; 
            int occrooms; 
            int totalrooms;  
            double occrate;  
            int vacant; 

 

            System.out.println("How many floors are there?");    

             do 
             {
            	System.out.println("The number of floors " + "must be at least " + MIN_FLOORS);
                floors = keyboard.nextInt();
             }

            while (floors < MIN_FLOORS);
             System.out.println("How many rooms are on each floor?");    

             do   
                {
                System.out.println("The number " + "of rooms must be greater than " + MIN_ROOMS);
                rooms = keyboard.nextInt();
             }


           while(rooms < MIN_ROOMS);    
            System.out.println("How many rooms are taken?");
            occrooms = keyboard.nextInt();
            totalrooms = (floors * rooms);
            occrate = ((double)occrooms / totalrooms);
            
        vacant = (totalrooms - occrooms);


            System.out.println("Total number of rooms in the hotel: " + totalrooms + " \nNumber of rooms taken are: " +

                    occrooms + "\nRooms that are vacant: " + vacant + "\nThe occratte is: " + occrate * 100 + "%.");

    }

}
