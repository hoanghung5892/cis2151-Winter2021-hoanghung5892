
import java.util.ArrayList;
import java.util.List;


public class Track {
    static ArrayList<Base_Cart> Carts;
    protected int total_distance = 2000;
    protected int distance_next_bend;
    protected int max_speed_coming_bend;

    public int getDistance_next_bend() {
        return distance_next_bend;
    }

    public int getTotal_distance() {
        return total_distance;
    }

    public int getMax_speed_coming_bend() {
        return max_speed_coming_bend;
    }
    public static void main (String[]args)
    {
        Light_Carts lightCart = new Light_Carts(298,52,100,32,"");
        Heavy_Carts heavyCart = new Heavy_Carts(302,48,100,28,"");
        Motorcycles motorcycles = new Motorcycles(303,53,100,33,"");
        Carts.add(0, lightCart);
        Carts.add(1, heavyCart);
        Carts.add(2, motorcycles);
    }
    enum Item{MUSHROOM, SHELL, BANANA}
}

