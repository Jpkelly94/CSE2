//Cse 2 hw 8
//Created on October 20th, 2015, by John Kelly
//The purpose of this code is to analyze the user's inputed string using methods


import java.util.Scanner; //import Scanner class

public class StringAnalysis{
    public static void main(String[] args){
        String type = null; //string that the user will input
         Scanner myScanner = new Scanner(System.in);
         System.out.print("Enter a string of any length: ");
         type = myScanner.next();
         System.out.print("Enter the number of characters you would like to analyze (If 0 or a negative is entered, the entire string will be analyzed): ");
         int input2 = myScanner.nextInt();
         boolean check = false; //boolean variable to help analyze user input
         if (input2<=0 && input2<type.length()) { //if statement determines which method to use from below
             check = analyze(type);
         }
         else {
            check = analyze1(type, input2); 
         }
         System.out.println(check);
         }
         
    public static Boolean analyze(String type) { //method for analyzing string
        Boolean check = true;
        for (int i = 0; i<type.length();i++) {
            char a = type.charAt(i); //character analysis of string
            if(Character.isDigit(a)){
                check = false;
            }
        }
        return check;
    }
    
    public static Boolean analyze1(String type, int input) { //check for analyzing string with numbers
        Boolean check = true;
        for (int i = 0; i<input;i++) {
            char a = type.charAt(i); //character analysis of string
            if(Character.isDigit(a)){
                check = false;
            }
        }
        return check;
    }
}
