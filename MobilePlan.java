import java.util.Date;

public class MobilePlan{

  private String type;
  private int sms;
  private int minutes;
  private int data;
  private Date dateCreated;
  private double monthlyBill;

  public MobilePlan(int minutes, int sms, int data){
    this.minutes = minutes;
    this.sms = sms;
    this.data = data;
    this.type = "Basic";
    this.dateCreated = new Date();
  }

  public MobilePlan(){
    this(0,0,0);
  }

  public int getData(){
    return this.data;
  }

  public int getSms(){
    return this.sms;
  }

  public int getMinutes(){
    return this.minutes;
  }

  public void setData(int data){
    this.data = data;
  }

  public void setMinutes(int minutes){
    this.minutes = minutes;
  }

  public void setSms(int sms){
    this.sms = sms;
  }

  public double getMonthlybill(){
    double totalMin = (0.01 * this.minutes);
    double totalSms = (0.005 * this.sms);
    double totalData = (2 * this.data);
    this.monthlyBill = totalMin + totalSms + totalData;
    return this.monthlyBill;
  }

  public String toString(){
    return "Class Name " + this.getClass().getSimpleName() + "\nCreated on: " + this.dateCreated + "\nType: " + this.type
    + "\nMinutes: " + this.minutes + "\nData: GB " + this.data + "\nSms: " + this.sms + "\nMonthly Bill: " + this.getMonthlybill();
  }

}
