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
    public Carts carts;
    public SHELL(Carts carts)
    {
        this.carts = carts;
    }
    public void Shot()
    {
        carts.setCurrentSpeed(0);
        System.out.println("You got shot by other cart");
        System.out.println("Your current speed: "+carts.getCurrentSpeed());
    }
}
