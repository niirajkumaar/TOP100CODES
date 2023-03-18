//1. Check if a Number is Positive or Negative
import java.util.Scanner;
public class Q1PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A Number:");
        int num=sc.nextInt();

        if(num>0){
            System.out.println("POSITIVE");
        }
        else if(num<0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("ZERO");
        }
    }
}
