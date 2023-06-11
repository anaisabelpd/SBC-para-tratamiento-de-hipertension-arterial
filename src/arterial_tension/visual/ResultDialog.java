package arterial_tension.visual;

import java.awt.Image;
import java.awt.Toolkit;

public class ResultDialog extends javax.swing.JDialog {

    private String action;

    public ResultDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(this.getIconImage());
    }
    
    public final Image getIconImage() {
        Image res = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("arterial_tension/images/icon.png"));
        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        labelPoints = new javax.swing.JLabel();
        btn_again = new arterial_tension.customs.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        labelMessage = new javax.swing.JTextArea();
        btn_mainmenu = new arterial_tension.customs.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Resultado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));

        labelPoints.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPoints.setText("Resultados del análisis:");

        btn_again.setBackground(new java.awt.Color(102, 255, 0));
        btn_again.setForeground(new java.awt.Color(255, 255, 255));
        btn_again.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_rotate.png"))); // NOI18N
        btn_again.setText("Volver a realizar");
        btn_again.setToolTipText("Volver a realizar otra prueba");
        btn_again.setFocusPainted(false);
        btn_again.setIconTextGap(12);
        btn_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_againActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);

        labelMessage.setColumns(20);
        labelMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMessage.setLineWrap(true);
        labelMessage.setRows(4);
        labelMessage.setWrapStyleWord(true);
        labelMessage.setAlignmentX(0.0F);
        labelMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelMessage.setFocusable(false);
        jScrollPane3.setViewportView(labelMessage);

        btn_mainmenu.setBackground(new java.awt.Color(102, 255, 0));
        btn_mainmenu.setForeground(new java.awt.Color(255, 255, 255));
        btn_mainmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_menu.png"))); // NOI18N
        btn_mainmenu.setText("Menú Principal");
        btn_mainmenu.setToolTipText("Volver al menú principal");
        btn_mainmenu.setFocusPainted(false);
        btn_mainmenu.setIconTextGap(12);
        btn_mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btn_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_again, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(labelPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(labelPoints)
                .addGap(68, 68, 68)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_again, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_againActionPerformed
        action = "again";
        this.dispose();
    }//GEN-LAST:event_btn_againActionPerformed

    private void btn_mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainmenuActionPerformed
        action = "menu";
        this.dispose();
    }//GEN-LAST:event_btn_mainmenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        action = "menu";
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultDialog dialog = new ResultDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void setPoints(String points){
        String msg = "Puntuación: "+points+"/20";
        labelPoints.setText(msg);
    }
    
    public void setMessage(String msg){
        labelMessage.setText(msg);
    }
    
    public String getAction(){
        return action;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private arterial_tension.customs.Button btn_again;
    private arterial_tension.customs.Button btn_mainmenu;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea labelMessage;
    private javax.swing.JLabel labelPoints;
    // End of variables declaration//GEN-END:variables
}
