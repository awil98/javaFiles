public class MobileMain{
  public static void main(String[] args){
    MobilePlan m1 = new MobilePlan(1000, 1000, 10);
    System.out.println(m1.toString()+ "\n");
    m1.setMinutes(500);
    m1.setSms(800);
    m1.setData(15);
    System.out.println(m1.toString() + "\n");

    Streaming s1 = new Streaming(1000, 1000, 5, 5);
    System.out.println(s1.toString() + "\n");
    s1.setMinutes(500);
    s1.setSms(800);
    s1.setData(10);
    s1.setDataStreaming(10);
    System.out.println(s1.toString() + "\n");

    InternationalLongDistance ILD = new InternationalLongDistance(1000, 1000, 5, 100);
    System.out.println(ILD.toString() + "\n");
    ILD.setMinutes(600);
    ILD.setSms(700);
    ILD.setData(8);
    ILD.setMinILD(150);
    System.out.println(ILD.toString());

  }
}
