package Pattern;
import java.util.Scanner;
public class Square{
    public static void main(String[]args){
    Scanner Input = new Scanner (System.in);
    System.out.print("Enter the row of the pattern: ");
    int n = Input.nextInt();
    Input.close();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
