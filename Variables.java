public class Variables {

    // Static variable
    static String college = "ABC College";

    // Instance variables
    String name= "Rahul";
    int age;

    public static void main(String[] args) {

        // Create object
        Variables s1 = new Variables();

        // Instance variables

        s1.age = 20;

        // Local variable
        double gpa = 8.5;

        // Display values
        System.out.println("College: " + Variables.college); //static access
        System.out.println("College: " + college);
        System.out.println("Name: " + s1.name);              //instance access
        System.out.println("Age: " + s1.age);
        System.out.println("GPA: " + gpa);                   //local access
    }
}