import java.util.*;
public class Payroll {
		public int employeeId[] = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
		public int hours[];
		public double payRate[];
		public double wages[];
		static Scanner in = new Scanner(System.in);
Payroll()
		{
		hours = new int[7];
		payRate = new double[7];
		wages = new double[7];
		}
		void inputHoursAndPayrate()
		{
		
		System.out.println("Input Hours and Payrate for 7 Employee.");
		for(int i=0;i<7;i++)
		{
		System.out.println("Enter Hours for Employee #" + employeeId[i]);
		hours[i] = in.nextInt();
		while(hours[i] <0 )
		{
		System.out.println("Error! Please enter Hours again");
		hours[i] = in.nextInt();
		}
		
		System.out.println("Enter Payrate for Employee #" + employeeId[i]);
		payRate[i] = in.nextDouble();
		while(payRate[i] <0 || payRate[i]< 6)
		{
		System.out.println("Error! Needs to be more than 6!!");
		payRate[i] = in.nextDouble();
		}
		}
		}
		
		void displayGrossWage()
		{
		System.out.println("Gross wage of all 7 Employees:"); 
		for(int i=0;i<7;i++)
		{
		wages[i] = hours[i]*payRate[i];
		System.out.println("Gross wage of Employee #"+employeeId[i]+" : $"+wages[i]); 
		}
		}
		
		double returnWage(int ID)
		{
		for(int i=0;i<7;i++)
		{
		if(employeeId[i] == ID)
		{
		
		return wages[i];
		}
		}
		return 0;
		}
		public static void main(String args[])
		{
		Payroll pay = new Payroll();
		pay.inputHoursAndPayrate();
		pay.displayGrossWage();
		System.out.println("Enter Employee ID for which you want to get Wages : ");
		int search = in.nextInt();
		double wage = pay.returnWage(search);
		if(wage != 0)
		System.out.println("Gross Wage for Employee : "+search+" is :"+wage);
		else if(wage ==0)
		System.out.println("Employee ID not found!");
}
}
