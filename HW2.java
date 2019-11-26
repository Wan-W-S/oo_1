interface Shape
{
  abstract void getarea(double);
}

Class Rectangle implements Shape
{
  double length;
  double width;
  public Rectangle (double l,w)
  {
    length=l;
    width=w;
  }
  public void getArea (double)
  {
    System.out.println("area="+ length*width);
  }
}

Class Triangle implements Shape
{
  double base;
  double height;
  public Triangle (double b,h)
  {
    base=b;
    height=h;
  }
  public void getArea (double)
  {
    System.out.println("area="+ base*height/2);
  }
}
public class HW2
{
  public static void main(String args[])
  {
    Rectangle rec;
    rec=new Rectangle(2,2);
    rec.getArea();
    
    Triangle tri;
    tri=new Triangle(2,6);
    tri.getArea();
  }
}
