import java.util.Scanner;
public class CircleData {
	public static void main (String[] args){
		
		 double radius;

		 
		 Circle c1 = new Circle();
		 
		 @SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			System.out.println("What is the radius of the circle?");
			radius = keyboard.nextDouble();
			c1.setRadius(radius);
			
			
			System.out.println("Radius: " + c1.getRadius() + "\nArea : " + c1.getArea() + "\nDiameter: " + c1.getDiameter() + "\nCircumference: " + c1.getCircumference());
			
		
			
		
	}

}
