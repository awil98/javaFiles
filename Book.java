public class Book{
  final private int RESERVED = -1;
  final private int CHECKED = 0;
  final private int RETURNED = 1;

  private String title;
  private String author;
  private int year;
  private int status;

  Book(String title, String author, int year, int status){
    this.title = title;
    this.author = author;
    this.year = year;
    this.status = status;
  }

  Book(){
    title = "Harry Potter and The Goblet of Fire";
    author = "J.K. Rowling";
    year = 2000;
    status = RETURNED;
  }

  public String getTitle(){
    return title;
  }

  public String getAuthor(){
    return author;
  }

  public int getYear(){
    return year;
  }

  public String getStatus(){
    String status = "";
    switch(this.status){
      case -1:
        status = "RESERVED";
        break;
      case 0:
        status = "CHECKED";
        break;
      case 1:
        status = "RETURNED";
        break;
      default:
        status = "Invalid because you don't know how to enter a value between -1 and 1 ";
        break;

    }

    return status;
  }

  public void setTitle(String s){
    title = s;
  }

  public void setAuthor(String s){
    author = s;
  }

  public void setYear(int y){
    year = y;
  }

  public void setStatus(int s){
    status = s;
  }

  public String toString(){
    return "The title of the book is: " + title + "\nThe author is: " + author + "\nThe year is: " + year + "\nThe status is: " + getStatus();
  }

  public static void main(String[] args){

    Book b1 = new Book("Marley and Me", "John Grogan", 2005, -1);
    System.out.println(b1);

    Book b2 = new Book();
    System.out.println("");
    b2.setTitle("The Book Thief");
    b2.setAuthor("Markus Zusak");
    b2.setYear(2005);
    b2.setStatus(0);

    System.out.println(b2);
  }

}
