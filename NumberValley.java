package Pattern;
import java.util.Scanner;
public class NumberValley {
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = Input.nextInt();

        Input.close();

        int reduct = 2*(n-1);

        //Loop
        for(int i =1; i<=n; i++){
            //number
            
            for (int j= 1; j<=i; j++){
                System.out.print(j);
            } 
            //space
            for (int j =1; j<=reduct; j++){
            System.out.print(" ");
            }
            //number
            for (int j = i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
            reduct -=2;
        }
    }
}
