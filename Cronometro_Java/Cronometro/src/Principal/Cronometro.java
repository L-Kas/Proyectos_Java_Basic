
package Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;








public class Cronometro extends javax.swing.JFrame {
private Timer tiempo;
private int centesimas =0;
private int segundos = 0;
private int minutos = 0;
private int horas = 0;

private ActionListener accion = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        centesimas++;
       if(centesimas==100){
       segundos++;
       centesimas=0;
       }
        if(segundos==60){
        minutos++;
        segundos=0;
        }
        if(minutos==60){
        horas++;
        minutos=0;
        }
        if(horas==24){
        horas=0;
        }
        actualizarEtiquetaTiempo();
    }
};





public void actualizarEtiquetaTiempo(){
String textoTiempo = (horas <=9? "0" : "") + horas +":"+(minutos <=9? "0":":") +minutos
        +":"+(segundos<=9?"0":"")+segundos+":"+(centesimas <=9?"0":"")+centesimas;
        etiquetaTexto.setText(textoTiempo);
}





    public Cronometro() {
        initComponents();
        
        tiempo = new Timer(10, accion);
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etiquetaTexto = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        btn_pausar = new javax.swing.JButton();
        btn_detener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("  CRONOMETRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 11, 334, 32));

        etiquetaTexto.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        etiquetaTexto.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaTexto.setText("00:00:00:00");
        getContentPane().add(etiquetaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 230, 50));

        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 105, 35));

        btn_pausar.setText("Pausar");
        btn_pausar.setEnabled(false);
        btn_pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pausarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 111, 98, 35));

        btn_detener.setText("Detener");
        btn_detener.setEnabled(false);
        btn_detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detenerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detener, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 111, 116, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pausarActionPerformed
       tiempo.stop();
       btn_iniciar.setEnabled(true);
       btn_detener.setEnabled(true);
       btn_pausar.setEnabled(false);
    }//GEN-LAST:event_btn_pausarActionPerformed

    private void btn_detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detenerActionPerformed
        if(tiempo.isRunning()){
          tiempo.stop();
        }
        
        centesimas=0;
        segundos=0;
        minutos=0;
        horas=0;
        
        btn_iniciar.setEnabled(true);
        btn_iniciar.setText("Inicio");
        btn_detener.setEnabled(false);
        btn_pausar.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "GRACIAS POR UTILIZAR ESTE CRONOMETRO");
        
    }//GEN-LAST:event_btn_detenerActionPerformed

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        
  tiempo.start();
  btn_iniciar.setEnabled(false);
  btn_iniciar.setText("Reanudar");
  btn_detener.setEnabled(true);
  btn_pausar.setEnabled(true);
        
        
    }//GEN-LAST:event_btn_iniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_detener;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_pausar;
    private javax.swing.JLabel etiquetaTexto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
