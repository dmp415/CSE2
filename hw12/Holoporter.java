//Programmer: Donnie Posch
//Project: HW#12 - Utilize three dimensional arrays to "holographically teleport" the physical representation of an object some long distance
//Date: 4/23/2016
//Professor: Brian Chen
//Class: CSE 2

import java.util.*; //Import all java utility libraries

public class Holoporter{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //General Conceptual Approach - Simulate a holoportation scan by creating an array(soRandom) and populating with genetic data(coder). 
        //Next, we print out the original genetic profile(print) before we holoport it(holoport) into a placeholder array
        //We then attempt to confirm how much information was lost in the process(sampling and percentage)
        //Lastly, we want to genetically modify the object thorugh rearranging(frankenstein)
        
        //This is our orginal data taken directly from the holoportation scan
        String[][][] god = soRandom();
        //This is the placeholder that the data is going to be forced into, thus losing some
        //of its data content
        String[][][] lucy = soRandom();
        
        //Code to populate god array with coder strings
        for(int i = 0; i < god.length; i++){
            for(int j = 0; j < god[i].length; j++){
                for(int k = 0; k < god[i][j].length; k++){
                    god[i][j][k] = coder();
                }
            }
        }
        
        percentage(god, lucy);
        
        holoport(god, lucy);
        System.out.print("\n");
        print(god);
        System.out.print("\n");
        sampling(god);
        System.out.print("\n");
        print(lucy);
        System.out.print("\n");
        sampling(lucy);
        
        percentage(god, lucy);
        
        String[][][] frankengod = frankenstein(god);
        String[][][] frankenlucy = frankenstein(lucy);
        
