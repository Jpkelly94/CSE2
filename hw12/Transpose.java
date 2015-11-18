//CSE 2, HW 12
//Created by John Kelly on November 14th, 2015
//The purpose of this program is to apply multi-dimensional arrays through matrices

import java.util.Scanner; //import Scanner class
import java.util.Random; //import Random

public class Transpose {
    public static int[][] randomMatrix(int width, int height) { //method for creating random values in the matrix using inputs from main method
        int[][]matrix1 = new int[width][height];
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++) {
                matrix1[x][y] = (int) ((Math.random()*21)- 10); //fills matrix with individual random values
            }
        }
        return matrix1;
    }
    public static void printMatrix(int [][] matrix1) { //method for printing out the matrices
        for (int x = 0; x < matrix1.length; x++){
            for (int y = 0; y < matrix1[x].length; y++) {
                System.out.print(matrix1[x][y] + " "); //print out each line of the matrix, adding a space to make it look nicer
            } System.out.println();
        }
    }
    public static int[][] transposeMatrix(int[][] matrix1, int width, int height) { //method for transposing the matrix
        int [][]matrix2 = new int[height][width];
        for(int x = 0; x < height; x++){ //for loop that transposes the matrix
            for(int y = 0; y < width; y++){
                matrix2[x][y] = matrix1[y][x]; //transposing occurs here through the declared variables at beginning of for loop
            }
        } return matrix2;
    }
    public static void main(String[] args) { 
        Scanner myScanner = new Scanner(System.in); 
        System.out.print("Enter a positive integer for the height of the matrix: "); //where the user enters their inputs
        int height = myScanner.nextInt();
        while (height < 0) { //while loop ensuring that the user entered a positive integer
            System.out.print("Error: You did not enter a positive integer. Please enter a positive integer: ");
            height = myScanner.nextInt();
        }
        System.out.print("Enter a positive integer for the width of the matrix: ");
        int width = myScanner.nextInt();
        while (width < 0) { //while loop ensuring that the user entered a positive integer
            System.out.print("Error: You did not enter a positive integer. Please enter a positive integer: ");
            width = myScanner.nextInt();
        }
        //next four lines call different methods to apply the user's inputs
        int[][]matrix1 = randomMatrix(width, height);
        printMatrix(matrix1);
        System.out.println();
        int[][]transposedMatrix = transposeMatrix(matrix1, width, height);
        printMatrix(transposedMatrix);
    }
}