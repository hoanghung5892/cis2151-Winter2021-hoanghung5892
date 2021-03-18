
import java.util.ArrayList;
import java.util.Random;


public class Track {
    static ArrayList<Carts> Carts;
    public int total_distance = 2000;
    public int distance_next_bend;
    public ArrayList<Bends> bends;
    public int currentPosition;
    public int max_speed_bend;
public Track(ArrayList<Carts> Carts, int currentPosition )
{
    this.Carts = Carts;
    this.currentPosition = currentPosition;

}

    public int getNextBend() {
        bends.add(new Bends(500,100));
        bends.add(new Bends(1000,120));
        bends.add(new Bends(1500,200));
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
     return distance_next_bend;   
    }

    public int getTotal_distance() {
        return (total_distance - currentPosition);
    }

    public int getBendMaxSpeed() {
        bends.add(new Bends(500,100));
        bends.add(new Bends(1000,120));
        bends.add(new Bends(1500,200));
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
    public void checkMaxSpeed(){
        Light_Carts lightCart = new Light_Carts(298,52,100,32);
        Heavy_Carts heavyCart = new Heavy_Carts(302,48,100,28);
        Motorcycles motorcycles = new Motorcycles(303,53,100,33);
        ArrayList<Carts> carts = new ArrayList<>();
        carts.add(lightCart);
        carts.add(heavyCart);
        carts.add(motorcycles);
        Bends first_bend = bends.get(0);
        Bends second_bend = bends.get(1);
        Bends third_bend = bends.get(2);
        bends.add(new Bends(500,100));
        bends.add(new Bends(1000,120));
        bends.add(new Bends(1500,200));
        if(currentPosition < 500)
        {
            if ( lightCart.getCurrentSpeed() > first_bend.getMax_speed_bend())
            {
                Random rd = new Random();
                int a = rd.nextInt(1);
                if(a == 1)
                {
                    System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
                    System.out.println("Your current posstion :"+currentPosition);         
                }
                if(a == 0 )
                {
                    System.out.println("You are successfull pass the bends without penalty!!!");
                    System.out.println("Your current posstion :"+currentPosition);
                }
            }
            if ( heavyCart.getCurrentSpeed() > first_bend.getMax_speed_bend())
            {
                   System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
            }
            if ( motorcycles.getCurrentSpeed() > first_bend.getMax_speed_bend())
            {
                   System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
            }
        }
        if (currentPosition < 1000)
        {
            if ( lightCart.getCurrentSpeed() > second_bend.getMax_speed_bend())
            {
                Random rd = new Random();
                int a = rd.nextInt(1);
                if(a == 1)
                {
                    System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
                    System.out.println("Your current posstion :"+currentPosition);         
                }
                if(a == 0 )
                {
                    System.out.println("You are successfull pass the bends without penalty!!!");
                    System.out.println("Your current posstion :"+currentPosition);
                }
            }
            if ( heavyCart.getCurrentSpeed() > second_bend.getMax_speed_bend())
            {
                   System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
            }
            if ( motorcycles.getCurrentSpeed() > second_bend.getMax_speed_bend())
            {
                   System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
            }
            
        }
        if (currentPosition > 1500 )
        {
            if ( lightCart.getCurrentSpeed() > third_bend.getMax_speed_bend())
            {
                Random rd = new Random();
                int a = rd.nextInt(1);
                if(a == 1)
                {
                    System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
                    System.out.println("Your current posstion :"+currentPosition);         
                }
                if(a == 0 )
                {
                    System.out.println("You are successfull pass the bends without penalty!!!");
                    System.out.println("Your current posstion :"+currentPosition);
                }
 
            }
            if ( heavyCart.getCurrentSpeed() > third_bend.getMax_speed_bend())
            {
                   System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
            }
            if ( motorcycles.getCurrentSpeed() > third_bend.getMax_speed_bend())
            {
                   System.out.println("Your speed larger than the bend speed. You went off the road");
                    currentPosition = 0;
            }
        }
        
    }

    enum Item{MUSHROOM, SHELL, BANANA}
}

