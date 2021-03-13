
public abstract class Base_Cart {
    protected int maxSpeed = 300;
    protected int acceleration = 50;
    protected int currentSpeed = 100;
    protected int breakSpeed = 30;
    protected String Item;
    
    public Base_Cart(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed, String Item)
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
    public int accelerate(int acceleration)
    {
        currentSpeed = currentSpeed + acceleration;
        return currentSpeed;
    }
    public int brake(int breakSpeed)
    {
        currentSpeed = currentSpeed - breakSpeed;
        return currentSpeed;
    }
     public abstract void use_item();
    
    
}
