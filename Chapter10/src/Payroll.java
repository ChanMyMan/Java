
public class Payroll {
	private String workerId;
	private String workerName;
	private double hourlyPayRate;
	private double hours;
	
	
	public Payroll(String name) {
		workerName = name;
	}
	
 
	

	public Payroll(String name, String id) {
		workerName = name;
		workerId = id; 
	}




	public Payroll() {
		// TODO Auto-generated constructor stub
	}




	public String getWorkerId() {
		return workerId;
	}
	public void setWorkerId(String id) {
		workerId = id;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String name) {
		workerName = name;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}
	public double grossPay() {
		return (hours * hourlyPayRate);
		
		

	}
	 

}

