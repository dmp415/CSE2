public class CardGenerator{
    public static void main (String[] args) {
        
        int randomCard = (int)((Math.random()*51)+2);
        
        if (randomCard >=2 && randomCard <=14){
            String suit1 = "Diamonds";
            if (randomCard >= 2 && randomCard<=10){
                System.out.println("You chose the " + (randomCard) + " of " + suit1 + ".");
            }
            else if (randomCard == 11){
                System.out.println("You chose the Jack of " + suit1 + ".");
            }
            else if (randomCard == 12){
                System.out.println("You chose the Queen of " + suit1 + ".");
            }
            else if (randomCard == 13){
                System.out.println("You chose the King of " + suit1 + ".");
            }
            else if (randomCard == 14){
                System.out.println("You chose the Ace of " + suit1 + ".");
            }
        }    
        if (randomCard >=15 && randomCard <=27){
            String suit2 = "Clubs";
            if (randomCard >= 15 && randomCard<=23){
                System.out.println("You chose the " + (randomCard-13) + " of " + suit2 + ".");
            }
            else if (randomCard == 24){
                System.out.println("You chose the Jack of " + suit2 + ".");
            }
            else if (randomCard == 25){
                System.out.println("You chose the Queen of " + suit2 + ".");
            }
            else if (randomCard == 26){
                System.out.println("You chose the King of " + suit2 + ".");
            }
            else if (randomCard == 27){
                System.out.println("You chose the Ace of " + suit2 + ".");
            }
        }
        if (randomCard >=28 && randomCard <=40){
            String suit3 = "Hearts";
            if (randomCard >= 28 && randomCard<=36){
                System.out.println("You chose the " + (randomCard-26) + " of " + suit3 + ".");
            }
            else if (randomCard == 37){
                System.out.println("You chose the Jack of " + suit3 + ".");
            }
            else if (randomCard == 38){
                System.out.println("You chose the Queen of " + suit3 + ".");
            }
            else if (randomCard == 39){
                System.out.println("You chose the King of " + suit3 + ".");
            }
            else if (randomCard == 40){
                System.out.println("You chose the Ace of " + suit3 + ".");
            }
        }    
        if (randomCard >=41 && randomCard <=53){
            String suit4 = "Spades";
            if (randomCard >= 41 && randomCard<=49){
                System.out.println("You chose the " + (randomCard-39) + " of " + suit4 + ".");
            }
            else if (randomCard == 50){
                System.out.println("You chose the Jack of " + suit4 + ".");
            }
            else if (randomCard == 51){
                System.out.println("You chose the Queen of " + suit4 + ".");
            }
            else if (randomCard == 52){
                System.out.println("You chose the King of " + suit4 + ".");
            }
            else if (randomCard == 53){
                System.out.println("You chose the Ace of " + suit4 + ".");
            }
        } 
 
  }  //End of Method   
} //End of Class
