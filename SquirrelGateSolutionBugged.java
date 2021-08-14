import java.util.Arrays;

public class SquirrelGateSolutionBugged{
   
   /**
      This method takes two parameters; an array of int values named k,
      & a String named s.

      If s and k are not of the same length, the method returns an empty
      string: ""
      
      Otherwise, it returns a new String of the same length than s.
      In that returned string, each character at index n (between 0 and length -1)
      is the result of adding the value k[n] to the character at index n
      in the parameter string s.
   **/
   public static String decode(int[] k, String s){
      String result = "";
      
      if(k.length != s.length()) 
         return result;
      
      for(int i = 0 ; i < k.length ; i++)
         result += "" + (char)(s.charAt(i) + k[i]);
      
      return result;
   } // end of method
   
   
   
   /**
      This method must create an array of 9 int values named guess.
      Initially, all values in the guess array are set to -1.
      
      Assume that, so far, we have guessed 0 of the 9 digits right.
      
      For each element of the guess array: 
         For each digit between 0 and 9 (inclusive):
            Assign that value to that element
            Call the dial method with the guess array as parameter
            
            If the return value shows that we guessed all 9 digits
            then
                  return the guess array
            
            If the return value shows that we guessed 1 more digit than before
            then
                  update the number of digits we guessed right
                  stop trying new values for this element of the array
                  and skip instead to trying digits for the next element
   **/
   public static int[] hack(){
   
      int[] guess = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
      int score = 0, best = 0;
      
      for(int i=0 ; i < guess.length ; i++)
         for(int j=0 ; j < 10 ; j++){
            guess[i] = j; 
            score = dial(guess);
            if(score > best){
               best =+ 1;
               break;
            } // end if
         } // end for j
   
      return guess;
   } // end of method
   
   
   
   /**
      The main method is provided to you by the squirrels; do not modify it.
   **/
   public static void main(String[] args){
   
      System.out.println("TESTING decode method");
      // this string makes it easy to see how each letter has been modified
      String msg = "abcde";
   
      // We put a bunch of keys in a 2D array so we may iterate over them
      int[][] keys = {
         {0,0,0,0,0},   // this key changes nothing
         {1,1,1,1,1},   // take next letter for each character in the message
         {4,3,2,1,0}    // applies different changes to different characters
         };
      
      // iterate over all the keys and use them on the above msg
      for(int test=0 ; test < keys.length ; test++)
         System.out.println("\tDecoding " + msg
            + " with key " + Arrays.toString(keys[test])
            + " --> "      + decode(keys[test], msg));
      
      System.out.println("\n\nRUNNING the hackTheGate method");
      int[] key = hack();    
      
      System.out.println("\n\nThe squirrels left you a note...");
      System.out.print(decode(key, "BweGlm]ks"));
   } // end of main
   
   
   
   /**
      The method dial is provided to you by the squirrels; do not modify it.
      
      It takes an array of 9 int values that represents a possible 9 digit
      combination and returns the number of values that you guessed right;
      i.e., when the right value is in the right position in the combination
   **/
   public static int dial(int[] guess){
      int[] solution = {0, 2, 0, 1, 9, 0, 4, 3, 0}; // code to discover
      int score = 0; // how many digits were discovered in the guess
      
      if(guess.length != solution.length){
         System.out.println("Your code is not of the appropriate length; "
            + guess.length + " instead of " + solution.length);
         System.exit(-1);
      } // end if
      
      for(int e: guess)
         if( (e < -1) || (e > 9)){
            System.out.println("Out of range value found in your guess: " + e);
            System.exit(-1);
         } // end if
         
      for(int i=0 ; i < solution.length ; i++)
         score += (solution[i] == guess[i])? 1 : 0;
         
      if(score == solution.length)
         System.out.print("\nAll chevrons locked with code ");
      else
         System.out.print("\t" + score + " chevron(s) locked with code ");
      
      System.out.println(Arrays.toString(guess));
      
      return score;
   } // end of method
} // end of class
