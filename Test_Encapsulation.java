class Encapsulation
{
       private int x;
       public int getter_x()
{
       return this.x;
}
public void setter_x(int a)
{
   this.x=a;
}
}
public class Test_Encapsulation
{
  public static void main(String [] arg)
{
     Encapsulation e=new Encapsulation();
 System.out.println(e.getter_x());
 e.setter_x(10);
System.out.println(e.getter_x());
}
}
