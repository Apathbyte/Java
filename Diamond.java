package Pattern;
import java.util.Scanner;
public class Diamond {
//Just use combination
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the rows/2: ");
        int n = Input.nextInt();

        Input.close();

        //Loop
        for(int i =1; i<=n; i++){
            //Upper
            //space
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
            //Star
            for (int j= 1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            //space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int l =1 ; l<=n; l++){
             //Lower
            //space
            for(int k= 1; k<=l-1; k++){
                System.out.print(" ");
            }
            //Star
            for(int k= 1; k<=2*n-(2*l-1); k++){
                System.out.print("*");
            }
            //Space
            for(int k= 1; k<=l-1; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
