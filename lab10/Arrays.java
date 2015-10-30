//Lab06 for CSE 2. 
//Created by John Kelly on October 30th, 2015
//The purpose of this program is to practice using arrays

import java.util.Scanner; //import scanner
import java.lang.Math; //import Math

public class Arrays {
    public static void main(String[] args) {;

        int x = (int) (Math.random()*6) + 5;
        Scanner myScanner = new Scanner(System.in); 
        System.out.println("Enter "+x+" students' names: "); //ask user for student names
        String[] students = new String[x]; //array for student names
        for (int i = 0; i < x; i++) {
            students[i] = myScanner.next();
        }
        
        int[] midtermGrade = new int[x]; //array for student grades
        for (int j = 0; j < x; j++) {
            midtermGrade[j] = (int)(Math.random()*100);
        }
        for (int k = 0; k < x ;k++ ) {
            System.out.println(students[k] + ": " +midtermGrade[k]); //Print out students and grades
        }
    }
}
