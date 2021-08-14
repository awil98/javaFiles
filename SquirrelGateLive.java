import java.util.Arrays;

public class SquirrelGateLive{
   
   /**
   
      THIS IS 1 OF THE 2 METHODS YOU NEED TO WRITE
   
      This method takes two parameters; an array of int values named k,
      and a String named s.

      If s and k are not of the same length, the method returns an empty
      string: ""
      
      Otherwise, it returns a new String of the same length than s.
      In that returned string, each character at index n (between 0 and length -1)
      is the result of adding the integer value k[n] to the character found at index n
      in the parameter string s.
   **/
   public static String decode(int[] k, String s){
      return s; // this "place holder" code only returns s, replace it with your code
   } // end of method
   
   
   
   /**
   
      THIS IS THE OTHER METHOD YOU NEED TO WRITE
      
      This method must create an array of 9 int values named guess.
      Initially, all values in the guess array are set to -1.
      
      Let's keep track of how many digits we guessed right so far.
      A digit is guessed right if the correct value is in the right slot in the array.
      We start by storing that, so far, we have guessed 0 of the 9 digits right.
      
      For each element of the guess array: 
         For each digit between 0 and 9 (inclusive):
            Assign that value to that element
            Call the dial method (already implemented) with the guess array as parameter
            
            If the return value shows that we guessed all 9 digits, then return the guess array
            If the return value shows that we guessed 1 more digit than before, then do the following;
                  update the number of digits we guessed right
                  stop trying new values for this element of the array
                  and skip instead to trying digits for the next element
   **/
   public static int[] hack(){
   
      // this version only tries one arbitrary guess,
      // uses dial to get the number of digits we guessed
      // right, ignores the result, and just return guess
      
      // replace all this with your code so as to actually
      // adress the requirements
      int[] guess = {1,2,3,4,5,6,7,8,9};
      int score = dial(guess);
      return guess;
   } // end of method
   
   
   
   /**
      YOU DON'T HAVE TO MODIFY THE MAIN
   **/
   public static void main(String[] args){

      System.out.println("RUNNING your decode method");
      // this string makes it easy to see how each letter has been modified
      // so we use it to test your decode method
      String msg = "abcde";

      // We put a bunch of keys in a 2D array so we may iterate over them
      int[][] keys = {
         {0,0,0,0,0},   // this key changes nothing
         {1,1,1,1,1},   // take next letter for each character in the message
         {4,3,2,1,0}    // applies different changes to different characters
      };
      
      // iterate over all the keys and use them to decode msg
      // with the help of your decode method
      for(int test=0 ; test < keys.length ; test++)
         System.out.println("\tDecoding " + msg
            + " with key " + Arrays.toString(keys[test])
            + " --> "      + decode(keys[test], msg));
      
      
      // running your hack method to see if it is able to crack the code
      System.out.println("\n\nRUNNING your hack method");
      int[] key = hack();    
      
      // When you are done with the whole final exam
      // running the code below will reveal the message that the squirrels
      // left for you before they left
      System.out.println("\n\nThe squirrels left you a note...");
      System.out.print(decode(key, "BweGlm]ks"));
   } // end of main
   
   
   
   /**
      YOU DON'T HAVE TO MODIFY THE METHOD DIAL
      
      It takes an array of 9 int values that represents a possible 9 digit
      combination and returns the number of values that you guessed right;
      i.e., when the right value is in the right position in the combination
   **/
   public static int dial(int[] guess){
      int[] solution = {0, 2, 0, 1, 9, 0, 4, 3, 0}; // code to discover
      int score = 0; // how many digits were discovered in the guess
      
      // just checking a few things in case your hack method is not calling
      // this one properly
      
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
         
      // scoring the guess array you passed as parameter      
      for(int i=0 ; i < solution.length ; i++)
         score += (solution[i] == guess[i])? 1 : 0;
         
      // determining if you guessed all 9 digits
      if(score == solution.length)
         System.out.print("\nYou guessed the combination and unlocked all chevrons with code ");
      else
         System.out.print("\t" + score + " digit(s) in the combinations were guessed with code ");
      
      System.out.println(Arrays.toString(guess));
      
      return score;
   } // end of method
} // end of class
