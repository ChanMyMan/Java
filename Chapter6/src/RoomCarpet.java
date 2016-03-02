import java.text.DecimalFormat;
public class RoomCarpet {
	private RoomDimension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension legth, double cost){
		size = legth;
		carpetCost = cost;
	}
	public double getTotalCost()
	{
		return carpetCost * size.getArea();
	}
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		String str = "Room dimenison: \n " + size + "\nCapert cost $" + dollar.format(getTotalCost());
		return str;
	}
}
