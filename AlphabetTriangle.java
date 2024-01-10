package Pattern;

public class AlphabetTriangle {
   public static void main(String[]args){
    
    //Loop 1
    for (int i = 1; i<=5; i++){
        char alphabet = (int)65;
        for (int j= 1; j<=i; j++){
            System.out.print(alphabet);
            alphabet +=1;
        }
        System.out.println();
    }

    //Loop 2
    for (int i = 1; i<=5; i++){
        char alphabet = (int)65;
        for (int j= 1; j<=(5-i)+1; j++){
            System.out.print(alphabet);
            alphabet +=1;
        }
        System.out.println();
        
    }

     //Loop 3
    for (int i = 0; i<5; i++){
        char ch = (char) ('A' + i);
        for (int j= 0; j<=i; j++){
            System.out.print(ch);
        }
        System.out.println();
        
    }
   }   
}   

