//7th lab for CSE 2
//Program done by John Kelly on October 9th, 2015
//The purpose of this program is to create an "x" in several asterisks

import java.util.Scanner; //import Scanner class

public class encrypted_x {
    
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int input = 0;
        Boolean acceptable = false;
        System.out.println("Input an integer between 1 and 100: ");
        while (!acceptable) {
            if (myScanner.hasNextInt()) {
                input = myScanner.nextInt(); 
                if (input > 0 && input < 100) {
                    acceptable = true;
                }
                else {
                    System.out.print("Error: You did not enter an integer between 1 & 100. Please read the instructions again, and enter another input: ");
                }
            }
            else {
                System.out.print("Your input was not an integer. Please enter an integer between 1 & 100: ");
                myScanner.next();
            }
        }
        for (int i = 0; i<input; i++) {
            for (int j = 0; j < input; j++) {
                if (i == j || j == input - i-1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
}
        