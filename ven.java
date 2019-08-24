import java.util.*;
import java.lang.*;


class p
{
public double w,x,y,z,res;

public p()
{ w=34;
  x=35;
  y=24;
  z=21;
}
public p(double a, double b, double c, double d)
{
w=a;
x=b;
y=c;
z=d;
}
public void dist()
{
res= Math.sqrt(Math.pow((w-y),2) + Math.pow((x-z),2));
}
public void result()
{
System.out.println("Distance between points = "+ res);
}
}
class point
{
public static void main(String arg[])
{ 
p p1=new p();
p p2=new p(30,66,22,32);
p1.dist();
p2.dist();
p1.result();
p2.result();
}
}