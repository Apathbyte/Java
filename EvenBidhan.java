import java.util.Scanner;

public class EvenBidhan {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = Input.nextInt();
        
        Input.close();

        System.out.print("The five even numbers from " + num + " are: ");

        if (num % 2 != 0) { // If the number is odd, we have to add 1 to make it even
            num++;
        } else { // If the number is even, we have to add 2 to get the next even number
            num += 2;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(num + ", ");
            num += 2; // We have to increase by 2 to get the next even number
        }
    }
}
