import java.util.Scanner;
public class MeanAndStDeviation {
    public static void main(String[]args){
    //Algorithms
    //1. Ask for input--> set size and--> elements of the set
    //2. Calculate Mean 
    //3. Calculate Standard Deviation

    //Input for the cardinality
    Scanner Input = new Scanner(System.in);
    System.out.print("What is the set size? ");
    int setCardinality = Input.nextInt();
    

    //Input for the set elements;
    double sum = 0;
    double sumOfSquare = 0;
    double square= 0;
    System.out.print("What are the elements of the set? ");
    for (int i = 1; i<= setCardinality; i++ ){
        double setElements = Input.nextDouble();
        //sum of elements 
        sum = sum + setElements;
        //square the elements
        square = Math.pow(setElements, 2);
        //sum of all the squared elements
        sumOfSquare += square;
    }
    Input.close();
    // System.out.println("Sum of numbers "+ sum);
    // System.out.println("Sum of squares: "+ sumOfSquare);
    
    double mean = sum/setCardinality;
    System.out.println("The Mean of this set is: " + mean);

    //lets store (sum^2/n) is x 
    double x = (Math.pow(sum, 2))/setCardinality;
    double numo = sumOfSquare - x;
    double deno = setCardinality-1;
    // lets store the division in facto 
    double facto = numo / deno;
    double standardDeviation = Math.sqrt(facto);
    
    
    System.out.println("The Standard Deviation of this set is: " + standardDeviation);
    }
}
