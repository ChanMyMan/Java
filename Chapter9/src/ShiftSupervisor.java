import java.text.DecimalFormat;

public class ShiftSupervisor extends Employee {

	

	private double salary;
	private double annualBonus;
	
	  public ShiftSupervisor(String n, String num, String date,double annualBonus, double salary)
	    {
	    super(n, num, date);
	  this.salary = salary;
	  this.annualBonus = annualBonus;
	    }
	

	public ShiftSupervisor() {
		// TODO Auto-generated constructor stub
	}


	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualBonus() {
		return annualBonus;
	}
	public void setAnnualBonus(double annualBonus) {
		this.annualBonus = annualBonus;
	}	
	@Override
	public String toString() {
		String str = super.toString();
		 DecimalFormat dollar = new DecimalFormat("$#,##0.00");
		return  str += "\nSalary: " +   dollar.format(salary) + "\nAnnualBonu: " +   dollar.format(annualBonus);
	}

}
