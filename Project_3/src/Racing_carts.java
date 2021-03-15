
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
        ArrayList<Carts> carts = new ArrayList<>();
        carts.add(lightCart);
        carts.add(heavyCart);
        carts.add(motorcycles);
        System.out.println(carts.toArray());
    }

    @Override
    public void use(Carts carts, Track track) {
        
    }


    enum Item{MUSHROOM, SHELL, BANANA}
}
