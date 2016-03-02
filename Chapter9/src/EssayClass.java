public class EssayClass
{
 public static void main(String[] args)
 {
  Essay e1 = new Essay();
 
  
  e1.setGrammar(30);
  e1.setSpelling(15);
  e1.setCorrectLength(19);
  e1.setContent(28);
  
  e1.setScore(e1.getTotal());

  
  System.out.println("Grammer: " +e1.getGrammarScore() + "\nSpelling: " + e1.getSpellingScore() +
         "\nLength: " + e1.getCorrectLengthScore() + "\nContent: "
         + e1.getContentScore() + "\nYou got " + e1.getTotal() + " out of a 100." + "\nYou got a/an: " + e1.getGrade() + ".\n");
 }
}
