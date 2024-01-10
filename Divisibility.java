public class Divisibility {
    public static void main(String[]args){
        //Algorithm
        //1. loop through  1 to 1,00,000/ lets use while loop for now
        //2. ok so lets have variable that increases inside of the loop if the number is divisible by "the" numbers
        //3. For ease lets use if else 

        //counting variables
        int counting1 = 0;
        int counting2 = 0;
        int counting3 = 0;
        int counting4 = 0;
        int counting5 = 0;
        int counting6 = 0;
        int counting7 = 0;
        int counting8 = 0;
        int counting9 = 0;
        
        //loop begins
        int i =1;
        while (i<=1000000){
        //   System.out.println(i); // for checking loop
        //condition met increasea variable by 1 and note: don't use else if or the conditional will end after first condition is met
          if (i % 1 == 0){
             counting1++;
          }
         if (i % 2 == 0){
            counting2++;
          }
         if (i % 3 == 0){
            counting3++;
          }
         if (i % 4 == 0){
            counting4++;
          }
         if (i % 5 == 0){
            counting5++;
          }
         if (i % 6 == 0){
            counting6++;
          }
         if (i % 7 == 0){
            counting7++;
          }
         if (i % 8 == 0){
            counting8++;
          }
         if (i % 9 == 0){
            counting9++;
          }
          i++;
        }
        
        //lets print the results
        System.out.println("There are " + counting1 +" numbers divisible by 1");
        System.out.println("There are " + counting2 +" numbers divisible by 2");
        System.out.println("There are " + counting3 +" numbers divisible by 3");
        System.out.println("There are " + counting4 +" numbers divisible by 4");
        System.out.println("There are " + counting5 +" numbers divisible by 5");
        System.out.println("There are " + counting6 +" numbers divisible by 6");
        System.out.println("There are " + counting7 +" numbers divisible by 7");
        System.out.println("There are " + counting8 +" numbers divisible by 8");
        System.out.println("There are " + counting9 +" numbers divisible by 9");
    }
}
