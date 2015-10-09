//CSE 2 Homework 6
//Created by John Kelly, due on October 6th, 2015
//The purpose of this program is to give the user an idea of how much they will spend throughout the week and in four years.

import java.util.Scanner; //import Scanner class
import java.text.DecimalFormat; //import Decimal Format
import java.lang.Math; //import Math functions
import java.util.Random; //import random

public class BarGraph {
    
    public static void main (String[] args) { //main method required for every java program
        //PART I
        
        Scanner myScanner = new Scanner( System.in ); //Makes user input expenses for each day of the week
        System.out.println("Enter your expenses for Monday: ");
        double monEx = myScanner.nextDouble();
        System.out.println("Enter your expenses for Tuesday: ");
        double tueEx = myScanner.nextDouble();
        System.out.println("Enter your expenses for Wednesday: ");
        double wedEx = myScanner.nextDouble();
        System.out.println("Enter your expenses for Thursday: ");
        double thurEx = myScanner.nextDouble();
        System.out.println("Enter your expenses for Friday: ");
        double friEx = myScanner.nextDouble();
        System.out.println("Enter your expenses for Saturday: ");
        double satEx = myScanner.nextDouble();
        System.out.println("Enter your expenses for Sunday: ");
        double sunEx = myScanner.nextDouble();
        
        int monAst = 0; //These variables are intended to print out the bar chart
        int tueAst =  0;
        int wedAst = 0;
        int thurAst = 0;
        int friAst = 0;
        int satAst = 0;
        int sunAst = 0;
        
        while (monAst < (monEx)-1) { //by using loops, one asterisk will be added to the above variabels for each dollar spent
            System.out.print("*");
            monAst++;
        }
         while (monAst < monEx) {
            System.out.print("*\n");
            monAst++;
        }
         while (tueAst < (tueEx-1)) {
            System.out.print("*");
            tueAst++;
        }
         while (tueAst < tueEx) {
            System.out.print("*\n");
            tueAst++;
        }
         while (wedAst < (wedEx-1)) {
            System.out.print("*");
            wedAst++;
        }
         while (wedAst < wedEx) {
            System.out.print("*\n");
            wedAst++;
        }
         while (thurAst < (thurEx-1)) {
            System.out.print("*");
            thurAst++;
        }
         while (thurAst < thurEx) {
            System.out.print("*\n");
            thurAst++;
        }
         while (friAst < (friEx-1)) {
            System.out.print("*");
            friAst++;
        }
         while (friAst < friEx) {
            System.out.print("*\n");
            friAst++;
        }
         while (satAst < (satEx-1)) {
            System.out.print("*");
            satAst++;
        }
         while (satAst < satEx) {
            System.out.print("*\n");
            satAst++;
        }
         while (sunAst < (sunEx-1)) {
            System.out.print("*");
            sunAst++;
        }
        while (sunAst < sunEx) {
            System.out.print("*\n");
            sunAst++;
        }
        
        double dayAvg = ((monEx + tueEx + wedEx + thurEx + friEx + satEx + sunEx)/7); //average out user inputs
        DecimalFormat df = new DecimalFormat("#.00"); // Converting double to 2 decimals
        System.out.println("You spend $" + df.format(dayAvg) + " on average."); 
        
        //PART II
        
        int california = 0; //meaningless variable for the purpose of the loops shown below
        double yearExp = dayAvg; //create a variable for 4 year's expenses

        while (california < 1460) {//This loop calculates the estimated expenditures for four years
            double randChange = Math.random() * 41; //generate random number for a percentage change between 0 and -20%
            double percent = randChange;
            if (randChange < 21) {
                percent = (randChange - 20)/100;
                yearExp = yearExp + (dayAvg*(1+percent));
            }
            else if (randChange > 20) {
                percent = (randChange - 20)/100;
                yearExp = yearExp + (dayAvg*(1+percent));
            }
            california++;
        }
        System.out.println("Your expenses over a four-year period will be " + df.format(yearExp));
        }    
        
    }    