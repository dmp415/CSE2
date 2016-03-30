//Programmer: Donnie Posch
//Project: HW09b - Create a program that either prints a string as many times as the length of the string
//or prints a rectangular box with length and width of the entered integer
//Date: 3/29/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;

public class Rectangularize{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        //Try and catch statements to check input and handle it accordingly. If not an integer, then a string. If a mix of char and ints, then a string
        try{
            System.out.print("Please enter either an integer or a string of characters:");
            int input = myScanner.nextInt();
            rectangle(input);
        }
        
        catch(Exception err){
            String input = myScanner.nextLine();
            rectangle(input);
        }
    }  //End of Main Method
    
    //Nested loop to print the same number of % as the input, on the same number of lines as the input
    public static void rectangle(int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.print("%");
            }
            System.out.print("\n");
        }
    }//End of rectangle Method
    
    //Loop to print the inputted string as many times as there are characters in the string
    public static void rectangle(String x){
        for(int i = 0; i < x.length(); i++ ){
            System.out.println(x);
        }
    }//End of rectangle Method
} //End of Class