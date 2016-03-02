
public class Month {
	   private int month[] = new int[1];
	
	    static String name;
	    
	    public Month(int array[])
	    {
	        for (int i = 0; i < array.length; i++)
	        {
	            if (array[i] < 0 || array[i] > 12)
	            {
	                
	               throw new IllegalArgumentException("Error. It cant be a  negative number or over 12.");
	            }
	            if(array[i] == 1)
	            {
	            	name = "January";
	            }
	            if(array[i] == 2)
	            {
	            	name = "February";
	            }
	            if(array[i] == 3)
	            {
	            	name = "March";
	            }
	            if(array[i] == 4)
	            {
	            	name = "April";
	            }
	            if(array[i] == 5)
	            {
	            	name = "May";
	            }
	            if(array[i] == 6)
	            {
	            	name = "June";
	            }
	            if(array[i] == 7)
	            {
	            	name = "July";
	            }
	            if(array[i] == 8)
	            {
	            	name = "August";
	            }
	            if(array[i] == 9)
	            {
	            	name = "September";
	            }
	            if(array[i] == 10)
	            {
	            	name = "October";
	            }
	            if(array[i] == 11)
	            {
	            	name = "November";
	            }
	            if(array[i] == 12)
	            {
	            	name = "December";
	            }
	        }
	        
	    }

		public String getTotal() {
			return name;
		}
}
