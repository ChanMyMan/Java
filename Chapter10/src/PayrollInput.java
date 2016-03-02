import java.util.Scanner;
public class PayrollInput {
	public static void main (String[] args){
		String name;
		int id = null;
		
		
		Payroll p1 = new Payroll();
		

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the worker's name?");
		name = keyboard.nextLine ();
       
        try
        {
            new Payroll(name);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
		
		
		System.out.println("What is the worker's id?");
		id = keyboard.nextInt ();
		p1.setWorkerId(id);
		
	    try
        {
            new Payroll(id);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
		 
	
		
		
		System.out.println("How many hours did he/she work?");
		p1.setHours(keyboard.nextDouble ());
		//System.out.println(p1.getHours());
		
		System.out.println("How much are they making an hour?");
		p1.setHourlyPayRate(keyboard.nextDouble ());
		
		//System.out.println(p1.getHourlyPayRate());
		
	
		
		System.out.printf(p1.getWorkerName() + " makes $%,.2f",p1.grossPay());
		System.out.println(" this week.");
	}		
}