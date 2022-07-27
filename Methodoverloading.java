class Methodoverloading
{
public void area(int a)
{
System.out.println("AREA OF SQUARE: "+(a*a));
}
public void area(int a,int b)
{
System.out.println("AREA OF RECTANGLE: "+(a*b));
}
public void area(float p,float q)
{
System.out.println("AREA OF RHOMBUS: "+(p*q)/2);
}
public static void main(String args[])
{
Methodoverloading obj=new Methodoverloading();
obj.area(2);
obj.area(2,4);
obj.area(2.3f,4.0f);
}
}
