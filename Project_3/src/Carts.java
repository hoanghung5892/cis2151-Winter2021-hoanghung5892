
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
