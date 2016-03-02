import java.util.Scanner;
public class TestScoreData {
	public static void main (String[] args){
		
		 
		  double test1;
		  double test2;
		  double test3;
		  
		  TestScores t1 = new TestScores();
		  
		  
		 
		  
		  @SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Grade for Test One?");
			test1 = keyboard.nextDouble();
			t1.setTest1(test1);
			
			
			System.out.println("Grade for Test One?");
			test2 = keyboard.nextDouble();
			t1.setTest2(test2);
			
			
			System.out.println("Grade for Test One?");
			test3 = keyboard.nextDouble();
			t1.setTest3(test3);
			
			if(t1.total() > 90)
			{
				System.out.println("A");
			}
			else if(t1.total() > 80)
			{
				System.out.println("B");
			}
			else if(t1.total() > 70)
			{
				System.out.println("C");
			}
			else if(t1.total() > 60)
			{
				System.out.println("D");
			}
			else if(t1.total() < 60)
			{
				System.out.println("F");
			}
			

			
			System.out.println("Your average test score is " + t1.total());
			
	}

}
