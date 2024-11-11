/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defense_system.view;

import defense_system.controller.MainController;
import defense_system.DefenseObserver;
import defense_system.StrengthEnum;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author ASUS
 */
public class Submarine extends javax.swing.JFrame implements DefenseObserver {

    /**
     * Creates new form Submarine
     */
    private static MainController mainController;
    private int soldiers;
    public Submarine(MainController mainController) {
        this.mainController=mainController;
        
        initComponents();
         btnShoot.setEnabled(false);
        btnSonarOp.setEnabled(false);
        btnTomahawk.setEnabled(false);
        btnTrident2.setEnabled(false);
        displayMsg.setEditable(false);
        soldierCount.setValue(20);
        soldiers=(int)soldierCount.getValue();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAreaCleared = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnTomahawk = new javax.swing.JButton();
        btnSonarOp = new javax.swing.JButton();
        btnTrident2 = new javax.swing.JButton();
        jSliderEnergy = new javax.swing.JSlider();
        txtSendMsg = new javax.swing.JTextField();
        lblsoldierCount = new javax.swing.JLabel();
        soldierCount = new javax.swing.JSpinner();
        jSliderOxigen = new javax.swing.JSlider();
        btnSend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblsoldierCount1 = new javax.swing.JLabel();
        ammoCount = new javax.swing.JSpinner();
        position = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayMsg = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");
        setFont(new java.awt.Font("A12Yasarath", 0, 10)); // NOI18N

        lblAreaCleared.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAreaCleared.setText("Area Not Cleared");

        btnShoot.setText("Shoot");

        btnTomahawk.setText("Tomahawk Missile");

        btnSonarOp.setText("Sonar Operation");

        btnTrident2.setText("Trident-2 Missile");

        jSliderEnergy.setBackground(new java.awt.Color(204, 204, 204));
        jSliderEnergy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSliderEnergy.setForeground(new java.awt.Color(255, 0, 0));
        jSliderEnergy.setMajorTickSpacing(20);
        jSliderEnergy.setMinorTickSpacing(10);
        jSliderEnergy.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderEnergy.setPaintLabels(true);
        jSliderEnergy.setPaintTicks(true);
        jSliderEnergy.setSnapToTicks(true);
        jSliderEnergy.setValue(100);

        lblsoldierCount.setText("Soldier Count");

        soldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                soldierCountStateChanged(evt);
            }
        });

        jSliderOxigen.setBackground(new java.awt.Color(204, 204, 204));
        jSliderOxigen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSliderOxigen.setForeground(new java.awt.Color(255, 0, 0));
        jSliderOxigen.setMajorTickSpacing(20);
        jSliderOxigen.setMinorTickSpacing(10);
        jSliderOxigen.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderOxigen.setPaintLabels(true);
        jSliderOxigen.setPaintTicks(true);
        jSliderOxigen.setSnapToTicks(true);
        jSliderOxigen.setValue(100);

        btnSend.setBackground(new java.awt.Color(0, 102, 102));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSendMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Oxigen");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Energy");

        lblsoldierCount1.setText("Ammo Count");

        position.setText("Position");
        position.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                positionStateChanged(evt);
            }
        });

        displayMsg.setColumns(20);
        displayMsg.setRows(5);
        jScrollPane1.setViewportView(displayMsg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblAreaCleared, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSonarOp))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTomahawk, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTrident2)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblsoldierCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(41, 41, 41))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblsoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(46, 46, 46)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ammoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSendMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSliderOxigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(soldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(lblsoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsoldierCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ammoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(position)
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSendMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaCleared, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShoot)
                                    .addComponent(btnSonarOp))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTomahawk)
                                    .addComponent(btnTrident2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSliderEnergy, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                    .addComponent(jSliderOxigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMousePressed
        // TODO add your handling code here:
        sendMsg();
    }//GEN-LAST:event_btnSendMousePressed

    private void positionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_positionStateChanged
        // TODO add your handling code here:
        if(position()){
            enableButtons();
        }
    }//GEN-LAST:event_positionStateChanged

    private void soldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_soldierCountStateChanged
        // TODO add your handling code here:
        if(soldiers>(int)soldierCount.getValue() && (int)soldierCount.getValue()>=0){
            setSoldierCount((int)soldierCount.getValue());
            displaySoldierCount();
        }
    }//GEN-LAST:event_soldierCountStateChanged

    /**
     * @param args the command line arguments
     */
    
    //-----------update status of the Area---------
    public void update(){
        if(mainController.getArea()){
            lblAreaCleared.setText("Area Cleared");
        }else{
            lblAreaCleared.setText("Area Not Cleared");
        }
    }
    
    //------------implement get obj title function--------------
    public String getObjTitle(){
        return super.getTitle();
    }
    
    //-------------send messeges-------------
    public void sendMsg(){
       
            mainController.reciveMsg(super.getTitle(),txtSendMsg.getText());
       
    }
    
    
    //------------display messeges-------------
    public void displayMsg(){
        displayMsg.append(mainController.getMainMsg()+"\n");
    }
    
    //----------display private messeges--------
     public void displayPrivateMsg(){
       displayMsg.append("(private)"+mainController.getPrivateMsg()+"\n");
   }
    //----------------check position--------
    public boolean position(){
       return position.isSelected();
   }
//    public void position(){
//       if(position.isSelected()){
//           enableButtons();
//       }
//   }
    //---------------enable buttons-----------
    public void enableButtons(){
         

              switch(mainController.getStrength()){
                  case CLOSED:
                      btnShoot.setEnabled(false);
                      btnSonarOp.setEnabled(false);
                      btnTomahawk.setEnabled(false);
                      btnTrident2.setEnabled(false);
                      break;
                  case LOW:
                      btnShoot.setEnabled(true);
                      btnSonarOp.setEnabled(false);
                      btnTomahawk.setEnabled(false);
                      btnTrident2.setEnabled(false);
                      break;
                  case MEDIUM:
                      btnShoot.setEnabled(true);
                      btnSonarOp.setEnabled(true);
                      btnTomahawk.setEnabled(false);
                      btnTrident2.setEnabled(false);
                      break;
                  case HIGH:
                      btnShoot.setEnabled(true);
                      btnSonarOp.setEnabled(true);
                      btnTomahawk.setEnabled(true);
                      btnTrident2.setEnabled(false);
                      break;
                  case STRONG:
                      btnShoot.setEnabled(true);
                      btnSonarOp.setEnabled(true);
                      btnTomahawk.setEnabled(true);
                      btnTrident2.setEnabled(true);
                      break;
                        
              }
            
       
    }
    
    //--------set Soldiers Count--------
    public void setSoldierCount(int soldiers){
        if(soldiers<this.soldiers){
            this.soldiers=soldiers;
        }
    }
    
    //----------send soldier count function-------
    public void displaySoldierCount(){
       if((int)soldierCount.getValue()>=0){
           mainController.displayExtraDetais(super.getTitle(),"Soldier Count", ""+soldiers);
       }
   }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submarine(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammoCount;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonarOp;
    private javax.swing.JButton btnTomahawk;
    private javax.swing.JButton btnTrident2;
    private javax.swing.JTextArea displayMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderEnergy;
    private javax.swing.JSlider jSliderOxigen;
    private javax.swing.JLabel lblAreaCleared;
    private javax.swing.JLabel lblsoldierCount;
    private javax.swing.JLabel lblsoldierCount1;
    private javax.swing.JCheckBox position;
    private javax.swing.JSpinner soldierCount;
    private javax.swing.JTextField txtSendMsg;
    // End of variables declaration//GEN-END:variables
}
