
public class Employee {
private String name;
private int idNumber;
private String department;
private String position;
//mutator
public void setName(String employeeName)
{
  name = employeeName;
}
public void setId(int id)
{
  idNumber = id;
}
public void setDepartment(String field)
{
	  department = field;
	}
public void setPosition(String rank)
{
	  position = rank;
	}
//accessor
public String getName() 
{
return name;	
}
public int getId() 
{
return idNumber;	
}
public String getDepartment() 
{
return department;	
}
public String getPosition() 
{
return position;	
}

}
