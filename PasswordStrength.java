import java.util.Scanner;
public class PasswordStrength{
    public static void main(String[] args) {
        //Algorithm
        //1. Ask user for string
        //2. check the string for conditions
        //3. print if the conditions are matched or not 
    //Lets display the message for instructions to set a strong password
     System.out.println("A valid password must have: ");
     System.out.println("At least 10 characters");
     System.out.println("At least one uppercase letter");
     System.out.println("At least one lowercase letter");
     System.out.println("At least one number");
     System.out.println("At least one symbol");
 
    //Lets ask user for input password
     Scanner Input = new Scanner(System.in);
     
     //lets declare a boolean variable
        boolean checker;
        
        do {
            System.out.println();
            System.out.print("Enter a password: ");
            String password = Input.nextLine();
            checker = passoperation(password);

            //lets define a condition with the return value that prints if the password meets the requiremment or not
            if (checker) {
                System.out.println("Password meets all the requirements.");
            } 
            else {
                System.out.println("A valid password must have:");
                System.out.println("At least 10 characters");
                System.out.println("At least one uppercase letter");
                System.out.println("At least one lowercase letter");
                System.out.println("At least one number");
                System.out.println("At least one symbol");
            }

        } while (!checker);//keep asking for input until checker is true, so use ! to continue the process till it's false

     Input.close();

    }

    //lets create a method that returns a boolean
    public static boolean passoperation(String password) {
        //find the length of the string and make sure it's more than 10 characters
        int len = password.length();
        if (len < 10) {
            return false;
        }
        
        //lets declare some boolean variable
         boolean uppercasePresent = false;
         boolean lowercasePresent = false;
         boolean numberPresent = false;
         boolean symbolPresent = false;
        
        //lets iterate through 0th index to length of password to check if it meets requirements
        for (int i = 0; i < len; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercasePresent = true;
            } else if (Character.isLowerCase(ch)) {
                lowercasePresent = true;
            } else if (Character.isDigit(ch)) {
                numberPresent = true;
            } else {
                symbolPresent= symbol(ch);
            }
        }
        return uppercasePresent && lowercasePresent && numberPresent && symbolPresent;
    }

    //Lets define a set of symbols in a new boolean method and return it to 
    public static boolean symbol(char chara) {
        
        String symbols = "!@#$%^&*()-_+=<>?,.;/|{}[]'";
        boolean check =  symbols.contains(String.valueOf(chara));
        return check;
    }

}
