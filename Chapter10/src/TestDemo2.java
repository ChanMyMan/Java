
public class TestDemo2 {
    public static void main(String[] args) throws Exception
    {
        
        double[] scores = { 97.5, 66.7, 88.0, 105.0}; 
       
        try
        {
            new TestScores(scores);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        
            TestScores avg = new TestScores(scores); 
            System.out.print("The Average of the your scores is " + avg.getAverage());
        
    }
}
