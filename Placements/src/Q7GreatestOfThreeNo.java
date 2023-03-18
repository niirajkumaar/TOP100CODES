//7. Find the Greatest Number Among Three Numbers in Java
import java.util.Scanner;
public class Q7GreatestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First No.:");
        int first= sc.nextInt();
        System.out.print("Enter Second No.");
        int second=sc.nextInt();
        System.out.print("Enter Third No.:");
        int third= sc.nextInt();

        if(first>second && first>third){
            System.out.print("Greatest No. is "+first);
        }
        else if(second>third){
            System.out.print("Greatest No. is "+second);
        }
        else{
            System.out.print("Greatest No. is "+third);
        }
    }
}
