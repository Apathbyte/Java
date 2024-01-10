import java.util.Scanner;
public class arrayGrade {
    //Algorithms
    // 1. lets create an array that takes input form user and stores the input
    //2. check the condition for the grades
    //3. display the output
    public static void main(String[]args){
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter the number of students in the class: ");
    int numStudents = Input.nextInt();
    System.out.println();
    
    int studentGrades[] = new int[numStudents];
    for (int i= 0; i< numStudents; i++){
       System.out.println("Enter the grade for student #" + (i+1));
       studentGrades[i] = Input.nextInt();
    }
    Input.close();
    // for(int studentGradesStore: studentGrades){
    //     System.out.println(studentGradesStore);
    // } //checking the array elements

    //For max elements and min elements
    //lets asumme that 0th index value is max and compare each index with it iterating through a loop
    int maximum = studentGrades[0];
    for(int j =0 ; j<numStudents; j++){
        if (studentGrades[j]>maximum){
            maximum = studentGrades[j];
        }
    }

    //For min element using the same method as max
    int minimum = studentGrades[0];
    for(int k= 0; k<numStudents; k++){
        if (studentGrades[k]<minimum){
            minimum = studentGrades[k];
        }
    }
    // System.out.println(minimum);
    // System.out.println(maximum);
//  A if score is >= max - 5
//  B if score is >= max - 10 and < max - 5
//  C if score is >= max - 15 and < max - 10
//  D if scores is >= max - 20 and < max - 15
//  F otherwise
    char grade;
    for (int m= 0; m<numStudents; m++){
        int score = studentGrades[m];
        if (score >= maximum -5){
            grade = 'A';
        }
        else if(score >= maximum - 10 && score < maximum - 5){
           grade = 'B';
        }
        else if(score >= maximum - 15 && score < maximum - 10){
            grade = 'C';
        }
        else if(score >= maximum - 20 && score < maximum -15){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println("Student #" + (m+1) +": " + grade);
    }
    System.out.println();
    System.out.println("Highest Score: " + maximum);
    System.out.println("Lowest Score: "+ minimum);
    }
}
