
public class RecursivePowerBidhan {


		public static void main(String[] args) {
	        int base = 2;
	        int exponent = 8;

	        int result = powerbidhan(base, exponent);

	        System.out.println("Recursive process of exponential is:  " + result);
	    }

	    public static int powerbidhan(int base, int exponent) {
	        if(exponent == 0) {
	            return 1;
	        } else {
	            return base * powerbidhan(base, exponent - 1);
	        }
	  

	}

}
