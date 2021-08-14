public class Game{
  private Team team1;
  private Team team2;
  private String time;

  public Game(Team team1, Team team2, String time){
    this.team1 = team1;
    this.team2 = team2;
    this.time = time;
  }

  public Team getTeam1(){
    return this.team1;
  }

  public Team getTeam2(){
    return this.team2;
  }

  public String getTime(){
    return this.time;
  }
}
