// // // import java.util.Scanner;
// // public class Test{
// //     public static void main(String[]sargs){
// //         int myage = 29;
// //         int votingage = 18;
// //         if (myage>=votingage){
// //             System.out.println("You can vote.");
// //         }
// //         else{
// //             System.out.println("You cannot vote.");
// //         }
// // }
// // }

// // import java.util.Scanner;

// // public class Test {

// //     public static void main(String[] args) {
// //         Scanner Input = new Scanner(System.in);
// //         boolean checker = false;

// //         do {
// //             System.out.print("Enter a password: ");
// //             String password = Input.nextLine();
// //             checker = passoperation(password);

// //             if (checker) {
// //                 System.out.println("Password is valid.");
// //             } else {
// //                 System.out.println("Password is not valid. Please try again.");
// //             }
// //         } while (checker);

// //         Input.close();
// //     }

// //     public static boolean passoperation(String password) {
// //         // Check for password length
// //         if (password.length() < 10) {
// //             return false;
// //         }

// //         boolean hasUppercase = false;
// //         boolean hasLowercase = false;
// //         boolean hasNumber = false;
// //         boolean hasSymbol = false;

// //         for (char c : password.toCharArray()) {
// //             if (Character.isUpperCase(c)) {
// //                 hasUppercase = true;
// //             } else if (Character.isLowerCase(c)) {
// //                 hasLowercase = true;
// //             } else if (Character.isDigit(c)) {
// //                 hasNumber = true;
// //             } else {
// //                 hasSymbol = isSymbol(c);
// //             }
// //         }

// //         return hasUppercase && hasLowercase && hasNumber && hasSymbol;
// //     }

// //     private static boolean isSymbol(char c) {
// //         // You can define your own set of symbols or use the following default set
// //         String symbols = "!@#$%^&*()-_+=<>?";
// //         return symbols.contains(String.valueOf(c));
// //     }
// // }

// import java.util.Scanner;

// public class Test{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Choose a shape: ");
//         System.out.println("1. Triangle");
//         System.out.println("2. Square");
//         System.out.println("3. Circle");

//         int shapeChoice = scanner.nextInt();

//         System.out.println("Choose calculation: ");
//         System.out.println("1. Area");
//         System.out.println("2. Perimeter");

//         int calculationChoice = scanner.nextInt();

//         switch (shapeChoice) {
//             case 1:
//                 calculateTriangle(calculationChoice);
//                 break;
//             case 2:
//                 calculateSquare(calculationChoice);
//                 break;
//             case 3:
//                 calculateCircle(calculationChoice);
//                 break;
//             default:
//                 System.out.println("Invalid choice. Please choose a valid option.");
//         }

//         scanner.close();
//     }

//     public static void calculateTriangle(int calculationChoice) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the base of the triangle: ");
//         double base = scanner.nextDouble();

//         System.out.println("Enter the height of the triangle: ");
//         double height = scanner.nextDouble();

//         double area = 0.5 * base * height;
//         double perimeter = base + (2 * Math.sqrt((base * base + height * height)));

//         displayResults("Triangle", calculationChoice, area, perimeter);

//         scanner.close();
//     }

//     public static void calculateSquare(int calculationChoice) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the side length of the square: ");
//         double sideLength = scanner.nextDouble();

//         double area = sideLength * sideLength;
//         double perimeter = 4 * sideLength;

//         displayResults("Square", calculationChoice, area, perimeter);

//         scanner.close();
//     }

//     public static void calculateCircle(int calculationChoice) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the radius of the circle: ");
//         double radius = scanner.nextDouble();

//         double area = Math.PI * radius * radius;
//         double perimeter = 2 * Math.PI * radius;

//         displayResults("Circle", calculationChoice, area, perimeter);

//         scanner.close();
//     }

//     public static void displayResults(String shape, int calculationChoice, double area, double perimeter) {
//         System.out.println("Shape: " + shape);

//         if (calculationChoice == 1) {
//             System.out.println("Area: " + area);
//         } else if (calculationChoice == 2) {
// //             System.out.println("Perimeter: " + perimeter);
// //         } else {
// //             System.out.println("Invalid calculation choice.");
// //         }
// //     }
// // }

// // 

// public class test{
//     public static void main(String[]args){
//         sum(10,20);
//         difference(7, 4);
//         product(9, 4);
        
//     }

//     public static void sum(int a, int b){
//       System.out.println(a + b);
//     }

//     public static void difference(int a, int b){
//      System.out.println(a-b);
//     }
     
//     public static void product(int a, int b){
//         System.out.println(a*b);
//     }
// }
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a shape: (1) Triangle, (2) Square, (3) Circle:");
        int choice1 = input.nextInt();

        System.out.println("Choose an operation: (1) Perimeter, (2) Area:");
        int choice2 = input.nextInt();

        double base, height;

        switch (choice1) {
            case 1:
                System.out.print("Enter the base of the triangle: ");
                base = input.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                height = input.nextDouble();
                if (choice2 == 1) {
                    triangleperimeter(base, height);
                } else if (choice2 == 2) {
                    double areaT = trianglearea(base, height);
                    System.out.println("Area of the triangle is: " + areaT);
                }
                break;
            // Handle other shapes similarly...

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }

    public static double trianglearea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void triangleperimeter(double base, double height) {
        double hypotenuse = Math.sqrt(base * base + height * height);
        double perimeter = base + 2 * hypotenuse;
        System.out.println("Perimeter of triangle is: " + perimeter);
    }

    // Define other shape methods similarly...
}
