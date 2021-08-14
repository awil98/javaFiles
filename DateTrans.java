import java.util.Scanner;

/*   Requirements   Write a program that inputs from the user three integer values.
The first one will correspond to the number of the month. Any input outside of [1..12]
will cause the program to display an error message and prompt the user to enter a correct
value.
The second one will correspond to the day of the week [1..7] with 1 standing formonday.
The third will simply be the date in the month. It should, for now, always be within [1..31]
regardless of the month that has been selected.
Your program will take this data and display on the console the date in a formatted way.
For instance, if the values provided were 8, 1, and 26, the program will display;
Monday, 26 of August   To do so, you will write a static method returning the formatted date as a String
based on the three integer values passed as parameter. You will then use this method
from your main.
OPTIONAL   -  Make sure that the range of acceptable values for the date in the month value
is based on the selected month. For simplicity, we will assume february to always have 28 days.
-  Add the year value to the program, then handle leap years.
See section 3.11, "Case Study: Determining Leap Year", on p.97 in the textbook.*/

public class DateTrans{
  public static void main(String[] args){

    int week = getNumber("Enter the day of the week: ",1,7);

    int date = getNumber("Enter the day of the month: ",1,31);

    int month = getNumber("Enter the month of the year: ",1,12);

    System.out.println(formatDate(week, date, month));
  }// end of main method

  static String formatDate(int w, int d, int m){
    String month = "";
    String Day = "";
    //w is day of week d is the day of the month m is the month of the year
    switch(m){
      case 1:
        month = "January";
        break;
      case 2:
        month = "February";
        break;
      case 3:
        month = "March";
        break;
      case 4:
        month = "April";
        break;
      case 5:
        month = "May";
        break;
      case 6:
        month = "June";
        break;
      case 7:
        month = "July";
        break;
      case 8:
        month = "August";
        break;
      case 9:
        month = "September";
        break;
      case 10:
        month = "October";
        break;
      case 11:
        month = "November";
        break;
      case 12:
        month = "December";
        break;
    }//end of switch

    switch(w){
      case 1:
        Day = "Sunday";
        break;
      case 2:
        Day = "Monday";
        break;
      case 3:
        Day = "Tuesday";
        break;
      case 4:
        Day = "Wednesday";
        break;
      case 5:
        Day = "Thursday";
        break;
      case 6:
        Day = "Friday";
        break;
      case 7:
        Day = "Saturday";
        break;
    }
    return Day + ", " + d + " of " + month;
  }//end of formatDate

  static int getNumber(String prompt, int lower, int upper){
    int value = 0;
    Scanner scan = new Scanner(System.in);
    //Day of the week
    do{
      System.out.println(prompt);
      value = scan.nextInt();
    }while(value < lower || value > upper);
    //input validation so user is stuck in loop until they enter a valid number
    return value;
  }//end method getNumber
}
