package Pattern;
import java.util.Scanner;
public class RightArrow {
    public static void main(String[]args){
        Scanner Input  = new Scanner(System.in);
        System.out.print("Enter the number of rows/2:");
        int n = Input.nextInt();

        Input.close();

        //Loop 

        //upper
        for (int x= 1; x<=n; x++){
            for (int y = 1; y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for (int i=1; i<=n; i++){
            for(int j = 1;j<=n-i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        //Shorter Method
        for (int a=1 ; a<=2*n-1; a++){
            int stars = a;
            if(a>n){
                stars = 2*n - a;
            }
            for (int b = 1; b<= stars; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
