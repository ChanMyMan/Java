import java.util.Scanner;
public class TimeCalculator {
public static void main (String[] args){
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number of seconds: ");
		
		int value = keyboard.nextInt();
		
		if(value < 3600)
		{
			int minutes = value / 60;
			System.out.println(minutes + " minutes");
		}
		else if(value < 86400)
		{
			int hours = value / 3600;
			System.out.println(hours + " hours");
		}
		else if (value >= 86400)
		{
			int days = value / 86400;
			System.out.println(days + " days");
		}

}
}
