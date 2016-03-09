//Programmer: Donnie Posch
//Project: HW06c - Create a spinning progress indicator using an infinite loop
//Date: 3/8/2016
//Professor: Brian Chen
//Class: CSE 2


public class TextSpinner{
    public static void main (String[] args) {
        
        //Infinite loop that prints each orientation of the spinner, deletes it, and then prints the next one
        while(true){
            System.out.print("/\b");
            System.out.print("-\b");
            System.out.print("\\\b");
            System.out.print("|\b");
        }
        
        
    }  //End of Method   
} //End of Class