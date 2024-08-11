package collections;
import java.util.*;
import java.io.*;

 class RotateFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the list
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        // Reading the elements of the list
        List<Integer> myList = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            myList.add(element);
        }

        // Printing the list before rotation
        System.out.println("List before rotation: " + myList);

        // Rotating the list
        Collections.rotate(myList, 4);

        // Printing the list after rotation
        System.out.println("List after rotation: " + myList);

        // Closing the scanner
        scanner.close();
    }
}
