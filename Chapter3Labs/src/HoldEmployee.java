
public class HoldEmployee {
public static void main (String [] args){
	
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	Employee e3 = new Employee();
	
	e1.setName("Susan Meyers");
	e1.setId(47899);
	e1.setDepartment("Accoounting");
	e1.setPosition("Vice President");
	
	System.out.println("Name: " + e1.getName());
	System.out.println("Id Number: " + e1.getId());
	System.out.println("Department: " + e1.getDepartment());
	System.out.println("Position: " + e1.getPosition());
	
	e2.setName("Mark Jones");
	e2.setId(39119);
	e2.setDepartment("IT");
	e2.setPosition("Programmer");
	
	System.out.println();
	System.out.println("Name: " + e2.getName());
	System.out.println("Id Number: " + e2.getId());
	System.out.println("Department: " + e2.getDepartment());
	System.out.println("Position: " + e2.getPosition());
	
	e3.setName("Joy Rogers");
	e3.setId(89119);
	e3.setDepartment("Manufacturing");
	e3.setPosition("Engineer");
	
	System.out.println();
	System.out.println("Name: " + e3.getName());
	System.out.println("Id Number: " + e3.getId());
	System.out.println("Department: " + e3.getDepartment());
	System.out.println("Position: " + e3.getPosition());
	
}
}
