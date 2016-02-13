import java.util.Scanner;

public class Convert{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the length in meters, in form XX.XX:");
        double meters = myScanner.nextDouble();
        
        double meterToInches = 39.3701;
        
        double inches = (((int)((meters * meterToInches)*10000))/(10000.0));
        
        System.out.println( meters + " meters is equivalent to " + inches + " inches.");
        
    }//End of Main Method
}//End of Class