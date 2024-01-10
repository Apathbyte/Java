/*OOPs
Classes and objects 
Blueprint is class
Objects are cars produced from the blueprint
Properties of objects are written in class

Functions defined under the class are called methods 
 */
class Pen{
    String color;
    String type; //Ballpoint, Gel

    public void write(){
        System.out.println("Writitng something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
   String name;
   int age;
   int roll;

   public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.roll);
   }

   }



public class OOPs{
   public static void main(String args[]){
    Pen pen1 = new Pen(); // new allocates a space in memory heap and Pen() is constructor function
    pen1.color = "blue";
    pen1.type = "Gel";

    Pen pen2 = new Pen();
    pen2.color = "black";
    pen2.type = "ballpoint";

    pen1.printcolor();
    pen2.printcolor();


    Student std1 = new Student();
    std1.name = "Bidhan";
    std1.age = 20;
    std1.roll = 1;

    Student std2 = new Student();
    std2.name = "Aaliya";
    std2.age = 19;
    std2.roll = 2;

    std1.printInfo();
    std2.printInfo();
   }
}