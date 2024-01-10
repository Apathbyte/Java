import java.util.Scanner;

public class NColumns {

    //Algorithm
    //1. Ask no. of columns from the user and create a square matrix 
    //2. fill the matrix with random numbers from 1-1000
    //3. display the matrix 
    //4. display for elements; sum, average, largest, smallest and the most frequent 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of columns for the square matrix you want: ");
        int column = input.nextInt();

        int [][] squareMatrix = createdMatrix(column);
        printingMatrix(squareMatrix);
        sumOfElements(squareMatrix);
        averageOfElements(squareMatrix);
        largestElements(squareMatrix);
        smallestElements(squareMatrix);
        frequentElements(squareMatrix);

        input.close();
    }

    // Method for Creating a matrix
    public static int [][] createdMatrix(int column) {
        int [][] squareMatrix = new int [column][column];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < column; j++) {
                squareMatrix[i][j] = 1 + (int) (Math.random() * 1000);// for random values from 1 to 1000
            }
        }

        return squareMatrix;
    }

    // Matrix Printing method
    public static void printingMatrix(int [][] squareMatrix) {
        System.out.println("The square matrix is: ");
        for (int r = 0; r < squareMatrix.length; r++) {
            for (int c = 0; c < squareMatrix[r].length; c++) {
                System.out.print(squareMatrix[r][c] + "\t");
            }
            System.out.println(); // lets move to the next line after each row
        }
    }

    //Method for the sum of all the elements
    public static int[][] sumOfElements(int [][]squareMatrix){
        int sum = 0;
        for (int r = 0; r < squareMatrix.length; r++){
            for (int c = 0; c < squareMatrix[r].length; c++){
              sum += squareMatrix[r][c];
            }
        }

        System.out.println("The sum of all the elements of the matrix is: " +  sum);
        
        return squareMatrix;
    }
    
    //Method for average of elements
    public static int [][] averageOfElements(int [][]squareMatrix){
         int sum = 0;
        for (int r = 0; r < squareMatrix.length; r++){
            for (int c = 0; c < squareMatrix[r].length; c++){
              sum += squareMatrix[r][c];
            }
        }
        double average = sum/ (squareMatrix.length * squareMatrix[0].length);
        System.out.println("The average of the elements of the matrix is: " + average);

        return squareMatrix;
    }

    //Method for largest element
    public static int [][] largestElements(int [][]squareMatrix){
       int maximum = squareMatrix[0][0];//lets initialize the max value to 1st row's 1 st element
       for (int [] row: squareMatrix){ //lets use for each loop to work to with arrays easily
        for (int number : row){
            if (number > maximum){
                maximum = number;
            }
        }
        }

       System.out.println("The maximum value present in the matrix is:" + maximum);
       return squareMatrix;
    }

    //Method for smallest element
    public static int [][] smallestElements(int [][]squareMatrix){
        int minimum = squareMatrix[0][0];
        for (int []row: squareMatrix){
            for (int number : row){
                if (number < minimum){
                    minimum = number;
                }
            }
        }

        System.out.println("The minimum value present in the matrix is:" + minimum);

        return squareMatrix;
    }

    //Method for the most frequent element
    public static int[][] frequentElements(int[][] squareMatrix) {
        int mostFrequentElement = 0;
        int maxCount = 0;
    
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                int currentElement = squareMatrix[i][j];
                int currentCount = 0;
    
                for (int k = 0; k < squareMatrix.length; k++) {
                    for (int l = 0; l < squareMatrix[k].length; l++) {
                        if (squareMatrix[k][l] == currentElement) {
                            currentCount++;
                        }
                    }
                }
    
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostFrequentElement = currentElement;
                }
            }
        }

        System.out.println("The most frequent element is: " + mostFrequentElement);
    
        return squareMatrix;
    }
    
    
}
