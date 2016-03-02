  public class Exam
    {
      
       private String[] correctAnswers = 
                                     {"B", "D", "A", "A", "C", "A", 
                                      "B", "A", "C", "D", 
                                      "B", "C", "D", "A", 
                                      "D", "C", "C", "B", "D", "A"}; 

       private String[] userAnswers; 
       int[] missed = new int[correctAnswers.length]; 

       public Exam (String[] Answers)
       {
          userAnswers = new String[Answers.length]; 

          for (int i = 0; i < Answers.length; i++)
          {
             userAnswers[i] = Answers[i]; 
          }
       }

    
       public boolean passed()
       {
          if (totalCorrect() >= 15)
             return true; 
          else
             return false; 
       }

      
       public int totalCorrect()
       {
          int correctCount = 0; 

          for (int i = 0; i < correctAnswers.length; i++)
          {
             if (userAnswers[i].equalsIgnoreCase(correctAnswers[i]))
             {
                correctCount++; 
             }
          }
          return correctCount; 
       }

    
       public int totalIncorrect()
       {
          int incorrectCount = 0; 

          for (int i = 0; i < correctAnswers.length; i++)
          {
             if (!userAnswers[i].equalsIgnoreCase(correctAnswers[i]))
             {
                missed[incorrectCount] = i; 
                incorrectCount++; 
             }
          }
          return incorrectCount; 
       }

       public int[] questionsMissed()
       {
          return missed; 
       }

    }