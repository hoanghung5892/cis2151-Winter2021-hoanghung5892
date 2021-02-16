
package project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Project_2 {
    
    public static void main(String[] args) {       
        Card Cr1 = new Card();
        Cr1.printCard();
        Random r = new Random();
        int randomIndex = r.nextInt(Cr1.getSize());
        Cr1.getRandomCard(randomIndex);
        
        
        
    }
}

   
