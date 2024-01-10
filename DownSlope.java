package Pattern;
import java.util.Scanner;
public class DownSlope {
    public static void main (String[]args){
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter the dimensional row of the pattern: ");
    int n = Input.nextInt();
    Input.close();
        for (int i= 1; i<=n; i++){
             for (int j=1 ; j<=i; j++){
                System.out.print("*");
             }
        System.out.println();
        }
        for (int k = 1; k<=n; k++){
            for(int l= 1; l<=k; l++){
                System.out.print(k);
            }
        System.out.println();
        }
        for(int a = 1; a<=n; a++){
            for(int b = 1; b<=a; b++){
                System.out.print(b);
            }
        System.out.println();
        }
}
}