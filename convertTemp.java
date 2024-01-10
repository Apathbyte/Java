import java.util.*;
public class convertTemp{
    public static void main(String[]args){
        //Convert Temperature from Farenhiet to Celsuis 
        System.out.print("Enter the temperature in farenheit scale: ");
        Scanner input = new Scanner(System.in);
        double farenheit = input.nextDouble();
        input.close();
        // System.out.println(farenheit);
        double celsuis = (5.0/9)*(farenheit - 32);
        System.out.println( farenheit + " in celsuis is " +celsuis);
    }
}