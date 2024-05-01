import java.util.Scanner;
import java.util.Arrays;

public class StudentAges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] birthYears = new int[5];
        int currentYear = java.time.Year.now().getValue(); // Get the current year
        int[] ages = new int[5];

        // Input birth years from the user
        System.out.println("Enter the birth year of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            birthYears[i] = scanner.nextInt();
            ages[i] = currentYear - birthYears[i]; // Calculate age
        }

        // Sort the ages array in descending order
        Arrays.sort(ages);
        int[] descAges = new int[5];
        for (int i = 0; i < 5; i++) {
            descAges[i] = ages[4 - i];
        }

        // Output the ages in descending order
        System.out.println("Ages of the students in descending order:");
        for (int age : descAges) {
            System.out.println(age);
        }

        scanner.close(); // Close the scanner
    }
}
