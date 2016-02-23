//Programmer: Donnie Posch
//Project: HW04 - RGB to Hexidecimal
//Date: 2/22/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;

public class ToHex{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
    
         //Code to input RGB values. Continues to run until an integer is inserted.
        System.out.print("Enter a Red Value: ");
        while (!myScanner.hasNextInt()) 
        myScanner.next();
        int red = myScanner.nextInt();
        
        System.out.print("Enter a Green Value: ");
        while (!myScanner.hasNextInt()) 
        myScanner.next();
        int green = myScanner.nextInt();
        
        System.out.print("Enter a Blue Value: ");
        while (!myScanner.hasNextInt()) 
        myScanner.next();
        int blue = myScanner.nextInt();


        //Check to make sure RGB values fall within range of 0-255
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255){
            System.out.println("\n You entered invalid input. All input must be between 0 and 255. Please try again.");
        }
        
        //Once all input is validated, a debugging line prints out what was entered to confirm input.
        else{
        System.out.println("You entered " + red + ", " + green + ", " + blue + ".");

        //The RGB values are then split into the whole divisor and remainder
        int red1 = (red / 16);
        int red2 = (red % 16);
        int green1 = (green / 16);
        int green2 = (green % 16);
        int blue1 = (blue / 16);
        int blue2 = (blue % 16);

        //Start with an empty string to be populated
        String hex = "";
        
        //Multiple calls of the convertor function, to calculate each piece of Hexidecimal and then compile it into one string.
        hex += convertor(red1, hex);
        hex += convertor(red2, hex);
        hex += convertor(green1, hex);
        hex += convertor(green2, hex);
        hex += convertor(blue1, hex);
        hex += convertor(blue2, hex);
        
        //Printout of final Hexidecimal conversion      
        System.out.println ("The hexadecimal equivalent of the RGB value is " + hex + ".");
        
            
        }
    }//End of Main Method
    
    //Method to convert integers into hexidecimal values
    public static String convertor(int x, String hex){
 
        //String to store the converted RGB values in, which gets reset at the beginning of each iteration.
        String hexadd = "";
        
        //Nested if else statements to convert divisors and remainders into corresponding hexidecimal values, as strings.
        if (x >= 0 && x < 10){
        hexadd = String.valueOf(x);
        }
        else if (x == 10){
            hexadd = "A";
        }
        else if (x == 11){
            hexadd = "B";
        }
        else if (x == 12){
            hexadd = "C";
        }
        else if (x == 13){
            hexadd ="D";
        }
        else if (x == 14){
            hexadd = "E";
        }
        else if (x == 15){
            hexadd = "F";
        }

        return hexadd;
    }//End of method convertor

}//End of Class
