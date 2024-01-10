import java.util.Scanner;
public class StringSubstringCheck{
    public static void main(String[]args){
        //Algorithm
        //Step 1: ask user for two strings
        //check if second string is substring of first USE TERNARY OPERATOR
        //print results

        //step 1:
         Scanner Input = new Scanner(System.in);
         System.out.print("Enter the first String:");
         String first = Input.nextLine();

         System.out.print("Enter the second String:");
         String second = Input.nextLine();
         Input.close();

        //step2:
        //lets try and find a substring of first string from 0th index to a random range on it's length
        // int len = first.length();
        // int range = (int)(Math.random()*len);
        // String subString = first.substring(0,range);
        // System.out.println(subString);
        //Use ternary operators 
        // if (subString.equalsIgnoreCase(second)){
        //     System.out.println(second +" is a substring of first");
        // }
        // else{
        //     System.out.println("Invalid");
        // }
        // if (first.contains(second)){
        //     System.out.println("Is substring");
        // }
        // else {
        //     System.out.println("Not substring");
        // }
        String Result;
        Result = (first.contains(second))?second +" is a substring of " + first: second + " is not a substring of " + first;
        System.out.println(Result);
    }
}