//Cse 2 Hw 10
//Created on October 31st, 2015, by John Kelly
//The purpose of this code is to draw five cards from a deck at random through the use of arrays

import java.util.Scanner; //import scanner

public class Shuffling{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] suitNames={"C","H","S","D"}; //suits club, heart, spade or diamond   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; //ranks of the cards in the 
    String[] cards = new String[52]; //52 cards a deck
    String[] hand = new String[5]; //5 cards in a hand
    for (int i=0; i<52; i++){
      cards[i]=rankNames[i%13]+suitNames[i/13];
      System.out.print(cards[i]+" ");
    }
    printArray(cards); //calls upon the printArray method
    shuffleList(cards); //calls upon the shuffle list method
    System.out.println(""); //move to next line
    System.out.println("Shuffled");
    printArray(cards); //calls upon the printArray method again, after the cards have been shuffled
    hand = randomizeHand(cards); //randomizes the cards in the user's hand
    System.out.println(""); //move to next line
    System.out.println("Randomized Hand!");
    printArray(hand); //calls upon the printArray method again, after the hand has been randomized
    System.out.println(""); //move to next line
  }
  public static void printArray(String[] mycard) {
    
     for (int i=0; i<mycard.length; i++){
      System.out.print(mycard[i]+" ");
    }
  }
  
   public static void shuffleList(String[] myCards) {
    int [] x = new int[5];
    String temp = ""; //empty string for swap
    for (int j = 0; j < 80; j++) { //Shuffles the cards using a for-loop and random numbers. The number "80" is arbitrary; the deck shuffles 80 times 
      x = (int) (Math.random()*50)+1;
      
      //The next three lines swap temp with myCard2, with the purpose of making myCard2 equal to the values calculated above
      temp = myCard2[0];
      myCard2[0] = myCard2[x];
      myCard2[x] = temp;
      
    }
  }
  public static String[] randomizeHand(String[] myList){
    String [] hand = new String[5];
    for (int k = 0; k < hand.length; k++) { //for loop draws five cards
      hand[k] = myList[(int)(Math.random()*5)+1]
      System.out.print(hand[k] + " ");
    }
    
    return hand; // returns hand to the main method
    
    }
  }