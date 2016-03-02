
import java.util.Scanner;

public class LandTractDemo {
   public static void main(String[] args) {
       double length;
       double width;
       
       @SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);

       System.out.print("Enter the length of Tract 1: ");
       length = keyboard.nextDouble();
       System.out.print("Enter the width of Tract 1: ");
       width = keyboard.nextDouble();
       

       LandTract tract1 = new LandTract(length, width);
       double area1 = tract1.getArea(length, width);
       
       System.out.print("Enter the length of tract 2: ");
       length = keyboard.nextDouble();
       System.out.print("Enter the width of tract 2: ");
       width = keyboard.nextDouble();
       
      
       LandTract tract2 = new LandTract(length, width);
       double area2 = tract2.setArea(length, width);
       System.out.println("\nTract 1 Area: " + area1);
       System.out.println("Tract 2 Area: " + area2 + "\n");

       // Determine whether the two tracts are equal
       if (tract1.equals(tract2))
           System.out.println("Same size tracts!");
       else
           System.out.println("Different Size Tracts!!!");
   }
}
