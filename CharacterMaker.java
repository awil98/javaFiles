public class CharacterMaker{

  private String name;
  private int health;
  private int mana;

  CharacterMaker(String name, int health, int mana){
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
    return this.name;
  }

  public int getHealth(){
    return this.health;
  }

  public int getMana(){
    return this.mana;
  }

  public String toString(){
    return "Name " + this.name + " Health " + this.health + " Mana " + this.mana;
  }
}
