import java.util.Scanner;
import java.util.Arrays;

public class TestStackOfIntegers{

  public static void main(String[] args){
    StackOfIntegers stack = new StackOfIntegers();
    StackOfIntegers stack2 = new StackOfIntegers(3);

    for(int i =0; i < 2; i++){
      stack.push(i);
    }

    while(!stack.isEmpty())
      System.out.print(stack.pop() + " ");
  }
}
