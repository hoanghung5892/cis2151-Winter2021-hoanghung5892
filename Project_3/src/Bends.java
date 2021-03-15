/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Hung
 */
public class Bends {
        public int bendposition;
        public int max_speed_bend;
    
    public Bends(int bendposition, int max_speed_bend )
    {
        this.bendposition = bendposition;
        this.max_speed_bend = max_speed_bend;
    }

    public int getBendposition() {
        return bendposition;
    }

    public int getMax_speed_bend() {
        return max_speed_bend;
    }
}