        print(frankengod);
        System.out.print("\n");
        print(frankenlucy);
        System.out.print("\n");
        
    }  //End of Main Method   

    //Solid cohesive function to generate a multidimensional array with all arrays having random length
    public static String[][][] soRandom(){
        Random randomGen = new Random();
        
        //Generate the size of each of the array dimensions, ensuring they are no longer than 10
        int firstD = randomGen.nextInt(9);
        
        //Generate a random size for the first dimension of the array
        String [][][] multiD = new String[firstD][][];
        
        //For each of the arrays in the first dimension, there is a two dimension array of random length
        for(int i = 0; i < firstD; i++){
            int secondD = randomGen.nextInt(9);
            multiD[i] = new String[secondD][];
                //For each two dimensional array, there is a one dimensional array of random length
                for(int j = 0; j < secondD; j++){
                    int thirdD = randomGen.nextInt(9);
                    multiD[i][j] = new String[thirdD];
                }
        } 
        return multiD;
    }//End of soRandom Method
    
    //Generate two random characters and four random characters, concat them into a string, and return it 
    public static String coder(){
        Random randomGen = new Random();
        
        String letter1, letter2 = "";
        int random1, random2, random3, random4 = 0;
        String genome = "";
        
            int i = 0;
            int first = (int)((Math.random()*26)+97);
            char firstChar = Character.toUpperCase((char) first);
            genome += firstChar;
        
            int second = (int)((Math.random()*26)+97);
            char secondChar = Character.toUpperCase((char) second);
            genome += secondChar;
            
            random1 = randomGen.nextInt(10);
            genome += random1;
            
            random2 = randomGen.nextInt(10);
            genome += random2;
            
            random3 = randomGen.nextInt(10);
            genome += random3;
            
            random4 = randomGen.nextInt(10);
            genome += random4;
            
        return genome;
    }//End of Coder Method

    public static String[][][] holoport(String[][][] original, String[][][] placeholder){
        int i, j, k = 0;
             
        if(original.length >= placeholder.length){
            for(i = 0; i < placeholder.length; i++){
                if(original[i].length >= placeholder[i].length){
                    for(j = 0; j < placeholder[i].length; j++){
                        if(original[i][j].length >= placeholder[i][j].length){
                            for(k = 0; k < placeholder[i][j].length; k++){
                                placeholder[i][j][k] = original[i][j][k];
                            }  
                        }
                else{
                    for(k = 0; k < original[i][j].length; k++){
                        placeholder[i][j][k] = original[i][j][k];
                    } 
                    for(k = original[i][j].length; k < placeholder[i][j].length; k++){
                    placeholder[i][j][k] = "$$$$$$";
                    }
                }
                    }
        }
        else{
             for(j = 0; j < original[i].length; j++){
                 placeholder[i][j] = original[i][j];
                    }
                    for(j = original[i].length; j < placeholder[i].length; j++){
                 placeholder[i][j] = new String[0];
             }  
                    
                }
              }
            }
          else{
             for(i = 0; i < original.length; i++){
                 placeholder[i] = original[i];
                    }
                    for(i = original.length; i < placeholder.length; i++){
                 placeholder[i]= new String[0][0];
             }  
                    
                }
         return placeholder;
    }//End of holoport Method
    
    public static void sampling(String[][][] god){
        Scanner myScanner = new Scanner(System.in);
        String letters = "AA";
        String numbers = "0000";
        
        System.out.print("Enter a 2 characters:");
        letters = myScanner.nextLine();
        String uppercase = letters.toUpperCase();
        System.out.print("Enter a 4 integer sequence:");
        numbers = myScanner.nextLine();
        
        String code = uppercase + numbers;
        System.out.print(code);
        
        int findCount = 0;
        
        for(int i = 0; i < god.length; i++){
            for(int j = 0; j < god[i].length; j++){
                for(int k = 0; k < god[i][j].length; k++){
                    if(god[i][j][k].equals(code)){
                        System.out.print("The code was found at position (" + i + "," + j + "," + k + ")");
                        findCount++; 
                    }
                }
            }
        }
        
        if (findCount == 0){
            System.out.print("Code not found.");
        }
        
    }//End of sampling Method

    public static void percentage(String[][][] god, String[][][] lucy){
        int original = 0; 
        int placeholder = 0;
        
        for(int i = 0; i < god.length; i++){
            for(int j = 0; j < god[i].length; j++){
                for(int k = 0; k < god[i][j].length; k++){
                    original++;
                }
            }
        }
        System.out.println(original);
        for(int i = 0; i < lucy.length; i++){
            for(int j = 0; j < lucy[i].length; j++){
                for(int k = 0; k < lucy[i][j].length; k++){
                    placeholder++;
                }
            }
        }
        System.out.println(original);
        
        int percentage = (((original - placeholder) / original) * 100);
        System.out.println("The percent difference is " + percentage);
                    
        
        
    }//End of percentage Method
    
    //Utilizes basic sorting code applied to multi dimensional arrays to sort arrays based on length
    public static String[][][] frankenstein(String[][][] sequence){
        int counter = 0;
        
        //Multi-dimensional application of basic shuffling code from lecture 20
        //Handles the sorting of the inner dimensions of the array
        for(int i = 0; i < sequence.length;i++){
            for(int j = 0; j < sequence[i].length; j++){
                for(int k = 1; k < sequence[i][j].length; k++){
                    counter = k;
                    //found compareTo function online, when strings are equal returns zero
                    while(sequence[i][j][counter].compareTo(sequence[i][j][counter--]) < 0){
                        String temp = sequence[i][j][counter--];
                        sequence[i][j][counter--] = sequence[i][j][counter];
                        sequence[i][j][counter] = temp;
                        counter--;
                        if(counter == 0){
                            break;
                        }
                    }
                }
            }
        }
        //Handles the sorting of the outer dimensions of the array
        for(int i = 0;i < sequence.length; i++){
            for(int j = 1; j < sequence[i].length; j++){
                counter = j;
                while(sequence[i][counter].length < sequence[i][counter--].length){
                    String[] temp = sequence[i][counter--];
                    sequence[i][counter--] = sequence[i][counter];
                    sequence[i][counter] = temp;
                    counter--;
                    if(counter == 0){
                      break;
                    }
                }
            }
        }
    return sequence;
    }//End of frankenstein Method

    public static void print(String[][][] god){
        for(int i = 0; i < god.length; i++){
            for(int j = 0; j < god[i].length; j++){
                for(int k = 0; k < god[i][j].length; k++){
                    if(k == 0){
                        System.out.print("[" + god[i][j][k] + ",");
                    }
                    if(k == (god[i][j].length - 1)){
                        System.out.print(god[i][j][k] +"]|");
                    }
                    else{
                    System.out.print(god[i][j][k] + ",");
                    }
                }
            }
            System.out.print("---");
        }
        
    }//End of print Method

    
} //End of Class