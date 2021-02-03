/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunghoang_project_1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hoang Hung
 */
public class PlaneTest {
    
    public PlaneTest() {
    }

    @Test
    public void testChangeAltitudePassMaximumAltitude() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        
        // Act
        Plane plane = new Plane("",20000);
        plane.changeAltitude(20000);       
        double actualcurrentAltitudeInFeet = plane.getCurrentAltitudeInFeet();
        double maxAltitute = plane.getMaxAltitudeInFeet();
        
        // Assert
        assertTrue(actualcurrentAltitudeInFeet > maxAltitute);

    }
    @Test
    public void testChangeAltitudeLessThanMaxAndHigher1000InFeet() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        
        // Act
        Plane plane = new Plane("",20000);
        plane.changeAltitude(10000);       
        double actualcurrentAltitudeInFeet = plane.getCurrentAltitudeInFeet();
        double maxAltitute = plane.getMaxAltitudeInFeet();
        
        // Assert
        assertTrue(actualcurrentAltitudeInFeet < maxAltitute);
        assertTrue(actualcurrentAltitudeInFeet >= 1000);

    }
    @Test
    public void testChangeAltitudeLessThan1000InFeetWithLandingGearEnable() {
        /// AAA format - Arrange - Act - Assert 
        // Arrange
        boolean expectedlandingGearEnable = true;
        // Act
        Plane plane = new Plane("",20000);
        plane.changeAltitude(-2500);       
        boolean actuallandingGearEnable = plane.enableLandingGear();
        
        // Assert
        assertEquals(expectedlandingGearEnable,actuallandingGearEnable);
        assertTrue(actuallandingGearEnable);
    }
    @Test
    public void testChangeAltitudeLessThan1000InFeetWithLandingGearDisable() {
        /// AAA format - Arrange - Act - Assert 
        // Arrange
        boolean expectedlandingGearEnable = false;
        // Act
        Plane plane = new Plane("",20000);
        plane.changeAltitude(-2500);       
        boolean actuallandingGearEnable = plane.getlandingGearEnable();
        
        // Assert
        assertEquals(expectedlandingGearEnable,actuallandingGearEnable);
        assertFalse(actuallandingGearEnable);
    }

    @Test
    public void testEnableLandingGearOver1000InFeet() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        boolean expectedlandigGearEnable = false;
        
        // Act
        Plane plane = new Plane("",20000);
        plane.changeAltitude(3000);       
        boolean actuallandingGearEnable = plane.enableLandingGear();
        
        // Assert
        assertEquals(expectedlandigGearEnable,actuallandingGearEnable);
        
    }
    @Test
    public void testEnableLandingGearUnder1000InFeet() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        boolean expectedlandigGearEnable = true;
        
        // Act
        Plane plane = new Plane("",20000);
        plane.changeAltitude(-2500);       
        boolean actuallandingGearEnable = plane.enableLandingGear();
        
        // Assert
        assertEquals(expectedlandigGearEnable,actuallandingGearEnable);
        
    }
    

    @Test
    public void testDisableLandingGearUnder1000InFeet() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        boolean expectedlandigGearEnable = true;
        
        // Act
        Plane plane = new Plane("",20000);
        plane.changeAltitude(-2500);       
        boolean actuallandingGearEnable = plane.disableLandingGear();
        
        // Assert
        assertEquals(expectedlandigGearEnable,actuallandingGearEnable);

    }
        @Test
    public void testDisableLandingGearOver1000InFeet() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        boolean expectedlandigGearEnable = false;
        
        // Act
        Plane plane = new Plane("",20000);
        plane.changeAltitude(3300);       
        boolean actuallandingGearEnable = plane.disableLandingGear();
        
        // Assert
        assertEquals(expectedlandigGearEnable,actuallandingGearEnable);

    }

    @Test
    public void testGetlandingGearEnable() {
        // Arrange
        boolean expectedlandingGearEnable = false;
        
        // Act
        Plane plane = new Plane("",1);
        boolean actuallandingGearEnable = plane.getlandingGearEnable();
        
        // Assert
        assertEquals(expectedlandingGearEnable,actuallandingGearEnable);

    }

    @Test
    public void testGetMaxAltitudeInFeet() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        double expectedMaxAltitudeInFeet = 20000;
        
        // Act
        Plane plane = new Plane("",expectedMaxAltitudeInFeet);
        double actualMaxAltitudeInFeet = plane.getMaxAltitudeInFeet();
        
        // Assert
        assertEquals(expectedMaxAltitudeInFeet,actualMaxAltitudeInFeet, .000001);
    }

    @Test
    public void testGetModel() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        String expectedModel = "Boeing747";
        
        // Act
        Plane plane = new Plane(expectedModel,1);
        String actualModel = plane.getModel();
        
        // Assert
        assertEquals(expectedModel,actualModel);
    }

    @Test
    public void testGetCurrentAltitudeInFeet() {
        /// AAA format - Arrange - Act - Assert 
        
        // Arrange
        double expectedcurrentAltitudeInFeet = 3000;
        
        // Act
        Plane plane = new Plane("",1);
        double actualAltitudeInFeet = plane.getCurrentAltitudeInFeet();
        
        // Assert
        assertEquals(expectedcurrentAltitudeInFeet,actualAltitudeInFeet, .000001);
    }
    
}
