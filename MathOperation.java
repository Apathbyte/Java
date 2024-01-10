import java.util.Scanner;
public class LAB2Q2 {
    public static void main (String[]args){
        Scanner Input = new Scanner(System.in);
          System.out.println("Enter the first integer value:" );
           int x = Input.nextInt();
          System.out.println("Enter the second integer value:" );
           int y = Input.nextInt();
        Input.close();
        int sum = x + y;
         System.out.println("Sum of the values:" + sum);
        int difference = x - y;
         System.out.println("Difference of the values:" + difference);
        int product = x * y;
         System.out.println("Product of the values:" + product);
        int quotient = x / y;
         System.out.println("Quotient of the values:" + quotient);
    }
}
