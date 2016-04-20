//Programmer: Donnie Posch
//Project: Lab 07 - Print a bowtie design utilizing various looping structures and nested loops
//Date: 3/11/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.Scanner;

public class Bowtie{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        int nStars = 11;
        
        int top = (nStars/2);
        int bottom = (nStars/2)+1;
        
        
        
        
       
    //Nested while loops to print top part of bowtie
    int i = 0;    
    while(i<top){
        int k = 0;
        while(k < (i + 1)){
            System.out.print(" ");
            k++;
        }
        int j = 0;
        while(j < (nStars - (i*2))){
            System.out.print("*");
            j++;
        }
        System.out.print("\n");
        i++;
    }    
    //Nested while loops to print bottom part of bowtie    
    i = 0;    
    while(i<bottom){
        int k = 0;
        while(k < (bottom - i)){
            System.out.print(" ");
            k++;
        }
        int j = 0;
        while(j < (i*2 + 1)){
            System.out.print("*");
            j++;
        }
        System.out.print("\n");
        i++;
    }   

    //Nested for loop to print top part of bowtie    
    for (int i = 0; i < top; i++){
        for (int k = 0; k < i+1; k++){
        System.out.print(" ");
        }
        for (int j = 0; j < (nStars - (i*2)); j++){
        System.out.print("*");
        }
    System.out.print("\n");
    }
    //Nested for loop to print bottom part of bowtie
    for (int i = 0; i < bottom; i++){
        for (int k = 0; k < bottom-i; k++){
        System.out.print(" ");
        }
        for (int j=0; j < (i*2+1); j++){
        System.out.print("*");
        }
        
    System.out.print("\n");
    }
    //Nested do - while loop to print top of bowtie
    int i = 0;    
    do{
        int k = 0;
        do{
            System.out.print(" ");
            k++;
        }while(k < (i + 1));
        int j = 0;
        do{
            System.out.print("*");
            j++;
        }while(j < (nStars - (i*2)));
    System.out.print("\n");
    i++;
    }while(i<top);
    
    //Nested do - while loop to print bottom of bowtie
    i = 0;    
    do{
        int k = 0;
        do{
            System.out.print(" ");
            k++;
        }while(k < (bottom - i));
        int j = 0;
        do{
            System.out.print("*");
            j++;
        }while(j < (i*2 + 1));
    System.out.print("\n");
    i++;
    }while(i<bottom);
    
        

    
    
    } //End of Method   
} //End of Class