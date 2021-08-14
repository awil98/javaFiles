public class Playable extends CharacterMaker{

  private int STR;
  private int DEX;
  private int CON;
  private int INT;
  private int WIS;
  private int CHA;

  Playable(String name, int health, int mana){
    super(name, health, mana);
    //call the roll dice method to set all other values
    rollStats();
  }

  public void rollStats(){

  }

  public int getSTR(){
    return this.STR;
  }

  public int getDEX(){
    return this.DEX;
  }

  public int getCon(){
    return this.CON;
  }

  public int getINT(){
    return this.WIS;
  }

  public int getCHA(){
    return this.CHA;
  }

  public String toString(){
    return super.toString() + " more";
  }

}
