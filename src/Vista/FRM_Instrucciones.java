/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author krist
 */
public class FRM_Instrucciones extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Instrucciones
     */
    public FRM_Instrucciones() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(Miel, "src/ImagenesJuego/Mielgiphy.gif");
        rsscalelabel.RSScaleLabel.setScaleLabel(fondoIns, "src/ImagenesJuego/InstruccionesFondo.jpg");


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Miel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fondoIns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Instrucciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 161, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Debe saltar las abejas que vienen ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 470, 40));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Para saltar pulse la tecla espacio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 331, 38));

        Miel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/Mielgiphy.gif"))); // NOI18N
        Miel.setText("jLabel4");
        getContentPane().add(Miel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, 110));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("del lado derecho de Memil");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 320, 30));

        fondoIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesJuego/InstruccionesFondo.jpg"))); // NOI18N
        fondoIns.setText("jLabel4");
        getContentPane().add(fondoIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Miel;
    private javax.swing.JLabel fondoIns;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
