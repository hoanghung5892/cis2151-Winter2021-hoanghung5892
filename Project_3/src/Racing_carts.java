
import java.util.ArrayList;


public class Racing_carts implements Items {
    public static void main (String[]args)
    {

        

    }

    @Override
    public void use(Carts carts, Track track) {
        Light_Carts lightCart = new Light_Carts(300,50,100,30,"");
        Heavy_Carts heavyCart = new Heavy_Carts(300,50,100,30,"");
        Motorcycles motorcycles = new Motorcycles(300,50,100,30,"");
        ArrayList<Carts> carts_1 = new ArrayList<>();
        carts_1.add(lightCart);
        carts_1.add(heavyCart);
        carts_1.add(motorcycles);
        Track track_1 = new Track(carts_1, 200);

        
    }


    enum Item{MUSHROOM, SHELL, BANANA}
}
