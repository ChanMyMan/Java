import java.util.Scanner;
public class DEMO {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("How many students are there?");
		int num = keyboard.nextInt();
		
		String[] students = new String[num];
		System.out.println("There are " + students.length + " elements in the array!");
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for(int x : numbers)
		{
			System.out.println(x);
		}
		numbers = new int[5];
		for(int x : numbers)
		{
			System.out.println(x);
		}
		int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
		int[] secondArray = {1,2,3,4,5,6,7,8,9,10};
	
		
		showArray(secondArray);
		
	}
	public static void showArray(int[] myNumbers)
	{
		System.out.println("The SHow Array Method: ");
		for(int i : myNumbers)
		{
			System.out.println(i);
		}
	}
}
