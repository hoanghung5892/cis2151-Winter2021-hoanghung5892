
import java.util.ArrayList;
import java.util.Random;


public abstract class Carts {
    protected int maxSpeed;
    protected int acceleration;
    protected int currentSpeed ;
    protected int breakSpeed ;
    protected String Item;
    
    public Carts(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed)
    {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.currentSpeed = currentSpeed;
        this.breakSpeed = breakSpeed;             
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setBreakSpeed(int breakSpeed) {
        this.breakSpeed = breakSpeed;
    }

    public void setItem(String Item) {
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

    public String getItem(Carts cart, Track track) {       
        if(track.currentPosition > 1200)
        {   
            System.out.println("You passed 1200 miles. You can get a random item! ");
            Random rd = new Random();
            int a = rd.nextInt(2);
            if(a == 0)
            {
                cart.Item = "MUSHROOM";
                System.out.println("You got a mushroom!");
            }
            if(a == 1)
            {
                cart.Item = "SHELL";
                System.out.println("You got a shell!");
            }
            if(a == 2)
            {
                cart.Item = "BANANA";
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
    public abstract void entertheBend();
    

}
