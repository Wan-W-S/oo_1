abstract class CShape
{
  protected String color;
  public void setColor(String str)
  {
    color=str;
  }
  public abstract void show();
}


Class CTriangle extends Cshape
{
  protected double A,B,C;
  public CTriangle(double a, double b, double c)
  {
    A=a;
    B=b;
    C=c;
  }
  public void show()
  {
    System.out.print("color="+color+", ");
    System.out.println("area="+0.5*A*B);
  }
}

public class wan
{
  public static void main(String args[])
  {
    CTriangle tri=new CTriangle(3,4,5);
    tri.setColor("red");
    tri.show();
  }
}
