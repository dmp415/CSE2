//Program to split a check a certain number of ways

import java.util.Scanner;

public class Check{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        
        //Prompt to get user input for cost of the check
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        
        //Prompt to get the user to input the percentage tip they want to leave
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        
        //Conver the tip into a decimal value
        tipPercent /= 100;
        
        //Prompt to determine the number of ways to split the check
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        //Perform the calculations on the inputed data to attain the desired information
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;
        totalCost = checkCost *(1+tipPercent);
        costPerPerson = totalCost / numPeople;
        dollars = (int)costPerPerson;
        dimes = (int)(costPerPerson * 10)%10;
        pennies = (int)(costPerPerson *100)%10;
        
        //Display the desired data
        System.out.println("Each person in the group owes $" + dollars + '.'+ dimes + pennies);
        
        
    }  //End of Method   
} //End of Class
