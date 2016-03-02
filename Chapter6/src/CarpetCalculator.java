import java.util.Scanner;
public class CarpetCalculator {

	public static void main(String[] args)
	{
		final double CARPET_PRICE = 8.0;
		double length;
		double width;
		RoomDimension dimension;
		RoomCarpet room;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will display price of carpet for a room.");
		System.out.println("Enter the length: ");	
		length = keyboard.nextDouble();
		
		System.out.println("Enter the width: ");	
		width = keyboard.nextDouble();
		
		dimension = new RoomDimension(length, width);
		room= new RoomCarpet(dimension, CARPET_PRICE);
		
		System.out.println(room);
	}
}
