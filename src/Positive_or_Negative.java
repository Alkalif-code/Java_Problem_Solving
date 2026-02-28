/* 1️⃣ Positive, Negative, Zero
Takes an integer input
Prints whether it is Positive, Negative, or Zero
*/
import java.util.Scanner;      
public class Positive_or_Negative{

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        double given_number=scan.nextDouble();
        if(given_number > 0){
            System.out.println("Positive");
        }
        else if(given_number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}