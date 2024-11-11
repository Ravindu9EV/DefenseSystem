/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defense_system.model;

import defense_system.*;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface Observer {
    public void setArea(int area);
    public boolean getArea();
    
    public void reciveMsg(String title,String msg);
    public String getMsg();
    
    public void setMainMsg(String mainMsg);
   public String getMainMsg();
   
   public void setPrivateMsg(String title,String pMsg);
   public String getPrivateMsg();
   //public void sendStrength(StrengthEnum strength);
   public void setStrength(int strength);
   public StrengthEnum getStrength();
   
   public void displayExtraDetails(String title,String lbl,String details);
   //public boolean getPos();
}
