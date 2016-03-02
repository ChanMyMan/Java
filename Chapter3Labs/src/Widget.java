
public class Widget {

	private double numberOfDays;
	private double numberOfWidgets;
	public double numberPerHour = 10;
	

	public Widget(double number) {
		this.numberOfWidgets = number;
	}
	public double getNumberOfWidgets() {
		return numberOfWidgets;
	}
	public void setNumberOfWidgets(double number) {
		numberOfWidgets = number;
	}
	public double getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(double days) {
		numberOfDays = days;
	}
	public double total() {
		return (numberOfWidgets / 160);
	}
}
