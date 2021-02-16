
package project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Card implements Comparable<Card>{


    enum Suit { Spades, Clubs, Hearts, Diamonds}
    enum Face { Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace }
    enum Rank { HighCard, OnePair, TwoPair, ThreeOfAKind, Straight, Flush, FullHouse, FourOfAKind, StraightFlush}
    public Suit suit;
    public Face face;
    private Rank rank;
    public ArrayList Card;
    
    public Card(Face face, Suit suit)
    {
        this.suit = suit;
        this.face = face;
    }

    public String getRandomCard(int a){
        List<String> Card_1 = new ArrayList<>();
        String randomElement = Card_1.get(a);
        return randomElement;
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

    
