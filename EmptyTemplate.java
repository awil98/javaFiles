import java.util.Scanner;
import java.util.Arrays;

public class EmptyTemplate{
  String msg = "Hello from greetings.";

  public static void greet(String name){
    System.out.println("Hello " + name);
  }
  //since this method isn't staic an object has to be creaeted to use this method in another class
  public void greeting(String name){
    System.out.println(msg + " Hello From greeting");
  }
}
