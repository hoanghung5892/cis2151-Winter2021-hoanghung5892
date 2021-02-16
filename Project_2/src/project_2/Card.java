
package project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Card implements Comparable<Card>{





    enum Suit { SPACES, CLUBS, HEARTS, DIAMONDS}
    enum Face { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }
    public Suit suit;
    public Face face;
    
    public Card(Face face, Suit suit)
    {
        this.suit = suit;
        this.face = face;
    }
    Card(Card card)
    {   
        //Copy constructor
        suit = card.suit;
        face = card.face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public int compareTo(Card other) {
        return face.ordinal() - other.face.ordinal();
        
    }
    }

    
