
import java.util.ArrayList;
import java.util.List;


public class Track {
    static ArrayList<Carts> Carts;
    public int total_distance = 2000;
    public int distance_next_bend;
    public ArrayList<Bends> bends;
    public int currentPosition;
    public int bendposition;
    public int max_speed_bend;
public Track(ArrayList<Carts> Carts, int currentPosition )
{
    this.Carts = Carts;
    this.currentPosition = currentPosition;
    bends.add(new Bends(500,100));
    bends.add(new Bends(1000,120));
    bends.add(new Bends(1500,200));
}

    public int getNextBend() {
        if(currentPosition < 500)
            {
                Bends first_bend = bends.get(0);
                distance_next_bend = first_bend.bendposition - currentPosition ;
            }
        if(currentPosition < 1000)
            {
                Bends second_bend = bends.get(0);
                distance_next_bend = second_bend.bendposition - currentPosition ;
            }
        if(currentPosition < 1500)
            {
                Bends third_bend = bends.get(0);
                distance_next_bend = third_bend.bendposition - currentPosition ;
            }   
        return max_speed_bend;
    }

    public int getTotal_distance() {
        return (total_distance - currentPosition);
    }

    public int getBendMaxSpeed() {
        if(currentPosition < 500)
        {
           Bends first_bend = bends.get(0);
           max_speed_bend = first_bend.getMax_speed_bend();
        }
        if(currentPosition < 1000)
        {
           Bends second_bend = bends.get(1);
           max_speed_bend = second_bend.getMax_speed_bend();
        }
        if(currentPosition < 1500)
        {
           Bends third_bend = bends.get(2);
           max_speed_bend = third_bend.getMax_speed_bend();
        }       
        return max_speed_bend;
    }

    enum Item{MUSHROOM, SHELL, BANANA}
}

