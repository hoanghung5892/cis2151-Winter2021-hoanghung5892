/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Hung
 */
public class SHELL {
    public Carts cart_1;
    public Carts cart_2;
    public SHELL(Carts cart_1, Carts cart_2)
    {
        this.cart_1 = cart_1;
        this.cart_2 = cart_2;
    }
    public void Shot()
    {
        cart_2.setCurrentSpeed(0);
        System.out.println("You got shot by other cart");
        System.out.println("Your current speed: "+cart_2.getCurrentSpeed());
    }
}
