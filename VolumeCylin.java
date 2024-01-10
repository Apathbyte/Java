import java.util.Scanner;;
public class VolumeCylin {
    public static void main (String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Readius of the cylinder: ");
        float radius = Input.nextFloat();
        
        System.out.print("Enter the height/length of the triangle: ");
        float height = Input.nextFloat();

        Input.close();
        final float PI = 3.1415f;
        float volume = PI * radius * radius * height;

        System.out.println("Volume of the Cylinder is: " + volume);
    }
}
