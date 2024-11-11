/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defense_system;

import defense_system.controller.MainController;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author ASUS
 */
public interface DefenseObserver {
    public void update ();
    public void sendMsg();
    public void displayMsg();
    public void enableButtons();
    public boolean position();
    public String getObjTitle();
    public void displayPrivateMsg();
    public void displaySoldierCount();
}
