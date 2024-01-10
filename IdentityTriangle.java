package Pattern;
import java.util.Scanner;
public class IdentityTriangle {
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = Input.nextInt();

        Input.close();

        //Loop
        for (int i = 1; i<= n; i++){
            int number = 1;
            if(i % 2 != 0){
               number = 1;
            }
            else{
                number = 0;
            }
             for(int j = 1; j<=i; j++){
                System.out.print(number);
                number = 1-number;
             }
        System.out.println();
        }
    }
}
