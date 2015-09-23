//CSE 2 Homework 4
//Due September 22nd
//By John Kelly
//The purpose of this program is to draw a hand of five cards and determine if there are any pairs, a three of a kind, or just a high-card hand



import java.lang.Math; //import math

public class PokerHandCheck {
    
    public static void main (String[] args) {
    
    //Code for the first card:
        int card1 = (int) (Math.random()* 4); //Generate random number used to label suit
        
        String suit1 = ""; //Use the value of card1 to determine what suit the card is
        if (card1 == 1) {
            suit1 = "Diamonds";
        }    
        else if (card1 == 2) {
            suit1 = "Clubs";
        }
        else if (card1 == 3) {
            suit1 = "Spades";
        }
        else {
            suit1 = "Hearts";
        }
        
        int cardNumber1 = (int) ((Math.random()*13)+1); //Generate a random number to determine the rank of the given card    
       
        String cardType1="";
        switch (cardNumber1) {
            case 13: cardType1 = "King";
            break;
            case 12: cardType1 = "Queen";
            break;
            case 11: cardType1 = "Jack";
            break;
            case 10: cardType1 = "Ten";
            break;
            case 9: cardType1 = "Nine";
            break;
            case 8: cardType1 = "Eight";
            break;
            case 7: cardType1 = "Seven";
            break;
            case 6: cardType1 = "Six";
            break;
            case 5: cardType1 = "Five";
            break;
            case 4: cardType1 = "Four";
            break;
            case 3: cardType1 = "Three";
            break;
            case 2: cardType1 = "Two";
            break;
            case 1: cardType1 = "Ace";
            break;
            default:
            break;
    }
        String firstCard = "You drew the " + cardType1 + " of " +suit1; 
        System.out.println(firstCard); //print out the given card
        
    
    //Code for the second card:
    
        int card2 = (int) (Math.random()* 4); //Again, we generate another random number to assign another card its suit
        
        String suit2 = "";
        if (card2 == 1) {
            suit2 = "Diamonds";
        }    
        else if (card2 == 2) {
            suit2 = "Clubs";
        }
        else if (card2 == 3) {
            suit2 = "Spades";
        }
        else {
            suit2 = "Hearts";
        }
        
        int cardNumber2 = (int) ((Math.random()*13)+1); //Again, we generate a random number to assign a nother card its rank
        
        String cardType2="";
        switch (cardNumber2) {
            case 13: cardType2 = "King";
            break;
            case 12: cardType2 = "Queen";
            break;
            case 11: cardType2 = "Jack";
            break;
            case 10: cardType2 = "Ten";
            break;
            case 9: cardType2 = "Nine";
            break;
            case 8: cardType2 = "Eight";
            break;
            case 7: cardType2 = "Seven";
            break;
            case 6: cardType2 = "Six";
            break;
            case 5: cardType2 = "Five";
            break;
            case 4: cardType2 = "Four";
            break;
            case 3: cardType2 = "Three";
            break;
            case 2: cardType2 = "Two";
            break;
            case 1: cardType2 = "Ace";
            break;
            default:
            break;
        }
        
        String secondCard = "You drew the " + cardType2 + " of " +suit2;
        System.out.println(secondCard);
    
    //Code for the third card:
    
        int card3 = (int) (Math.random()* 4); 
        
        String suit3 = "";
        if (card3 == 1) {
            suit3 = "Diamonds";
        }    
        else if (card3 == 2) {
            suit3 = "Clubs";
        }
        else if (card3 == 3) {
            suit3 = "Spades";
        }
        else {
            suit3 = "Hearts";
        }
        
        int cardNumber3 = (int) ((Math.random()*13)+1);
        
        String cardType3="";
        switch (cardNumber3) {
            case 13: cardType3 = "King";
            break;
            case 12: cardType3 = "Queen";
            break;
            case 11: cardType3 = "Jack";
            break;
            case 10: cardType3 = "Ten";
            break;
            case 9: cardType3 = "Nine";
            break;
            case 8: cardType3 = "Eight";
            break;
            case 7: cardType3 = "Seven";
            break;
            case 6: cardType3 = "Six";
            break;
            case 5: cardType3 = "Five";
            break;
            case 4: cardType3 = "Four";
            break;
            case 3: cardType3 = "Three";
            break;
            case 2: cardType3 = "Two";
            break;
            case 1: cardType3 = "Ace";
            break;
            default:
            break;
        }
        
        String thirdCard = "You drew the " + cardType3 + " of " +suit3;
        System.out.println(thirdCard);
    
    //Code for the fourth card:
    
        int card4 = (int) (Math.random()* 4); 
        
        String suit4 = "";
        if (card4 == 1) {
            suit4 = "Diamonds";
        }    
        else if (card4 == 2) {
            suit4 = "Clubs";
        }
        else if (card4 == 3) {
            suit4 = "Spades";
        }
        else {
            suit4 = "Hearts";
        }
        
        int cardNumber4 = (int) ((Math.random()*13)+1);
        
        String cardType4="";
        switch (cardNumber4) {
            case 13: cardType4 = "King";
            break;
            case 12: cardType4 = "Queen";
            break;
            case 11: cardType4 = "Jack";
            break;
            case 10: cardType4 = "Ten";
            break;
            case 9: cardType4 = "Nine";
            break;
            case 8: cardType4 = "Eight";
            break;
            case 7: cardType4 = "Seven";
            break;
            case 6: cardType4 = "Six";
            break;
            case 5: cardType4 = "Five";
            break;
            case 4: cardType4 = "Four";
            break;
            case 3: cardType4 = "Three";
            break;
            case 2: cardType4 = "Two";
            break;
            case 1: cardType4 = "Ace";
            break;
            default:
            break;
        }
        
        String fourthCard = "You drew the " + cardType4 + " of " +suit4;
        System.out.println(fourthCard);
    
    //Code for the fifth card:
    
        int card5 = (int) (Math.random()* 4); 
        
        String suit5 = "";
        if (card5 == 1) {
            suit5 = "Diamonds";
        }    
        else if (card5 == 2) {
            suit5 = "Clubs";
        }
        else if (card5 == 3) {
            suit5 = "Spades";
        }
        else {
            suit5 = "Hearts";
        }
        
        int cardNumber5 = (int) ((Math.random()*13)+1);
        
        String cardType5="";
        switch (cardNumber5) {
            case 13: cardType5 = "King";
            break;
            case 12: cardType5 = "Queen";
            break;
            case 11: cardType5 = "Jack";
            break;
            case 10: cardType5 = "Ten";
            break;
            case 9: cardType5 = "Nine";
            break;
            case 8: cardType5 = "Eight";
            break;
            case 7: cardType5 = "Seven";
            break;
            case 6: cardType5 = "Six";
            break;
            case 5: cardType5 = "Five";
            break;
            case 4: cardType5 = "Four";
            break;
            case 3: cardType5 = "Three";
            break;
            case 2: cardType5 = "Two";
            break;
            case 1: cardType5 = "Ace";
            break;
            default:
            break;
        }
        
        String fifthCard = "You drew the " + cardType5 + " of " +suit5;
        System.out.println(fifthCard);

    //Hand assessment:
    int i = 0; //This counter determines whether or not the user draws a high card hand, a pair, two pairs, or three of a kind
    if(cardNumber1 == cardNumber2) {
        
        i = i+1;
    }
    else if (cardNumber1 == cardNumber3) {
        
        i = i+1;
        
    }
    else if (cardNumber1 == cardNumber4) {
        
        i = i+1;
    }
    else if (cardNumber1 == cardNumber5) {
        
        i = i+1;
    }
    else if (cardNumber2 == cardNumber3) {
        
        i = i+1;
    }
    else if (cardNumber2 == cardNumber4) {
        
        i = i+1;
    }
    else if (cardNumber2 == cardNumber5) {
        
        i = i+1;
    }
    else if (cardNumber3 == cardNumber4) {
        
        i = i+1;
    }
    else if (cardNumber3 == cardNumber5) {
        
        i = i+1;
    }
    else if (cardNumber4 == cardNumber5) {
        
        i = i+1;
    }
    else if ((cardNumber1 == cardNumber2) && (cardNumber1 == cardNumber3)) {
        
        i = i+2;
    }
    else if ((cardNumber1 == cardNumber2) && (cardNumber1 == cardNumber4)) {
        
        i = i+2;
    }
    else if ((cardNumber1 == cardNumber2) && (cardNumber1 == cardNumber5)) {
        
        i = i+2;
    }
    else if ((cardNumber1 == cardNumber3) && (cardNumber1 == cardNumber4)) {
        
        i = i+2;
    }
    else if ((cardNumber1 == cardNumber3) && (cardNumber1 == cardNumber5)) {
        
        i = i+2;
    }
    else if ((cardNumber1 == cardNumber4) && (cardNumber1 == cardNumber5)) {
        
        i = i+2;
    }
    else if ((cardNumber2 == cardNumber3) && (cardNumber2 == cardNumber4)) {
        
        i = i+2;
    }
    else if ((cardNumber2 == cardNumber3) && (cardNumber2 == cardNumber5)) {
        
        i = i+2;
    }
    else if ((cardNumber2 == cardNumber4) && (cardNumber2 == cardNumber5)) {
        
        i = i+2;
    }
    else if ((cardNumber3 == cardNumber4) && (cardNumber3 == cardNumber5)) {
        
        i = i+2;
    }
    else if ((cardNumber1 == cardNumber2) && (cardNumber3 == cardNumber4)) {
        
        i = i+3;
    }
    else if ((cardNumber1 == cardNumber2) && (cardNumber3 == cardNumber5)) {
        
        i = +3;
    }
    else if ((cardNumber1 == cardNumber2) && (cardNumber4 == cardNumber5)) {
        
        i = +3;
    }
    else if ((cardNumber1 == cardNumber3) && (cardNumber2 == cardNumber4)) {
        
        i = +3;
    }
    else if ((cardNumber1 == cardNumber3) && (cardNumber2 == cardNumber5)) {
        
        i = +3;
    }
    else if ((cardNumber1 == cardNumber3) && (cardNumber4 == cardNumber5)) {
        
        i = +3;
    }
    else if ((cardNumber1 == cardNumber4) && (cardNumber2 == cardNumber3)) {
        
        i = +3;
    }
    else if ((cardNumber1 == cardNumber4) && (cardNumber2 == cardNumber4)) {
        
        i = +3;
    }
    else if ((cardNumber1 == cardNumber4) && (cardNumber2 == cardNumber5)) {
        
        i = +3;
    }
    else if ((cardNumber3 == cardNumber4) && (cardNumber3 == cardNumber5)) {
        
        i = +3;
    }
    
    if (i == 0) { //After the above if statement determines the value of i, this statement takes that value and uses it to determine the appropriate statement
        
        System.out.println("You have a high-card hand.");
    }
    else if (i == 1){
        
        System.out.println("You have a pair!");
    }
    else if (i == 2) {
        
        System.out.println("You have a three of a kind!");
    }
    else {
        
        System.out.println("You have two pair!");
    }
    }
}