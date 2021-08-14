import java.util.Scanner;

public class MyProg{
  public static void main(String[] args){
    System.out.println("Whis is your name?");
    Scanner s = new Scanner(System.in);
    String name = s.next();

    EmptyTemplate.greet(name);
//EmptyTemplate.greeting(name);

    //it can also be written as
    EmptyTemplate e = new EmptyTemplate();
    e.greet(name);
    e.greeting(name);

  }
}
