public class Variables {

    // Static variable
    static String college = "ABC College";

    // Instance variables
    String name = "Rahul";
    int age;

    public static void main(String[] args) {

        // Create object
        Variables s1 = new Variables();

        // Instance variable
        s1.age = 20;

        // Local variable
        double gpa = 8.5;

        // Primitive variables
        byte b = 10;
        short s = 1000;
        int i = 50000;
        long l = 100000L;
        float f = 10.5f;
        double d = 99.99;
        char c = 'A';
        boolean bool = true;

        // Display previous variables
        System.out.println("College: " + Variables.college); // Static access
        System.out.println("College: " + college);
        System.out.println("Name: " + s1.name);              // Instance access
        System.out.println("Age: " + s1.age);
        System.out.println("GPA: " + gpa);                   // Local access

        // Display primitive variables with data type
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}