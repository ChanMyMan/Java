
public class Car {
//Instance Variable
	private int yearModel;
	private String make;
	private int speed;
	
//Car Constructor
	public Car(int year,String m)
	{
		yearModel = year;
		make = m;
		speed = 0;
	}
	
	// Accessors
	public int getYear()
	{
		return yearModel;
	}
	public String getMake()
	{
		return make;
	}
	public int getSpeed() {
		return speed;
		}

//Methods that perform calculations
	public void accelerate()
	{
		speed = speed + 5;
	}
	public void brake()
	{
		speed = speed - 5;
	}
}
