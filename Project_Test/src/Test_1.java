
import java.util.Scanner;


public class Test_1 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);     
        // as k contractor friend's name
        System.out.println("Hello my Friend! What is your name?");         
        String name = keyboard.nextLine();
        // ask how far apart the post
        System.out.println("Hey " + name + ", How far apart the post do you want?");
        int postDistance = Integer.parseInt(keyboard.nextLine());
        // ask the length of the fence
        System.out.println( name + "," + " What is the length of the fence?");
        int lengthFence = Integer.parseInt(keyboard.nextLine());
        //ask the width of the fence
        System.out.println("Hey " + name + "," + "What is the width of the fence?");
        int wideFence =Integer.parseInt(keyboard.nextLine());
        //ask the size of boards
        System.out.println("Hey" + name + "," + "What is the length of the board "
                + name + " purchased ? ");
        int lengthBoard = Integer.parseInt(keyboard.nextLine());
        // Caculate the perimeter
        int perimeter = 2*(lengthFence + wideFence);
        int numberpostperBoard, numberboardNeed,x,wastedperboard,totalWasted;

        
        numberpostperBoard = lengthBoard / postDistance;
        if (perimeter%(numberpostperBoard*postDistance) == 0)
        {
            numberboardNeed = perimeter / (numberpostperBoard*postDistance) ;
        }
        else 
        {
            numberboardNeed = perimeter / (numberpostperBoard*postDistance) ;
            numberboardNeed = numberboardNeed + 1;
            
        }
        
        wastedperboard = lengthBoard%postDistance;
        totalWasted = wastedperboard*numberboardNeed;
        System.out.println("Total board is "+numberboardNeed+" Total wasted is "+totalWasted);
                
            
    }
}
