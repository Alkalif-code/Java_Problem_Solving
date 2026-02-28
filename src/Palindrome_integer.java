/*Check Palindrome Number
Input: Integer
Output: Print "Palindrome" or "Not Palindrome"
Rule: Use reverse logic.*/
import java.util.Scanner;
public class Palindrome_integer{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();        //234
        int orginal=number;              //storing for final verify pali or not
        int rev=0;
        while(number>0){
            int digit = number%10;   //digit =4  l
            rev = rev*10+digit;       //rev=4
            number=number/10;        //23
        }
        if(orginal==rev){           //condition we using stored variable
            System.out.println("Palindrome");
        }        
        else{
            System.out.println("Not Palindrome");
        }

   }
}