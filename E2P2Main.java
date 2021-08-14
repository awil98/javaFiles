public class E2P2Main{

  public static void main(String[] args){
    E2P2 object = new E2P2();
    object.displayAll();
    object.addPerson("Aaron", "Williams", 21);
    object.addPerson("Zach", "Lastinger", 20);
    object.addPerson("John", "Doe", 25);
    object.displayAll();
    E2P2Person p1 = new E2P2Person("Morty", "Smith");
    p1.setAge(13);
    E2P2Person p2 = new E2P2Person("Rick", "Sanchez");
    p2.setAge(57);
    E2P2Person p3 = new E2P2Person("Lecrae", "Moore");
    p3.setAge(36);
    object.addPerson(p1);
    object.addPerson(p2);
    object.addPerson(p3);
    object.displayAll();
  }
}
