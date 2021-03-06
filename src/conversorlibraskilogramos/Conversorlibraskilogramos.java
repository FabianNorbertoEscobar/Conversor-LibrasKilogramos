/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorlibraskilogramos;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian
 */
public class Conversorlibraskilogramos extends javax.swing.JFrame {

    /**
     * Creates new form Conversorlibraskilogramos
     */
    public Conversorlibraskilogramos() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        getContentPane().setBackground(Color.GREEN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        akilogramosButton = new javax.swing.JButton();
        alibrasButton = new javax.swing.JButton();
        librasTextField = new javax.swing.JTextField();
        kilogramosTextField = new javax.swing.JTextField();
        librasLabel = new javax.swing.JLabel();
        kilogramosLabel = new javax.swing.JLabel();
        conversorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de masa");

        akilogramosButton.setBackground(new java.awt.Color(255, 255, 0));
        akilogramosButton.setText("A kilogramos");
        akilogramosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akilogramosButtonActionPerformed(evt);
            }
        });

        alibrasButton.setBackground(new java.awt.Color(255, 255, 0));
        alibrasButton.setText("A libras");
        alibrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alibrasButtonActionPerformed(evt);
            }
        });

        librasTextField.setBackground(new java.awt.Color(204, 102, 255));
        librasTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librasTextFieldActionPerformed(evt);
            }
        });

        kilogramosTextField.setBackground(new java.awt.Color(204, 102, 255));

        librasLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        librasLabel.setText("Libras");

        kilogramosLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kilogramosLabel.setText("Kilogramos");

        conversorLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        conversorLabel.setText("CONVERSOR LIBRAS-KILOGRAMOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(librasLabel)
                    .addComponent(kilogramosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kilogramosTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(librasTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(akilogramosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alibrasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(conversorLabel)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(conversorLabel)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akilogramosButton)
                    .addComponent(librasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(librasLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alibrasButton)
                    .addComponent(kilogramosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilogramosLabel))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akilogramosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akilogramosButtonActionPerformed
        // TODO add your handling code here:
        String librasString=librasTextField.getText();
        if(librasString.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Debe ingresar un número en el campo libras","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            return;
        }
        double libras;
        try
        {
            libras=Double.valueOf(librasString);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this,"El valor ingresado \""+librasString+"\" no conforma un número","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        double kilogramos=libras*0.45;
        String kilogramosString=String.format("%.2f", kilogramos);
        kilogramosString=kilogramosString.replace(',','.');
        kilogramosTextField.setText(kilogramosString);
                
    }//GEN-LAST:event_akilogramosButtonActionPerformed

    private void librasTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librasTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librasTextFieldActionPerformed

    private void alibrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alibrasButtonActionPerformed
        // TODO add your handling code here:
        String kilogramosString=kilogramosTextField.getText();
        if(kilogramosString.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Debe ingresar un número en el campo kilogramos","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            return;
        }
        double kilogramos;
        try
        {
            kilogramos=Double.valueOf(kilogramosString);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "El valor ingresado \""+kilogramosString+"\" no conforma un número","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        double libras=kilogramos/0.45;
        String librasString=String.format("%.2f",libras);
        librasString=librasString.replace(',','.');
        librasTextField.setText(librasString);
        
    }//GEN-LAST:event_alibrasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Conversorlibraskilogramos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversorlibraskilogramos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversorlibraskilogramos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversorlibraskilogramos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversorlibraskilogramos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akilogramosButton;
    private javax.swing.JButton alibrasButton;
    private javax.swing.JLabel conversorLabel;
    private javax.swing.JLabel kilogramosLabel;
    private javax.swing.JTextField kilogramosTextField;
    private javax.swing.JLabel librasLabel;
    private javax.swing.JTextField librasTextField;
    // End of variables declaration//GEN-END:variables
}
