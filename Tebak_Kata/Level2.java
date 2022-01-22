/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tebak_Kata;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Level2 extends javax.swing.JFrame {
    int c=3; //kesempatan
    int skor=0;
    /**
     * Creates new form Frame4
     */
    public Level2(int skor) {
        initComponents();
        this.skor = skor;
        jbtn1.setVisible(true);
        jbtn2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtn1 = new javax.swing.JLabel();
        jbtn2 = new javax.swing.JLabel();
        jTextFieldAnswer = new javax.swing.JTextField();
        jbtnhint = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEBAK GAMBAR - LEVEL 2");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Kata/img/btn1.png"))); // NOI18N
        jbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn1MouseExited(evt);
            }
        });
        jPanel1.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        jbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Kata/img/btn2.png"))); // NOI18N
        jbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn2MouseClicked(evt);
            }
        });
        jPanel1.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, 160));

        jTextFieldAnswer.setBackground(new java.awt.Color(232, 225, 207));
        jTextFieldAnswer.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        jTextFieldAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextFieldAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 420, 80));

        jbtnhint.setBackground(new java.awt.Color(255, 255, 51));
        jbtnhint.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbtnhint.setForeground(new java.awt.Color(255, 255, 255));
        jbtnhint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnhint.setText("HINT");
        jbtnhint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnhintMouseClicked(evt);
            }
        });
        jPanel1.add(jbtnhint, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 80, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Kata/img/HINT.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Kata/img/TIMPA.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Kata/img/LVL2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Kata/img/level2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn1MouseClicked
        // TODO add your handling code here:
        if(c>0 && jTextFieldAnswer.getText().equalsIgnoreCase("jerman")){
            skor = skor + 10;
            JOptionPane.showMessageDialog(rootPane, "CORRECT!\nSkor = "+skor);
            this.setVisible(false);
            jTextFieldAnswer.setVisible(false);
            new Level3(skor).setVisible(true);
        }

        else if(c!=1){
            --c;
            JOptionPane.showMessageDialog(rootPane, "TRY AGAIN!");
            jTextFieldAnswer.getText();
        }

        else{
            this.setVisible(false);
            new Failed_Stage(skor).setVisible(true);
        }
    }//GEN-LAST:event_jbtn1MouseClicked

    private void jbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn1MouseEntered
        // TODO add your handling code here:
        jbtn1.setVisible(false);
        jbtn2.setVisible(true);
    }//GEN-LAST:event_jbtn1MouseEntered

    private void jbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn1MouseExited
        // TODO add your handling code here:
        jbtn1.setVisible(true);
        jbtn2.setVisible(false);
    }//GEN-LAST:event_jbtn1MouseExited

    private void jbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn2MouseClicked
        // TODO add your handling code here:
        if(c>0 && jTextFieldAnswer.getText().equalsIgnoreCase("jerman")){
            skor = skor + 10;
            JOptionPane.showMessageDialog(rootPane, "CORRECT!\nSkor = "+skor);
            this.setVisible(false);
            jTextFieldAnswer.setVisible(false);
            new Level3(skor).setVisible(true);
        }

        else if(c!=1){
            --c;
            JOptionPane.showMessageDialog(rootPane, "TRY AGAIN!");
            jTextFieldAnswer.getText();
        }

        else{
            this.setVisible(false);
            new Failed_Stage(skor).setVisible(true);
        }
    }//GEN-LAST:event_jbtn2MouseClicked

    private void jbtnhintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnhintMouseClicked
        // TODO add your handling code here:
        this.jLabel2.setVisible(true);
        this.jLabel3.setVisible(false);
    }//GEN-LAST:event_jbtnhintMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.jLabel2.setVisible(true);
        this.jLabel3.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level2(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAnswer;
    private javax.swing.JLabel jbtn1;
    private javax.swing.JLabel jbtn2;
    private javax.swing.JLabel jbtnhint;
    // End of variables declaration//GEN-END:variables
}