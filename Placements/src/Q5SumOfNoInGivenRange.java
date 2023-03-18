//5.Find the Sum of the Numbers in a Given Range
import java.util.Scanner;
public class Q5SumOfNoInGivenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Starting No.:");
        int start=sc.nextInt();
        System.out.print("Enter Ending No.:");
        int end=sc.nextInt();

        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.println("The sum of Numbers in the range from "+start+" and "+end+" is "+sum);
    }
}
