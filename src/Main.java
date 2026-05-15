import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Shrek Movie Rating Calculator ===");

        System.out.print("Shrek 1 rating: ");
        int grade1 = scanner.nextInt();

        System.out.print("Shrek 2 rating: ");
        int grade2 = scanner.nextInt();

        System.out.print("Shrek the Third rating: ");
        int grade3 = scanner.nextInt();

        System.out.print("Shrek Forever After rating: ");
        int grade4 = scanner.nextInt();

        System.out.print("Shrek 5 rating: ");
        int grade5 = scanner.nextInt();

        double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;

        System.out.printf("Average rating: %.2f%n", average);

        scanner.close();
    }
}