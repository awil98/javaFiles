public class Dog{

  private String name;
  private String breed;
  private String color;
  private int age;
  private double weight;
  private boolean hasShots;

  Dog(String name, String breed, String color, int age, double weight, boolean hasShots){
    this.name = name;
    this.breed = breed;
    this.color = color;
    this.age = age;
    this.weight = weight;
    this.hasShots = hasShots;
  }

  Dog(){
    name = "n/a";
    breed = "Mutt";
    color = "White";
    age = 0;
    weight = 0;
    hasShots = false;
  }

  public String getName(){
    return name;
  }

  public String getBreed(){
    return breed;
  }

  public String getColor(){
    return color;
  }

  public int getAge(){
    return age;
  }

  public double getWeight(){
    return weight;
  }

  public boolean hasShots(){
    return hasShots;
  }

  public void changeName(String name){
    this.name = name;
  }

  public void changeColor(String color){
    this.color = color;
  }

  public void changeBreed(String breed){
    this.breed = breed;
  }

  public void changeAge(int age){
    this.age = age;
  }

  public void changeWeight(double weight){
    this.weight = weight;
  }

  public void changeIfHasShots(boolean hasShots){
    this.hasShots = hasShots;
  }

  public String toString(){
    return "The dog's info is as follows:\nName: " + name + "\nBreed: " + breed
    + "\nColor: " + color + "\nAge: " + age + "\nWeight: " + weight + "\nShot status: " + hasShots;
  }

  public static void main(String[] args){
    Dog d1 = new Dog("Spot", "Labrador", "Golden", 1, 63.5, false);
    System.out.println(d1);

    Dog d2 = new Dog();
    d2.changeName("Max");
    d2.changeBreed("Blood Hound");
    d2.changeColor("Brown");
    d2.changeAge(7);
    d2.changeWeight(107.3);
    d2.changeIfHasShots(true);
    System.out.println("");
    System.out.println(d2);
  }
}
