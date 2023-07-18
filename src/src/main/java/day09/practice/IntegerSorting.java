package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntegerSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read numbers from the user
        System.out.print("Enter numbers: ");
        String input = scanner.nextLine();

        // Split the input string into individual numbers
        String[] numbers = input.split(" ");

        ArrayList<Integer> list = new ArrayList<Integer>();

        // Convert the numbers to integers and add them to the list
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }

        // Sort the list
        Collections.sort(list);

        // Print the sorted list
        System.out.print("Sorted list: ");
        for (int number : list) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
