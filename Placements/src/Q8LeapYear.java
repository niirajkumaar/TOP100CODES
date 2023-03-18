//8. Java Program to Check Leap Year or not
import java.util.Scanner;
public class Q8LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Year:");
        int year= sc.nextInt();

        if(year%400==0){
            System.out.print(year+" is Leap Year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.print(year+" is Leap Year");
        }
        else{
            System.out.print(year+" is not a Leap Year");
        }
    }
}
