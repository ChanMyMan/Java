
public class RainfallDemo {
	public static void main(String args[])
	{
	Rainfall r1 = new Rainfall();
	
	r1.inputRainFall();
	
	System.out.println("Total rainfall of the year: " + r1.totalRainFall());
	System.out.printf("Avegare monthly rainfall of the year : %.2f\n",r1.avgMonthlyRainFall());
	System.out.println("Month with most rain: "+r1.mostRainFall());
	System.out.println("Month with least rain: "+r1.leastRainFall());

	}
}
