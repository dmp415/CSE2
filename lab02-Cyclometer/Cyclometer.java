public class Cyclometer{
        public static void main(String[] args){
            int time1 = 480; //Trip 1 Time
            int time2 =3220; //Trip 2 Time
            int rotations1 =1561;//Trip 1 rotations
            int rotations2 =9037;//Trip 2 rotations
            double diameter =27.0; //Wheel Diameter
            double PI = 3.14159; //Relavent conversion factors
            double feetPerMile = 5280;
            double inchesPerFoot = 12;
            double secondsPerMinute = 60;
            double distance1, distance2,totalDistance; //Variables to be populated by calculations
            
            System.out.println("Trip 1 took " + (time1/secondsPerMinute)+"minutes and had " +(rotations1)+" counts."); //Print out initial input data
            System.out.println("Trip 2 took " + (time2/secondsPerMinute)+"minutes and had " +(rotations2)+" counts.");
        
            distance1 = (rotations1*diameter*PI)/(inchesPerFoot*feetPerMile); //Calculations and storage of calculated values into variables
            distance2 = (rotations2*diameter*PI)/(inchesPerFoot*feetPerMile);
            totalDistance = (distance1 + distance2);
            
            System.out.println("Trip 1 was " + distance1 +" miles.");
            System.out.println("Trip 2 was " + distance2 +" miles.");
            System.out.println("The total distance was " + totalDistance + " miles.");
            
    }//End of Main Method
}//End of Class