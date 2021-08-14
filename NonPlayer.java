public class NonPlayer extends CharacterMaker{

  private Boolean immortal;
  private String role;
  private double exp;
  private int gold;
  private int dmg;
  private int dice;

  NonPlayer(Boolean immortal, String role, double exp, int gold, int dice, String name, int health, int mana){
    super(name, health, mana);

    this.immortal = immortal;
    this.role = role;
    this.exp = exp;
    this.gold = gold;
    this.dice = dice;

  }

  NonPlayer(Boolean monster, String name, int health, int mana){
    super(name, health, mana);

    String role = monster ? "monster" : "villager";
    this.role = role;
    this.immortal = false;
    this.exp = 1000;
    this.gold = 50;
    this.dice = 0;
  }

  public double getExp(){
    return this.exp;
  }

  public int getGold(){
    return this.gold;
  }

  public void rollDice(){
    this.dice = (int)(Math.random() * (21));
  }

  public int attack(){
    return 0;//update method
  }
}
