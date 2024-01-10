import java.util.Scanner;
public class salesTax {
    public static void main(String[]args){
        // Sales tax calculator 
        Scanner input = new Scanner (System.in);
        System.out.print("What is the price of the total price of the goods: ");
        double totalPrice = input.nextDouble();
        
        input.nextLine();
        System.out.println("Which province do you live in: ");
        String province = input.nextLine();

        input.close();
        
        String prov = province.toLowerCase();
        double taxRate = 0.0;
        //  System.out.println("The province you live in is " + Prov);
        // System.out.print(totalPrice);
       
        if (prov.equals("alberta") || prov.equals("british columbia") || prov.endsWith("manitoba") || prov.equals("quebec")){
          taxRate = 5.0;
        }
        else if (prov.equals("ontario")){
            taxRate = 13.0;
        }
        else{
            taxRate = 15.0; 
        }
        // System.out.print(taxRate);
        //Calculation
        System.out.println("The tax rate in " + prov + " is: " + taxRate + "%");
        double tax = totalPrice * (taxRate/100.0);
        double salestax;
        salestax = totalPrice + tax;
        System.out.println("The total price with tax is: " + salestax);
    }
}
