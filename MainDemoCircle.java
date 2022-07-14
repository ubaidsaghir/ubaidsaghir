class Circle
{
  float r;
  Circle(float a)
  {
     this.r=a;
	 }

public void setRadius(float b)
{
  this.r=b;
}
  public float getRadius()
  {
    return this.r;
   }
   float getcircumference()
   {
     float C = 2*3.14f*r;
	 return C;
	 }
	float getArea()
 {
  float A= 3.14f*r*r;
   return A;
}   
}
public class MainDemoCircle
{
  public static void main(String arg[])
  {
    Circle C = new Circle(10.5f);
	C.setRadius(15.23f);
	System.out.println(C.getRadius());
	System.out.println(C.getcircumference());
	System.out.println(C.getArea());
	}
}
