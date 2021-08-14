//import java.util.Math;

public class Loan{

  private String loantype;
  private int loanAmount;
  private double interestRate;
  private double termYears;

  Loan(String loantype, int loanAmount, double interestRate, double termYears){
    this.loantype = loantype;
    this.loanAmount = loanAmount;
    this.interestRate = interestRate;
    this.termYears = termYears;
  }

  Loan(){
    loantype = "Education";
    loanAmount = 15000;
    interestRate = 5.0;
    termYears = 4;
  }

  public String getLoanType(){
    return loantype;
  }

  public int getLoanAmount(){
    return loanAmount;
  }

  public double getInterestRate(){
    return interestRate;
  }

  public double getTermYears(){
    return termYears;
  }

  public void updateLoanType(String loanName){
    loantype = loanName;
  }

  public void updateLoanAmount(int amount){
    loanAmount = amount;
  }

  public void updateInterestRate(double interest){
    interestRate = interest;
  }

  public void updateTermYears(double termYears){
    this.termYears = termYears;
  }

  public double monthlyPayment(){

    double top = loanAmount * interestRate;
    double inSideBottom = 1 + interestRate;
    double yearsToMonths = termYears * 12;
    double inSideSolved = Math.pow(inSideBottom, yearsToMonths);
    double bottomSolved = 1 / inSideSolved;
    double result = (top) / ( 1 - bottomSolved);
    return result;
  }

  public double totalInterest(){
    double totalTime = termYears * 12;
    return monthlyPayment() * totalTime;
  }

  public String toString(){
    return "The loan type is: " + loantype + "\nThe loan amount is: " + loanAmount + "\nThe loan term in years is: " + termYears + "\nThe loan interest rate is: " + interestRate;
  }

  public static void main(String[] args){
    Loan first = new Loan("Car", 20000, 3.5, 5);
    System.out.println(first);
    System.out.println("\nThe monthly payment is: ");
    System.out.println(first.monthlyPayment());
    System.out.println("\nThe Total interest is: ");
    System.out.println(first.totalInterest());

    first.updateLoanAmount(25000);

    System.out.println(first);
    System.out.println("\nThe monthly payment is: ");
    System.out.println(first.monthlyPayment());
    System.out.println("\nThe Total interest is: ");
    System.out.println(first.totalInterest());

    Loan secondLoan = new Loan("Education", 30000, 5, 10);

    System.out.println(secondLoan);
    System.out.println("\nThe monthly payment is: ");
    System.out.println(secondLoan.monthlyPayment());
    System.out.println("\nThe Total interest is: ");
    System.out.println(secondLoan.totalInterest());

    secondLoan.updateInterestRate(6);

    System.out.println(secondLoan);
    System.out.println("\nThe monthly payment is: ");
    System.out.println(secondLoan.monthlyPayment());
    System.out.println("\nThe Total interest is: ");
    System.out.println(secondLoan.totalInterest());

    Loan thirdLoan = new Loan();
    thirdLoan.updateLoanType("Home Reform");
    thirdLoan.updateLoanAmount(2000);
    thirdLoan.updateInterestRate(2.5);
    thirdLoan.updateTermYears(1.5);

    System.out.println(thirdLoan);
    System.out.println("\nThe monthly payment is: ");
    System.out.println(thirdLoan.monthlyPayment());
    System.out.println("\nThe Total interest is: ");
    System.out.println(thirdLoan.totalInterest());
  }
}
