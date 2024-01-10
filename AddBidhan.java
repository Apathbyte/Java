import java.util.Scanner;

public class AddBidhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = getValidNumberBidhan(scanner);

        System.out.print("Enter the second number: ");
        double num2 = getValidNumberBidhan(scanner);

        double sum = sumBidhan(num1, num2);

        System.out.println("The sum of two numbers is: " + sum);

        scanner.close();
    }

    private static double getValidNumberBidhan(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }

    public static double sumBidhan(double num1, double num2) {
        return num1 + num2;
    }
}
