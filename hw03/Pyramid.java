import java.util.Scanner;

public class Pyramid{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the length of a side of a pyramid with a square base: ");
        double sideLength = myScanner.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        double height = myScanner.nextDouble();
        
        double volume = (((sideLength*sideLength)*height)/3);
        
        System.out.println("The volume of the pyramid is " + volume);
        
    }//End of Main Method
}//End of Class