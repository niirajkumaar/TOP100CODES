//10. Java Program to print Prime numbers in a given range
// https://github.com/niirajkumaar/TOP100CODES/tree/master/Placements/src
import java.util.Scanner;
public class Q10PrimeNoInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Start Position:");
        int start= sc.nextInt();
        System.out.print("Enter End Position:");
        int end= sc.nextInt();
        int count=0;

        for(int i=start;i<=end;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }

            if(count==2){
                System.out.print(i+" ");
            }

        }

    }
}
