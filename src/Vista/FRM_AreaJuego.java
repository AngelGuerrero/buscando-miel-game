/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.HiloJuego;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author krist
 */
public class FRM_AreaJuego extends javax.swing.JFrame {
   String estadoPersonaje = "Suelo";
    HiloJuego hilo;
    private Clip sonidoFondo;
    /**
     * Creates new form FRM_AreaJuego
     */
    public FRM_AreaJuego() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(abeja, "src/ImagenesJuego/abeja.gif");
        rsscalelabel.RSScaleLabel.setScaleLabel(memilCorriendo, "src/ImagenesJuego/MemilCaminando.gif");
        setLocation(10, 10);
        memilCorriendo.setLocation(200, 400);
        hilo = new HiloJuego(this);
        hilo.start();
        try {
            sonidoFondo = AudioSystem.getClip();
            sonidoFondo.open(AudioSystem.getAudioInputStream(
                    getClass().getResource("src/ImagenesJuego/black_box-153858.mp3")));
            sonidoFondo.loop(10);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void moverPersonaje() {
        if (estadoPersonaje.equals("Subiendo")) {
            memilCorriendo.setLocation(memilCorriendo.getX() + 1, memilCorriendo.getY() - 5);
        }
        if (memilCorriendo.getY() < 20) {
            estadoPersonaje = "Bajando";
        }
        if (estadoPersonaje.equals("Bajando")) {
            memilCorriendo.setLocation(memilCorriendo.getX(), memilCorriendo.getY() + 5);
        }
        if (memilCorriendo.getY() >= 333) {
            estadoPersonaje = "Suelo";
        }
    }//Fin del metodo moverPersonaje
    
    public void moverFondo() {
        if (fondo.getX() > -170) {
            fondo.setLocation(fondo.getX() - 1, fondo.getY());
        } else {
            fondo.setLocation(0, fondo.getY());
        }
    }//Fin del metodo moverFondo
    
     public void moverAbeja() {
        abeja.setLocation(abeja.getX() - 2, abeja.getY());
        if (abeja.getX() < -50) {
            abeja.setLocation(1000, abeja.getY());
        }
    }//Fin del metodo moverMalo
     
     public void detectarColision() {
        if (abeja.getX() < (memilCorriendo.getX() + 115)
                && (abeja.getX() + 110) > memilCorriendo.getX()
                && (memilCorriendo.getY() + 35) > abeja.getY()) {
            hilo.gameOver = true;

        } 

    }//Finb del metodo

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abeja = new javax.swing.JLabel();
        memilCorriendo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abeja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/Abeja.gif"))); // NOI18N
        getContentPane().add(abeja, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 100, 100));

        memilCorriendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/MemilCaminando.gif"))); // NOI18N
        getContentPane().add(memilCorriendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 170));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abeja;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel memilCorriendo;
    // End of variables declaration//GEN-END:variables
}
