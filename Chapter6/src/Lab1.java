import java.util.*;
public class Lab1 {
public static double area(double radius)
{
return (double)(Math.PI*Math.pow(radius,2));
}
public static int area(int length, int width)
{
return (length * width);
}
public static double area(double radius, double height)
{
return (double)(Math.PI*Math.pow(radius,2)*height);
}

public static void main(String args[])
{
	//Circle
@SuppressWarnings("resource")
Scanner in = new Scanner(System.in);
System.out.println("Area of Circle ");
System.out.println("Enter Radius: ");
double radius = in.nextDouble();
System.out.printf("Area of Circle : %.2f\n",Lab1.area(radius));

	//Rectangle
System.out.println("Area of Rectangle");
System.out.println("Enter Length: ");
int length = in.nextInt();
System.out.println("Enter Width: ");
int width = in.nextInt();
System.out.println("Area of Rectangle : "+Lab1.area(length,width));

	//Cylinder
System.out.println("Area of Cylinder ");
System.out.println("Enter Radius :");
radius = in.nextDouble(); 
System.out.println("Enter Height :");
double height = in.nextDouble(); 
System.out.printf("Area of Cylinder : %.2f\n",Lab1.area(radius,height));

}
}