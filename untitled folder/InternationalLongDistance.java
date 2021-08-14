import java.util.Date;

public class InternationalLongDistance extends MobilePlan{

  private String type;
  private int minsILD;
  private Date dateCreated;
  private double monthlyBill;

  public InternationalLongDistance(int minutes, int sms, int data, int minsILD){
    super(minutes, sms, data);
    this.minsILD = minsILD;
    this.dateCreated = new Date();
    this.type = "International Long Distance";
  }

  public int getMinsILD(){
    return this.minsILD;
  }

  public void setMinILD(int mins){
    this.minsILD = mins;
  }

  public double getMonthlybill(){
    double totalMin = super.getMinutes() * (.7);
    double totalsms = super.getSms() * (.8);
    double totalData = super.getData() * (.8);
    double totalMinsILD = this.minsILD * (.1);
    this.monthlyBill = totalMin + totalsms + totalData + totalMinsILD;
    return this.monthlyBill;
  }

  public String toString(){
    return "Class Name " + this.getClass().getSimpleName() + "\nCreated on: " + this.dateCreated + "\nType: " + this.type
    + "\nMinutes: "  + super.getMinutes() + "\nILD Minutes: " + this.minsILD + "\nData: GB " + super.getData() + "\nSms: " + super.getSms() + "\nMonthly Bill: " + this.getMonthlybill();
  }
}
