public class Player extends Playable{

  private String[] skills;
  private String profession;
  private int level;
  private double currExp;
  private double expRequired;

  Player(String name, int health, int mana, String profession, int level, String[] skills){
    super(name, health, mana);

    this.currExp = 0;
    this.expRequired = 1000;
    this.profession = profession;
    this.level = level;
    this.skills = skills;
  }

  Player(String name, int health, int mana){
    super(name, health, mana);

    this.profession = "";
    this.level = 0;
    String[] skills = new String[10];
    this.skills = skills;
    this.currExp = 0;
    this.expRequired = 1000;
  }

  public String getSkill(int index){
    return this.skills[index];
  }

  public String getProfession(){
    return this.profession;
  }

  public int getLevel(){
    return this.level;
  }

  public void addSkill(String skill){
    if(this.skills[this.skills.length - 1] != null){
      String[] temp = new String[this.skills.length+1];
      for(int i = 0; i < this.skills.length; i++){
        temp[i] = this.skills[i];
      }
      temp[temp.length-1] = skill;
      this.skills = temp;
    }else{
      int indexOfNull = 0;
      for(; indexOfNull < this.skills.length; indexOfNull++){
        if(this.skills[indexOfNull] == null){
          break;
        }
      }
      this.skills[indexOfNull] = skill;
    }
  }

  public void gainExp(double value){
    this.currExp += value;
    if(this.currExp >= this.expRequired){
      gainLevel();
    }

  }

  public void gainLevel(){
    this.level++;
    this.currExp = 0;
    this.expRequired *= 2;
  }

  public int rollDice(){
    return (int)(Math.random() * (7-1)) + 1;
  }

  public int attack(){
    //instructions don't make sense
    return 0;
  }

  public void defend(int damage){
    //do some stuff
  }

}
