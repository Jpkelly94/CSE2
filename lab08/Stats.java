//CSE 2, Lab 8
//Created on October 16th, 2015
//The purpose of this program is to use methods to calculate the mean and median of 5 inputs from the user

import java.util.Scanner; //import Scanner class

public class Stats {

    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an input: ");
        double input1 = myScanner.nextDouble();
        System.out.println("Enter another input, each greater than the last: ");
        Boolean a = true;
        double input2 = myScanner.nextDouble();
        while (a) {
                if (input2 > input1) {
                    a = false;
                }
                else {
                    System.out.print("Error: Your inputs must increase sequentially. Please read the instructions again, and enter another input: ");
                    input2 = myScanner.nextDouble();
            }
        }
        System.out.println("Enter another input, greater than the last: ");
        Boolean b = false;
        double input3 = myScanner.nextDouble();
            while (b) {
            if (myScanner.hasNextInt()) {
                input3 = myScanner.nextInt(); 
                if (input3 > input2) {
                    b = true;
                }
                else {
                    System.out.print("Error: Your inputs must increase sequentially. Please read the instructions again, and enter another input: ");
                }
            }
            else {
                System.out.print("Your input was not a number. Please enter another input: ");
                myScanner.next();
            }
        }
        System.out.println("Enter another input, greater than the last: ");
        Boolean c = false;
        double input4 = myScanner.nextDouble();
            while (c) {
            if (myScanner.hasNextInt()) {
                input4 = myScanner.nextInt(); 
                if (input4 > input3) {
                    c = true;
                }
                else {
                    System.out.print("Error: Your inputs must increase sequentially. Please read the instructions again, and enter another input: ");
                }
            }
            else {
                System.out.print("Your input was not a number. Please enter another input: ");
                myScanner.next();
            }
        }
        System.out.println("Enter another input, greater than the last: ");
        Boolean d = false;
        double input5 = myScanner.nextDouble();
            while (d) {
            if (myScanner.hasNextInt()) {
                input5 = myScanner.nextInt(); 
                if (input5 > input4) {
                    d = true;
                }
                else {
                    System.out.print("Error: Your inputs must increase sequentially. Please read the instructions again, and enter another input: ");
                }
            }
            else {
                System.out.print("Your input was not a number. Please enter another input: ");
                myScanner.next();
            }
        }
        double n=mean(input1,input2,input3,input4,input5);
        median(input3);
        print(n,input3);
    }
    public static double mean(double a, double b, double c, double d, double e){
        double inputMean = (a + b + c + d + e)/5;
        return inputMean;
    }
    public static double median(double c){
        double med = c;
        return med;
    }
    public static void print(double inputMean, double inputMedian){
        System.out.println("The mean of the five inputs is " +inputMean);
        System.out.println("The median of the five inputs is " +inputMedian);
    }
}