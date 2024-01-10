public class NumberPlate {
    public static void main(String[]args){
        //Algorithm
        //1. Generate 3 random characters(must be uppercase)
        //2. Generate 4 random integers
        //3. Concatenate all 7 in a single line

        //ASCII of A-Z would be 65-90
        //Mathrandom gives random numbers in range [0,1) and we need char from 65 to 91 to represent A-Z so;
         char char1 = (char)(65 + (Math.random()*26));
         char char2 = (char)(65 + (Math.random()*26));
         char char3 = (char)(65 + (Math.random()*26));
         int number1 = (int)(Math.random()*10);

        //lets generate random numbers between 0 and 9;
         int number2 = (int)(Math.random()*10);
         int number3 = (int)(Math.random()*10);
         int number4 = (int)(Math.random()*10);

        // System.out.println(char1); //checking if it prints
        //lets concate them
         String numberPlate = " " + char1 + char2 + char3 + number1 + number2 + number3 + number4;
         System.out.println(numberPlate);
    }
}
