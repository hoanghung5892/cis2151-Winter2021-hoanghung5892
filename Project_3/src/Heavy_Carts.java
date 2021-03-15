
import java.util.List;

public class Heavy_Carts extends Carts {
    protected List<String> Items;

    public Heavy_Carts(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed, String Item) {
        super(maxSpeed+2, acceleration-2, currentSpeed, breakSpeed-2, Item);
    }

    @Override
    public void use_item() {
       
    }
    public void add_Item( String item)
    {
        Items.add(Item);
        Items.add(item);
    }

    @Override
    public void accelerate() {
        currentSpeed = currentSpeed + acceleration;
        //System.out.println(currentSpeed);
    }
    @Override
    public void brake() {
        currentSpeed = currentSpeed - breakSpeed;
    }
    
}
