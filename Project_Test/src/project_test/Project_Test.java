/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_test;

import java.util.Scanner;

/**
 *
 * @author Hoang Hung
 */
public class Project_Test {

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
        int numbercompletepostperboard, wastedperboard, numberofBoardperLF, totalWastedperLF,totalWasted;
        int  numberofBoardperWF, totalWastedperWF, numberofBoardforFence;
        int x;                      
        numbercompletepostperboard = lengthBoard / postDistance ;
        x = numbercompletepostperboard*postDistance;
        wastedperboard = lengthBoard % postDistance;  
        if(lengthBoard <=0 || postDistance <= 0 || lengthFence <= 0 || wideFence <= 0)
        {
            System.out.println("These values must be larger than 0.");
        }
        if ( lengthBoard > lengthFence)
        {
            int wasted;
            wasted = (lengthBoard - lengthFence) +(lengthBoard- wideFence);
            System.out.println("Total board need is 4. Total wasted is  "+wasted);
        }
        else
        {            

            
            if (lengthFence%x == 0)
            {
                if (wideFence%x == 0)
                {
                    numberofBoardperWF = wideFence / (numbercompletepostperboard*postDistance);
                    totalWastedperWF = numberofBoardperWF*wastedperboard;
                    numberofBoardperLF = lengthFence / (numbercompletepostperboard*postDistance);
                    totalWastedperLF = numberofBoardperLF*wastedperboard;
                    numberofBoardforFence = (numberofBoardperLF*2) + (numberofBoardperWF*2);
                    totalWasted = (totalWastedperLF*2)+ (totalWastedperWF*2);
                    System.out.println("Total wasted "+totalWasted+ ". Number of board need to complete the fence: "+numberofBoardforFence);                   
                }
                else {
                    numberofBoardperWF = wideFence / (numbercompletepostperboard*postDistance);
                    totalWastedperWF = numberofBoardperWF*wastedperboard + (lengthBoard - (wideFence%numberofBoardperWF));
                    numberofBoardperLF = lengthFence / (numbercompletepostperboard*postDistance);
                    totalWastedperLF = numberofBoardperLF*wastedperboard;
                    numberofBoardforFence = (numberofBoardperLF*2) + ((numberofBoardperWF+1)*2);
                    totalWasted = (totalWastedperLF*2)+ (totalWastedperWF*2);
                    System.out.println("Total wasted "+totalWasted+ ". Number of board need to complete the fence: "+numberofBoardforFence); 
                    
                }

            }
            else{
                if (wideFence%x == 0)
                {
                    numberofBoardperWF = wideFence / (numbercompletepostperboard*postDistance);
                    totalWastedperWF = numberofBoardperWF*wastedperboard;
                    numberofBoardperLF = lengthFence / (numbercompletepostperboard*postDistance);
                    totalWastedperLF = numberofBoardperLF*wastedperboard + (lengthBoard - (lengthFence%numberofBoardperLF));
                    numberofBoardforFence = ((numberofBoardperLF+1)*2) + (numberofBoardperWF*2);
                    totalWasted = (totalWastedperLF*2)+ (totalWastedperWF*2);
                    System.out.println("Total wasted "+totalWasted+ "Number of board need to complete the fence: "+numberofBoardforFence);                   
                }
                else {
                    numberofBoardperWF = wideFence / (numbercompletepostperboard*postDistance);
                    totalWastedperWF = numberofBoardperWF*wastedperboard + (lengthBoard - (wideFence%numberofBoardperWF));
                    numberofBoardperLF = lengthFence / (numbercompletepostperboard*postDistance);
                    totalWastedperLF = numberofBoardperLF*wastedperboard + (lengthBoard - (lengthFence%numberofBoardperLF));
                    numberofBoardforFence = ((numberofBoardperLF+1)*2) + ((numberofBoardperWF+1)*2);
                    totalWasted = (totalWastedperLF*2)+ (totalWastedperWF*2);
                    System.out.println("Total wasted "+totalWasted+ "Number of board need to complete the fence: "+numberofBoardforFence); 
                    
                }
                
            }
        }

                          
    }
}
    

