//Lab03- Check Assignment
//Friday, September 11th, 2015. By John Kelly
//The purpose of this assignment is to create a program that determines what percent of the check each person

import java.util.Scanner; //import Scanner class

public class Check {
    
    public static void main (String[] args) { //main method required for every java program
        
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100; //We want to convert the percentage into a decimal value
        double totalCost;
        double costPerPerson;
        int dollars,   //whole dollar amount of cost 
              dimes, pennies; //for storing digits to the right of the decimal point for the cost$ 
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder after the division: 583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $ " + dollars + '.' + dimes + pennies);
        
        
    } //end of main method
}