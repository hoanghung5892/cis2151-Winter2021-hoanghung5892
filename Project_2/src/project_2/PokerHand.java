
package project_2;

// sourced from Professor Eric's github https://github.com/EricCharnesky/CIS2151-Winter2021/blob/main/Project2/src/project2/PokerHand.java 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PokerHand {
    private ArrayList<Card> cards;

    public PokerHand(ArrayList<Card> cards) {
        for (Card card : cards) {
            this.cards.add(new Card(card));
        }
        Collections.sort(this.cards);
        System.out.println(cards);
    }

        public Object getRandomCard()
    {
        Random random = new Random();     
        int randomIndex = random.nextInt(cards.size());
        Object randomElement = cards.get(randomIndex);
        cards.remove(randomElement);
        return randomElement;
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
                if(cards.get(4).getFace().ordinal() == otherHand.cards.get(4).getFace().ordinal())
                {
                    return Result.DRAW;
                }
                if(cards.get(4).getFace().ordinal() < otherHand.cards.get(4).getFace().ordinal())
                {
                    return Result.LOSE;
                }
                if(cards.get(4).getFace().ordinal() > otherHand.cards.get(4).getFace().ordinal())
                {
                    return Result.WIN;
                }                             
            }
            if(getHandRank()== Rank.STRAIGHT)
            {
                if(cards.get(4).getFace().ordinal() == otherHand.cards.get(4).getFace().ordinal())
                {
                    return Result.DRAW;
                }
                if(cards.get(4).getFace().ordinal() < otherHand.cards.get(4).getFace().ordinal())
                {
                    return Result.LOSE;
                }
                if(cards.get(4).getFace().ordinal() > otherHand.cards.get(4).getFace().ordinal())
                {
                    return Result.WIN;
                }    
            }
            if(getHandRank()== Rank.HIGH_CARD)
            {
                if(cards.get(4).getFace().ordinal() == otherHand.cards.get(4).getFace().ordinal() )
                {
                    if(cards.get(3).getFace().ordinal() == otherHand.cards.get(3).getFace().ordinal() )
                    {
                        if(cards.get(2).getFace().ordinal() == otherHand.cards.get(2).getFace().ordinal())
                        {
                            if(cards.get(1).getFace().ordinal() == otherHand.cards.get(1).getFace().ordinal())
                            {
                                if(cards.get(0).getFace().ordinal() == otherHand.cards.get(0).getFace().ordinal())
                                {
                                    return Result.DRAW;
                                }
                                if(cards.get(0).getFace().ordinal() > otherHand.cards.get(0).getFace().ordinal())
                                {
                                    return Result.WIN;
                                }
                                else return Result.LOSE;
                            }
                            if(cards.get(1).getFace().ordinal() > otherHand.cards.get(1).getFace().ordinal())
                            {
                                return Result.WIN;
                            }
                            else return Result.LOSE;
                        }
                        if(cards.get(2).getFace().ordinal() > otherHand.cards.get(2).getFace().ordinal())
                        {
                            return Result.WIN;
                        }
                        else return Result.LOSE;
                    }
                    if(cards.get(3).getFace().ordinal() > cards.get(3).getFace().ordinal() )
                    {
                        return Result.WIN;
                    }
                    else return Result.LOSE;
                }
                if((cards.get(4).getFace().ordinal()) > otherHand.cards.get(4).getFace().ordinal() )
                {
                    return Result.WIN;
                }
                else return Result.LOSE;
            }
        }

        // TIE BREAK!!! - figure out which rank and tie break
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

    private boolean isStraightFlush() {
       if(isStraight())
       {
       if( cards.get(0).getSuit().ordinal() == cards.get(1).getSuit().ordinal() && cards.get(1).getSuit().ordinal() == cards.get(2).getSuit().ordinal()
               && cards.get(2).getSuit().ordinal() == cards.get(3).getSuit().ordinal() &&cards.get(3).getSuit().ordinal() == cards.get(4).getSuit().ordinal())
            {
//           if(cards.get(0).getFace().ordinal()+1== (cards.get(1).getFace().ordinal()) &&cards.get(1).getFace().ordinal()+1== cards.get(2).getFace().ordinal()
//                   &&cards.get(2).getFace().ordinal()+1== cards.get(3).getFace().ordinal()&&cards.get(3).getFace().ordinal()+1== cards.get(4).getFace().ordinal())
//           {
//               return true;
//           }
            return true;
            }return false;
       }
        
        return false;
    }

    private boolean isFourOfAKind() {
      
        int cp1,cp2,cp3,cp4,cp5;
        cp1 = cards.get(0).getFace().ordinal();
        cp2 = cards.get(1).getFace().ordinal();
        cp3 = cards.get(2).getFace().ordinal();
        cp4 = cards.get(3).getFace().ordinal();
        cp5 = cards.get(4).getFace().ordinal();
        if(cp1== cp2 && cp1 == cp3 && cp1 == cp4 || cp1 == cp2 && cp1 == cp3 && cp1 == cp5 ||cp2== cp1 && cp2 == cp3 && cp2 == cp4 || cp2 == cp1 && cp2 == cp3 && cp2 == cp5 ||
                cp3 == cp1 && cp3 ==cp2 && cp3 == cp4 || cp3 == cp1 && cp3 ==cp2 && cp3 == cp5 || cp4 == cp1 && cp4 == cp2 & cp4 ==cp3 ||cp4 == cp1 && cp4 == cp2 & cp4 ==cp5)
        {
            return true;
        }
        
        return false;
    }

    private boolean isFullHouse() {
         if (cards.get(0).getFace().ordinal() == cards.get(1).getFace().ordinal() && cards.get(0).getFace().ordinal() == cards.get(2).getFace().ordinal() && 
                 cards.get(2).getFace().ordinal() != cards.get(3).getFace().ordinal()&&  cards.get(3).getFace().ordinal() == cards.get(4).getFace().ordinal() )      
                 {
                     return true;
                 }
        return false;
    }

    private boolean isFlush() {
        if( cards.get(0).getSuit().ordinal() == cards.get(1).getSuit().ordinal() && cards.get(1).getSuit().ordinal() == cards.get(2).getSuit().ordinal()
          && cards.get(2).getSuit().ordinal() == cards.get(3).getSuit().ordinal() &&cards.get(3).getSuit().ordinal() == cards.get(4).getSuit().ordinal())
       {
           return true;
       }
        return false;
    }
    private boolean isStraight() {
        if(cards.get(0).getFace().ordinal()+1== (cards.get(1).getFace().ordinal()) &&cards.get(1).getFace().ordinal()+1== cards.get(2).getFace().ordinal()
                   &&cards.get(2).getFace().ordinal()+1== cards.get(3).getFace().ordinal()&&cards.get(3).getFace().ordinal()+1== cards.get(4).getFace().ordinal())
           {
               return true;
    }
        return false;
    }

    private boolean isThreeOfAKind() {

         if (cards.get(0).getFace().ordinal() == cards.get(1).getFace().ordinal() && cards.get(0).getFace().ordinal() == cards.get(2).getFace().ordinal() && 
                 cards.get(2).getFace().ordinal() != cards.get(3).getFace().ordinal()&&  cards.get(3).getFace().ordinal() != cards.get(4).getFace().ordinal() )      
                 {
                     return true;
                 }
                
        return false;
    }
    private boolean isTwoPair() {
        if(cards.get(0).getFace().ordinal() == cards.get(1).getFace().ordinal() && cards.get(2).getFace().ordinal() ==cards.get(3).getFace().ordinal() && cards.get(1).getFace().ordinal() !=cards.get(2).getFace().ordinal())
        {
            return true;
        }
        return false;
    }

    private boolean isPair() {
        if(cards.get(0).getFace().ordinal() == cards.get(1).getFace().ordinal() || cards.get(0).getFace().ordinal() == cards.get(2).getFace().ordinal() ||
                cards.get(0).getFace().ordinal() == cards.get(3).getFace().ordinal() || cards.get(0).getFace().ordinal() == cards.get(4).getFace().ordinal())
        {
            return true;
        }
        return false;    
    }
    
}
