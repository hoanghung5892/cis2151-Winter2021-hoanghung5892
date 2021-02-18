
package project_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Project_2 {
    
    public static void main(String[] args) {       
    double user_balance = 100.0;
    double comp_balance = 100.0;  
   do{   
        DeckOfCards deck = new DeckOfCards();
        ArrayList computerCards = new ArrayList();
        ArrayList UserCards = new ArrayList();
        for (int i = 0; i < 10; i++)
        {
            if(i < 5)
            {
                computerCards.add(deck.getRandomCard());
            }
            if (i >=5 && i<10)
            {
                UserCards.add(deck.getRandomCard());
            }
            
        }

        System.out.println();
        System.out.print("User cards: ");
        PokerHand user = new PokerHand(UserCards);
        System.out.print("Computer cards: ");
        PokerHand comp = new PokerHand(computerCards);

        double pot_win = 2.0;
        Random random = new Random();
        System.out.println("Press 1 if you want to raise and 2 for fold.");
        Scanner keyboard = new Scanner(System.in);
        int user_input = Integer.parseInt(keyboard.nextLine());
        if(user_input == 1)
        {
            pot_win = pot_win + 1;
            user_balance = user_balance - 1;
            int randomIndex = random.nextInt(2);
            if(randomIndex == 0)
            {
                System.out.println("Computer decided to fold.");
                System.out.println("User get the win_pot : $"+pot_win+ " The blance is: $"+(user_balance+pot_win));
            }
            if(randomIndex ==1)
            {   
                int randomMoneyBet = random.nextInt(50);
                pot_win = pot_win + randomMoneyBet;
                comp_balance = comp_balance - randomMoneyBet;
                System.out.println("Computer decided to raise the amount $"+randomMoneyBet);
                System.out.println("User rank :"+user.getHandRank());
                System.out.println("Comp rank :"+comp.getHandRank());
                System.out.println("Press 1 if you want to call and 2 fold.");
                int user_input_second = Integer.parseInt(keyboard.nextLine());
                if(user_input_second == 1)
                {    
                    pot_win = pot_win + randomMoneyBet;
                    user_balance = user_balance - randomMoneyBet;
                    if(user.call(comp) == PokerHand.Result.WIN)
                    {                        
                        System.out.println("User "+user.call(comp)+" Win_pot is  $"+pot_win);
                        user_balance = user_balance + pot_win;
                        System.out.println("User Balance: $"+user_balance);
                        System.out.println("Comp Balance: $"+comp_balance);
                    }
                    if(user.call(comp) == PokerHand.Result.LOSE)
                    {             
                        
                        System.out.println("User "+user.call(comp)+" Win_pot is  $"+pot_win);
                        comp_balance = comp_balance + pot_win;
                        System.out.println("User Balance: $"+user_balance);
                        System.out.println("Comp Balance: $"+comp_balance);
                    }
                    if(user.call(comp) == PokerHand.Result.DRAW)
                    {
                        user_balance = user_balance +pot_win/2;
                        comp_balance = comp_balance + pot_win/2;
                        System.out.println("User "+user.call(comp)+" Win_pot is $"+pot_win);
                        System.out.println("User Balance: $"+(user_balance));
                        System.out.println("Comp Balance: $"+comp_balance);
                    }
                }
                if (user_input_second == 2)
                {
                    System.out.println("User decided to fold");
                    System.out.println("Computer get the win_pot $"+pot_win+" Comp Balance : $"+(comp_balance+pot_win));
                }
        }
                             
        
        }
        if(user_input == 2)
        {
            System.out.println("User decided to fold.");
            System.out.println("Computer get the win_pot $"+pot_win+"\nComp Balance : $"+(comp_balance + pot_win));
            
        }  
 } while (comp_balance > 1 && user_balance > 1);
   if(comp_balance <1)
   {
       System.out.println("Computer run out of money");
       
   }
      if(user_balance <1)
   {
       System.out.println("You run out of money");
       
   }
    }
}

   
