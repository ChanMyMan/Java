import java.util.Scanner;
import java.io.*;
public class Demo {
	 public static void main(String args[])
		{
		 Scanner keyboard = new Scanner(System.in);
		 
		 int input;
		 
		 System.out.println("Can I have good input?");
		 input = keyboard.nextInt();
		 
		 try 
		 {
			 double math = 10 / input;
		 }
		 catch(Exception ex)
		 {
			 System.out.println("Can I have good input?");
			 input = keyboard.nextInt();
		 }
		
		}
}
