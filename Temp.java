/*Enter in the number that is printed out. Note the number
  that you Enter in will not have any spaces*/
public class Temp
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    private int secret;
    Temp()
    {
        // calls constructor 2
        this(3);
    }

    // parameterized constructor 2
    Temp(int x)
    {
        // calls constructor 3
        this(x, x);
    }

    // parameterized constructor 3
    Temp(int x, int y)
    {
        this.secret = x + y;
    }

    public String toString(){
      return this.secret + "";
    }

    public static void main(String args[])
    {
        Temp obj1 = new Temp();
        System.out.print(obj1);
        Temp obj2 = new Temp(2);
        System.out.print(obj2);
        Temp obj3 = new Temp(3,2);
        System.out.print(obj3);

        System.out.println();
    }
}
