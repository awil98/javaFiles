public class Team{
 /*File name Team.java
  Author name: Aaron Williams
  Created: 6/16/2020
  This class was created to hold data related to a Schools team. This
  class specifically holds data related to the school name, sport, and
  team name, and its MOTTO. The class also contains getter methods the
  requested getter methods.
  *
  */
  private String highSchoolName;
  private String sport;
  private String teamName;
  public static String MOTTO = "Sportmanship";

  /*This constructor is used to create Team objects. It takes in a
  highSchoolname, a sport, and a teamName.
  */
  public Team(String highSchoolName, String sport, String teamName){
      this.highSchoolName = highSchoolName;
      this.sport = sport;
      this.teamName = teamName;
  }

  /*This method returns the data that's located in the highSchoolName field.
  The return type of this method is String.
  */
  public String getSchoolName(){
    return this.highSchoolName;
  }

  /*This method returns a string that conatins the team's sport.
  */
  public String getSport(){
    return this.sport;
  }

  /*This method returns the team's name as a string
  */
  public String getTeamName(){
    return this.teamName;
  }
}
