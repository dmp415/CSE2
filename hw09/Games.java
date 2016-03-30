//Programmer: Donnie Posch
//Project: HW09a - Create three minigames for the user to play
//Date: 3/29/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;
import java.util.Random;

public class Games{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        //Welcomes user to the game program
        System.out.println("Welcome to the Posch Game Center!");
        System.out.print("In order to play a game, enter one of the following[1, 2, or 3]:\n1.Guess the box  2.Spin the Wheel  3.Scrambler\n");
        
        //Assigns each game a corresponding integer to play, which then uses a loop that terminates the program if a string is entered
        while (!myScanner.hasNextInt()){
            myScanner.next();
            System.out.println("You have entered invalid input. The arcade does not have that game. Goodbye.");
            return;
        }
        int input = myScanner.nextInt();
        
        //Control structure to choose which game is played based on user input, if one of the corresponding game integers, it launches the game
        //If not, it alerts the user that the arcade doesn't have the game they are looking for and exits program
        if(input == 1){
            guessTheBox();
        }
        else if (input == 2){
            spinTheWheel();
        }
        else if (input == 3){
            String altered = scrambler();
            System.out.println(altered);
        }
        else{
            System.out.println("You have entered invalid input. The arcade does not have that game. Goodbye.");
        }
        
    }  //End of Main Method
    
    public static void guessTheBox(){
        //Explains the game
        System.out.println("You have chosen Guess the Box!");
        System.out.println("In this game, there will be three boxes to choose from, but only one will have a prize in it.");
        
        //Establishes a new scanner and introduces the random generator
        Scanner boxGuess = new Scanner(System.in);
        Random randomGen = new Random();
        
        //Generates either 0, 1, 2 which is then adjusted to 1, 2, 3
        int randomInt = randomGen.nextInt(2);
        int adjustedRandom = (randomInt + 1);
            
            //Loop to ensure correct input is entered once the game has started. 
            while(true){    
                System.out.print("Please enter your guess as to which box has the prize in it [1, 2, or 3]:");
                    while (!boxGuess.hasNextInt()){
                        boxGuess.next();
                        System.out.print("You have entered invalid input. Must enter 1, 2, or 3.");
                    }
                int guess = boxGuess.nextInt(); 
                
                //Bounding the input, and a selection structure to choose whether input is a winner or not
                if(guess < 1 || guess > 3){
                    System.out.println("You have entered invalid input. Must enter 1, 2, or 3.");
                }
                else if(guess == adjustedRandom){
                    System.out.println("You have guessed correctly! Your prize is the self satisfaction that comes with winning!");
                    break;
                }
                else{
                    System.out.println("You did not choose the correct box. Sorry, Loser.");
                    break;
                }
        }
    }//End of guessTheBox Method
    
    public static void spinTheWheel(){
        //Explains the game
        System.out.println("You have chosen Spin the Wheel!");
        System.out.println("In this game, there will be a spinner consisting of 10 spaces, 5 red and 5 black.");
        
        Scanner spinGuessColor = new Scanner(System.in);
        Scanner spinGuessNumber = new Scanner(System.in);
        Random randomGen = new Random();
        
        //Initialization of control variables
        int random = 0;
        int randomColor = randomGen.nextInt(1);
        String color1 = "";
        String color2 = "";
        String color = "";
        int number = 0;
        
        while(true){
            //Get input for color and number of user spin input
            System.out.print("Choose a color[Black or Red]:");
            color = spinGuessColor.nextLine();
            System.out.print("Choose a number[1-5]:");
        
                //Bounding of input to ensure correct input. color will accept any string input, while number will only accept an integer
                while (!spinGuessNumber.hasNextInt()){
                spinGuessNumber.next();
                System.out.print("You have entered invalid input. Must enter a number between 1 and 5.");
                }
            number = spinGuessNumber.nextInt();
        
            //If the string and number are acceptable input, then the program executes
            if((color.equals("black") || color.equals("Black") || color.equals("red") || color.equals("Red") ) && (number >= 1 && number <= 5)){
                break;
            }
            //Otherwise, program will loop back around to reprompt for new input
            else{
                System.out.println("You entered invalid input. Try again.");
            }
        }
        
            //Determines color that spinner lands on, declaring both capitalizations, and generating a number between 1-5
            if(randomColor == 0){
                random = (randomGen.nextInt(4) + 1);
                System.out.println("The spinner landed on Red "+ random );
                color1 = "red";
                color2 = "Red";
            }
        
            //Determines color that spinner lands on, declaring both capitalizations, and generating a number between 1-5
            if(randomColor == 1){
                random = (randomGen.nextInt(4) + 1);
                System.out.println("The spinner landed on Black " + random);
                color1 = "black";
                color2 = "Black";
            }
        
            //Checks if input matches what the spinner spun, and prints out the corresponding message
            if(((color.equals(color1)) || color.equals(color2)) && number == random){
                System.out.println("You spun " + color + " " + number);
                System.out.println("Your guess matched the spin! Your prize is the self satisfaction that comes with winning!");
            }
            else{
                System.out.println("You spun " + color + " " + number);
                System.out.println("Your spin did not match. Sorry, Loser.");
            }
    }//End of spinTheWheel Method
    
    
    public static String scrambler(){
        //Explanation of game
        System.out.println("You have chosen Scrambler!");
        System.out.println("In this game, the user will input a string and a scrambled version of the word will be returned");
        Scanner scrambleWord = new Scanner(System.in);
        
        //Get the user to input a word to be scrambled
        System.out.print("Input a word to be scrambled:");
        String altered = scrambleWord.nextLine();
        
        //Constructs a string with no characters in it
        StringBuilder newString = new StringBuilder();
        //Constructs a string with the characters of the inputted word in it
        StringBuilder string = new StringBuilder(altered);
        
        //Loop to execute through the entire length of the word, however many letters it is
        //As letters are moved from string to newString, the string length will decrement, until the length = 0
        while (string.length() > 0) 
        {   
            //Calculate a random position in the word to choose a character to pick up
            int position = (int)(Math.random() * string.length());
            //Procced to insert that character into the empty newString construct 
            newString.append(string.charAt(position));
            //Delete the character you just pulled out form the original string so it can't be chosen again
            string.deleteCharAt(position);
        }
        //Return the newString construct to the main function to be printed out
        return newString.toString();
    }//End of scrambler Method
} //End of Class