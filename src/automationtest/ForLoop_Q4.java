package automationtest;
//program to use a for loop and print name that many number of times
import java.util.Scanner;

public class ForLoop_Q4 {
    public static void main(String[] args) {
        ForLoop_Q4 print = new ForLoop_Q4();
        print.PrintMyName("CR" , 10);
    }
    public void PrintMyName ( String name, int howManyTime)
    {
        System.out.println("Enter how many times name should be printed");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for ( int i= 0;i<num;i++)
            System.out.println("CR" );
    }
}
