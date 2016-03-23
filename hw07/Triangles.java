//Programmer: Donnie Posch
//Project: HW07b - Print out a triangle composed of numbers incrementing from 1 to the number entered
//Utilizing various different looping structures
//Date: 3/22/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;

public class Triangles{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        while(true){
         
            //Get user input, restricted to only integer input
            System.out.print("Enter an integer between 5 and 30:");
            while (!myScanner.hasNextInt()){ 
                myScanner.next();
            }
        
            int input = myScanner.nextInt();
         
            //Check input to make sure it is within range before running loop
            if(input < 5 || input > 30){
                System.out.println("You have entered invalid input. Please enter an integer between 5 and 30.");
            }
         
            else{
                System.out.println("For Loop:");
                //Nested loop to print out the top of the triangle, including the middle row
                for(int j = 1; j <= input; j++){
                    for(int i = 1; i <= j; i++){
                        System.out.print(j);
                    }
                System.out.print("\n");
                }
                //Nested loop to print bottom of triangle, starting after middle row
                for(int j = 1; j <= (input - 1); j++){
                    for(int i = 1; i <= (input-j); i++){
                        System.out.print((input - j));
                    }
                System.out.print("\n");
                }
                
                System.out.println("While Loop:");
                //Initialization of counter variables
                int j = 1;
                int i = 1;
                
                //Nested loop to print out the top of the triangle, including the middle row
                while(j <= input){
                    while(i <= j){
                        System.out.print(j);
                        i++;
                    }
                i = 1;
                j++;    
                System.out.print("\n");
                }
                
                //Need to reinitialize at 1 since the same variables are being used to increment
                //While I recognize I could use different variables to avoid reinitialization, i chose to do it this way out of personal preference
                j = 1;
                i = 1;
                
                //Nested loop to print bottom of triangle, starting after middle row
                while(j <= (input-1)){
                    while(i <= (input - j)){
                        System.out.print(input-j);
                        i++;
                    }
                i = 1;
                j++;    
                System.out.print("\n");
                }
                
                System.out.println("Do-While Loop:");
                //Again, must reinitialize
                i = 1;
                j = 1;
                
                //Nested loop to print out the top of the triangle, including the middle row
                do{
                        do{
                            System.out.print(j);
                            i++;
                        }while(i <= j);
                    i = 1;
                    j++;    
                    System.out.print("\n");
                }while(j <= input);
                
                //Again, must reinitialize
                i = 1;
                j = 1;
                
                //Nested loop to print bottom of triangle, starting after middle row
                do{
                        do{
                            System.out.print(input - j);
                            i++;
                        }while(i <= (input - j));
                    i = 1;
                    j++;    
                    System.out.print("\n");
                }while(j <= (input-1));
                
                
            break;
            }
        }
    }  //End of Method   
} //End of Class