import java.util.Scanner; 

public class ExamDemo
{
   public static void main(String[] args)
   {
      System.out.println("Exam "); 
      @SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in); 

      
      System.out.println("Mark A, B, C, or D"); 

      
      String[] answers = new String[20]; 
      String answer; 

      for (int i = 0; i < 20; i++)
      {
         do
         {
            System.out.print("Number " + (i+1) + ":"); 
            answer = keyboard.nextLine(); 
         } while (!isValidAnswer(answer)); 

         answers[i] = answer; 
      }

      Exam exam = new Exam(answers); 
      System.out.println("HOW YOU DID"); 
      System.out.println("Total Correct: " + exam.totalCorrect()); 
      System.out.println("Total Incorrect: " + exam.totalIncorrect()); 
      String passed = exam.passed() ? "YES" : "NO"; 
      System.out.println("Passed: " + passed); 
      if (exam.totalIncorrect() > 0)
      {
          System.out.println("The incorrect answerss are: ");
          int missedIndex; 
          for (int i = 0; i < exam.totalIncorrect(); i++)
          {
            missedIndex = exam.questionsMissed()[i]+1; 
            System.out.print(" " + missedIndex); 
          }
      }
   }
   public static boolean isValidAnswer (String answer)
   {
      return "A".equalsIgnoreCase(answer) || 
         "B".equalsIgnoreCase(answer)
         || "C".equalsIgnoreCase(answer) || 
         "D".equalsIgnoreCase(answer); 
   }
}