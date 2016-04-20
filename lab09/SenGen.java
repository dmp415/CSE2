//Programmer: Donnie Posch
//Project: Lab09 - Utilize methods to generate random sentences from a random number generator
//Date: 3/25/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;
import java.util.Random;

public class SenGen{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomGen = new Random();
        
        while(true){
            System.out.println("The " + Adjective() + " " + Subject() + " " + Verb() + " by the " + Adjective() + " " + Obj() );
            System.out.print("Would you like to print another sentence[N = 0/ Y = 1]:");
            while (!myScanner.hasNextInt()){ 
                myScanner.next();
            }
            int repeat = myScanner.nextInt();
            
            if(repeat == 0){
                break;
            }
            else if (repeat < 0 || repeat > 1){
                System.out.println("That is invalid input. Enter 0 to quit, enter 1 to print another sentence.");
                break;
            }
        }
        
        
        
    }//End of Method
    
    public static String Adjective(){
        
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(10);
        
        switch (randomInt){
            case 0:
                return("gold");
            case 1:
                return("red");
            case 2:
                return("green");
            case 3:
                return("blue");
            case 4:
                return("yellow");
            case 5:
                return("orange");
            case 6:
                return("grey");
            case 7:
                return("black");
            case 8:
                return("purple");
            case 9:
                return("silver");
            default:
                return("turquoise");
        }
    }//End of Method Adjective
    
    public static String Subject(){
        
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(10);
        
        switch (randomInt){
            case 0:
                return("wolf");
            case 1:
                return("fox");
            case 2:
                return("bear");
            case 3:
                return("giraffe");
            case 4:
                return("rhino");
            case 5:
                return("kangaroo");
            case 6:
                return("emu");
            case 7:
                return("orangutan");
            case 8:
                return("platypus");
            case 9:
                return("silverback gorilla");
            default:
                return("dog");
        }
    }//End of Method Subject
    
    public static String Verb(){
        
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(10);
        
        switch (randomInt){
            case 0:
                return("ran");
            case 1:
                return("darted");
            case 2:
                return("leaped");
            case 3:
                return("sprinted");
            case 4:
                return("vaulted");
            case 5:
                return("skipped");
            case 6:
                return("dashed");
            case 7:
                return("raced");
            case 8:
                return("rushed");
            case 9:
                return("flew");
            default:
                return("meandered");
        }
    }//End of Method Verb
    
    public static String Obj(){
        
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(10);
        
        switch (randomInt){
            case 0:
                return("house");
            case 1:
                return("river");
            case 2:
                return("stream");
            case 3:
                return("waffle house");
            case 4:
                return("car");
            case 5:
                return("dinosaur");
            case 6:
                return("garage");
            case 7:
                return("farm");
            case 8:
                return("fields");
            case 9:
                return("taqueria");
            default:
                return("museum");
        }
    }//End of Method Obj
} //End of Class