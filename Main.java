import java.util.Scanner;
public class Main {
    public int age;

    public static void main(String[] args) {
       


        //System.out.println("Enter a Day:");

        Scanner sc = new Scanner(System.in);
        int Day=sc.nextInt();

        switch(Day){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thurs");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            default:
                System.out.println("Sun");
                break;
        }
        } 

        

    }
