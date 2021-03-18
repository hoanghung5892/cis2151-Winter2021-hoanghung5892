
import java.util.List;

public class Heavy_Carts extends Carts {
    protected List<String> Items;
    protected Carts carts;

    public Heavy_Carts(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed) {
        super(maxSpeed+2, acceleration-2, currentSpeed, breakSpeed-2);
    }

    @Override
    public void use_item() {
        System.out.println("You current item: "+carts.Item);       
    }
    public void add_Item( String item)
    {
        Items.add(Item);
        Items.add(item);
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
