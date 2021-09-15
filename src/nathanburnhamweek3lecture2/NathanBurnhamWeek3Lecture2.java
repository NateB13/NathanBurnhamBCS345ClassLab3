//Nathan Burnham BCS345 9/15/21
//Lab 3 task method that takes string, and returns how many chars are there.

package nathanburnhamweek3lecture2;

public class NathanBurnhamWeek3Lecture2 
{
       public static int getLength(String word)
   {
       int length;
       length = word.length();
       return length;
   }
   
      public static void main(String[] args)
   {
       int length;
       String word = "Thousand";
       length = getLength(word);
       System.out.println("Length of word is: " + length);
   }
}