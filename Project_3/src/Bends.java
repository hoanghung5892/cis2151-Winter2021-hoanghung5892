
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
