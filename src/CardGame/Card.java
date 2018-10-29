package CardGame;

import java.util.Scanner;

/**
 * Name:
 * Date:
 * Period:
 *
 * CardGame.Card.java
 *
 * Represents a Card with a face and a suit.
 */

public class Card
{
    private String face;
    private String suit;
    private int value;

    public Card (String cardFace, String cardSuit)
    {
        face = cardFace;
        suit = cardSuit;
        if(face.equals("Ace")){
            value = 0;
        }
        if(face.equals("Deuce")){
            value = 2;
        }
        if(face.equals("Three")){
            value = 3;
        }
        if(face.equals("Four")){
            value = 4;
        }
        if(face.equals("Five")){
            value = 5;
        }
        if(face.equals("Six")){
            value = 6;
        }
        if(face.equals("Seven")){
            value = 7;
        }
        if(face.equals("Eight")){
            value = 8;
        }
        if(face.equals("Nine")){
            value = 9;
        }
        if(face.equals("Ten")){
            value = 10;
        }
        if(face.equals("Jack")){
            value = 10;
        }
        if(face.equals("Queen")){
            value = 10;
        }
        if(face.equals("King")){
            value = 10;
        }

    }

    public String toString()
    {
        return ("|" + face + suit + "|");
    }

    public String getFace() {
        return face;
    }
    
    public String getSuit() {
        return suit;
    }

    public int getValue(){return value;}

}
