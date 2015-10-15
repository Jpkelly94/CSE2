//7th lab for CSE 2
//Program done by John Kelly on October 9th, 2015
//The purpose of this program is to create an "x" in several asterisks

import java.util.Scanner; //import Scanner class

public class Twisty {
    
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int length = 0;
        int width = 0;
        
        //The following code assesses the user's input to make sure it fits the criteria. The input cannot be negative, greater than 80, zero, or a non-integer 
        Boolean acceptable = true;
        System.out.println("Input your desired length: ");
        while (acceptable) {
            if (myScanner.hasNextInt()) {
                length = myScanner.nextInt(); 
                if (length > 0 && length < 80) {
                    acceptable = false;
                }
                else {
                    System.out.print("Error: Your length must be less than 80, but greater than 0. Please read the instructions again, and enter another input: ");
                }
            }
            else {
                System.out.print("Your input was not an integer. Please enter an integer between 0 and 80: ");
                myScanner.next();
            }
        }
        System.out.println("Input your desired width: ");
        acceptable = true;
        while (acceptable) {
            if (myScanner.hasNextInt()) {
                width = myScanner.nextInt(); 
                if (width > 0 && width < length) {
                    acceptable = false;
                }
                else {
                    System.out.print("Error: Your width must be greater than 0, but less than your length. Please read the instructions again, and enter another input: ");
                }
            }
            else {
                System.out.print("Your input was not an integer. Please enter your desired width: ");
                myScanner.next();  
            }
        }
        //The following loops creates the twist
        for (int i = 0; i<width; i++) {
            int lenCount = 0; //The variable lenCount's purpose is simply to control how many #s and \s should be printed.
            Boolean a = true; //The boolean a's purpose is the same as lenCount's (but with a different application) and is not represented in the printed result of the code.
            while (lenCount < length){
            for (int j = 0; j < width ; j++) { 
                if (a) {
                if (i == j) { //This "if" statement creates the first "x" twist with hashtags and backslashes
                    System.out.print("#");
                    lenCount++;
                }
                else if (i == width - j-1) {
                    System.out.print("/");
                    lenCount++;
                }
                else {
                    System.out.print(" ");
                    lenCount++;
                }
                }
                
                if (!a) {
                if (i == j) { //This "if" statement creates the second "x" twist with hashtags and forward slashes
                    System.out.print("\\");
                    lenCount++;
                }
                else if (i == width - j-1) {
                    System.out.print("#");
                    lenCount++;
                }
                else {
                    System.out.print(" ");
                    lenCount++;
                }
                }   
            }
        if (a == true) { //This "if" statement is what executes the "twist"; notice the symmetry of the result as opposed to the same "x" shape appearing over and over
            a = false;
        }
        else {
            a = true;
        }
        }System.out.println(); //Creates another line to keep the twist going
        }
        } 
    }