import java.util.Scanner;
public class Swap {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a:");
        int a= sc.nextInt();

        System.out.println("Enter b:");
        int b= sc.nextInt();



        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp= a;
         a=  b;
         b=temp;
        System.out.println("After swap: a = " + a + ", b = " + b);


        //without using temp
        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("After swap: a = " + a + ", b = " + b);


        //Swap using mul and div
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}