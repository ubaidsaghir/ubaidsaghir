interface Bank
{
  float rateofinterest();
}
class SBI implements Bank
{
 public float rateofinterest()
{
   return 9.15f;}
}
class PNB implements Bank 
{
  public float rateofinterest(){
  return 9.7f;
}
}
public class interface2
{
  public static void main(String arg[])
{
  SBI a=new SBI();
  PNB b=new PNB;
  a.rateofinterest();
  b.rateofinterest();
}
}
