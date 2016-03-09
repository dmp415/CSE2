//Programmer: Donnie Posch
//Project: HW06a - Fibonacci Sequence Printer
//Date: 3/8/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;

public class Fibonacci{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        
        while(true){
            
            //Code to input integer values. Continues to run until an integer is inserted.
            System.out.print("Enter the first number in the sequence: ");
            while (!myScanner.hasNextInt()){ 
            myScanner.next();
            }
            int first = myScanner.nextInt();
        
            System.out.print("Enter the second number in the sequence: ");
            while (!myScanner.hasNextInt()){
            myScanner.next();
            }
            int second = myScanner.nextInt();
            int intermediate = second;
        
            System.out.print("How many numbers should be printed: ");
            while (!myScanner.hasNextInt()){ 
            myScanner.next();
            }
            int number = myScanner.nextInt();

            //Once all input is entered, a debugging line prints out what was entered to confirm input.
            System.out.println("You entered " + first + ", " + second + ", " + number + ".");

            //Check to make sure values fall within the acceptable range of input
            if (first <= 0 || second <= 0 || number <= 0){
            System.out.println("\nYou entered invalid input. All input must be positive. Please try again.");
            }
        
            //Need to include odd cases such as when number is less than 2, which only prints the initial numbers the user inputted
            else if(number == 1){
            System.out.print("The fibonacci sequence is as follows: " + first + ".");
            break;
            }
            
            else if (number == 2){
            System.out.print("The fibonacci sequence is as follows: " + first + ", ");
            System.out.print(second + "." );
            break;
            }
            
            else {
                //Main code to actually calculate and print Fibonacci Sequence. Adds first and second, then reassigns first as second and second as the calculated number, before looping and adding again.
                int i = 3;
                System.out.print("The fibonacci sequence is as follows: " + first + ", ");
                System.out.print(second);
                    while( i <= number ){
                        intermediate = first + second;
                        System.out.print(", " + intermediate);
                        first = second;
                        second = intermediate;
                        i++;
                    }
            System.out.print(".\n");
            break;
            }
        }
    }  //End of Method   
} //End of Class