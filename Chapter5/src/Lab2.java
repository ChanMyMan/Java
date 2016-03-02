
public class Lab2 {
	private double distance;
	private double time;
	@SuppressWarnings("unused")
	private double total;
	
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	} 
	public double getTotal() {
		return distance / time;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
