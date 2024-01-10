import java.util.Scanner;
public class FeetToMeters {
    public static void main (String[]args){
        Scanner Input = new Scanner (System.in);
        System.out.print("Enter the length in feet: ");
        float feet = Input.nextFloat();
        Input.close();

        float meters = 0.305f * feet;

        System.out.println(feet + " feet is " + meters);
    } 
}
