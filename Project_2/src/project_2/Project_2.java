
package project_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Project_2 {
    
    public static void main(String[] args) {       

        DeckOfCards deck = new DeckOfCards();
        //System.out.println(deck.getRandomCard());
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

        System.out.println("Computer Cards are :"+computerCards);
        System.out.println("User Cards are :"+UserCards);

        

         
         
         
         
        
    }
}

   
