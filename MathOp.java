import java.util.Scanner;
public class LAB2Q2_pt2 {
    public static void main (String[]args){
        Scanner Input = new Scanner(System.in);
          System.out.println("Enter the first number:" );
           double d1 = Input.nextDouble();
          System.out.println("Enter the second number:" );
           double d2 = Input.nextDouble();
        Input.close();
        double sum = d1 + d2;
         System.out.println("Sum of the numbers:" + sum);
        double difference = d1 - d2;
         System.out.println("Difference of the numbers:" + difference);
        double product = d1 * d2;
         System.out.println("Product of the numbers:" + product);
        double quotient = d1 / d2;
         System.out.println("Quotient of the numbers:" + quotient);
    }
}


