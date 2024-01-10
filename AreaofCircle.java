import java.util.*;//implicit import
public class AreaofCircle {
    public static void main(String[]args){
      // Area of circle via user input
        //Ask for input
          Scanner input = new Scanner(System.in);
             int radius = input.nextInt();
          input.close();
        //Calculate area
          Double Area;
          final double PI = 3.1415f;
          Area = PI * (radius * radius);
        //Print
          System.out.println("Area of Circle is " + Area);
    }
}
