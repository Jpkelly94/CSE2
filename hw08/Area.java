//Cse 2 hw 8
//Created on October 20th, 2015, by John Kelly
//The purpose of this code is to calculate the area of the user's inputed shape using methods


import java.util.Scanner; //import Scanner class

public class Area{
    public static void main(String[] args){
        String type = null; //String for user input
         //The number that will be returned is dependent upon the user's input
         Scanner myScanner = new Scanner( System.in ); 
         Boolean acceptable = true; //Simply the boolean variable for the verification loop, not of significance to user
         while (acceptable) {
             System.out.print("Enter a type of shape; either a circle, square, or triangle: ");
            if (myScanner.hasNext()) {
                type = myScanner.next(); 
                if (type.equals("triangle") || type.equals("square") || type.equals("circle")) {
                    acceptable = false;
                }
                else {
                    System.out.println("Error, please enter either a triangle, square, or circle: ");
                }
            }
        }
         double area = 0;
         switch(type){
             case "triangle":
                 area = triangle();
                 break;
            case "square":
                area = square();
                break;
            case "circle":
                area = circle();
                break;
         } System.out.println(area);
    }
    
    public static double square(){ //method for calculating square
        Scanner myScanner = new Scanner( System.in ); 
        System.out.print("Enter the height: ");
        double height = myScanner.nextDouble();
        double area = height * height; //area for square
        return area;
    }
    
    
    public static double triangle(){ //method for calculating area of traingle
        Scanner myScanner = new Scanner( System.in ); 
        System.out.print("Enter the height: ");
        double height = myScanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = myScanner.nextDouble();
        double area = 0.5 * height * width; //area of triangle
        return area;
    }
    
    
    public static double circle(){ //method for calculating area of circle
        Scanner myScanner = new Scanner( System.in ); 
        System.out.print("Enter the radius: ");
        double radius = myScanner.nextDouble();
        double area = 3.14 * radius * radius; //area of circle
        return area;
    }
    
}