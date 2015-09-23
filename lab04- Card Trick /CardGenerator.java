//Lab 04- Card Generator
//September 18th, 2015, by John Kelly
//The purpose of this program is to generate a random card from a complete deck

import java.lang.Math; //import math

public class CardGenerator {
    
    public static void main (String[] args) {
    
    int card = (int) (Math.random()* 4); //Generates a random number used to determine the card's suit
    
    String suit; //This if statement determines the suit of the card using the random number generated above
    if (card == 1) {
        suit = "Diamonds";
    }    
    else if (card == 2) {
        suit = "Clubs";
    }
    else if (card == 3) {
        suit = "Spades";
    }
    else {
        suit = "Hearts";
    }
    
    int cardNumber = (int) ((Math.random()*13)+1); //Generates a random number to assign a rank to the card
    
    String cardType=""; //Switch statement that determines the rank of the card using the given random number
    switch (cardNumber) {
        case 13: cardType = "King";
        break;
        case 12: cardType = "Queen";
        break;
        case 11: cardType = "Jack";
        break;
        case 10: cardType = "Ten";
        break;
        case 9: cardType = "Nine";
        break;
        case 8: cardType = "Eight";
        break;
        case 7: cardType = "Seven";
        break;
        case 6: cardType = "Six";
        break;
        case 5: cardType = "Five";
        break;
        case 4: cardType = "Four";
        break;
        case 3: cardType = "Three";
        break;
        case 2: cardType = "Two";
        break;
        case 1: cardType = "Ace";
        break;
        default:
        break;
    }
    System.out.println("You picked the " + cardType + " of " + suit); //prints out the rank and suit of the card
    }
        
}