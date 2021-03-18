
public class Motorcycles extends Carts {

    protected Carts carts;
    public Motorcycles(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed) {
        super(maxSpeed+3, acceleration+3, currentSpeed, breakSpeed+3);
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

    @Override
    public void entertheBend(Bends bend) {
    if(carts.getCurrentSpeed() > bend.getMax_speed_bend())
        {
                System.out.println("Your speed larger than the maximum bend's speed . You went off the road");
                bend.bendposition = 0;
                System.out.println("Your current posstion :"+bend.bendposition);  
        }
    }
    
}
