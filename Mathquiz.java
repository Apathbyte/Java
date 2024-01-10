import java.util.Scanner;
import java.util.Random;
public class Mathquiz {
    public static void main(String[]args){
        //Algorithm:
        //1. Make a random question generator(use Math.random)
        //2. Generate random math operations
        //3. Display these operations and numbers randomly
        //4. Ask user  for input; answer 
        //4. Determine if the answer is correct or not
        //5. Give an output followingly
        System.out.println("**********MATH QUIZ**********");
        System.out.println("=============================");
        //Number 1:
        int number1 = (int)(1 + Math.random()*15);
          //System.out.println(number1);
        //Number 2:
        int number2 = (int)(1 + Math.random()*15);
          //System.out.println(number2);
        //Now for the next step generate random operators
        Random operator = new Random();
          int Operatorpref =operator.nextInt(4);
          char Operatoruse;
          if (Operatorpref == 0){
            Operatoruse = '+';
          }
          else if(Operatorpref == 1){
            Operatoruse = '-';
          }
          else if(Operatorpref == 2){
            Operatoruse = '*';
          }
          else if(Operatorpref == 3){
            Operatoruse = '/';
          }
          else{
            throw new IllegalStateException("Incorrect Operator choice"+Operatorpref);
          }
          //System.out.println(Operatoruse);
        //Ask answer/input to the player:
        Scanner Input = new Scanner(System.in);
        System.out.print("Math Problem: " + number1+ " "+Operatoruse+" "+ number2+" "+"="+" ");
         int Answer = Input.nextInt();
        Input.close();
        //Now, mathematical operation on the random numbers:
        int correctanswer=0;
        if (Operatoruse == '+'){
            correctanswer = number1 + number2;
        }
        else if(Operatoruse == '-'){
            correctanswer = number1 - number2;
        }
        else if(Operatoruse == '*'){
            correctanswer = number1 * number2;
        }
        else if(Operatoruse == '/'){
            correctanswer = number1 / number2;
        }
         System.out.println(correctanswer);
        //Check if the user answer and program answer match
        if (Answer == correctanswer){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect! The correct answer is "+ correctanswer);
        }
    }
}
