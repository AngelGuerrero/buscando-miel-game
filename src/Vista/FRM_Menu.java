/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.RegistroJugadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author krist
 */
public class FRM_Menu extends javax.swing.JFrame implements ActionListener{
RegistroJugadores registro;
FRM_AreaJuego areaJuego;
    /**
     * Creates new form FRM_Menu
     */
    public FRM_Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btn_Inicio = new javax.swing.JButton();
        btn_Historia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Puntuaciones = new javax.swing.JButton();
        btn_Instrucciones = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/giphy_s.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 170));

        btn_Inicio.setBackground(new java.awt.Color(255, 204, 204));
        btn_Inicio.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_Inicio.setForeground(new java.awt.Color(102, 86, 76));
        btn_Inicio.setText("Iniciar Juego");
        btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InicioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        btn_Historia.setBackground(new java.awt.Color(255, 204, 204));
        btn_Historia.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_Historia.setForeground(new java.awt.Color(102, 86, 76));
        btn_Historia.setText("Historia");
        btn_Historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HistoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/Abeja.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 150, 150));

        btn_Puntuaciones.setBackground(new java.awt.Color(255, 204, 204));
        btn_Puntuaciones.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_Puntuaciones.setForeground(new java.awt.Color(102, 86, 76));
        btn_Puntuaciones.setText("Puntuaciones");
        btn_Puntuaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PuntuacionesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Puntuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        btn_Instrucciones.setBackground(new java.awt.Color(255, 204, 204));
        btn_Instrucciones.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        btn_Instrucciones.setForeground(new java.awt.Color(102, 86, 76));
        btn_Instrucciones.setText("Instrucciones");
        btn_Instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 86, 76));
        jButton1.setText("Registro Jugador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 210, 40));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setForeground(new java.awt.Color(102, 86, 76));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InicioActionPerformed
new FRM_AreaJuego().setVisible(rootPaneCheckingEnabled);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InicioActionPerformed

    private void btn_HistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HistoriaActionPerformed
new FRM_Historia().setVisible(rootPaneCheckingEnabled);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HistoriaActionPerformed

    private void btn_PuntuacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuntuacionesActionPerformed
new FRM_Puntuaciones().setVisible(rootPaneCheckingEnabled);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PuntuacionesActionPerformed

    private void btn_InstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InstruccionesActionPerformed
new FRM_Instrucciones().setVisible(rootPaneCheckingEnabled);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InstruccionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//DATOS JUGADOR
new FRM_DatosJugador(areaJuego, registro).setVisible(rootPaneCheckingEnabled);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Historia;
    private javax.swing.JButton btn_Inicio;
    private javax.swing.JButton btn_Instrucciones;
    private javax.swing.JButton btn_Puntuaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Iniciar Juego")){
        new FRM_AreaJuego().setVisible(rootPaneCheckingEnabled);
        
        }
        if(e.getActionCommand().equals("Historia")){
        new FRM_Historia().setVisible(rootPaneCheckingEnabled);
        
        }
        if(e.getActionCommand().equals("Puntuaciones")){
        
        
        }
        if(e.getActionCommand().equals("Instrucciones")){
        
        
        }
   
    }
}
