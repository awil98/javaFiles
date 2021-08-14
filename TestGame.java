public class TestGame{

  public static void main(String[] args){

    Team t1 = new Team("HighSchool1", "football", "Tigers");
    Team t2 = new Team("HighSchool2", "football", "Ligers");

    Game game1 = new Game(t1, t2, "7 P.M.");

    gameDetails(game1);

  }

  public static void gameDetails(Game game1){
    System.out.println("The home team is: " + game1.getTeam1().getTeamName());
    System.out.println("The away team is: " + game1.getTeam2().getTeamName());
    System.out.println("The Start time is: " + game1.getTime());
  }
}
