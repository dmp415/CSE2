//Programmer: Donnie Posch
//Project: Lab 10 - Program Description
//Date: 4/8/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;
import java.util.Random;

public class Grades{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomGen = new Random();
        
        int randomStudents = (randomGen.nextInt(5) + 5);
        
        String []students = new String[randomStudents];
        int []midterm = new int[randomStudents];
        
        System.out.print(randomStudents);
        
        for(int i = 0; i < randomStudents; i++){
            System.out.print("Please enter the name of the student:");
            students[i] = myScanner.nextLine();
        }
        
        for(int i = 0; i < randomStudents; i++){
           midterm[i] = randomGen.nextInt(100);
        }
        
        
        
        for(int i = 0; i < randomStudents; i++){
            System.out.println(students[i] + "      " + midterm[i]);
        }
        
        
        
    }  //End of Method   
} //End of Class