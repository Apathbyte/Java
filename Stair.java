package Pattern;
import java.util.Scanner;
public class Stair {
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n = Input.nextInt();

        Input.close();
        
        //Loop
        int start = 1;
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(start + " ");
                start +=1;
            }
            System.out.println();
        }
    }
    
}
