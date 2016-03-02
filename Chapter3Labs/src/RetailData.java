
public class RetailData {
	public static void main (String [] args){
	Retail r1 = new Retail();
	Retail r2 = new Retail();
	Retail r3 = new Retail();
	
	r1.setDescription("Jacket");
	r1.setPrice(59.95);
	r1.setUnitsOnHand(12);
	System.out.println("Description : " + r1.getDescription());
	System.out.println("Units on Hand : " + r1.getUnitsOnHand());
	System.out.println("Price : $" + r1.getPrice());
	
	r2.setDescription("Designer Jeans");
	r2.setPrice(34.95);
	r2.setUnitsOnHand(40);
	System.out.println("");
	System.out.println("Description : " + r2.getDescription());
	System.out.println("Units on Hand : " + r2.getUnitsOnHand());
	System.out.println("Price : $" + r2.getPrice());
	
	r3.setDescription("Shirt");
	r3.setPrice(24.95);
	r3.setUnitsOnHand(20);
	System.out.println("");
	System.out.println("Description : " + r3.getDescription());
	System.out.println("Units on Hand : " + r3.getUnitsOnHand());
	System.out.println("Price : $" + r3.getPrice());
}
}