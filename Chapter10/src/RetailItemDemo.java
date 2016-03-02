
public class RetailItemDemo {
    public static void main(String[] args) throws Exception
    {
        
        double[] price = {2004.36}; 
       
        try
        {
            new RetailItem(price);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        
        RetailItem avg = new RetailItem(price); 
            System.out.print("The price of that shirt is... " + "\n$" + avg.getTotal());
        
    }
}
