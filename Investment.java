import java.util.Scanner;
public class LAB2 {
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
          System.out.println("Please enter the investment amount:" );
            double investmentAmount = Input.nextDouble();
          System.out.println("Please enter the monthly interest rate:" );
            double monthlyInterestRate = Input.nextDouble();
          System.out.println("Please enter the number of years:" );
            double years = Input.nextDouble();
        Input.close();
        double x = (1 + monthlyInterestRate);
        double y = Math.pow(x, years);
        double futureValue = investmentAmount*y;
        System.out.println("The future value of the investment is:" + futureValue);
    }
}
