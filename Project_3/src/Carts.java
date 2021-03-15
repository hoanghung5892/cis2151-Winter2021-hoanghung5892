
import java.util.ArrayList;
import java.util.Random;


public abstract class Carts {
    protected int maxSpeed;
    protected int acceleration;
    protected int currentSpeed ;
    protected int breakSpeed ;
    protected String Item;
    
    public Carts(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed, String Item)
    {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.currentSpeed = currentSpeed;
        this.breakSpeed = breakSpeed;
        this.Item = Item;
        
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getBreakSpeed() {
        return breakSpeed;
    }

    public String getItem() {
        Light_Carts lightCart = new Light_Carts(298,52,100,32,"");
        Heavy_Carts heavyCart = new Heavy_Carts(302,48,100,28,"");
        Motorcycles motorcycles = new Motorcycles(303,53,100,33,"");
        ArrayList<Carts> carts = new ArrayList<>();
        carts.add(lightCart);
        carts.add(heavyCart);
        carts.add(motorcycles);
        Track track = new Track(carts, 200);
        if(track.currentPosition > 1200)
        {   
            System.out.println("You passed 1200 miles. You can get a random item! ");
            Random rd = new Random();
            int a = rd.nextInt(2);
            if(a == 0)
            {
                Item = "MUSHROOM";
                System.out.println("You got a mushroom!");
            }
            if(a == 1)
            {
                Item = "SHELL";
                System.out.println("You got a shell!");
            }
            if(a == 2)
            {
                Item = "BANANA";
                System.out.println("You got a banana!");
            }                
        }else System.out.println("You need to pass 1200 miles in order to get an item.");
        return Item;
    }


    public String addItem(String item)
    {
        if("MUSHROOM".equals(item))
        {
            this.Item = item;
        }
        if("BANANA".equals(item))
        {
            this.Item = item;  
        }
        if("SHELL".equals(item))
        {
            this.Item = item;
        }
        return Item;
    }
    public abstract void use_item();
    
    public abstract void accelerate();

    public abstract void brake();
    

}
