
public class Inheritance {
public static void main(String[] args)
{
	Demo crazy = new Demo(500,1);
	BumbleBee buzz = new BumbleBee(0, 0);
	
	buzz.setNumberOfEyes(4);
	buzz.setNumberOfLegs(2);
	
	System.out.println("Our bee has " + buzz.getNumberOfEyes() + " eyes and " + buzz.getNumberOfLegs() + " legs");
	System.out.println(buzz.move());
	System.out.println(crazy.move());
	System.out.println("Our Crazy Bug has " + crazy.getNumberOfEyes() + " eyes and " + crazy.getNumberOfLegs() + " legs");
}
}
