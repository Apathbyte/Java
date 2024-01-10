import java.util.Scanner;
public class sorting {
    // Algorithm
    // 1. Take input from user
    // 2. check if it's arranged in an ascending order or not
    // 3. Display the result
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        int numbers[] = new int[10];
        System.out.println("Enter the list of 10 integers: ");
        for (int i= 0; i< numbers.length; i++){
        numbers[i] = Input.nextInt();
        }
        Input.close();

        // let's use a simple logic; to be sorted 0th index <= 1st index and so on; i.e. ith element must be greater than i-1th element
        boolean sorting = true;
        for( int j= 1; j< numbers.length; j++){
            if (numbers[j]<numbers[j-1]){
               sorting = false;
               break;
            }
        }
        //Displaying result
        if(sorting){
            System.out.println("List is sorted");
        }
        else {
            System.out.println("List is Not sorted");
        }
    }
}
