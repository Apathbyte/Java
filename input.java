import java.util.Scanner;
public class input{
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your age");
        double a= Input.nextDouble();
        Input.close();
        if (a>=18){
            System.out.println("You can vote in the upcoming elections");
        }
        else{
            System.out.println("You cannot vote in the upcoming elections");
        }
        }
}