/* 3Leap Year Check
Input a year and check if it is a leap year.
Rules:
Divisible by 4
Not divisible by 100
Unless divisible by 400
*/
import java.util.Scanner;

public class Leap_Year{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

        if((a%4==0 && a%100!=0)||(a%400==0)){    // 3 condition must satisfy for a leap year.
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        scan.close();
    }
}
