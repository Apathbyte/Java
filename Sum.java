// public class Sum {
//     public static void main(String[] args) {
//         int sum = 0;

//         for (int i = 1; i <= 10; i++) {
//             sum += i;
//         }
//         System.out.println(sum);

//         sum = 0;
//         for (int i = 10; i <= 20; i++) {
//             sum += i;
//         }
//         System.out.println(sum);

//         sum = 0;
//         for (int i = 20; i <= 30; i++) {
//             sum += i;
//         }
//         System.out.println(sum);
//     }
// }

//lets use method for it then;

public class Sum {
    public static void main(String[] args) {
      System.out.println("Sum from 0 to 10 is :"+ Sum(0, 10));
      System.out.println("Sum from 10 to 20 is :" + Sum(10, 20));
      System.out.println("Sum from 20 to 30 is :" + Sum(20, 30));
    }

    public static int Sum(int i1, int i2){
        int sum = 0; 
        for (int i= i1; i<=i2; i++){
            sum+= i; 
        }
        return sum;
    }
}