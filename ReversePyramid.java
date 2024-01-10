package Pattern;
import java.util.Scanner;
public class ReversePyramid {
   public static void main(String[]args){
     Scanner Input= new Scanner(System.in);
     System.out.print("Enter the number of rows: ");
     int n = Input.nextInt();

     Input.close();
     //for pattern
     for (int i = 1; i<=n; i++){
        //space
        for(int j=1; j<=i; j++){
            System.out.print(" ");
        }
        //Stars
        for(int j=1; j<=2*n -(2*i+1); j++){
            System.out.print("*");
        }
        //space
        for(int j=1; j<=i; j++){
            System.out.print(" ");
        }
        System.out.println();
      }
    }
}
