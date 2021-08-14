public class E2P2Person{

  private String firstName;
  private String lastName;
  private int age;

  public E2P2Person(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = -1;
  }

  /*He asks you to create a setAge method
    that takes in a int parameter called
    age that doesn't allow the user to
    store a value that less than or equal to 0*/

  public void setAge(int age){
    if(age <= 0){
      System.out.println("The age cannon be less than 0.\nPlease try again.");
    }else{
      this.age = age;
    }
  }

  /*He basically asks you to create
    a toString method that displays
    John Doe, age unknown if the age value is -1
    and
    John Doe, age 23 if the age is known*/

  public String toString(){
    if(age > 0){
      return firstName + " " + lastName + ", age " + age;
    }else{
      return firstName + " " + lastName + ", age unknown";
    }
  }
}
