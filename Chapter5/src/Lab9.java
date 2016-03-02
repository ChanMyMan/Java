import java.util.Scanner;
public class Lab9{
public static void main(String[] args)
{

       @SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);
            final double min_START = 0;   
           
           
            double net;
            double gross;
            double state; 
            double federal;
            double fica = 0; 
            double id; 
          

 
            System.out.println("What is your id number? ");
            id =  keyboard.nextDouble();
            if(id <= 0)
            {
            	 System.out.println("What is your id number? (NEEDS TO BE MORE THAN 0!!");
                 id =  keyboard.nextDouble();
            }
            if (id > min_START)
            {
            	 System.out.println("What is your gross pay? ");
                 gross = keyboard.nextDouble();
                 
                 if(gross <= min_START)
                 {
                	 System.out.println("What is your GROSS PAY? (NEEDS TO BE MORE THAN 0!!");
                     gross =  keyboard.nextDouble(); 
                 }
                 
                 if (gross > min_START)
                 {
                	 System.out.println("What is your state tax? ");
                     state = keyboard.nextDouble(); 
                     
                     if (state > gross)
                     {
                    	 System.out.println("NEEDS TO BE LESS THAN THE GROSS PAY!!"); 
                    	 System.out.println("What is your state tax? ");
                         state = keyboard.nextDouble(); 
                     }
                     if (state < gross)
                     {
                    	 System.out.println("What is your federal tax? ");
                         federal = keyboard.nextDouble(); 
                         
                         if (federal > gross)
                         {
                        	 System.out.println("NEEDS TO BE LESS THAN THE GROSS PAY!!"); 
                        	 System.out.println("What is your federal tax? ");
                             federal = keyboard.nextDouble(); 
                         }
                         if (federal < gross)
                         {
                        	 System.out.println("What is your FICA withholding? ");
                             fica = keyboard.nextDouble(); 
                             
                             if(fica > gross)
                             {
                            	 System.out.println("NEEDS TO BE LESS THAN THE GROSS PAY!!"); 
                            	 System.out.println("What is your FICA withholding? ");
                                 fica = keyboard.nextDouble(); 
                             }
                             if(fica < gross)
                             {
                            	net = gross - state - federal - fica;
                            	 System.out.println("Your net pay is $" + net);
                               
                             }
                         }
                     }
                 }
            }
            
}
}
