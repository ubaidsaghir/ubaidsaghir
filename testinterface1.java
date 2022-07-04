interface drawable
{
  void draw();
{
class Rectangle implements drawable
{
 public void draw()
{
 System.out.print("Drawing Rectangle"):
}
}
class circle implements drawable
{
public void draw()
{
 System.out.print("Drawing Circle");
}
}
public class testinterface1
{
  public static void main(String arg[])
{
   Rectangle a=new Rectangle();
   circle b=new circle();
   a.draw();
   b.draw();
}
}

