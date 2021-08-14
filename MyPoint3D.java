public class MyPoint3D{

  private double x;
  private double y;
  private double z;

  MyPoint3D(double x, double y, double z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

  MyPoint3D(){
    x = 0;
    y = 0;
    z = 0;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double getZ(){
    return z;
  }

  public void setX(double x){
    this.x = x;
  }

  public void setY(double y){
    this.y = y;
  }

  public void setZ(double z){
    this.z = z;
  }

  public double distance(MyPoint3D obj){
    double xSum = Math.pow((obj.getX() - this.x), 2);
    double ySum = Math.pow((obj.getY() - this.y), 2);
    double zSum = Math.pow((obj.getZ() - this.z), 2);
    double result = Math.pow((xSum + ySum + zSum), .5);

    return result;
  }

  public double distance(int x, int y, int z){
    double xSum = Math.pow((x - this.x), 2);
    double ySum = Math.pow((y - this.y), 2);
    double zSum = Math.pow((z - this.z), 2);
    double result = Math.pow((xSum + ySum + zSum), .5);

    return result;
  }

  public double distance(MyPoint3D obj1, MyPoint3D obj2){
    double xSum = Math.pow((obj2.getX() - obj2.getX()), 2);
    double ySum = Math.pow((obj2.getY() - obj2.getY()), 2);
    double zSum = Math.pow((obj2.getZ() - obj2.getZ()), 2);
    double result = Math.pow((xSum + ySum + zSum), .5);

    return result;
  }

  public String toString(){
    return "Point( " + this.x + ", " + this.y + ", " + this.z + " )";
  }

  public static void main(String[] args){
    MyPoint3D p1 = new MyPoint3D(1,1,1);
    System.out.println(p1);
  }
}
