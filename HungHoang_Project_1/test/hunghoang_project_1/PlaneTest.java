
package hunghoang_project_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PlaneTest {
    
    public PlaneTest() {
    }

    @Test
    public void testChangeAltitude() {
        fail();
    }

    @Test
    public void testEnableLandingGear() {
        fail();
    }

    @Test
    public void testDisableLandingGear() {
        fail();
    }

    @Test
    public void testGetlandingGearEnable() {
        fail();
    }

    @Test
    public void testGetMaxAltitudeInFeet() {
        /// AAA format Arrange - Act - Assert
        
        // Arrange
        double expectedMaxAltitudeInFeet = 20000;
        
        //Act - call the code for testing 
        Plane plane = new Plane("",expectedMaxAltitudeInFeet,1,false);
        double actualMaxAltitudeInFeet = plane.getMaxAltitudeInFeet();
        
        // Assert
        assertEquals(expectedMaxAltitudeInFeet,actualMaxAltitudeInFeet, .00000001);
    }

    @Test
    public void testGetModel() {
        /// AAA format Arrange - Act - Assert
        
        // Arrange
        String expectedModel = "Boeing747";
        
        //Act - call the code for testing 
        Plane plane = new Plane(expectedModel,1,1,false);
        String actualModel = plane.getModel();
        
        // Assert
        assertEquals(expectedModel,actualModel);

    }

    @Test
    public void testGetCurrentAltitudeInFeet() {

    }
    
}
