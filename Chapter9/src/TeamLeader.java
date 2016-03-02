import java.text.DecimalFormat;

public class TeamLeader extends ShiftSupervisor {
	
	private double monthlyBonus;
	private String trainingHours;
	
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	public String getTrainingHours() {
		return trainingHours;
	}
	public void setTrainingHours(String trainingHours) {
		this.trainingHours = trainingHours;
	}
	@Override
	public String toString() {
	 String str = super.toString();
		 DecimalFormat dollar = new DecimalFormat("$#,##0.00");
		return  str += "\nMonthlyBonus: " +   dollar.format(monthlyBonus) + "\nTrainingHours: " +  (trainingHours);
	}
	
	
	
}
