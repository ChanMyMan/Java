public class TestScores
{
    private double scores[] = new double[5];  
    double total = 0;
    
    public TestScores(double array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < 0 || array[i] > 100)
            {
                
               throw new IllegalArgumentException("Error");
            }
            else
            {
                scores[i] = array[i];
                total += array[i];
            }
        }
        
    }

	public double getAverage() {
		// TODO Auto-generated method stub
		return total / 4;
	}
}