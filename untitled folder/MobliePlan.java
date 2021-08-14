import java.util.date;
public class MobilePlan{

  private String type;
  private int sms;
  private int minutes;
  private int data;
  private date dateCreated;
  private double monthlyBill;

  MobilePlan(int minute, int sms, int data){
    this.minutes = minute;
    this.sms = sms;
    this.data = data;
    this.type = "Basic";
  }

}
