import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
import java.io.File;
public class Lab3 {
	

	public static void main (String[] args) throws IOException
	{
		double time;
		double distance;
		
		
		Lab2 s1 = new Lab2(); 
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How long was your drive? (hours)");
		time  = keyboard.nextDouble();
		s1.setTime(time);
		
		System.out.println("H0w far did you go? (in miles)");
		distance  = keyboard.nextDouble();
		s1.setDistance(distance);
		
	
		
	  
	    
		File file = new File ("C:/Users/Me/Desktop/directory/file.txt");
	    PrintWriter printWriter = new PrintWriter ("file.txt");
	
		for(int num = 0; num <= 3; num++)
		{
			
			if(num >= 1 && num < 2)
			{
				printWriter.println("Distance: " + s1.getDistance() + " Time: " + s1.getTime() + " MPH: " + s1.getTotal());
			}
			
			if(num >= 2 && num < 3)
			{
				printWriter.println("Distance: " + s1.getDistance() * 2 + " Time: " + s1.getTime() * 2 + " MPH: " + s1.getTotal()); 
			}
			
			if(num >= 3)
			{
				printWriter.println("Distance: " + s1.getDistance() * 3 + " Time: " + s1.getTime() * 3 + " MPH: " + s1.getTotal());
			}
			
		
		}
		 printWriter.close (); 
		
		
		
	}
}
