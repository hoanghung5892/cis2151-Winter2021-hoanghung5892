
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Hung
 */
public class Racing_carts implements Items {
    public static void main (String[]args)
    {
        Light_Carts lightCart = new Light_Carts(298,52,100,32,"");
        Heavy_Carts heavyCart = new Heavy_Carts(302,48,100,28,"");
        Motorcycles motorcycles = new Motorcycles(303,53,100,33,"");
        ArrayList<Base_Cart> Carts = new ArrayList<>();
        Carts.add(0, lightCart);
        Carts.add(1, heavyCart);
        Carts.add(2, motorcycles);
    }

    @Override
    public void use(Base_Cart carts, Track track) {
        
    }
    enum Item{MUSHROOM, SHELL, BANANA}
}
