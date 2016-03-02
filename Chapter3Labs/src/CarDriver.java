
public class CarDriver {
public static void main(String[] args)
{
	Car myFirstCar = new Car(1997, "Chevy");
	System.out.println("My first car was a " + myFirstCar.getYear() + " " + myFirstCar.getMake());

	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.accelerate();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.accelerate();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.accelerate();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.accelerate();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.accelerate();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.brake();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.brake();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.brake();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.brake();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.brake();
	System.out.println("The current speed is : " + myFirstCar.getSpeed());
	myFirstCar.brake();
	
}
}
