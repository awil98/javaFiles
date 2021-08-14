import java.util.Date;

public class TODO{

  private String name;
  private String description;
  private boolean isDone;
  private Date dateCreated;
  private Date dateCompleted;

  private static int counter = 0;
  private static TODO[] references = null;

  public static void displayALLInstances(){
    System.out.println("TODO has " + TODO.counter + "instances");

    for(int i = 0; i < TODO.references.length; i++){
      if(TODO.references[i] != null){
        System.out.println(TODO.references[i]);
      }
    }
  }

  public TODO(){
    this("default task", "...");
    /*
    this.name = "default task";
    this.description = "...";
    */
  }

  public TODO(String name, String description){
    this.name = name;
    this.description = description;
    this.isDone = false;
    this.dateCreated = new Date();
    if(TODO.counter == 0){
      TODO.references = new TODO[1000];
    }
    TODO.references[this.counter++] = this;
  }

  public String toString(){
    return name + " : " + description;
  }
}
