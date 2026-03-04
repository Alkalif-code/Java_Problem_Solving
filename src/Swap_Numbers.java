/*Swap Two Numbers
With third variable
Without third variable*/
import java.util.Scanner;
public class Swap_Numbers{
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=a;             //Store A value in C variable
    a=b;                 
    b=c;
    
    System.out.println(a);
    System.out.println(b);

    // ONLY Two Variable 
    
    int x=20;
    int y=30;
    
    x=x+y;  //20+30 = 50
    y=x-y;  //50-30 = 20

    x=x-y;  //50-20 = 30

    System.out.println(x);
    System.out.println(y);

    }
}