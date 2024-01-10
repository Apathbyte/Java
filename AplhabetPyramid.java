package Pattern;
import java.util.Scanner;
public class AplhabetPyramid {
    public static void main(String[]args){
       Scanner Input = new Scanner (System.in);
       System.out.print("Enter the number of rows: ");
       int n = Input.nextInt();
       
       Input.close();

       //loop
       for(int i = 0; i<n; i++){
       
        //Space
        for(int j=0; j<n-i-1; j++){
           System.out.print(" ");
        }
        //Alphabets
         char ch= 'A';
        int breakpoint = i;
        for(int j =1; j<=2*i+1 ; j++){
            System.out.print(ch);
            if (j<=breakpoint){
                ch++;
            }
            else{
                ch--;
            }
        }
        //Space
        for(int j =0; j<n- i-1; j++){
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}
