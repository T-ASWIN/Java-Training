package basicprogram;
import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the number of strings in the array: ");
        int arraySize = scanner.nextInt();

        // Consume the newline left-over
        scanner.nextLine();

        // Create an array of the specified size
        String[] array = new String[arraySize];

        // Prompt the user to enter elements for the array
        System.out.println("Enter " + arraySize + " strings:");

        for (int i = 0; i < arraySize; i++) {
            // Read each string from the user
            array[i] = scanner.nextLine();
        }

        // Create another array to store the reversed array
        String[] reversedArray = new String[arraySize];

        // Populate the reversed array
        for (int i = 0; i < arraySize; i++) {
            reversedArray[i] = array[arraySize - 1 - i];
        }

        // Display the entered array
        System.out.print("You entered: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Display the reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
