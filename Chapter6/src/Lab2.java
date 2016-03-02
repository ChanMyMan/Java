
public class Lab2<Lab> {

private String description;
private int units;

public Lab2()
{
	description = "";
	units = 0;
			
}


public Lab2(String d)
{
	description = d;
	units = 0;
			
}
public Lab2(String d, int u)
{
	description = d;
	units = u;
			
}
public Lab2(Lab d)
{
	description = (String) d;
			
}	
public void setDescription(String d)
{
	description = d;
			
}
public void setUnits(int u)
{
	units = u;
}
public String getDescription()
{
	return description;
			
}
public int getUnits()
{
	return units;
}
			}


