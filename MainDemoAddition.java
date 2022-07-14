class Addition
{
  private int x,y;
  public int getx()
{
  return this.x;
}
public void setx(int a)
{
  this.x=a;
}

public int gety()
{
   return this.y;
}
public void sety(int b)
{
  this.y=b;
}
void add()
{
   System.out.println(x+y);
}
}
public class MainDemoAddition
{
 public static void main(String arg[])
{
  Addition obj=new Addition();
  obj.setx(10);
  obj.sety(20);
  obj.add();
}
}
