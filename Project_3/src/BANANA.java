
public class BANANA implements Items{

    @Override
    public void use(Carts carts, Track track) {
            carts.use_item();
            System.out.println("You dropped a banana at "+track.currentPosition);
            carts.setItem(null);
    }
    
}
