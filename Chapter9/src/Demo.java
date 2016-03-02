
public class Demo {

	//fields
	private int numberOfEyes;
	private int numberOfLegs;
	
	public String move()
	{
		return "The insert goes forward for 3 secounds.";
	}

	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public Demo(int numberOfEyes, int numberOfLegs) {
		super();
		this.numberOfEyes = numberOfEyes;
		this.numberOfLegs = numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
}
