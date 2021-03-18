
import java.util.Random;


public class Light_Carts extends Carts {
    
    protected Carts carts;

    public Light_Carts(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed ) {
        super(maxSpeed-2, acceleration+2, currentSpeed, breakSpeed+2 );
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
        if ( carts.getCurrentSpeed() > bend.getMax_speed_bend())
            {
                Random rd = new Random();
                int a = rd.nextInt(1);
                if(a == 1)
                {
                    System.out.println("Your speed larger than the maximum bend's speed . You went off the road");
                    bend.bendposition = 0;
                    System.out.println("Your current posstion :"+bend.bendposition);         
                }
                if(a == 0 )
                {
                    System.out.println("You are successfull pass the bends without penalty!!!");
                    System.out.println("Your current posstion :"+bend.bendposition);
                }
            }

    }


}
