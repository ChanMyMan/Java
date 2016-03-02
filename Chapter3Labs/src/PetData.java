import java.util.Scanner;
public class PetData {
public static void main (String[] args){
					 
	 String name;
	 String type;
	 double age ;
	
		  
	@SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Whats your pets name?");
	name = keyboard.nextLine();
	
	System.out.println("What type of pet is it?");
	type = keyboard.nextLine();
			
	Pet p1 = new Pet(type, name);
	
	
			
	
	System.out.println("Whats your pets age?");
	age = keyboard.nextDouble();
			
	Pet p2 = new Pet(age);
	
	
	System.out.println("Pets Name :" + p1.getName() + "\nType of Pet: " + p1.getType() + "\nPets Age: " + p2.getAge());
			
			
			
		}
	}

