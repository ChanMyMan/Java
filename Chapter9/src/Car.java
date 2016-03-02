
public class Car extends Vehicle{

	private String make;
	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public Car(String color, int numWheels, String make)
	{
		super(color,numWheels);
		this.setMake(make);
	}

	
}
