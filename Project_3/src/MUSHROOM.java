
public class MUSHROOM implements Items {

    @Override
    public void use(Carts carts, Track track) {
        carts.currentSpeed = carts.currentSpeed + carts.getMaxSpeed();
        System.out.println("Current Speed: "+carts.getCurrentSpeed());
        carts.currentSpeed = carts.getMaxSpeed();
        System.out.println("Current Speed: "+carts.getCurrentSpeed());
        carts.setItem(null);
    }
    
}
