
public class Motorcycles extends Carts {

    protected Carts carts;
    public Motorcycles(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed, String Item) {
        super(maxSpeed+3, acceleration+3, currentSpeed, breakSpeed+3, Item);
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
