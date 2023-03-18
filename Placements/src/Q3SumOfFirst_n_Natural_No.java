//3. Program to Find the Sum of First N Natural Numbers
import java.util.Scanner;
public class Q3SumOfFirst_n_Natural_No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A number:");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
