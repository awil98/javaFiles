public class TestTeam{
  /*File name: TestTeam
    Author name: Aaron Williams
    date: 6/16/2020
    Description: This file creates three team objects and then displays all of their information
  */
  public static void main(String[] args){

    Team t1 = new Team("HighSchool1", "football", "Tigers");
    Team t2 = new Team("HighSchool2", "football", "Ligers");
    Team t3 = new Team("HighSchool3", "football", "Lions");
    /**/
    Team[] myArray = {t1, t2, t3};
    for(int i = 0; i < myArray.length; i++){
      System.out.println("School Name: " + myArray[i].getSchoolName() +"\nSport: " + myArray[i].getSport() +"\nTeam name: " + myArray[i].getTeamName());
      System.out.println("MOTTO: " + myArray[i].MOTTO +"\n");
    }
  }
}
