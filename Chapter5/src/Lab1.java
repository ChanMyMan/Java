import java.util.Scanner;
public class Lab1 {
	public static void main (String[] args){
		
		int number;
		int start = 1;
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a positive number.");
		number  = keyboard.nextInt();
		
		while(start <= number)
		{
			
			System.out.println(start);
			
			sum += start;
			start++;
		}
		 System.out.println(sum);
	}
}

