import java.util.Scanner;
class HelloWorld 
{
    public static void main(String args[])
 {         
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int enternumber = 1;
        while(enternumber >=1 && enternumber<10)
  {
            System.out.println("USER PLEASE INPUT  YOUR NUMBER=");
            enternumber = scanner.nextInt();
            for(int j =0;j<i;j++)
       {
            System.out.println("Hello Humans");
            }
            i++;
        }
        System.out.println(" Loop end ");
    }
}