/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import project_2.Card.Face;
import project_2.Card.Suit;

public class PokerHandNGTest {
    
    public PokerHandNGTest() {
    }
    public ArrayList<Card> hand;
    @Test
    public void testIsStraightFlush_TRUE() {  
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TWO,Suit.SPADES));
        hand.add(1, new Card(Face.THREE,Suit.SPADES));
        hand.add(2, new Card(Face.FOUR,Suit.SPADES));
        hand.add(3, new Card(Face.FIVE,Suit.SPADES));
        hand.add(4, new Card(Face.SIX, Suit.SPADES));
        PokerHand hand_test = new PokerHand(hand);  
        boolean expResult = true;
        boolean result = hand_test.isStraightFlush();
        assertEquals(expResult, result);
        System.out.println(hand);
    }
    @Test
    public void testIsStraightFlush_False() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TWO,Suit.SPADES));
        hand.add(1, new Card(Face.THREE,Suit.SPADES));
        hand.add(2, new Card(Face.FOUR,Suit.SPADES));
        hand.add(3, new Card(Face.FIVE,Suit.SPADES));
        hand.add(4, new Card(Face.NINE, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand);  
        boolean expResult = false;
        boolean result = hand_test.isStraightFlush();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFourOfAKind_True() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.FOUR,Suit.CLUBS));
        hand.add(1, new Card(Face.FOUR,Suit.SPADES));
        hand.add(2, new Card(Face.FOUR,Suit.HEARTS));
        hand.add(3, new Card(Face.FOUR,Suit.DIAMONDS));
        hand.add(4, new Card(Face.NINE, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand);  
        boolean expResult = true;
        boolean result = hand_test.isFourOfAKind();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsFourOfAKind_False() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.FOUR,Suit.CLUBS));
        hand.add(1, new Card(Face.ACE,Suit.SPADES));
        hand.add(2, new Card(Face.FOUR,Suit.HEARTS));
        hand.add(3, new Card(Face.FOUR,Suit.DIAMONDS));
        hand.add(4, new Card(Face.NINE, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand);  
        boolean expResult = false;
        boolean result = hand_test.isFourOfAKind();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFullHouse_True() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.FOUR,Suit.CLUBS));
        hand.add(1, new Card(Face.NINE,Suit.SPADES));
        hand.add(2, new Card(Face.FOUR,Suit.HEARTS));
        hand.add(3, new Card(Face.FOUR,Suit.DIAMONDS));
        hand.add(4, new Card(Face.NINE, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand);  
        boolean expResult = true;
        boolean result = hand_test.isFullHouse();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsFullHouse_False() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.FOUR,Suit.CLUBS));
        hand.add(1, new Card(Face.NINE,Suit.SPADES));
        hand.add(2, new Card(Face.FOUR,Suit.HEARTS));
        hand.add(3, new Card(Face.FOUR,Suit.DIAMONDS));
        hand.add(4, new Card(Face.ACE, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand);  
        boolean expResult = false;
        boolean result = hand_test.isFullHouse();
        assertEquals(expResult, result);
    }


    @Test
    public void testIsFlush_True() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.FOUR,Suit.CLUBS));
        hand.add(1, new Card(Face.NINE,Suit.CLUBS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.JACK,Suit.CLUBS));
        hand.add(4, new Card(Face.ACE, Suit.CLUBS));
        PokerHand hand_test = new PokerHand(hand);  
        boolean expResult = true;
        boolean result = hand_test.isFlush();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsFlush_False() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.FOUR,Suit.CLUBS));
        hand.add(1, new Card(Face.NINE,Suit.CLUBS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.JACK,Suit.CLUBS));
        hand.add(4, new Card(Face.ACE, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = false;
        boolean result = hand_test.isFlush();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsStraight_False() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.NINE,Suit.CLUBS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.JACK,Suit.CLUBS));
        hand.add(4, new Card(Face.ACE, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = false;
        boolean result = hand_test.isStraight();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsStraight_True() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.NINE,Suit.CLUBS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.JACK,Suit.CLUBS));
        hand.add(4, new Card(Face.KING, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = true;
        boolean result = hand_test.isStraight();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsThreeOfAKind_true() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.QUEEN,Suit.DIAMONDS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.QUEEN,Suit.HEARTS));
        hand.add(4, new Card(Face.KING, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = true;
        boolean result = hand_test.isThreeOfAKind();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsThreeOfAKind_false() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.QUEEN,Suit.DIAMONDS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.ACE,Suit.HEARTS));
        hand.add(4, new Card(Face.KING, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = false;
        boolean result = hand_test.isThreeOfAKind();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsTwoPair_false() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.QUEEN,Suit.DIAMONDS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.ACE,Suit.HEARTS));
        hand.add(4, new Card(Face.KING, Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = false;
        boolean result = hand_test.isTwoPair();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsTwoPair_true() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.QUEEN,Suit.DIAMONDS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.ACE,Suit.HEARTS));
        hand.add(4, new Card(Face.TEN,Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = true;
        boolean result = hand_test.isTwoPair();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPair_true() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.QUEEN,Suit.DIAMONDS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.ACE,Suit.HEARTS));
        hand.add(4, new Card(Face.EIGHT,Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = true;
        boolean result = hand_test.isPair();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsPair_false() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.FOUR,Suit.DIAMONDS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.ACE,Suit.HEARTS));
        hand.add(4, new Card(Face.EIGHT,Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = false;
        boolean result = hand_test.isPair();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsHighCard_true() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.FOUR,Suit.DIAMONDS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.ACE,Suit.HEARTS));
        hand.add(4, new Card(Face.EIGHT,Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = true;
        boolean result = hand_test.isHighCard();
        assertEquals(result, expResult);
    }
    @Test
    public void testIsHighCard_false() {
        hand = new ArrayList<>(5);
        hand.add(0, new Card(Face.TEN,Suit.CLUBS));
        hand.add(1, new Card(Face.ACE,Suit.DIAMONDS));
        hand.add(2, new Card(Face.QUEEN,Suit.CLUBS));
        hand.add(3, new Card(Face.ACE,Suit.HEARTS));
        hand.add(4, new Card(Face.EIGHT,Suit.DIAMONDS));
        PokerHand hand_test = new PokerHand(hand); 
        boolean expResult = false;
        boolean result = hand_test.isHighCard();
        assertEquals(result, expResult);
    }
    
}