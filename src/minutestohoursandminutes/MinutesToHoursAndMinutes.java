/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutestohoursandminutes;

/**
 *
 * @author SwDev16
 * Write a program that declares a minute variable and converts it to hours and minutes.
 */
import java.util.Scanner;
public class MinutesToHoursAndMinutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strMins = " ";
        int intMins = 0, intHours=0, intMinsOverTheHour=0;
        do{
        System.out.println("Please input the minutes worked or enter 'q' to quit: ");
        strMins = sc.nextLine();
        
        try{
            if(!strMins.matches("Q|q")) {
                intMins = Integer.parseInt(strMins);
                intHours = intMins/60;
                intMinsOverTheHour = intMins %60;
            
            
            System.out.println("That converts to " + intHours + " hours and " + intMinsOverTheHour + " minutes");
            }
            
            break;
        }catch(NumberFormatException NFe){
            System.out.println("Sorry please enter only numbers.");
        }
        
        
        }while (!strMins.matches("Q|q"));
        
    }
    
}
