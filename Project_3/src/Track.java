
import java.util.ArrayList;
import java.util.List;


public class Track {
    static ArrayList<Base_Cart> Carts;
    public int total_distance = 2000;
    public int distance_next_bend;
    public int max_speed_coming_bend;
    public int currentPosition;
    public int numberofbend = 3;

    public int getDistance_next_bend() {
        if(total_distance < 500)
        {
            distance_next_bend = 0;
            System.out.println("No more bend left");
        }
        if (total_distance > 500 && total_distance < 1000)
        {
            distance_next_bend = 1500 - currentPosition;
        }
        if (total_distance > 1000 && total_distance < 1500)
        {
            distance_next_bend = currentPosition - 1000;
        }
        else {distance_next_bend = 2000 - currentPosition; }
       
        System.out.println("Distance of next bend is "+distance_next_bend);
        return distance_next_bend;
    }

    public int getTotal_distance() {
        return (total_distance - currentPosition);
    }

    public int getMax_speed_coming_bend() {
        return max_speed_coming_bend;
    }

    enum Item{MUSHROOM, SHELL, BANANA}
}

