import java.util.Scanner;
public class lab2Data {
public static void main (String[] args){
		double time;
		double distance;
		
		
		Lab2 s1 = new Lab2(); 
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How long was your drive? (hours)");
		time  = keyboard.nextDouble();
		s1.setTime(time);
		
		System.out.println("How far did you go? (in miles)");
		distance  = keyboard.nextDouble();
		s1.setDistance(distance);
	
		for(int num = 0; num <= time; num++)
		{
			if(num >= 1 && num < 2)
			{
				System.out.println("Distance: " + s1.getDistance() + " Time: " + s1.getTime() + " MPH: " + s1.getTotal());
			}
			if(num >= 2 && num < 3)
			{
				System.out.println("Distance: " + s1.getDistance() * 2 + " Time: " + s1.getTime() * 2 + " MPH: " + s1.getTotal());
			}
			if(num >= 3)
			{
				System.out.println("Distance: " + s1.getDistance() * 3 + " Time: " + s1.getTime() * 3 + " MPH: " + s1.getTotal());
				
			}
		
		}
		
	
		
		
	}
}
