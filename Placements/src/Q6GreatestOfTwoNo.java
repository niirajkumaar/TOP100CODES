//6. Java Program to Find Greatest of Two Numbers
import java.util.Scanner;
public class Q6GreatestOfTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First No.:");
        int first=sc.nextInt();
        System.out.print("Enter Second No.:");
        int second=sc.nextInt();

        if(first>second){
            System.out.print("Greatest No. is "+first);
        }
        else if(second>first){
            System.out.print("Greatest No. is "+second);
        }
        else{
            System.out.print("No. is Equal");
        }

    }
}
