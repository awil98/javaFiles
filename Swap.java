import java.util.Scanner;
import java.util.Arrays;

public class Swap{
  public static void main(String[] args){
    int[] a = {1,2,3,4,5};
    int[] b = {6,7,8,9,0};

    display("Before the swap...",a,b);
    //swapArrays(a,b);
    swapElements(a,b);
    display("After the Swamp...",a,b);

  }//end of main

  public static void display(String msg, int data1[], int[] data2){
    System.out.println(msg);
    System.out.println("1st Array holds"+ Arrays.toString(data1));
    System.out.println("2nd Array holds"+ Arrays.toString(data2));
  }//end of display

  public static void swapArrays(int[] data1, int[] data2){
    int[] tmp = data1;
    data1 = data2;
    data2 = data1;
  }//end of swapArrays

  public static void swapElements(int[] data1, int[] data2){
    if(data1.length != data2.length) return;

    int len = data1.length;

    for(int i=0; i < len; i++){
      int tmp = data1[i];
      data1[i] = data2[i];
      data2[i] = tmp;
    }//end of for loop
  }//end of swapElements
}//end of class
