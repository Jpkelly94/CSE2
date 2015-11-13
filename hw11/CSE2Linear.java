//CSE 2 Homework 11
//Created by John Kelly on November 7th, 2015
//The purpose of this program is to sort an array of 15 student grades which are entered by the user, as well as search the 15 entries for a particular score

import java.util.Random;
import java.util.Scanner;

public class CSE2Linear {
    public static void main(String[] args) {
        int students = 16; //Number of students +1 whose grades will be entered by the user. The purpose of using "16" rather than "15" is that the 
        int [] grades = new int [students]; //create the array of grades that will consist of inputs the user enters 
        int x = 0; //arbitrary variable to help count with for-loops
        int temp = 0; //temporary int to store data
        
        System.out.print("Enter 15 ints for final grades in CSE 2: ");
        Scanner myScanner = new Scanner(System.in);
        for (x = 1; x < students; x++){
            if (myScanner.hasNextInt()){
               temp = myScanner.nextInt();
               if (temp > 0 || temp < 100){
                   if(temp>grades[x-1] || x ==0){
                       grades[x] = temp;
                   }
                   else{
                        System.out.print("Error: You must enter an integer greater than the last one:  ");
                        x--;
                   }
               }
                else{
                    System.out.print("Error: You must enter an integer between 0 and 100: ");
                    x--;
                }
    
            }
            else {
                System.out.print("Error: You did not enter an integer, please enter an integer between 0 and 100: ");
                x--;
            }
           
            }
            binary(grades);
            linear(grades);
            scramble(grades);
            
        }
    public static int linear(int [] grades) {
        Scanner myScanner2 = new Scanner(System.in);
        int students2 = 15;
        
        System.out.print("Enter a grade to linear search for: ");
        int input = myScanner2.nextInt();
        
        for (int a = 0; a < students2; a++){
            if (input == grades[a]){
                System.out.println(input + " was found with " +a+ " comparisons.");
            }
            if (a == students2) {
                System.out.println(input + " was not found with" +a+ " comparisons.");
            }
        }
        return input;
    }
    public static int binary(int [] grades) {
        Scanner myScanner3 = new Scanner(System.in);
        System.out.print("Enter a grade to binary search for: ");
        int binInput = myScanner3.nextInt();
        int highCounter = 1;
        int lowCounter = 16;
        
        int high = grades[highCounter];
        int low = grades[lowCounter];
        
        while(high>=low) {
            int mid = (low + high)/2;
            if (grades[mid] == binInput) {
                return binInput;
            }
            if (grades[mid] < binInput){
                low = grades[(lowCounter+1)];
            }
            if (grades[mid] > binInput){
                high = grades[(highCounter-1)];
            }
        }
        return binInput;
        
    }
    public static int[] scramble(int[] grades){
        int scramble;
        Random random = new Random();
        for (int x = grades.length-1; x > 0; x++){
            scramble = random.nextInt(x+1);
            if (scramble != x){
                grades[scramble] ^= grades[x];
                grades[x] ^= grades[scramble];
                grades[scramble] ^= grades[x];
            }
        }
        return grades;
    }
        
    }