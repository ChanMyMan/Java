
public class Vehicle {

	private String color;
	private int numberOfWheels;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public Vehicle(String color, int numberOfWheels) {
		super();
		this.color = color;
		this.numberOfWheels = numberOfWheels;
	}
	
}
