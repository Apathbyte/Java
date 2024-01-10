import java.util.Scanner;
public class SubString {
    public static void main(String[]args){
    //Algorithm
        //Step 1: ask user for two strings
        //check if second string is substring of first ***USE TERNARY OPERATOR**
        //print results

    //step 1:
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String firsString = Input.nextLine();

    //second string
    System.out.print("Enter the second string: ");
    String secoString = Input.nextLine();
    Input.close();
    
    //check if first contains second and print result
    String Result;
    Result = (firsString.contains(secoString))? secoString + " is a substring of "+ firsString: secoString + " is not a substring of "+ firsString;
    System.out.println(Result);
    }
}
