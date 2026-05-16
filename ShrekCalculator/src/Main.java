import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int grade1, grade2, grade3, grade4, grade5;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Shrek Movie Rating Calculator ===");

        while (true) {
            System.out.print("Shrek 1 rating: ");
            grade1 = scanner.nextInt();
            if (grade1 < 0 || grade1 > 10) {
                System.out.println("Invalid rating. Please enter a number between 0 and 10.");
            }
            else {
                break;
            }
        }

        while (true) {
            System.out.print("Shrek 2 rating: ");
            grade2 = scanner.nextInt();
            if (grade2 < 0 || grade2 > 10) {
                System.out.println("Invalid rating. Please enter a number between 0 and 10.");
            }
            else {
                break;
            }
        }

        while (true) {
            System.out.print("Shrek the Third rating: ");
            grade3 = scanner.nextInt();
            if (grade3 < 0 || grade3 > 10) {
                System.out.println("Invalid rating. Please enter a number between 0 and 10.");
            }
            else {
                break;
            }
        }


        while (true) {
            System.out.print("Shrek Forever After rating: ");
            grade4 = scanner.nextInt();
            if (grade4 < 0 || grade4 > 10) {
                System.out.println("Invalid rating. Please enter a number between 0 and 10.");
            }
            else {
                break;
            }
        }

        while (true) {
            System.out.print("Shrek 5 rating: ");
            grade5 = scanner.nextInt();
            if (grade5 < 0 || grade5 > 10) {
                System.out.println("Invalid rating. Please enter a number between 0 and 10.");
            }
            else {
                break;
            }
        }

        average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;

        System.out.printf("Average rating: %.2f%n", average);

        scanner.close();
    }
}