import java.util.Scanner;
public class Greater {
	static double nums[] = {7, 8, 9, 10, 64, 90, 70, 100, 103};

	public static void main(String args[])
	{

		
	@SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Give me a num to compare to the others...");
	double n = keyboard.nextDouble(); 
	
for(int i = 0; i <= nums[i]; i++)
	{
				
				while(n > nums[i])
				{
				System.out.println("Number less than " + n +" is "+ nums[i]);
				i++;
				}
				while(n < nums[i])
				{
					System.out.println("Number more than " + n +" is "+ nums[i]);
					i++;
				}
		}
	}
	}
	
	

	
