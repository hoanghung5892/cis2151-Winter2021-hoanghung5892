/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Hung
 */
public class MUSHROOM implements Items {

    @Override
    public void use(Carts carts, Track track) {
        carts.currentSpeed = carts.currentSpeed + carts.getMaxSpeed();
        System.out.println("Current Speed: "+carts.getCurrentSpeed());
        carts.currentSpeed = carts.getMaxSpeed();
        System.out.println("Current Speed: "+carts.getCurrentSpeed());
    }
    
}
