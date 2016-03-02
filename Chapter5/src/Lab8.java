import java.util.Scanner;
public class Lab8
{
public static void main(String[] args)
    {
        int num;
        int max;
        int min;

        @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Use -99 to quit. ");
        System.out.print("\nEnter an integer: ");
        num = keyboard.nextInt();
        max = num;
        min = num;
        
        while(num != -99)
        {
            if (num > max)
            {
                max = num;
            }
            
            else if (num < min)
            {
                min = num;
            }
            
            else if (max == -99) 
            {
                max = num;
            }
            
            else if (min == -99)
            {
                min = num;
            }
            else
            { 
                System.out.print("Enter an integer: ");
                num = keyboard.nextInt();
            }
        }
 
        System.out.println("Biggest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}