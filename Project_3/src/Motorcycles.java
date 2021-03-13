/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Hung
 */
public class Motorcycles extends Base_Cart {

    public Motorcycles(int maxSpeed, int acceleration, int currentSpeed, int breakSpeed, String Item) {
        super(maxSpeed+3, acceleration+3, currentSpeed, breakSpeed+3, Item);
    }

    @Override
    public void use_item() {
        
    }
    
}
