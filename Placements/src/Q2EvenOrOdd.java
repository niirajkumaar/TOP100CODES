//2. Check if a Number is Even or Odd
import java.util.Scanner;
public class Q2EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A Number:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
