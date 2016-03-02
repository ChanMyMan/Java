import java.util.Scanner;
public class TestAverage {
	public static void main (String[] args){
		
		 
		  double test1;
		  double test2;
		  double test3;
		  
		  TestScore t1 = new TestScore();
		  
		  
		 
		  
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
			
			System.out.println("Your average test score is " + t1.total());
			
	}

}
