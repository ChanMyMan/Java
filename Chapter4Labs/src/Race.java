import java.util.Scanner;
public class Race {
  static String runner1;
  static String runner2;
  static String runner3;
  static double time1;
  static double time2;
  static double time3;
  static String loser;
  static String second;
  static String winner;

	public static void main (String[] args){
		 
		
		@SuppressWarnings({ "resource"})
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Runner One's Name");
			runner1 = keyboard.nextLine();
			
			System.out.println("Runner One's time?");
						time1 = keyboard.nextDouble();
			
			System.out.println("Runner Two's Name");
			String string = keyboard.nextLine();
			runner2 = keyboard.nextLine();
			
			System.out.println("Runner Two's time?");
			time2 = keyboard.nextDouble();
			
			System.out.println("Runner Three's Name");
			String string1 = keyboard.nextLine();
			runner3 = keyboard.nextLine();
			
			System.out.println("Runner Three's time?");
			time3 = keyboard.nextDouble();
			
			
				   
				if(time1 < time2 && time1 < time3)
			        winner = runner1;
				   else if(time2 < time1 && time2 < time3)
					winner = runner2;
				   else if(time3 < time1 && time3 < time2)
					   winner = runner3;
				
				
				if(time1 > time2 && time1 < time3)
				second = runner1;
				else if(time2 > time1 && time2 < time3)
			    second = runner2;
				else if(time3 > time1 && time3 < time2)
				second = runner3;

				  
					if(time1 > time2 && time1 > time3)
				        loser = runner1;
					   else if(time2 > time1 && time2 > time3)
						loser = runner2;
					   else if(time3 > time1 && time3 > time2)
						   loser = runner3;
				
			
				System.out.println("First Place: " + winner + "\nSecond: " + second + "\nLast: " + loser);
				
				   


}
}