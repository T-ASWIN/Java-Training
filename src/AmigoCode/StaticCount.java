package AmigoCode;

import java.util.Scanner;

class Demo {
    static String[] names;
    static int count;

    // Method to get the count and names from the user
    void getCountAndNames() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        count = sc.nextInt();  // Update the static count variable

        // Initialize the names array to store the input names
        names = new String[count];
        sc.nextLine(); // Consume the newline character left after nextInt()

        // Loop to get names from the user
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
    }

    // Constructor
    public Demo() {
        for (int i = 0; i < count; i++) {
            System.out.println("Name " + (i + 1) + ": " + names[i]);
        }
    }
}

public class StaticCount {
    public static void main(String[] args) {
        // Create an object of Demo and get count and names
        Demo obj = new Demo();
        obj.getCountAndNames();

        // Call the constructor to print the names
        new Demo();
    }
}
