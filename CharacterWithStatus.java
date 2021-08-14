public class CharacterWithStatus{
  private String name;
  private int health;
  private int mana;
  private String status;
  private int dice;

  CharacterWithStatus(String name, int health, int mana){
    this.name = name;
    this.health = health;
    this.mana = mana;
  }

  public void changeName(String name){
    this.name = name;
  }

  public void changeHealth(int health){
    this.health = health;
  }

  public void changeMana(int mana){
    this.mana = mana;
  }

  public String getName(){
    return name;
  }

  public int getHealth(){
    return health;
  }

  public int getMana(){
    return mana;
  }

  public void updateDice(){
    dice = (int)(Math.random() * ((6-1) + 1)) + 1;
    updateStatus();
  }

  public void updateStatus(){
    switch(dice){
      case 1:
        status = "Dead";
        health = 0;
        mana = 0;
        break;
      case 2:
        status = "Stunned";
        break;
      case 3:
        status = "Poisoned";
        break;
      case 4:
        status = "Sleeping";
        break;
      case 5:
        status = "Half Dead";
        health = health / 2;
        mana = mana / 2;
        break;
      case 6:
        status = "Revive";
        health = 100;
        mana = 100;
        break;
    }
  }

  public String describeStatus(){
    String result = "";
    switch(dice){
      case 1:
        result = "It appears fate wanted you dead";
        break;
      case 2:
        result = "Fate wants you to live in the moment and stand stil";
        break;
      case 3:
        result = "Fate has it that you suffer slowly";
        break;
      case 4:
        result = "Fate says take a nice rest";
        break;
      case 5:
        result = "Fate has spared your life";
        break;
      case 6:
        result = "It appears fate want you to live another day";
        break;
      default:
        result = "Test your fate and roll the dice";
    }

    return result;
  }

  public String toString(){
    return "The character's name is " + name + "\nThe character's health and mana are " + health + " " + mana + "\nThe character's status is " + status;
  }

  public static void main(String[] args){
    CharacterWithStatus ch1 = new CharacterWithStatus("Aaron", 1000, 1000);
    ch1.updateDice();
    System.out.println("The character's status can best be described as: " + ch1.describeStatus());
    System.out.println(ch1);
  }
}
