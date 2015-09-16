//3rd Homework assignment for CSE 2
//Due September 15th, 2015
//The purpose of this program is to compute the volume and surface area of a block with the dimensions as inputs
//By John Kelly


import java.util.Scanner; //import Scanner class

public class Block {
    
    public static void main (String[] args) { //main method required for every java program
        
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the length of the block: "); //user inputs length of block
        double length = myScanner.nextDouble();
        System.out.print("Enter the width of the block: "); //user inputs the width of the block
        double width = myScanner.nextDouble();
        System.out.print("Enter the height of the block: "); //user inputs the height of the block
        double height = myScanner.nextDouble();
        double volume = length*width*height; //volume of the block
        double surfaceArea = 2*width*height + 2*length*width + 2*length*height; //surface area of the block
        System.out.println("The volume of a block with the dimensions of " + length + " x " + width + " x " + height + " is " + volume);
        System.out.println("The surface area of the block is " + surfaceArea);
    }
    
}        