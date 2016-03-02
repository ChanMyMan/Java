
public class Pet {
	private String name;
	private String type;
	private double age;
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public Pet(double age) {
		this.age = age;
	}

	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Type
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//Age
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
}
