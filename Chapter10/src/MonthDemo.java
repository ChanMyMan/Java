
public class MonthDemo {
	 public static void main(String[] args) throws Exception
	    {
	        
	        int[] month = {10}; 
	       
	        try
	        {
	            new Month(month);
	        }
	        catch (IllegalArgumentException e)
	        {
	            System.out.println(e.getMessage());
	        }
	        
	        Month avg = new Month(month); 
	            System.out.print("The month you entered is... " + avg.getTotal());
	        
	    }
}
