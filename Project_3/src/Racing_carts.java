
import java.util.ArrayList;


public class Racing_carts implements Items {
    public static void main (String[]args)
    {
        Carts lightcart = new Light_Carts(300,50,100,30,"");
        Carts heavycart = new Heavy_Carts(300,50,100,30,"");
        Carts motorcyles = new Motorcycles(300,50,100,30,"");
        ArrayList<Carts> carts_list = new ArrayList<>();
        carts_list.add(lightcart);
        carts_list.add(heavycart);
        carts_list.add(motorcyles);
        Track track = new Track(carts_list,200);


    }

    @Override
    public void use(Carts carts, Track track) {
        carts = new Light_Carts(300,50,100,30,"");
        Carts cart_1 = new Heavy_Carts(300,50,100,30,"");
        ArrayList<Carts> carts_list = new ArrayList<>();
        carts_list.add(carts);
        carts_list.add(cart_1);
        track = new Track(carts_list, 200);
        if(carts.Item.isEmpty())
        {
            System.out.println("Your cart doesnt have any item.");
        }
        else
        {
           if("MUSHROOM".equals(carts.Item))
        {
            carts.maxSpeed = carts.maxSpeed + 100;
            System.out.println("Currently max speed of the carts: "+carts.getMaxSpeed());
            System.out.println("Current posstion: "+track.currentPosition);
            System.out.println("Total distance: "+track.getTotal_distance());
            carts.Item =null;
        }
        if("BANANA".equals(carts.Item))
        {                   
            System.out.println("You dropped a banana at "+track.currentPosition);
            carts.Item = null;
        }
        if("SHELL".equals(carts.Item))
        {     
            SHELL shot = new SHELL(cart_1);
            shot.Shot();
            carts.Item = null;
        }
        }
        }

    enum Item{MUSHROOM, SHELL, BANANA}
    }
    
