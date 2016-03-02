import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Lab5 {
	 static int accountNumbers[] = new int[18]; /*{5658845,4520125,7895122,8777541,8451277,1302850,8080152,456255,5552012,5050552,7825877,1250255,1005231,654231,3852085,7576651,7881200,4581002}*/
	 static int inputAccount;
	static boolean found = false;
	 public static void main(String args[]) throws FileNotFoundException
		{
	
		  Scanner dataFile = new Scanner(new File("Code.txt"));

	        @SuppressWarnings("unused")
			ArrayList<Double> ChargeAccount = new ArrayList<Double>();

	        int index = 0;
	        while(dataFile.hasNextLine() && index < accountNumbers.length){
	            accountNumbers[index] = dataFile.nextInt();
	            index++;
	            
	            //Scanner scanner = new Scanner(line);
	         //   scanner.useDelimiter(",");
	          //  while(scanner.hasNextDouble()){
	          //      salesData.add(scanner.nextDouble());
	            //}
	          //  scanner.close();
	        }

	        

	       
	  
	@SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your account number?");
	inputAccount = keyboard.nextInt();
	
	for(int i = 0; i < accountNumbers.length; i++)
	{
	if(inputAccount == accountNumbers[i])
	{
		found = true;
		break;
		}
	}
	if (found)
	{
		System.out.println("The account # " + inputAccount + " is valid!");
	}
	else 
	{
		System.out.println("The account # " + inputAccount + " is invalid!");
	}
	dataFile.close();
}
}
