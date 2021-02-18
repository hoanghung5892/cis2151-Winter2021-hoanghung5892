
package project_2;

// sourced from Professor Eric's github https://github.com/EricCharnesky/CIS2151-Winter2021/blob/main/Project2/src/project2/PokerHand.java 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PokerHand {
    public ArrayList<Card> hand;

    public PokerHand(ArrayList<Card> cards) {
        hand = new ArrayList<Card>(5);
        for (Card card : cards) {
            this.hand.add(card);
        }
        Collections.sort(this.hand);
        for(Card card : hand)
        {
            card.toString();
        }
        System.out.println(hand);
    }

    enum Rank {
        HIGH_CARD, PAIR, TWO_PAIR, THREE_OF_A_KIND,
        STRAIGHT, FLUSH, FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH
    };

    enum Result {
        WIN, DRAW, LOSE
    };

    public Result call(PokerHand otherHand) {
        if (getHandRank().ordinal() > otherHand.getHandRank().ordinal()) {
            return Result.WIN;
        }

        if (getHandRank().ordinal() < otherHand.getHandRank().ordinal()) {
            return Result.LOSE;
        }
        if(getHandRank().ordinal()== otherHand.getHandRank().ordinal())
        {
            if(getHandRank() == Rank.STRAIGHT_FLUSH)
            {
                if(hand.get(4).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.DRAW;
                }
                if(hand.get(4).getFace().ordinal() < otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.LOSE;
                }
                if(hand.get(4).getFace().ordinal() > otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.WIN;
                }                             
            }
            if(getHandRank()== Rank.STRAIGHT)
            {
                if(hand.get(4).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.DRAW;
                }
                if(hand.get(4).getFace().ordinal() < otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.LOSE;
                }
                if(hand.get(4).getFace().ordinal() > otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.WIN;
                }    
            }
            if(getHandRank()== Rank.HIGH_CARD)
            {
                if(hand.get(4).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal() )
                {
                    if(hand.get(3).getFace().ordinal() == otherHand.hand.get(3).getFace().ordinal() )
                    {
                        if(hand.get(2).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal())
                        {
                            if(hand.get(1).getFace().ordinal() == otherHand.hand.get(1).getFace().ordinal())
                            {
                                if(hand.get(0).getFace().ordinal() == otherHand.hand.get(0).getFace().ordinal())
                                {
                                    return Result.DRAW;
                                }
                                if(hand.get(0).getFace().ordinal() > otherHand.hand.get(0).getFace().ordinal())
                                {
                                    return Result.WIN;
                                }
                                else return Result.LOSE;
                            }
                            if(hand.get(1).getFace().ordinal() > otherHand.hand.get(1).getFace().ordinal())
                            {
                                return Result.WIN;
                            }
                            else return Result.LOSE;
                        }
                        if(hand.get(2).getFace().ordinal() > otherHand.hand.get(2).getFace().ordinal())
                        {
                            return Result.WIN;
                        }
                        else return Result.LOSE;
                    }
                    if(hand.get(3).getFace().ordinal() > hand.get(3).getFace().ordinal() )
                    {
                        return Result.WIN;
                    }
                    else return Result.LOSE;
                }
                if((hand.get(4).getFace().ordinal()) > otherHand.hand.get(4).getFace().ordinal() )
                {
                    return Result.WIN;
                }
                else return Result.LOSE;
            }
            if(getHandRank()== Rank.TWO_PAIR)
            {
                if(hand.get(4).getFace().ordinal()==hand.get(3).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal()== otherHand.hand.get(3).getFace().ordinal()
                    && hand.get(4).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal())
                {
                    if(hand.get(2).getFace().ordinal()==hand.get(1).getFace().ordinal() && otherHand.hand.get(2).getFace().ordinal()== otherHand.hand.get(1).getFace().ordinal()
                    && hand.get(2).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal())
                    {
                       if(hand.get(0).getFace().ordinal() == otherHand.hand.get(0).getFace().ordinal())
                       {
                           return Result.DRAW;
                       }
                        if(hand.get(0).getFace().ordinal() > otherHand.hand.get(0).getFace().ordinal())
                       {
                           return Result.WIN;
                       }
                        else return Result.LOSE;
                    }
                    if(hand.get(2).getFace().ordinal()==hand.get(1).getFace().ordinal() && otherHand.hand.get(2).getFace().ordinal()== otherHand.hand.get(1).getFace().ordinal()
                        && hand.get(2).getFace().ordinal() < otherHand.hand.get(2).getFace().ordinal())
                    {
                        return Result.LOSE;
                    }
                }
                if(hand.get(4).getFace().ordinal()==hand.get(3).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal()== otherHand.hand.get(3).getFace().ordinal()
                    && hand.get(4).getFace().ordinal() > otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.WIN;
                }
                if(hand.get(4).getFace().ordinal()==hand.get(3).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal()== otherHand.hand.get(3).getFace().ordinal()
                    && hand.get(4).getFace().ordinal() < otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.LOSE;
                }
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(3).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal()
                      && hand.get(3).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal()   )
                {
                    if(hand.get(1).getFace().ordinal() == hand.get(0).getFace().ordinal() && otherHand.hand.get(1).getFace().ordinal() == otherHand.hand.get(0).getFace().ordinal()
                        && hand.get(1).getFace().ordinal() == otherHand.hand.get(1).getFace().ordinal()   )
                    {
                        return Result.DRAW;
                    }
                      if(hand.get(1).getFace().ordinal() == hand.get(0).getFace().ordinal() && otherHand.hand.get(1).getFace().ordinal() == otherHand.hand.get(0).getFace().ordinal()
                        && hand.get(1).getFace().ordinal() > otherHand.hand.get(1).getFace().ordinal()   )
                    {
                        return Result.WIN;
                    }
                      else return Result.LOSE;
                }
                
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(3).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal()
                      && hand.get(3).getFace().ordinal() > otherHand.hand.get(2).getFace().ordinal()   )
                {
                    return Result.WIN;
                }
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(3).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal()
                      && hand.get(3).getFace().ordinal() < otherHand.hand.get(2).getFace().ordinal()   )
                {
                    return Result.LOSE;
                }
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal() == otherHand.hand.get(3).getFace().ordinal()
                        && hand.get(3).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal())
                {
                       if(hand.get(1).getFace().ordinal() == hand.get(0).getFace().ordinal() && otherHand.hand.get(2).getFace().ordinal() == otherHand.hand.get(1).getFace().ordinal()
                            && hand.get(3).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal())
                       {
                           return Result.WIN;
                           // the cards always get sorted before the compare. Therefore, hand.get(4).getFace().ordinal()
                           // alway larger than otherHand.hand.getFace().ordinal() . 
                       }
                        if(hand.get(1).getFace().ordinal() == hand.get(0).getFace().ordinal() && otherHand.hand.get(2).getFace().ordinal() == otherHand.hand.get(1).getFace().ordinal()
                            && hand.get(3).getFace().ordinal() > otherHand.hand.get(4).getFace().ordinal())
                       {
                           return Result.WIN;
                       }
                        if(hand.get(1).getFace().ordinal() == hand.get(0).getFace().ordinal() && otherHand.hand.get(2).getFace().ordinal() == otherHand.hand.get(1).getFace().ordinal()
                            && hand.get(3).getFace().ordinal() < otherHand.hand.get(4).getFace().ordinal())
                       {
                           return Result.LOSE;
                       }
                }
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal() == otherHand.hand.get(3).getFace().ordinal()
                        && hand.get(3).getFace().ordinal() > otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.WIN;
                }
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal() == otherHand.hand.get(3).getFace().ordinal()
                        && hand.get(3).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal())
                {
                    return Result.LOSE;
                }
            }
            if(getHandRank()== Rank.PAIR)
            {
                if(hand.get(4).getFace().ordinal()== hand.get(3).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal()== otherHand.hand.get(3).getFace().ordinal()
                     && hand.get(4).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal()   )
                {
                     if(hand.get(2).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal()   )
                     {
                         if(hand.get(1).getFace().ordinal()== otherHand.hand.get(1).getFace().ordinal())
                         {
                             if(hand.get(0).getFace().ordinal()== otherHand.hand.get(0).getFace().ordinal())
                             {
                                 return Result.DRAW;
                             }
                             if(hand.get(0).getFace().ordinal()== otherHand.hand.get(0).getFace().ordinal())
                             {
                                 return Result.WIN;
                             }else return Result.LOSE;
                         }
                         if(hand.get(1).getFace().ordinal() > otherHand.hand.get(1).getFace().ordinal())
                         {
                             return Result.WIN;
                         }
                         if(hand.get(1).getFace().ordinal() < otherHand.hand.get(1).getFace().ordinal())
                         {
                             return Result.LOSE;
                         }
                     }
                     if(hand.get(2).getFace().ordinal() > otherHand.hand.get(2).getFace().ordinal()   )
                     {
                         return Result.WIN;
                     }else return Result.LOSE;
                }
                if(hand.get(4).getFace().ordinal()== hand.get(3).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal()== otherHand.hand.get(3).getFace().ordinal()
                     && hand.get(4).getFace().ordinal() > otherHand.hand.get(4).getFace().ordinal()   )
                {
                    return Result.WIN;
                }
                if(hand.get(4).getFace().ordinal()== hand.get(3).getFace().ordinal() && otherHand.hand.get(4).getFace().ordinal()== otherHand.hand.get(3).getFace().ordinal()
                     && hand.get(4).getFace().ordinal() < otherHand.hand.get(4).getFace().ordinal()   )
                {
                    return Result.LOSE;
                }
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(3).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal()
                        && hand.get(3).getFace().ordinal() == otherHand.hand.get(3).getFace().ordinal())
                {
                        if(hand.get(1).getFace().ordinal() == hand.get(0).getFace().ordinal() && otherHand.hand.get(1).getFace().ordinal() == otherHand.hand.get(0).getFace().ordinal()
                            && hand.get(1).getFace().ordinal() == otherHand.hand.get(1).getFace().ordinal())
                        {
                            if(hand.get(4).getFace().ordinal() == otherHand.hand.get(4).getFace().ordinal())
                            {
                                return Result.DRAW;
                            }
                            if(hand.get(4).getFace().ordinal() > otherHand.hand.get(4).getFace().ordinal())
                            {
                                return Result.WIN;
                            }
                            else return Result.LOSE;
                            
                        }
                        if(hand.get(1).getFace().ordinal() == hand.get(0).getFace().ordinal() && otherHand.hand.get(1).getFace().ordinal() == otherHand.hand.get(0).getFace().ordinal()
                            && hand.get(1).getFace().ordinal() > otherHand.hand.get(1).getFace().ordinal())
                        {
                            return Result.WIN;
                        }
                        if(hand.get(1).getFace().ordinal() == hand.get(0).getFace().ordinal() && otherHand.hand.get(1).getFace().ordinal() == otherHand.hand.get(0).getFace().ordinal()
                            && hand.get(1).getFace().ordinal() < otherHand.hand.get(1).getFace().ordinal())
                        {
                            return Result.LOSE;
                        }
                }
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(3).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal()
                        && hand.get(3).getFace().ordinal() > otherHand.hand.get(3).getFace().ordinal())
                {
                    return Result.WIN;
                }
                if(hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() && otherHand.hand.get(3).getFace().ordinal() == otherHand.hand.get(2).getFace().ordinal()
                        && hand.get(3).getFace().ordinal() < otherHand.hand.get(3).getFace().ordinal())
                {
                    return Result.LOSE;
                }
            }
        }
        return Result.DRAW;
    }

    public Rank getHandRank() {
        if (isStraightFlush()) {          
            return Rank.STRAIGHT_FLUSH;
        }
        if (isFourOfAKind()) {
            return Rank.FOUR_OF_A_KIND;
        }
        if (isFullHouse()) {
            return Rank.FULL_HOUSE;
        }
        if(isFlush())
        {
            return Rank.FLUSH;
        }
        if(isStraight())
        {
            return Rank.STRAIGHT;
        }
        if(isThreeOfAKind())
        {
            return Rank.THREE_OF_A_KIND;
        }
        if(isTwoPair())
        {
            return Rank.TWO_PAIR;
        }
        if (isPair())
        {
            return Rank.PAIR;
        }
        return Rank.HIGH_CARD;
    }

    public boolean isStraightFlush() {

       if( hand.get(0).getSuit().ordinal() == hand.get(1).getSuit().ordinal() && hand.get(1).getSuit().ordinal() == hand.get(2).getSuit().ordinal()
               && hand.get(2).getSuit().ordinal() == hand.get(3).getSuit().ordinal() &&hand.get(3).getSuit().ordinal() == hand.get(4).getSuit().ordinal())
            {
           if(hand.get(0).getFace().ordinal()+1== (hand.get(1).getFace().ordinal()) &&hand.get(1).getFace().ordinal()+1== hand.get(2).getFace().ordinal()
                   &&hand.get(2).getFace().ordinal()+1== hand.get(3).getFace().ordinal()&&hand.get(3).getFace().ordinal()+1== hand.get(4).getFace().ordinal())
           {
                return true;
           }
                return false;
            }
        return false;     
    }

    public boolean isFourOfAKind() {
      
        int cp1,cp2,cp3,cp4,cp5;
        cp1 = hand.get(0).getFace().ordinal();
        cp2 = hand.get(1).getFace().ordinal();
        cp3 = hand.get(2).getFace().ordinal();
        cp4 = hand.get(3).getFace().ordinal();
        cp5 = hand.get(4).getFace().ordinal();
        if(cp1== cp2 && cp1 == cp3 && cp1 == cp4 || cp1 == cp2 && cp1 == cp3 && cp1 == cp5 ||cp2== cp1 && cp2 == cp3 && cp2 == cp4 || cp2 == cp1 && cp2 == cp3 && cp2 == cp5 ||
                cp3 == cp1 && cp3 ==cp2 && cp3 == cp4 || cp3 == cp1 && cp3 ==cp2 && cp3 == cp5 || cp4 == cp1 && cp4 == cp2 & cp4 ==cp3 ||cp4 == cp1 && cp4 == cp2 & cp4 ==cp5)
        {
            return true;
        }
        
        return false;
    }

    public boolean isFullHouse() {
         if (hand.get(0).getFace().ordinal() == hand.get(1).getFace().ordinal() && hand.get(0).getFace().ordinal() == hand.get(2).getFace().ordinal() && 
                 hand.get(2).getFace().ordinal() != hand.get(3).getFace().ordinal()&&  hand.get(3).getFace().ordinal() == hand.get(4).getFace().ordinal() )      
                 {
                     return true;
                 }
        return false;
    }

    public boolean isFlush() {
        if( hand.get(0).getSuit().ordinal() == hand.get(1).getSuit().ordinal() && hand.get(1).getSuit().ordinal() == hand.get(2).getSuit().ordinal()
          && hand.get(2).getSuit().ordinal() == hand.get(3).getSuit().ordinal() &&hand.get(3).getSuit().ordinal() == hand.get(4).getSuit().ordinal())
       {
           return true;
       }
        return false;
    }
    public boolean isStraight() {
        if(hand.get(0).getFace().ordinal()+1== (hand.get(1).getFace().ordinal()) &&hand.get(1).getFace().ordinal()+1== hand.get(2).getFace().ordinal()
                   &&hand.get(2).getFace().ordinal()+1== hand.get(3).getFace().ordinal()&&hand.get(3).getFace().ordinal()+1== hand.get(4).getFace().ordinal())
           {
               return true;
    }
        return false;
    }

    public boolean isThreeOfAKind() {

         if (hand.get(4).getFace().ordinal() == hand.get(3).getFace().ordinal() && hand.get(4).getFace().ordinal() == hand.get(2).getFace().ordinal() && 
                 hand.get(1).getFace().ordinal() != hand.get(0).getFace().ordinal() ||  hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() 
                 &&hand.get(3).getFace().ordinal() == hand.get(1).getFace().ordinal() && hand.get(0).getFace().ordinal() != hand.get(4).getFace().ordinal()
                 || hand.get(2).getFace().ordinal() == hand.get(1).getFace().ordinal() && hand.get(2).getFace().ordinal() == hand.get(0).getFace().ordinal()
                 &&hand.get(3).getFace().ordinal() != hand.get(4).getFace().ordinal())      
                 {
                     return true;
                 }
                
        return false;
    }
    public boolean isTwoPair() {
        if(hand.get(0).getFace().ordinal() == hand.get(1).getFace().ordinal() && hand.get(2).getFace().ordinal() ==hand.get(3).getFace().ordinal() && hand.get(1).getFace().ordinal() !=hand.get(2).getFace().ordinal())
        {
            return true;
        }
        return false;
    }

    public boolean isPair() {
        if(hand.get(4).getFace().ordinal() == hand.get(3).getFace().ordinal() || hand.get(4).getFace().ordinal() == hand.get(2).getFace().ordinal() ||
                hand.get(4).getFace().ordinal() == hand.get(1).getFace().ordinal() || hand.get(0).getFace().ordinal() == hand.get(4).getFace().ordinal()
            || hand.get(3).getFace().ordinal() == hand.get(2).getFace().ordinal() || hand.get(3).getFace().ordinal() == hand.get(1).getFace().ordinal()
                || hand.get(3).getFace().ordinal() == hand.get(0).getFace().ordinal() || hand.get(2).getFace().ordinal() == hand.get(1).getFace().ordinal()
                || hand.get(0).getFace().ordinal() == hand.get(1).getFace().ordinal())
        {
            return true;
        }
        return false;    
    }
    public boolean isHighCard()
    {
        if(hand.get(4).getFace().ordinal() != hand.get(3).getFace().ordinal() && hand.get(3).getFace().ordinal() != hand.get(2).getFace().ordinal()
                && hand.get(2).getFace().ordinal() != hand.get(1).getFace().ordinal() && hand.get(1).getFace().ordinal() != hand.get(0).getFace().ordinal()
                && hand.get(4).getSuit().ordinal() != hand.get(2).getSuit().ordinal())
        {
            return true;
        }
        return false;
    }
    
}
