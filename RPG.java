public class RPG{

  private String name;
  private String profession;

  private int health;
  private int mana;
  private int level;

  private double experience;
  private double levelup;

  RPG(String userName, String userProfession, int userHealth, int userMana, double userLevelUp){
    name = userName;
    profession = userProfession;
    health = userHealth;
    mana = userMana;
    levelup = userLevelUp;
    level = 1;
    experience = 0;
  }

  RPG(){
    name = "";
    profession = "";
    health = 0;
    mana = 0;
    level = 0;
    experience = 0.0;
    levelup = 0.0;
  }

  public String username(){
    return name;
  }

  public String userprofession(){
    return profession;
  }

  public int userhealth(){
    return health;
  }

  public int usermana(){
    return mana;
  }

  public int userlevel(){
    return level;
  }

  public double userexperience(){
    return experience;
  }

  public void updateUsername(String usersName){
    name = usersName;
  }

  public void updateUserProfession(String userProfession){
    profession = userProfession;
  }

  public void updateUserHealth(int usersHealth){
    health = usersHealth;
  }

  public void updateUsersMana(int usersMana){
    mana = usersMana;
  }

  public void updateUserLevel(int usersLevel){
    level = usersLevel;
  }

  public void updateUsersExperience(double usersExperience){
    experience = usersExperience;
  }

  public void gainExperience(double exp){
    experience += exp;
    if(experience > levelup){
      gainLevel();
    }
  }

  public double getProgress(){
    return (experience/levelup);
  }

  public void gainLevel(){
    level++;
    experience = 0.0;
  }

  public String toString(){
    return "The character's name is " + name +
    "\n The characters profession is " + profession +"\n The character's health, mana, and level are: " + health + ", " + mana + ", " + level
    + " \n The character's levelup and experience are " + levelup + ", " + experience;
  }

  public static void main(String[] args){

    RPG character1 = new RPG("Mitsuki Saiga", "Hero", 1000, 1000, 5000);
    System.out.println(character1);

    RPG character2 = new RPG();
    System.out.println("");
    System.out.println(character2);

    character2.updateUsername("Anorak");
    character2.updateUserProfession("Magus");
    character2.updateUserHealth(9999);
    character2.updateUsersMana(9999);
    character2.updateUserLevel(999);
    character2.updateUsersExperience(1);

    System.out.println("");
    System.out.println(character2);

  }

}
