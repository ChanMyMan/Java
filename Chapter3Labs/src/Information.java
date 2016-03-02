
public class Information {
	public static void main (String [] args){
	PersonalInformation p1 = new PersonalInformation();
	PersonalInformation p2 = new PersonalInformation();
	PersonalInformation p3 = new PersonalInformation();
	
	p1.setName("Chandler Wolters");
	p1.setAge(19);
	p1.setAddress("1024 Beech Street");
	p1.setPhoneNumber("1618-882-8130");
	
	System.out.println("Name: " + p1.getName());
	System.out.println("Age: " + p1.getAge());
	System.out.println("Address: " + p1.getAddress());
	System.out.println("Phone Number: " + p1.getPhoneNumber());
	
	p2.setName("Stephen Wolters");
	p2.setAge(18);
	p2.setAddress("1024 Beech Street");
	p2.setPhoneNumber("1618-872-9999");
	
	System.out.println();
	System.out.println("Name: " + p2.getName());
	System.out.println("Age: " + p2.getAge());
	System.out.println("Address: " + p2.getAddress());
	System.out.println("Phone Number: " + p2.getPhoneNumber());
	
	p3.setName("Chad Wolters");
	p3.setAge(41);
	p3.setAddress("1024 Beech Street");
	p3.setPhoneNumber("1618-581-0944");
	
	System.out.println();
	System.out.println("Name: " + p3.getName());
	System.out.println("Age: " + p3.getAge());
	System.out.println("Address: " + p3.getAddress());
	System.out.println("Phone Number: " + p3.getPhoneNumber());
	
	}
}
