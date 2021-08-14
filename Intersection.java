public class Intersection{

  private int street;
  private int avenue;

  Intersection(int street, int avenue){
    this.street = street;
    this.avenue = avenue;
  }

  Intersection(){
    street = 0;
    avenue = 0;
  }

  public int getStreet(){
    return street;
  }

  public int getAvenue(){
    return avenue;
  }

  public void setStreet(int street){
    this.street = street;
  }

  public void setAvenue(int avenue){
    this.avenue = avenue;
  }

  public int distance(Intersection value){
    int streetD = Math.abs(value.getStreet() - this.street);
    int aveD = Math.abs(value.getAvenue() - this.avenue);
    return streetD + aveD;
  }

  public int distance(int street, int avenue){
    int streetD = Math.abs(street - this.street);
    int aveD = Math.abs(avenue - this.avenue);
    return streetD + aveD;
  }

  public void getDirections(Intersection value){
    int streetD = Math.abs(value.getStreet() - this.street);
    int aveD = Math.abs(value.getAvenue() - this.avenue);

    System.out.println("Drive " + streetD + " blocks to get to " + value.getStreet() + getSuffix(value.getStreet()) + " street.\nTurn onto " + value.getStreet() + getSuffix(value.getStreet()) + "\nDrive " + aveD + " to get to " + value.getAvenue() + getSuffix(value.getAvenue()));
  }

  public void getDirections(int street, int avenue){
    int streetD = Math.abs(street - this.street);
    int aveD = Math.abs(avenue - this.avenue);

    System.out.println("Drive " + streetD + " blocks to get to " + street + getSuffix(street) + " street.\nTurn onto " + street + getSuffix(street) + "\nDrive " + aveD + " to get to " + avenue + getSuffix(avenue));
  }

  public String toString(){
    return "The Intersection of " + this.street + getSuffix(this.street) + " street and " + this.avenue + getSuffix(this.avenue) + " avenue.";
  }

  public String getSuffix(int n) {
     if(n == 11 | n == 12 | n == 13)
        return "th";

     switch(n%10) {
        case 1:
           return "st";
        case 2:
           return "nd";
        case 3:
           return "rd";
        default:
           return "th";
     }

  }


  public static void main(String[] args){
    Intersection s1 = new Intersection(83, 24);
    Intersection s2 = new Intersection();

    s2.setStreet(72);
    s2.setAvenue(11);

    System.out.println(s1);
    System.out.println(s2);


    System.out.println("The distance is " + s1.distance(s2));
    System.out.println("The distance is " + s1.distance(72, 11));

    System.out.println("");

    System.out.println("The distance is " + s2.distance(s1));
    System.out.println("The distance is " + s2.distance(83, 24));

    System.out.println("");

    s2.getDirections(s1);
    System.out.println("");
    s1.getDirections(s2);
  }
}
