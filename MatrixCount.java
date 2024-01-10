import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = Input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = Input.nextInt();

        int[][] matrix = generateMatrix(rows, columns);
        

        int[][] rowCounts = countingRows(matrix);
        int[][] columnCounts = countingColumns(matrix);
        
        System.out.println();
        printCounts("row", rowCounts);
        printCounts("column", columnCounts);

        printMatrix(matrix);
        
        Input.close();
    }

    public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Math.random() < 0.5 ? 0 : 1;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("\nThe generated matrix is:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] countingRows(int[][] matrix) {
        int[][] counts = new int[matrix.length][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                counts[i][matrix[i][j]]++;
            }
        }
        return counts;
    }

    public static int[][] countingColumns(int[][] matrix) {
        int[][] counts = new int[matrix[0].length][2];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int[] row : matrix) {
                counts[j][row[j]]++;
            }
        }
        return counts;
    }

public static void printCounts(String type, int[][] counts) {
    
        for (int i = 0; i < counts.length; i++) {
            System.out.println("The number of 1's in the "  + " " + type +" "+  (i + 1) + " is: " + counts[i][1]);
            System.out.println("The number of 0's in the "  + " " + type + " "+ (i + 1) + " is: " + counts[i][0]);
        }
    }
}
