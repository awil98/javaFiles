public class ComplexNumber{

  private double real;
  private double imaginary;

  ComplexNumber(double real, double imaginary){
    this.real = real;
    this.imaginary = imaginary;
  }

  ComplexNumber(){
    real = 0;
    imaginary = 0;
  }

  public double getReal(){
    return real;
  }

  public double getImaginary(){
    return imaginary;
  }

  public void changeReal(double real){
    this.real = real;
  }

  public void changeImaginary(double imaginary){
    this.imaginary = imaginary;
  }

  public ComplexNumber add(ComplexNumber obj){
    //format (a + bi) + (c +di) goes to (a + c) + (b + d)i
    double aAndC = this.real + obj.real;
    double bAndD = this.imaginary + obj.imaginary;

    ComplexNumber result = new ComplexNumber(aAndC, bAndD);
    return result;
  }

  public ComplexNumber subtract(ComplexNumber obj){

    double aAndC = this.real + obj.real;
    double bAndD = this.imaginary + obj.imaginary;

    ComplexNumber result = new ComplexNumber(aAndC, bAndD);
    return result;
  }

  public ComplexNumber multiply(ComplexNumber obj){
    //(a+bi)(c+di) ---> (ac-bd) + (ad + cb)i

    double real = ((this.real) * (obj.real) - (this.imaginary) * (obj.imaginary));
    double imaginary = ((this.real * obj.imaginary) + (obj.real *this.imaginary));

    ComplexNumber result = new ComplexNumber(real, imaginary);
    return result;
  }

  public ComplexNumber divide(ComplexNumber obj){
    //(ac+bd) + (bc-ad) / c2 + d2
    double real = ((this.real * obj.real) + (this.imaginary * obj.imaginary)/(Math.pow(obj.real, 2) + Math.pow(obj.imaginary, 2)));
    double imaginary = ((this.imaginary * obj.real) - (this.real * obj.imaginary)/(Math.pow(obj.real, 2) + Math.pow(obj.imaginary, 2)));

    ComplexNumber result = new ComplexNumber(real, imaginary);
    return result;
  }

  public String toString(){

    //The toString method must truncate string to one decimal position is imcomplete(finished)
    String sign;
    if(imaginary >= 0){
      return (Math.round(real * 10) / 10.0)  + "+" + (Math.round(imaginary * 10) / 10.0) + "i";
    }else{
      return (Math.round(real * 10) / 10.0) + "" + (Math.round(imaginary * 10) / 10.0) + "i";
    }

  }

  public static void main(String[] args){
    ComplexNumber a = new ComplexNumber(3, 5);
    ComplexNumber b = new ComplexNumber(-2, -3);
    ComplexNumber c = new ComplexNumber(2, -5);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    //The toString method must truncate string to one decimal position is imcomplete (finished)

  }

}
