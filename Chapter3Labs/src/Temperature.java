
public class Temperature {
	private double ftmp;
	

	public Temperature (double fahrenheit) {
		ftmp = fahrenheit;
	}
	
	// Accessors
		public double getFahrenheit()
		{
			return ftmp;
		}
		public double getCelsius()
		{
			return (5.0/9.0)*(ftmp - 32); 
		}
		public double getKelvin()
		{
			return ((5.0/9.0)*(ftmp - 32)) + 273; 
		}
	
	
}
