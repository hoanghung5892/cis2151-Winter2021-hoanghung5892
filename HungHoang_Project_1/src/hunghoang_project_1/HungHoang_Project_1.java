
package hunghoang_project_1;

import java.util.Scanner;


public class HungHoang_Project_1 {

    public static void main(String[] args) {
        Plane Boeing747 = new Plane("Boeing747",20000);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your altitude you want to change ? ");
        double changeAltitudeInFeet = Double.parseDouble(keyboard.nextLine());
        Boeing747.changeAltitude(changeAltitudeInFeet);
        
        
        

        
    }
    
}
