//3rd Homework assignment for CSE 2
//Due September 15th, 2015
//The purpose of this program is to determine how long the user has until dinner
//By John Kelly


import java.util.Scanner; //import Scanner class

public class Timer {
    
    public static void main (String[] args) { //main method required for every java program
        
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the current time: "); //user inputs current time
        int currentTime = myScanner.nextInt();
        System.out.print("Enter the time at which you will begin dinner: "); //user inputs what time they will be eating dinner
        int dinnerTime = myScanner.nextInt();
        int diffTime = dinnerTime - currentTime; //difference in current time and dinner time
        int hours = diffTime/100;
        int minutes = diffTime - (hours*100);
        System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
    }
}
