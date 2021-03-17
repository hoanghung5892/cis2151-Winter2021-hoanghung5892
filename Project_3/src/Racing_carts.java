
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
        System.out.println(track.getTotal_distance());
        use(lightcart,track);


    }

    @Override
    public  void use(Carts carts, Track track) {
        if(carts.Item.isEmpty())
        {
            System.out.println("Your cart doesnt have any item.");
        }
        else
        {
           if("MUSHROOM".equals(carts.Item))
        {
            carts.use_item();
            carts.maxSpeed = carts.maxSpeed + 100;
            System.out.println("Currently max speed of the carts: "+carts.getMaxSpeed());
            System.out.println("Current posstion: "+track.currentPosition);
            System.out.println("Total distance: "+track.getTotal_distance());
            carts.setItem(null);
        }
        if("BANANA".equals(carts.Item))
        {   
            carts.use_item();
            System.out.println("You dropped a banana at "+track.currentPosition);
            carts.setItem(null);
        }
        if("SHELL".equals(carts.Item))
        {     
            Carts cart1 = new Light_Carts(300,50,100,30,"");
            Carts cart2 = new Heavy_Carts(300,50,100,30,"");
            cart1.use_item();
            SHELL shot = new SHELL(cart1,cart2);
            shot.Shot();
            cart1.setItem(null);
        }
        }

    
    }
    enum Item{MUSHROOM, SHELL, BANANA}
}
    
