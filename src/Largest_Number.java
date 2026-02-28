/*2️⃣ Largest of Three Numbers
Input 3 numbers and print the largest one.
(Use only if-else, not Math.max)
*/
import java.util.Scanner;

public class Largest_Number{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b =scan.nextInt();
        int c =scan.nextInt();

        if(a>=b && a>=c){             
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}