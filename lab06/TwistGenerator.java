//Programmer: Donnie Posch
//Project: Lab06 - Have user input length, print out a twist based on input length
//Date: 3/4/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;

public class TwistGenerator{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        int length = 0;
        
        //Code to input positive values. Continues to run until an integer is inserted.
        System.out.print("Enter the length of the twist: ");
        while (!myScanner.hasNextInt()){
        myScanner.next();
        }
        
        int input = myScanner.nextInt();
        
        if (input < 0){
            length = (input * -1);
        }
        else{ 
            length = input;
        }
        
        System.out.println("You entered " + length + " as the length of your twist.");
        
        int fullTwist = (length / 3);
        int partialTwist = (length % 3);
       
        int i = 1;
        
        while(i <= fullTwist){
        System.out.print("\\ /");
        i++;
        }
        
        if(partialTwist == 0){
            System.out.printf("\n");
            i = 1;
        }
        else if(partialTwist == 1){
            System.out.print("\\");
            System.out.printf("\n");
            i = 1;
        } 
        else if (partialTwist == 2){
            System.out.print("\\ ");
            System.out.printf("\n");
            i = 1;
        }
        
        while(i <= fullTwist){
        System.out.print(" X ");
        i++;
        }
        
        if(partialTwist == 0){
            System.out.printf("\n");
            i = 1;
        }
        else if(partialTwist == 1){
            System.out.print(" ");
            System.out.printf("\n");
            i = 1;
        } 
        else if (partialTwist == 2){
            System.out.print(" X");
            System.out.printf("\n");
            i = 1;
        }
        
        while(i <= fullTwist){
        System.out.print("/ \\");
        i++;
        }
        
       if(partialTwist == 0){
            System.out.printf("\n");
            i = 1;
        }
        else if(partialTwist == 1){
            System.out.print("/");
            System.out.printf("\n");
            i = 1;
        } 
        else if (partialTwist == 2){
            System.out.print("/ \\");
            System.out.printf("\n");
            i = 1;
        }
        
        
    }  //End of Method   
} //End of Class