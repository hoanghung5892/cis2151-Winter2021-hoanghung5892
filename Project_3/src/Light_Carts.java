/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Hung
 */
public class Light_Carts extends Base_Cart {
    

    
    public Light_Carts(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed, String Item) {
        super(maxSpeed-2, acceleration+2, currentSpeed, breakSpeed+2, Item);
    }

    


}
