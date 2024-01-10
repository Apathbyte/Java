import java.util.Scanner;

public class RowAndColumn {
    //Algorithm
    //1. create a matrix with user desire rows and columns
    //2. count the rows and columns with 1 and 0s
    //3. display the counts and matrix
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the desired matrix: ");
        int rows = input.nextInt();

        System.out.println("Enter the number of columns in the desired matrix: ");
        int columns = input.nextInt();
        
        //creating matrix with the input
        int[][] Matrix = createMatrix(rows, columns);

        //lets count rows and cloumns for 1s and 0s
        int[][] rowCounts = countingRows(Matrix);
        int[][] columnCounts = countingColumns(Matrix);

        System.out.println();
        //lets print the counts
        printCounts("row", rowCounts);
        printCounts("column", columnCounts);

        // At last let's print the matrix
        printMatrix(Matrix);

        input.close();
    }

    public static int[][] createMatrix(int rows, int columns) {
        int[][] Matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Matrix[i][j] = (int) (Math.random() * 2); // for random values 0 and 1
            }
        }

        return Matrix;
    }

    public static void printMatrix(int[][] Matrix) {
        System.out.println("The matrix is: ");

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] countingRows(int[][] Matrix) {
        int[][] numbers = new int[Matrix.length][2];
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                if (Matrix[i][j] == 1) {
                    numbers[i][1]++;
                } else {
                    numbers[i][0]++;
                }
            }
        }
        return numbers;
    }

    public static int[][] countingColumns(int[][] Matrix) {
        int[][] numbers = new int[Matrix[0].length][2];
        for (int j = 0; j < Matrix[0].length; j++) {
            for (int[] row : Matrix) {
                if (row[j] == 1) {
                    numbers[j][1]++;
                } else {
                    numbers[j][0]++;
                }
            }
        }
        return numbers;
    }

    public static void printCounts(String type, int[][] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println("The number of 1's in " + type + " " + (i + 1) + " is: " + counts[i][1]);
            System.out.println("The number of 0's in " + type + " " + (i + 1) + " is: " + counts[i][0]);
        }
    }
}
