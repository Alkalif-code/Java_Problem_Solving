/*4,Grade Calculator
Input marks (0–100) and print grade:
90-100 → A
80-89  → B
70-79  → C
60-69  → D
Below 60 → Fail*/
import java.util.Scanner;
public class Grade_Calculator{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();

        if(mark>=90 && mark<=100){
            System.out.println("A");
        }
        else if(mark>=80 && mark<=89){
            System.out.println("B");
        }
        else if(mark>=70 && mark<=79){
            System.out.println("C");
        }
        else if(mark>=60 && mark<=69){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
