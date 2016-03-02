import java.util.*;
public class Rainfall {
double rainfall[];
public Rainfall()
{
	rainfall = new double[12]; 
}
void inputRainFall()
{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rainfall of 12 months: ");
		
		for(int i=0;i<12;i++)
		{
		System.out.println("Month "+(i+1)+": ");
		rainfall[i] = input.nextDouble();
		while(rainfall[i]<0)
		{
		
		System.out.println("Rainfall needs to be 0 or more!");
		rainfall[i] = input.nextDouble();
		}
		} 
		}
		
	double totalRainFall()
		{
		double total = 0;
		for(int i=0;i<12;i++)
		{
		total += rainfall[i];
		}
		return total;
		}
		double avgMonthlyRainFall()
		{
		double avg = (double)this.totalRainFall() / 12;
		return avg;
		}
		
		double mostRainFall()
		{
		double most = 0;
		most = rainfall[0];
		for(int i=0;i<12;i++)
		{
		if(most<rainfall[i])
		{
		most = i;
		}
		}
		return most; 
		}
		
		double leastRainFall()
		{
		double least = 0;
		least = rainfall[0];
		for(int i=0;i<12;i++)
		{
		if(rainfall[i]<least)
		{
		least = i;
		}
		}
		return least; 

}

}