/*Reverse a Number
Input: Integer
Output: Reversed integer
Rule: Do not convert number to String.*/
import java.util.Scanner;
public class Reverse_Integer{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int rev=0;

        while(number > 0){
            int n = number % 10;     // n=3         n=2         n=1           % is taking after decimal value

            rev = rev*10+n;        //rev=3        rev=32      rev=321        // storing reversing values 

            number = number/10; ///number= 12   number=1    number=0      /  is taking before decimal value
        }
        System.out.println(rev);

    }
}