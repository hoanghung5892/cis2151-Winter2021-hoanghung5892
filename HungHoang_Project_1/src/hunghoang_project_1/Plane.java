package hunghoang_project_1;


public class Plane {
    private double maxAltitudeInFeet;
    private boolean landingGearEnable ;
    private String model;
    private double currentAltitudeInFeet;
    
    public Plane(String model, double maxAltitudeInFeet, double currentAltitudeInFeet, boolean landingGearEnable)
    {
        this.model = model;
        this.maxAltitudeInFeet = maxAltitudeInFeet;
        this.currentAltitudeInFeet = currentAltitudeInFeet;
        this.landingGearEnable = landingGearEnable;
    }
    public Plane(String model, double maxAltitudeInFeet)
    {
        this.model = model;
        this.maxAltitudeInFeet = maxAltitudeInFeet;
        landingGearEnable = false;
        currentAltitudeInFeet = 3000;
    }
    public void changeAltitude(double changeAltitudeInFeet)
    {        
        
            currentAltitudeInFeet += changeAltitudeInFeet;
            if(currentAltitudeInFeet > maxAltitudeInFeet)
            {              
                System.out.println("Your current of altitude: "+currentAltitudeInFeet+" which can not be higher than the maximum altitude of the plane: "+maxAltitudeInFeet);
            }
            if(currentAltitudeInFeet < maxAltitudeInFeet && currentAltitudeInFeet >= 1000)
            {
                System.out.println("Your change of altitude is successful!");
                System.out.println("Your current height is "+currentAltitudeInFeet);
            }
            if ( landingGearEnable == false && currentAltitudeInFeet < 1000 )
            {
                System.out.println("You current altitude " +currentAltitudeInFeet+" which can't be below 1000, when the landing gear is disenabled.");
            }
            if (landingGearEnable == true && currentAltitudeInFeet < 1000)
            {
                System.out.println("Your current altitude can below 1000, when the landing gear is enabled.");
                System.out.println("Your current height is "+currentAltitudeInFeet);
            }
            }   
        
    public boolean enableLandingGear()
    {
        if (currentAltitudeInFeet > 1000)
        {   
           return landingGearEnable = false;
            
        }else return landingGearEnable = true;
        
    }
    public boolean disableLandingGear()
    {
        if(currentAltitudeInFeet < 1000)
        {
           return landingGearEnable = true;
            
        }else return landingGearEnable = false;
    }
    public boolean getlandingGearEnable(){
                return landingGearEnable;
    }
    public double getMaxAltitudeInFeet() {
        return maxAltitudeInFeet;
    }

    public String getModel() {
        return model;
    }

    public double getCurrentAltitudeInFeet() {
        return currentAltitudeInFeet;
    }

    public void setMaxAltitudeInFeet(double maxAltitudeInFeet) {
        this.maxAltitudeInFeet = maxAltitudeInFeet;
    }

    public void setLandingGearEnable(boolean landingGearEnable) {
        this.landingGearEnable = landingGearEnable;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCurrentAltitudeInFeet(double currentAltitudeInFeet) {
        this.currentAltitudeInFeet = currentAltitudeInFeet;
    }
    
}

