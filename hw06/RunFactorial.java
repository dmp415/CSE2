//Programmer: Donnie Posch
//Project: HW06b - Print the whole number equivalent of a factorial of an integer between 8 and 16
//Date: 3/8/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;

public class RunFactorial{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        while(true){
            
            //Code to input positive values. Continues to run until an integer is inserted.
            System.out.print("Enter an integer between 9 and 16 (including 9 and 16): ");
            while (!myScanner.hasNextInt()){ 
            myScanner.next();
            }
        
            int factorial = myScanner.nextInt();
        
            //If the input fails this test, the user will be reprompted for input after an error message
            if(factorial < 8 || factorial > 16){
                System.out.println("The integer must be between 9 and 16 (including 9 and 16). Try again.");
            }
        
            //If input is acceptable, the factorial is calculated and printed
            else{
                int i = 1;
        
                //Factorials over 12! are larger than integer values, so it must be represented by a double
                double evaluated = factorial;
        
                //A factorial is simply x! = x * (x-1) * (x-2)*...*(1)
                while (i < factorial){
                    evaluated *= (factorial - i);
                    i++;
                }
        
                System.out.println("The factorial " + factorial +"! is equal to "+ evaluated);
                break;
            }
    }
    }  //End of Method   
} //End of Class