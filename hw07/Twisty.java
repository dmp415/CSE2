//Programmer: Donnie Posch
//Project: HW07a - Print a double helix style twist based on a user input lenght and width
//Date: 3/22/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;

public class Twisty{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        while(true){
            
            //Input loop which only accepts integers
            System.out.print("Enter the desired length[1-80]:");
            while (!myScanner.hasNextInt()){ 
                myScanner.next();
            }
        
            int length = myScanner.nextInt();
            
            System.out.print("Enter the desired width[ width < length]:");
            while (!myScanner.hasNextInt()){ 
                myScanner.next();
            }
        
            int width = myScanner.nextInt();
         
            //Primary check to confirm input with width smaller than length, with an error specific message         
            if(width > length){
                System.out.println("That is invalid. Please enter an integer smaller than the length.");
            }
         
            //Check input to make sure it is within range before running loop, with a specfic error message if it is not
            else if(length < 1 || length > 80){
                System.out.println("You have entered invalid input. Please enter an integer between 1 & 80.");
            }
        
            //Once input is validated, nested loop to determine what gets printed
            else{
                for(int i = 0; i < width; i++){
            
                    for(int j = 0; j < length; j++){
                        if( i == j % width){
                            if ((int)(j / width) % 2 == 0){
                                System.out.print("#");
                            }
                            else{
                                System.out.print("\\");
                            }
                }
                else if((j % width) == width - i - 1){
                    if((int)(j / width) % 2 == 0){
                        System.out.print("/");
                    }
                    else{
                        System.out.print("#");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        //Break out of the loop once pattern has been printed
        break;
            }   
        }   
    }  //End of Method   
} //End of Class