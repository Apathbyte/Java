// public class LAB1 {
//     public static void main (String[]args){
//         //Q2:Create a new Java project and class. Write a program that displays the message: “Hello, World!”
//         System.out.println("Hello, World!");
//     }
// }


public class Sum{
    public static void main(String[]args){
        int s = 0;
        // Using for loop to prin the sum
        for (int i = 1; i<=10;++i){ //the loop goes from 1 to 10 
            s= s+i; //s+i goes untill the loop ends
            }
            System.out.println("Sum of numbers from 1 to 10 is " + s);
    }
}