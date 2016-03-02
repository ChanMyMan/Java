import java.util.*;
public class ChargeAccount {
	 static int accountNumbers[] = {5658845,4520125,7895122,8777541,8451277,1302850,8080152,456255,5552012,5050552,7825877,1250255,1005231,654231,3852085,7576651,7881200,4581002};
	 static int inputAccount;
	static boolean found = false;
	 public static void main(String args[])
		{
	
		
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
	
}
}
