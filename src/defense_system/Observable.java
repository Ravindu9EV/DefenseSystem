/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense_system;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Observable implements Observer {
    private int areaCleared;
    private boolean area;
    private String msg;
    private ArrayList<DefenseObserver> observerList=new ArrayList<>();
    
    private String mainMsg;
    private int strengthInt;
    private StrengthEnum strength=StrengthEnum.CLOSED;
    private String pMsg;
    public void addObserver(DefenseObserver obj){
        observerList.add(obj);
        
    }
    //------------area cleared--------------------
    public void setArea(int areaCleared){
            if(areaCleared==1){
                area=true;
             
            }else{
                area=false;
               
            }
           for(DefenseObserver obj:observerList){
            obj.update();
        } 
       }
     //-------------------display messeges----------------  
     public void reciveMsg(String title,String msg){
         this.msg=msg;
         for(DefenseObserver obj:observerList){
             if(title.equals(obj.getObjTitle()))
                obj.displayMsg();
            
        }
     }
     public String getMsg(){
         return msg;
     }
    
    public boolean getArea(){
        return area;
    }
     
  
    //-----send messeges to all defenses---------
   public void setMainMsg(String mainMsg){
       this.mainMsg=mainMsg;
        for(DefenseObserver obj:observerList){
            
            obj.displayMsg();
            
        }
   }
    public String getMainMsg(){
        return mainMsg;
    }
//    public void sendStrength(StrengthEnum strength){
//        
//        this.strength=strength;
//        notifyObjects();
//    }
    
    //------------------send private messeges---
    public void setPrivateMsg(String title,String privateMsg){
        for(DefenseObserver obj:observerList){
            if(obj.getObjTitle().equals(title) ){
                obj.displayPrivateMsg();
                pMsg=privateMsg;
                
                
            }
        }
    }
    public String getPrivateMsg(){
        return pMsg;
    }
    
    //-------- set the strength acording to JSliderValue----------------
    public void setStrength(int strengthInt){
        //this.strengthInt=strengthInt;
        
        if(strengthInt>=10){
                strength=StrengthEnum.LOW;
            }if(strengthInt>40 && strengthInt<=60){
                strength=StrengthEnum.MEDIUM;
            }if(strengthInt>60 && strengthInt<80){
                strength=StrengthEnum.HIGH;
                
            }if(strengthInt>=80){
                strength=StrengthEnum.STRONG;
                
            }else if(strengthInt<10){
                strength=StrengthEnum.CLOSED;
            }
          for(DefenseObserver obj:observerList){
              if(obj.position()){
                obj.enableButtons();
              }
        }
            
        
    }
    
    //----------------- display extra details--------------
    
    public void displayExtraDetails(String title,String lbl, String details){
        for(DefenseObserver obj:observerList){
            obj.displaySoldierCount();
        }
    }

    public StrengthEnum getStrength(){
        
        return strength;
    }
}
    
    

