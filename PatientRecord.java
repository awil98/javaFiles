public class PatientRecord{

  private String name;
  private double weight;
  private double height;
  private boolean usingMetric;

  PatientRecord(String name, double weight, double height, boolean usingMetric){
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.usingMetric = usingMetric;
  }

  PatientRecord(){
    name = "Smith";
    weight = 0;
    height = 0;
    usingMetric = false;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void setHeight(double height){
    this.height = height;
  }

  private static double convertLbToKG(double value){
    return (value * .453592);
  }

  private static double convertKgToLb(double value){
    return (value / .453592);
  }

  private static double convertInToCm(double value){
    return (value * 2.54);
  }

  private static double convertCmToIn(double value){
    return (value / 2.54);
  }

  public void setUsingMetric(boolean value){

    // figure out a way to check if the previous value isn't the new value
    // so what i'm thinking is to just check if value is equal to the usingMetric value
    //if it is I don't have to swtich if it isn't i have to make call the conversion method
    if(this.usingMetric == false && value == true){
      this.weight = convertLbToKG(this.weight);
      this.height = convertInToCm(this.height);
    }else if(this.usingMetric == true && value == false){
      this.weight = convertKgToLb(this.weight);
      this.height = convertCmToIn(this.height);
    }
    this.usingMetric = value;

  }

  public String describeWeight(){
    //I could do a if else statment is see if the current value is metric and call the appropate conversion method and String
    if(this.usingMetric == true){
      return name + "'s weight is " + this.weight + " in Kilograms and " + convertKgToLb(this.weight) + " in Kilograms.";
    }else{
      return name + "'s weight is " + this.weight + " in Pounds and " + convertLbToKG(this.weight) + " in Kilograms.";
    }

  }

  public String describeHeight(){
    if(this.usingMetric == true){
      return name + "'s height is " + this.height + " in CM and " + convertCmToIn(this.height) + " in Inches.";
    }else{
      return name + "'s height is " + this.height + " in In and " + convertInToCm(this.height) + " in Cm.";
    }

  }

  private double computeBMI(){
    if(this.usingMetric == true){
      return ((this.weight) / Math.pow(this.height, 2)) * 1000;
    }else{
      return((703) * (this.weight) / Math.pow(this.height, 2));
    }
  }

  public String describeBMI(){
    //just check to see what the current value of using metic is to see what value I should use
    if(this.usingMetric == true){
      return name + "'s B.M.I is " + computeBMI() + "in (kg/m^2) and " + ((703)*(convertKgToLb(this.weight)) / Math.pow(convertCmToIn(this.height), 2)) + " in (lb/in^2)";
    }else{
      return name + "'s B.M.I is " + computeBMI() + " in (lb/in^2) and " + ((convertLbToKG(this.weight)/ Math.pow((convertInToCm(this.height)),2)) * 1000) + " in (kg/m^2)";
    }
  }

  public static void main(String[] args){
    PatientRecord obj1 = new PatientRecord();
    obj1.setName("Oliva Smith");
    obj1.setHeight(60.3);
    obj1.setWeight(123.5);
    PatientRecord obj2 = new PatientRecord("Mason Williams", 90, 185, true);

    System.out.println(obj1.describeBMI());
    System.out.println(obj1.describeHeight());
    System.out.println(obj1.describeWeight());
    System.out.println("");
    System.out.println(obj2.describeBMI());
    System.out.println(obj2.describeHeight());
    System.out.println(obj2.describeWeight());

    obj1.setUsingMetric(true);
    obj2.setUsingMetric(false);

    System.out.println(obj1.describeBMI());
    System.out.println(obj1.describeHeight());
    System.out.println(obj1.describeWeight());
    System.out.println("");
    System.out.println(obj2.describeBMI());
    System.out.println(obj2.describeHeight());
    System.out.println(obj2.describeWeight());


  }

}
