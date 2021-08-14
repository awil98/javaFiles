import java.util.*;
import java.text.DecimalFormat;

public class Gymnast{
  private String firstName;
  private String lastName;
  private ArrayList<Double> list;

  public Gymnast(String firstName, String lastName, ArrayList<Double> scores){
    this.firstName = firstName;
    this.lastName = lastName;
    this.list = scores;
  }

  public Gymnast(){
    this.firstName = "John";
    this.lastName = "Doe";
    ArrayList<Double> empty = new ArrayList<Double>();
    this.list = empty;
  }

  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setScore(ArrayList<Double> scores){
    this.list = scores;
  }

  public ArrayList<Double> getScores(){
    return list;
  }

  public void addScore(double score){
    this.list.add(score);
  }

  public double totalScore(){
    DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );

    ArrayList<Double> updated = updateList();
    double total = 0;

    for(int i = 0; i < updated.size(); i++){
      total += updated.get(i);
    }
    double updatedTotal = new Double(df2.format(total)).doubleValue();
    return updatedTotal;
  }

  private ArrayList<Double> updateList(){
    double highest = list.get(0);
    double lowest = list.get(0);
    ArrayList<Double> newList = new ArrayList<Double>();

    for(int i = 0; i < list.size(); i++){
      if(list.get(i) < lowest){
        lowest = list.get(i);
      }else if(list.get(i) > highest){
        highest = list.get(i);
      }
    }

    for(int j = 0; j < list.size(); j++){
      if(list.get(j) != highest && list.get(j) != lowest){
        newList.add(list.get(j));
      }
      continue;
    }

    return newList;
  }

  public void display(){
    System.out.println("Name: "+ firstName + " " + lastName);
    System.out.println("Score 1: " + list.get(0));
    System.out.println("Score 2: " + list.get(1));
    System.out.println("Score 3: " + list.get(2));
    System.out.println("Score 4: " + list.get(3));
    System.out.println("Score 5: " + list.get(4));
    System.out.println("Score 6: " + list.get(5));
    System.out.println("Score 7: " + list.get(6));
    System.out.println("Score 8: " + list.get(7));
    System.out.println("Final Score: " + totalScore());
  }

  public static void main(String[] args){
    //format the
    List<Double> nums1 = Arrays.asList(9.2, 9.3, 9.0, 9.9, 9.5, 9.5, 9.6, 9.8);
    ArrayList<Double> list1 = new ArrayList<Double>();
    list1.addAll(nums1);
    Gymnast g1 = new Gymnast("Lauren", "Hepburn", list1);
    g1.display();

    System.out.println("");
    List<Double> nums2 = Arrays.asList(9.2, 9.2, 9.0, 9.9, 9.5, 9.5, 9.7, 9.6);
    ArrayList<Double> list2 = new ArrayList<Double>();
    list2.addAll(nums2);
    Gymnast g2 = new Gymnast("Kerrie", "Quinn", list2);
    g2.display();

    System.out.println("");
    List<Double> nums3 = Arrays.asList(9.7, 9.1, 9.3, 9.4, 9.5, 9.4, 9.6, 9.2);
    ArrayList<Double> list3 = new ArrayList<Double>();
    list3.addAll(nums3);
    Gymnast g3 = new Gymnast("Sherry", "Paul", list3);
    g3.display();

    System.out.println("");
    List<Double> nums4 = Arrays.asList(9.2, 9.0, 9.1, 9.5, 9.2, 9.3, 9.4, 9.6);
    ArrayList<Double> list4 = new ArrayList<Double>();
    list4.addAll(nums4);
    Gymnast g4 = new Gymnast("Dixie", "Barlow”", list4);
    g4.display();

    System.out.println("");
    List<Double> nums6 = Arrays.asList(9.2, 9.1, 9.2, 9.9, 9.5, 9.2, 9.3, 9.8);
    ArrayList<Double> list6 = new ArrayList<Double>();
    list6.addAll(nums6);
    Gymnast g5 = new Gymnast("Sarah", "Holt", list6);
    g5.display();

    System.out.println("");
    Gymnast g6 = new Gymnast();
    g6.setFirstName("Jamal");
    g6.setLastName("Evans");
    List<Double> nums7 = Arrays.asList(9.2, 9.3, 9.3, 9.7, 9.0, 9.2);
    ArrayList<Double> list7 = new ArrayList<Double>();
    list7.addAll(nums7);
    g6.setScore(list7);
    g6.addScore(9.6);
    g6.addScore(9.8);
    g6.display();

    System.out.println("");

    List<Double> nums8 = Arrays.asList(g1.totalScore(), g2.totalScore(), g3.totalScore(), g4.totalScore(), g5.totalScore(), g6.totalScore());
    ArrayList<Double> rank = new ArrayList<Double>();
    rank.addAll(nums8);
    Collections.sort(rank);

    System.out.println("Total Score Rank: ");
    System.out.println("Rank 1 = " + rank.get(5));
    System.out.println("Rank 2 = " + rank.get(4));
    System.out.println("Rank 3 = " + rank.get(3));
    System.out.println("Rank 4 = " + rank.get(2));
    System.out.println("Rank 5 = " + rank.get(1));
    System.out.println("Rank 6 = " + rank.get(0));

  }
}
