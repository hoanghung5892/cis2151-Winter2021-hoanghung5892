
import java.util.ArrayList;
import java.util.Random;


public class Racing_carts extends Using_Item  {
    public static void main (String[]args)
    {
        Carts lightcart = new Light_Carts(300,50,100,30);
        Carts heavycart = new Heavy_Carts(300,50,100,30);
        Carts motorcyles = new Motorcycles(300,50,100,30);
        ArrayList<Carts> carts_list = new ArrayList<>();
        carts_list.add(lightcart);
        carts_list.add(heavycart);
        carts_list.add(motorcyles);
        Track track = new Track(carts_list,200);
        System.out.println(track.getTotal_distance());
        ArrayList<Bends> bends = new ArrayList<>();
        bends.add(new Bends(500,100));
        bends.add(new Bends(1000,120));
        bends.add(new Bends(1500,200));
do{
        for(int i = 0; i > 10; i++)
        {
            Random rd = new Random();
            int a = rd.nextInt(1);
            if(a == 0)
            {
                System.out.println("Current Speed: "+(lightcart.getCurrentSpeed() +(lightcart.getAcceleration())));
                System.out.println("");
            }
            if(a == 1)
            {
                System.out.println("Current Speed: "+(lightcart.getCurrentSpeed() - (lightcart.getBreakSpeed())));
            }
            
        }
}
while (track.getTotal_distance() > 0);

    }

enum Item{MUSHROOM, SHELL, BANANA}
    
    }
   
    
