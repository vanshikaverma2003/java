class Ternary
{
public static void main(String args[])
{
int a=10,b=20,c=11,max;
max=(a > b)  ? (a > c ? a : c) : (b > c ? b : c);
System.out.println("Largest number: "+max);
}
}