//Programmer: Donnie Posch
//Project: Lab11 - Array Searches
//Date: 4/15/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;
import java.util.Random;

public class lab11{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomGen = new Random();
        
        int arraylength = 50;
        int max1 = 0;
        int max2 = 0;
        int min1 = 0;
        int min2 = 0;
        
        int []array1 = new int[arraylength];
        int []array2 = new int[arraylength];
        
        for(int i=0; i < array1.length; i++){
            array1[i] = randomGen.nextInt(100);
        }
        
        for(int i = 0; i < array1.length; i++){
            if(array1[i] <= array1[min1]){
                min1 = i;
            }
            
            if(array1[i] >= array1[max1]){
                max1 = i;
            }    
        }
        System.out.println("The max value of the array 1 is " + array1[max1] + " and the minimum is " + array1[min1]);
        
        
        for(int i=0; i < array2.length; i++){
            if(i == 0){
            array2[i] = randomGen.nextInt(100);
            }
            else{
            array2[i] = randomGen.nextInt(100) + array2[i-1];
            }
            System.out.print(array2[i] + " ");
        }
        
        for(int i = 0; i < array2.length; i++){
            if(array2[i] <= array2[min2]){
                min2 = i;
            }
            
            if(array2[i] >= array2[max2]){
                max2 = i;
            }    
        }    
        System.out.println("The max value of the array 1 is " + array2[max2] + " and the minimum is " + array2[min2]);

        
        System.out.print("Enter an integer to greater than 0:");
        while (!myScanner.hasNextInt()){
            myScanner.next();
            System.out.println("You have entered invalid input. See ya!");
            return;
        }
        int input = myScanner.nextInt();
        if(input < 0){
            System.out.println("You have entered invalid input. See ya!");
            return;
        }
        
        int low = 0;
        int high = array2.length - 1;
        int mid = 0;
        
        while (low <= high) {
        mid = (low + high) / 2;
        if (array2[mid] > input) {
            high = mid - 1;
        } else if (array2[mid] < input) {
            low = mid + 1;
        }
        }
        
        if (input == array2[mid]){
        System.out.print("The input " + input + " was found.");
        }
        else{
            System.out.println("The input " + input + " was not found. The two closest numbers were " + array2[mid - 1] + " and " + array2[mid]);
        }
    }  //End of Method   
} //End of Class