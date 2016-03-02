import java.util.Scanner;
public class MonthDemo {
	public static void main(String[] args) {
        
        Month object1 = new Month();
        System.out.println("Month " + object1.getMonthNumber()
                + " = " + object1);
        Month object2 = new Month(2);
        for (int i = 1; i <= 12; i++) {
            object2.setMonthNumber(i);
            System.out.println("Month " + object2.getMonthNumber()
                    + " name is " + object2);
        }
        System.out.println("Enter a month name/Number or Q to quite: ");
        Month object5;
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            int intMonth;
            String strMonth = keyboard.next();
           
            try {
                intMonth = Integer.parseInt(strMonth);
                object5 = new Month(intMonth);
                System.out.println(object5.getMonthName());
            } catch (Exception e) {
                object5 = new Month(strMonth);
                System.out.println(object5.getMonthNumber());
            }
        }
    }


}
