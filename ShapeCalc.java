import java.util.Scanner;

public class ShapeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a shape: (1) Triangle, (2) Square, (3) Circle:");
        int choice1 = input.nextInt();

        System.out.println("Choose an operation: (1) Perimeter, (2) Area:");
        int choice2 = input.nextInt();

        double result = 0;
        String calculationType = "";
        String calculationof = "";

        if (choice1 == 1) {
            if (choice2 == 1) {
                result = triangleperimeter();
                calculationType = "Perimeter";
            } else if (choice2 == 2) {
                result = trianglearea();
                calculationType = "Area";
            } else {
                System.out.println("Not a vlaid selection, choose again.");
            }
            calculationof = "triangle";
        } else if (choice1 == 2) {
            if (choice2 == 1) {
                result = squareperimeter();
                calculationType = "Perimeter";
            } else if (choice2 == 2) {
                result = squarearea();
                calculationType = "Area";
            } else {
                System.out.println("Not a vlaid selection, choose again.");
            }
            calculationof = "square";
        } else if (choice1 == 3) {
            if (choice2 == 1) {
                result = circleperimeter();
                calculationType = "Perimeter";
            } else if (choice2 == 2) {
                result = circlearea();
                calculationType = "Area";
            } else {
                System.out.println("Not a vlaid selection, choose again.");
            }
            calculationof = "circle";
        } else {
            System.out.println("Not a vlaid selection, choose again.");
        }

        System.out.println(calculationType +" of " + calculationof + " is: " + result);
        input.close();
    }
            

    public static double trianglearea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        input.close();
        return 0.5 * base * height;
    }

    public static double triangleperimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of first side of the triangle: ");
        double a = input.nextDouble();

        System.out.print("Enter the length of  second side of the triangle: ");
        double b = input.nextDouble();
        
        System.out.print("Enter the length of  third side of the triangle: ");
        double c = input.nextDouble();

        input.close();
        
        return a+b+c;
    }

    public static double squarearea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        double length = input.nextDouble();
        input.close();
        return Math.pow(length, 2);
    }

    public static double squareperimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        double length = input.nextDouble();
        input.close();
        return 4 * length;
    }

    public static double circlearea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();
        return Math.PI * radius * radius;
    }

    public static double circleperimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();
        return 2 * Math.PI * radius;
    }
}
