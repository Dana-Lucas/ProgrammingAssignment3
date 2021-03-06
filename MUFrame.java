/* 
 * CSC 120 PA3
 * Dana Lucas  
 * 10/15/2019
 *   
 * Project Description: This program creates rockets on a background that switches between a night sky and daylight. 
 *                      The rockets move vertically and horizontally when the Move Objects button is pressed. The thrusters 
 *                      are turned on/off when the Change Thrusters button is pressed, but are also activated/deactivated
 *                      when the rocket reaches the bottom/top of the screen.
 *
 * Acknowledgements:
 * 
 */
 
import java.awt.*;
import javax.swing.*;

public class MUFrame extends javax.swing.JFrame {

    private MUPanel muPanel;
    
    // declare private data here
    
    
    // constructor method
    public MUFrame() {
        initComponents();
        muPanel = new MUPanel();
        drawingPanel.add(muPanel);
        
        
        
        
    } // end of constructor
    
    // declare other methods here
    
    
    
      

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingPanel = new javax.swing.JPanel();
        moveObjects = new javax.swing.JButton();
        changeThrusters = new javax.swing.JButton();
        changeScene = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program authored by Dana Lucas");

        moveObjects.setText("Move Rocket");
        moveObjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveObjectsActionPerformed(evt);
            }
        });

        changeThrusters.setText("Change Thrusters");
        changeThrusters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeThrustersActionPerformed(evt);
            }
        });

        changeScene.setText("Change Scene");
        changeScene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSceneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawingPanelLayout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingPanelLayout.createSequentialGroup()
                        .addComponent(changeScene)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingPanelLayout.createSequentialGroup()
                        .addComponent(changeThrusters)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingPanelLayout.createSequentialGroup()
                        .addComponent(moveObjects)
                        .addGap(34, 34, 34))))
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawingPanelLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(moveObjects)
                .addGap(18, 18, 18)
                .addComponent(changeThrusters)
                .addGap(18, 18, 18)
                .addComponent(changeScene)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moveObjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveObjectsActionPerformed
        muPanel.moveObjects();
        muPanel.repaint();
    }//GEN-LAST:event_moveObjectsActionPerformed
       
    private void changeThrustersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeThrustersActionPerformed
        muPanel.changeThrusters();
        muPanel.repaint();
    }//GEN-LAST:event_changeThrustersActionPerformed

    private void changeSceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSceneActionPerformed
        muPanel.changeScene();
        muPanel.repaint();
    }//GEN-LAST:event_changeSceneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MUFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeScene;
    private javax.swing.JButton changeThrusters;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JButton moveObjects;
    // End of variables declaration//GEN-END:variables
}
