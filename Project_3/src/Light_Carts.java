
public class Light_Carts extends Carts {
    
    protected Carts carts;

    public Light_Carts(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed, String Item) {
        super(maxSpeed-2, acceleration+2, currentSpeed, breakSpeed+2, Item);
    }

    
    @Override
    public void use_item() {
        System.out.println("You current item: "+carts.Item);
    }

    @Override
    public void accelerate() {
        currentSpeed = currentSpeed + acceleration;
        System.out.println(currentSpeed);
    }

    @Override
    public void brake() { 
       currentSpeed = currentSpeed - breakSpeed;
       System.out.println(currentSpeed);
    }


}
