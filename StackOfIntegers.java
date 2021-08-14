import java.util.Scanner;
import java.util.Arrays;

public class StackOfIntegers{

  private int size;
  private int[] elements;
  private static final int INITIAL_CAPACITY = 2;

  public StackOfIntegers(int capacity){
    size = 0;
    elements = new int[capacity];
  }

  public StackOfIntegers(){
    this(INITIAL_CAPACITY);
    /*size = 0;
    elements = new int[2]*/
  }

  public void push(int value){
    if(size < elements.length){
      elements[size] = value;
      size++;
    }else{
      System.out.println("push: bad day for programming");
      int tmp = new int[elements.length * 2];
      System.arraycopy(elements,0,tmp,0,elements.length);
      elements = tmp;
    }
  }

  public int pop(){
    if(size == 0){
      System.out.println("pop: bad day for programming");
      return Integer.MIN_VALUE;
    }else{
      size--;
      return elements[size];
    }
  }

  public boolean isEmpty(){
    return (size == 0);
  }

}
