//9. Java Program to Check Whether a Number is Prime or Not
import java.util.Scanner;
public class Q9PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A No.:");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.print(n+" is not a prime Number");
        }
        else{
            System.out.print(n+" is Prime Number");
        }
    }
}
