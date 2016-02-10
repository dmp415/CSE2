public class Arithmetic{
    public static void main(String[] args){
        int pants = 3; //Declaration of Integer Values
        int shirts = 2;
        int belts = 1;
        double pantsPrice = 34.98;//Declaration of Double Values
        double shirtsPrice = 24.99;
        double beltsPrice = 33.99;
        double tax = 0.06;
        double totalPants, totalShirts, totalBelts; //Variables to store individual clothing type totals
        double pantsTax, shirtsTax, beltsTax; //Variables to store tax associated with each clothing type
        double totalUntaxed, totalTax, totalTaxed; //Variables to store totals
        
        //Calculation and assignment of individual item totals,  pre-tax
        totalPants = (((int)((pants * pantsPrice)*100))/100.0);
        totalShirts = (((int)((shirts * shirtsPrice)*100))/100.0);
        totalBelts = (((int)((belts * beltsPrice)*100))/100.0);
        
        //Calculation and assignment of tax associated with each item type
        pantsTax = (((int)((totalPants * tax)*100))/100.0);
        shirtsTax = (((int)((totalShirts * tax)*100))/100.0);
        beltsTax = (((int)((totalBelts * tax)*100))/100.0);
        
        //Calculation and assignment of summation of final values
        totalUntaxed = totalPants + totalShirts + totalBelts;
        totalTax = pantsTax + shirtsTax + beltsTax;
        totalTaxed = totalUntaxed + totalTax;
        
        //Display of calculated data
        System.out.println("At " + pantsPrice + "$, " + pants + " pairs of pants will cost " + totalPants + "$ before tax." );
        System.out.println("At " + shirtsPrice + "$, " + shirts + " shirts will cost " + totalShirts + "$ before tax." );
        System.out.println("At " + beltsPrice + "$, " + belts + "  belt will cost " + totalBelts + "$ before tax." );
        
        System.out.println("The sales tax from the purchase of the pants is " + pantsTax + "$." );
        System.out.println("The sales tax from the purchase of the shirts is " + shirtsTax + "$." );
        System.out.println("The sales tax from the purchase of the belt is " + beltsTax  + "$." );
        
        System.out.println("The total cost of the items before tax is " + totalUntaxed  + "$.");
        System.out.println("The total sales tax on the purchase was " + totalTax + "$." );
        System.out.println("The total cost of the entire purchase, including tax, is " + totalTaxed  + "$.");
        
        
        
    }//End of Main Method
}//End of Class