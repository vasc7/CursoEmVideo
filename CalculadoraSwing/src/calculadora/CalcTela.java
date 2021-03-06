/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


/**
 *
 * @author vasco
 */
public class CalcTela extends javax.swing.JFrame {

    /**
     * Creates new form CalcTela
     */
    public CalcTela() {
        initComponents();
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
        txtNum = new javax.swing.JSpinner();
        lblRD2 = new javax.swing.JLabel();
        lblEC = new javax.swing.JLabel();
        lblRQ = new javax.swing.JLabel();
        lblRC = new javax.swing.JLabel();
        lblVA = new javax.swing.JLabel();
        lblResRD2 = new javax.swing.JLabel();
        lblResEC = new javax.swing.JLabel();
        lblResRQ = new javax.swing.JLabel();
        lblResRC = new javax.swing.JLabel();
        lblResVA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculator.png"))); // NOI18N
        jLabel1.setText("Calculadora");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel2.setText("Informe um número");

        txtNum.setModel(new javax.swing.SpinnerNumberModel(0L, null, null, 10L));

        lblRD2.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        lblRD2.setText("Resto da Divião por 2");

        lblEC.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        lblEC.setText("Elevado ao Cubo");

        lblRQ.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        lblRQ.setText("Raiz Quadrada");

        lblRC.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        lblRC.setText("Raiz Cúbica");

        lblVA.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        lblVA.setText("Valor Absoluto");

        lblResRD2.setText("?");

        lblResEC.setText("?");

        lblResRQ.setText("?");

        lblResRC.setText("?");

        lblResVA.setText("?");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEC)
                    .addComponent(lblRD2)
                    .addComponent(lblRQ)
                    .addComponent(lblRC)
                    .addComponent(lblVA)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblResRQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResEC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResRC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResVA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResRD2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRD2)
                    .addComponent(lblResRD2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEC)
                    .addComponent(lblResEC, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRQ)
                    .addComponent(lblResRQ))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRC)
                    .addComponent(lblResRC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVA)
                    .addComponent(lblResVA)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float n1 = Float.parseFloat(txtNum.getValue().toString());
        float resDiv = n1 % 2;
        float eleC = (float) Math.pow(n1,3);
        float rQ = (float) Math.sqrt(n1);
        float rC = (float) Math.cbrt(n1);
        float vA = Math.abs(n1);
        
        lblResEC.setText(String.format("%.2f", eleC));
        lblResRC.setText(String.format("%.2f", rC));
        lblResRD2.setText(String.format("%.2f", resDiv));
        lblResRQ.setText(String.format("%.2f", rQ));
        lblResVA.setText(String.format("%.2f", vA));
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
            java.util.logging.Logger.getLogger(CalcTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEC;
    private javax.swing.JLabel lblRC;
    private javax.swing.JLabel lblRD2;
    private javax.swing.JLabel lblRQ;
    private javax.swing.JLabel lblResEC;
    private javax.swing.JLabel lblResRC;
    private javax.swing.JLabel lblResRD2;
    private javax.swing.JLabel lblResRQ;
    private javax.swing.JLabel lblResVA;
    private javax.swing.JLabel lblVA;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
