
	import java.util.Random;

		public class SmallestNumberBidhan {
		    public static void main(String[] args) {
		        Random random = new Random();
		        int[] numbers = new int[10];
		        int min = 200;

		        for (int i = 0; i < numbers.length; i++) {
		            numbers[i] = random.nextInt(101) + 100; // lets Generate random numbers between 100 and 200
		            if (numbers[i] < min) {
		                min = numbers[i]; // lets Update minimum if the current number is smaller
		            }
		        }

		        System.out.println("The smallest number is: " + min);
		    }

	}


