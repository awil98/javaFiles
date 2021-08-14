import java.util.Date;
public class Streaming extends MobilePlan{

  private String type;
  private int dataStreaming;
  private Date dateCreated;
  private double monthlyBill;

  public Streaming(int minutes, int sms, int data, int dataStreaming){
    super(minutes, sms, data);
    this.dataStreaming = dataStreaming;
    this.type = "Streaming";
    this.dateCreated = new Date();
  }

  public void setDataStreaming(int dataStreaming){
    this.dataStreaming = dataStreaming;
  }

  public int getDataStreaming(){
    return this.dataStreaming;
  }

  public double getMonthlybill(){
    double costPerSms = (super.getSms() * (8/10));
    double costPerMinute = (super.getData() * (8/10));
    double costPerData = (super.getMinutes() * (8/10));
    this.monthlyBill = costPerSms + costPerMinute + costPerData + this.dataStreaming;
    return this.monthlyBill;

  }

  public String toString(){
    return "Class Name " + this.getClass().getSimpleName() + "\nCreated on: " + this.dateCreated + "\nType: " + this.type
    + "\nMinutes: " + super.getMinutes() + "\nData: GB " + super.getData() + "\nSms: " + super.getSms() +  "\nStreaming Data: GB " + this.dataStreaming
    + "\nMonthly Bill: " + this.getMonthlybill();
  }
}
