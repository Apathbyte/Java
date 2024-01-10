package Pattern;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[]args){
        Scanner Input = new Scanner (System.in);
        System.out.print("Enter the number of row:");
        int n = Input.nextInt();

        Input.close();
        for (int i =1; i<=n; i++){
           //Space 
           for(int j =1; j<=n-i; j++){
              System.out.print(" ");
           }
           //Star
           for(int j =1; j<=(2*i)-1; j++){
            System.out.print("*");
           }
           //Space
           for(int j =1; j<=n-i; j++){
              System.out.print(" ");
           }
        System.out.println();
        }

        //numbers
        for (int i =1; i<=n; i++){
           //Space 
           for(int j =1; j<=n-i; j++){
              System.out.print(" ");
           }
           //Star
           for(int j =1; j<=(2*i)-1; j++){
            System.out.print(i);
           }
           //Space
           for(int j =1; j<=n-i; j++){
              System.out.print(" ");
           }
        System.out.println();
        }

    //numbers 2
        for (int i =1; i<=n; i++){
           //Space 
           for(int j =1; j<=n-i; j++){
              System.out.print(" ");
           }
           //Star
           for(int j =1; j<=(2*i)-1; j++){
            System.out.print(j);
           }
           //Space
           for(int j =1; j<=n-i; j++){
              System.out.print(" ");
           }
        System.out.println();
        }
        for (int i =1; i<=n; i++){
           //Space 
           for(int j =1; j<=n-i; j++){
              System.out.print("1");
           }
           //Star
           for(int j =1; j<=(2*i)-1; j++){
            System.out.print("*");
           }
           //Space
           for(int j =1; j<=n-i; j++){
              System.out.print("1");
           }
        System.out.println();
        }
    }
}
