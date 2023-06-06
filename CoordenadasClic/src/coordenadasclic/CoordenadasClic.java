package coordenadasclic;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.event.MouseEvent.BUTTON1;
import java.awt.event.MouseMotionAdapter;
import javax.swing.SwingUtilities;

public class CoordenadasClic extends javax.swing.JFrame {

    public CoordenadasClic() {
        initComponents();
        agregarEventos();
    }

    // Manejo de eventos del ratón:
    public void agregarEventos(){
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent evento){
                System.out.println("Coordenadas del puntero: " +
                        "X: " + evento.getX() +
                        ", " +
                        "Y: " + evento.getY());
            }
        });
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent evento) {
                if ( SwingUtilities.isLeftMouseButton(evento) ) {
                    System.out.println("Se pulsó el botón izquierdo del ratón");
                    System.out.println("En las coordenadas: " + "X: " + evento.getX() + " Y: " + evento.getY());
                }
                else
                    if(SwingUtilities.isMiddleMouseButton(evento) ) {
                        System.out.println("Se pulsó el botón central del ratón");
                        System.out.println("En las coordenadas: " + "X: " + evento.getX() + " Y: " + evento.getY());
                    }
                    else
                        if(SwingUtilities.isRightMouseButton(evento)) {
                            System.out.println("Se pulsó el botón derecho del ratón");
                            System.out.println("En las coordenadas: " + "X: " + evento.getX() + " Y: " + evento.getY());
                        } 
            }
        });
        
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
        lblTablero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coordenadasclic/Tablero_ejemplo.jpg"))); // NOI18N
        jPanel1.add(lblTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CoordenadasClic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoordenadasClic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoordenadasClic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoordenadasClic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoordenadasClic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTablero;
    // End of variables declaration//GEN-END:variables
}