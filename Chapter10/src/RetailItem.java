
public class RetailItem {
	   private double scores[] = new double[1];  
	    double total = 0;
	    
	    public RetailItem(double array[])
	    {
	        for (int i = 0; i < array.length; i++)
	        {
	            if (array[i] < 0)
	            {
	                
	               throw new IllegalArgumentException("Error. It cant be a  negative number.");
	            }
	            else
	            {
	                scores[i] = array[i];
	                total += array[i];
	            }
	        }
	        
	    }

		public double getTotal() {
			return total;
		}
}
