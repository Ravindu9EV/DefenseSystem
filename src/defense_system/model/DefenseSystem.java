/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defense_system.model;

import defense_system.*;
import defense_system.controller.MainController;
import defense_system.view.Helicopter;
import defense_system.view.Submarine;
import defense_system.view.Tank;

/**
 *
 * @author ASUS
 */
public class DefenseSystem {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Observable observerable=new Observable();
        MainController mc=new MainController(observerable);
        observerable.addObserver(new Helicopter(mc));
        observerable.addObserver(new Tank(mc));
        observerable.addObserver(new Submarine(mc));
        mc.setVisible(true);
        
    }
    
}


