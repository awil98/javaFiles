public class Square{

  private double side;

  Square(double side){
    this.side = side;
  }

  Square(){
    side = 1;
  }

  public void changeSide(double side){
    this.side = side;
  }

  public double getSide(){
    return side;
  }

  public double getDiagonal(){
    double inside = (Math.pow(side, 2) + Math.pow(side, 2));
    return Math.sqrt(inside);
  }

  public String toString(){
    return "The square's length and width are: " + side + "\nThe diagonal length is " + getDiagonal();
  }

  public static void main(String[] args){
    Square s1 = new Square(5.0);
    System.out.println(s1);

    Square s2 = new Square();
    s2.changeSide(8.0);
    System.out.println(s2);

  }
}
