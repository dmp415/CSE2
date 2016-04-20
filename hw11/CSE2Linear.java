//Programmer: Donnie Posch
//Project: HW11a - Create a program to accept user inputted grades (bounded) and search for specific grades
//Date: 4/18/2016
//Professor: Brian Chen
//Class: CSE 2



import java.util.Scanner;
import java.util.Arrays;

public class CSE2Linear{
       public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            
                int totalInput = 15;
                int grades[] = new int[totalInput];
                int temp = 0;
                int i = 0;
                int inter = 0;

                //First have the user input 15 integers between 0 and 100, inclusive            
                System.out.print("Please enter 15 integers between [0-100], each equal to or larger than the last:");
                
                //Controls the number of inputs as well as making sure they are all ints as well as being between 0 and 100
                while(i < totalInput){
                    while (!myScanner.hasNextInt()){
                    myScanner.next();
                    System.out.println("You have entered invalid input. Please enter an integer.");
                    }
                    temp = myScanner.nextInt();
                    if(temp < 0 || temp > 100){
                        System.out.println("Please enter an integer between 0 and 100.");
                        
                    }
                    //Provided they are acceptable integers, they are then stored in the array
                    else{
                        grades[i] = temp;
                        i++;
                    }
                    
                }
                //Print out the user inputed grade stack
                System.out.println("User Input: ");
                for(i = 0; i < grades.length; i++){
                    System.out.print(grades[i] + " ");
                }
                System.out.println("");
                
                //Sorts the user input array using the handy dandy arrays.sort function, making life easy, and then prints it out
                System.out.println("Sort: ");
                Arrays.sort(grades); //sorts the array
                for(i = 0; i < grades.length; i++){
                    System.out.print(grades[i] + " ");
                }
                System.out.println("");
                
                //We will now search the array to find a user input target value, restricting the search to only integer values
                System.out.print("Please enter an integer to be searched for [0 - 100]:");
                while (!myScanner.hasNextInt()){
                    myScanner.next();
                    System.out.println("You have entered invalid input. Please enter an integer.");
                    }
                    int target1 = myScanner.nextInt();
                
                //Once an acceptable search value has been entered, we check the array to see if any of the members match the target    
                for(i = 0; i < grades.length; i++){
                    //If they do match, we say it was found and how long it took, and break the loop
                    if(grades[i] == target1){
                        System.out.println(target1 + " was found after " + i + " iterations.");
                        break;
                    } 
                    //If they do not match by the end of the search, then it will report that the number was not found after searching the whole array
                    else if(i == 14){
                        System.out.println(target1 + " was not found after " + (i+1) + " iterations.");
                    }
                }
                
                //Nifty little loop to scramble up the array before searching again
                for (i=0; i<grades.length; i++){
        	       int target = (int) (grades.length * Math.random());
        	                inter = grades[target];
        	                grades[target] = grades[i];
        	                grades[i] = inter;
                        }
                        
                //We print out the scrambled array to ensure that it is indeed scrambled    
                System.out.println("Scrambled:");        
                for(i = 0; i < grades.length; i++){
                    System.out.print(grades[i] + " ");
                }
                System.out.println("");  
                
                //Again, we bound our target criteria to only accept integer values
                System.out.print("Please enter an integer to be searched for [0 - 100]:");
                while (!myScanner.hasNextInt()){
                    myScanner.next();
                    System.out.println("You have entered invalid input. Please enter an integer.");
                    }
                    int target2 = myScanner.nextInt();
                
                //We now do the same as above, and check the now scrambled array for the target integer    
                for(i = 0; i < grades.length; i++){
                    if(grades[i] == target2){
                        System.out.println(target2 + " was found after " + i + " iterations.");
                        break;
                    } 
                    else if(i == 14){
                        System.out.println(target2 + " was not found after " + (i+1) + " iterations.");
                    }
                }
                
            
    }//End of Main Method
} //End of Class