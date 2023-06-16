package arterial_tension.visual;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import sbc_for_hipertension_tratament_japp.Connection;
import arterial_tension.customs.Button;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;


public class InfoWindow extends javax.swing.JFrame {
        
    public InfoWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(this.getIconImage());
        enabled_tabs(true);
    }

    @Override
    public final Image getIconImage() {
        Image res = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("arterial_tension/images/icon.png"));
        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        bgroup_sex = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        tabbed = new arterial_tension.customs.MaterialTabbed();
        jp_biometric = new javax.swing.JPanel();
        jp_footer5 = new javax.swing.JPanel();
        btn_next = new arterial_tension.customs.Button();
        btn_mainmenu = new arterial_tension.customs.Button();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jp_m_condition1 = new javax.swing.JPanel();
        jp_footer2 = new javax.swing.JPanel();
        btn_next2 = new arterial_tension.customs.Button();
        btn_previous2 = new arterial_tension.customs.Button();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jp_mcondition2 = new javax.swing.JPanel();
        jp_footer3 = new javax.swing.JPanel();
        btn_previous3 = new arterial_tension.customs.Button();
        btn_mainmenu1 = new arterial_tension.customs.Button();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Hipertensión Arterial");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));

        tabbed.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jp_biometric.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer5.setBackground(new java.awt.Color(255, 255, 255));

        btn_next.setBackground(new java.awt.Color(102, 255, 0));
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_arrow-right.png"))); // NOI18N
        btn_next.setText("Siguiente");
        btn_next.setToolTipText("Siguiente prueba");
        btn_next.setFocusPainted(false);
        btn_next.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next.setIconTextGap(12);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jp_footer5Layout = new javax.swing.GroupLayout(jp_footer5);
        jp_footer5.setLayout(jp_footer5Layout);
        jp_footer5Layout.setHorizontalGroup(
            jp_footer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer5Layout.setVerticalGroup(
            jp_footer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jp_footer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Sobre la aplicación:");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Esta aplicación fue concebida con un carácter educativo como una propuesta de herramienta para\nla ayuda a los profesionales de la salud. Se basó en el análisis de la Guía Cubana de Hipertensión\nArterial en conjunto con la experiencia de un especialista en la rama de la cardiología. Por ello se\nrecomienda en caso de uso contar con la estricta supervisión de un profesional de la salud.");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jp_biometricLayout = new javax.swing.GroupLayout(jp_biometric);
        jp_biometric.setLayout(jp_biometricLayout);
        jp_biometricLayout.setHorizontalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_biometricLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_biometricLayout.setVerticalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_biometricLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jp_footer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("General", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_body-scale.png")), jp_biometric); // NOI18N

        jp_m_condition1.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer2.setBackground(new java.awt.Color(255, 255, 255));

        btn_next2.setBackground(new java.awt.Color(102, 255, 0));
        btn_next2.setForeground(new java.awt.Color(255, 255, 255));
        btn_next2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_arrow-right.png"))); // NOI18N
        btn_next2.setText("Siguiente");
        btn_next2.setToolTipText("Siguiente prueba");
        btn_next2.setFocusPainted(false);
        btn_next2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next2.setIconTextGap(12);
        btn_next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next2ActionPerformed(evt);
            }
        });

        btn_previous2.setBackground(new java.awt.Color(102, 255, 0));
        btn_previous2.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_arrow-left.png"))); // NOI18N
        btn_previous2.setText("Anterior");
        btn_previous2.setToolTipText("Prueba anterior");
        btn_previous2.setFocusPainted(false);
        btn_previous2.setIconTextGap(12);
        btn_previous2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previous2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer2Layout = new javax.swing.GroupLayout(jp_footer2);
        jp_footer2.setLayout(jp_footer2Layout);
        jp_footer2Layout.setHorizontalGroup(
            jp_footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                .addComponent(btn_next2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer2Layout.setVerticalGroup(
            jp_footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp_footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("ABREVIATURAS Y ACRÓNIMOS:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("AC: Bloqueadores de los canales del calcio\nAMPA: Auto medida de la presión arterial\nARA II: Antagonistas de los receptores de la angiotensina II\nBB: Betabloqueadores\ncHDL: HDL colesterol\ncLDL: LDL colesterol\nCNHTA: Comisión Nacional Técnica Asesora del Programa de Hipertensión Arterial\nDE: Disfunción eréctil\nDM: Diabetes mellitus\nEAP: Enfermedad arterial periférica\nECG: Electrocardiograma\nECV: Enfermedades cardiovasculares y cerebrovasculares\nERC: Enfermedad renal crónica\nFA: Fibrilación auricular\nFG: Filtrado glomerular\nFRC: Factores de riesgo cardiovascular\nGIM: Grosor de la íntima media\nGCHTA: Guía Cubana de Hipertensión Arterial\nHTA: Hipertensión arterial\nHVI: Hipertrofia ventricular izquierda\nIC: Insuficiencia cardiaca\nIECA: Inhibidores de la enzima convertidora de la angiotensina\nIMA: Infarto miocárdico agudo\nIMC: Índice de masa corporal\nIMVI: Índice de masa del ventrículo izquierdo\nIRC: Insuficiencia renal crónica\nLOD: Lesión en órgano diana\nMAPA: Monitorización ambulatoria de la presión arterial\nMINSAP: Ministerio de Salud Pública de la República de Cuba\nMVI: Masa ventricular izquierda\nOMS: Organización Mundial de la Salud\nOPS: Organización Panamericana de la Salud\nPA: Presión arterial\nPAD: Presión arterial diastólica\nPAS: Presión arterial sistólica\nPP: Presión de pulso\nRCV: Riesgo cardiovascular total\nRMN: Resonancia magnética nuclear\nSM: Síndrome metabólico\nTAC: Tomografía axial computarizada\nTG: Triglicéridos\nVI: Ventrículo izquierdo");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jp_m_condition1Layout = new javax.swing.GroupLayout(jp_m_condition1);
        jp_m_condition1.setLayout(jp_m_condition1Layout);
        jp_m_condition1Layout.setHorizontalGroup(
            jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_m_condition1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_m_condition1Layout.setVerticalGroup(
            jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_m_condition1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jp_footer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("ABREVIATURAS Y ACRÓNIMOS", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_diet.png")), jp_m_condition1); // NOI18N

        jp_mcondition2.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer3.setBackground(new java.awt.Color(255, 255, 255));

        btn_previous3.setBackground(new java.awt.Color(102, 255, 0));
        btn_previous3.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_arrow-left.png"))); // NOI18N
        btn_previous3.setText("Anterior");
        btn_previous3.setToolTipText("Prueba anterior");
        btn_previous3.setFocusPainted(false);
        btn_previous3.setIconTextGap(12);
        btn_previous3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previous3ActionPerformed(evt);
            }
        });

        btn_mainmenu1.setBackground(new java.awt.Color(102, 255, 0));
        btn_mainmenu1.setForeground(new java.awt.Color(255, 255, 255));
        btn_mainmenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_menu.png"))); // NOI18N
        btn_mainmenu1.setText("Menú Principal");
        btn_mainmenu1.setToolTipText("Volver al menú principal");
        btn_mainmenu1.setFocusPainted(false);
        btn_mainmenu1.setIconTextGap(12);
        btn_mainmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainmenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer3Layout = new javax.swing.GroupLayout(jp_footer3);
        jp_footer3.setLayout(jp_footer3Layout);
        jp_footer3Layout.setHorizontalGroup(
            jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471)
                .addComponent(btn_mainmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jp_footer3Layout.setVerticalGroup(
            jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_previous3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mainmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Sobre la Guía Cubana de Hipertensión Arterial:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("La Guía Cubana de Hipertensión Arterial (GCHTA), como habitualmente se le conoce, tuvo\nsu origen en el primer Programa Nacional de Hipertensión, editado en el año 1998, que fue\ndistribuido en todo el país, con el apoyo de una amplia campaña nacional que favoreció su\nconocimiento en toda Cuba. Posteriormente se comenzaron a editar las Guías de HTA,\nque fueron redactadas y actualizadas a través de talleres o reuniones de expertos, por\nmiembros de las comisiones asesoras nacional y de las provincias. Se sucedieron\nediciones de la Guía en los años 2003, 2006 y 2008, basadas en actualizaciones acorde\nal desarrollo del conocimiento y aportes de importantes documentos como el Joint National\nCommitte (JNC) norteamericano y las guías editadas por la Sociedad Europea de\nHipertensión Arterial y la NICE (National Institute for Health and Clinical Excellence) del \nReino Unido, entre otras, así como en la experiencia profesional de los miembros de\nnuestra CNHTA.");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jp_mcondition2Layout = new javax.swing.GroupLayout(jp_mcondition2);
        jp_mcondition2.setLayout(jp_mcondition2Layout);
        jp_mcondition2Layout.setHorizontalGroup(
            jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_mcondition2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_mcondition2Layout.setVerticalGroup(
            jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_mcondition2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jp_footer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Guía Cubana de Hipertensión Arterial", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_three-dumbell.png")), jp_mcondition2); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbed.getAccessibleContext().setAccessibleName("Tab");

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing
    // TODO add your handling code here:
    // TODO add your handling code here:

    private void jcb_coo_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_coo_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_coo_1ActionPerformed

    private void jcb_coo_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_coo_29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_coo_29ActionPerformed

    private void btn_previous3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous3ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous3ActionPerformed

    private void btn_previous2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous2ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous2ActionPerformed

    private void btn_next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next2ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next2ActionPerformed

    private void btn_mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainmenuActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_mainmenuActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_mainmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainmenu1ActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_mainmenu1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoWindow().setVisible(true);
            }
        });
    }
    
    private void transactionsNext(){
        int currentIndex = tabbed.getSelectedIndex();
        int maxIndex = tabbed.getTabCount() - 1;
        if (currentIndex < maxIndex) {
            tabbed.setSelectedIndex(currentIndex + 1);
        }
    }
    
    private void transactionsPrevious(){
        int currentIndex = tabbed.getSelectedIndex();
        if (currentIndex > 0) {
            tabbed.setSelectedIndex(currentIndex - 1);
        }
    }
    
    
    private void enabled_tabs(boolean enabled){
        tabbed.setEnabledAt(1, enabled);
        tabbed.setEnabledAt(2, enabled);
//        tabbed.setEnabledAt(3, enabled);
        status_button(btn_next, enabled);
    }
     
    
    private void status_button(Button btn, boolean enabled){
        btn.setEnabled(enabled);
        if (enabled){
            btn.setBackground(new Color(102,255,0));
        }else{
            btn.setBackground(Color.gray);
        }
    }
    
//    private int heart_rate_difference(){
//        int pulse1 = Integer.parseInt(tf_pulse1.getText());
//        int pulse2 =  Integer.parseInt(tf_pulse2.getText());     
//        return (pulse2*2) - (pulse1*2);       
//    }
    
//    private void clean_fields(){
//        tf_age.setText("");
//        tf_ta_diastolica.setText("");
//        tf_ta_sistolica.setText("");
//        for(JCheckBox checkbox: checkBoxList_rmconditons){
//                checkbox.setSelected(false);
//                //System.out.println(checkbox.getText());
//        }
//        for(JCheckBox checkbox: checkBoxList_rfactors){
//                checkbox.setSelected(false);
//                //System.out.println(checkbox.getText());
//        }
//        checkBoxList_rmconditons.clear();
//        checkBoxList_rfactors.clear();   
//    }
    
//    private String connect_with_SBC(int ta_diastolica, int ta_sitolica, String m_conditions, String r_factors){
//        String[] files = new String[1];
//        files[0] = "src/sbc_for_hipertension_tratament_japp/SBC.pl";
//        Connection c = new Connection(files);
//        String cat_aux = c.categoria(ta_diastolica, ta_sitolica);
//        String cat = "Categoria: "+cat_aux;
//        String rcv = "Riego cardriovascular: "+c.rcv(r_factors, cat_aux);
//        String estrategia = "Estrategia: "+c.propuesta_estrategia_terapeutica(r_factors, cat_aux);
//        String cont_abs = "Contraindiaciones absolutas: "+c.contraind_a(m_conditions);
//        String cont_relat = "Contraindicaiones relativa: "+c.contraind_r(m_conditions);
//        
//        return cat.replaceAll("'", "")+'\n'+rcv.replaceAll("'", "")+'\n'+estrategia.replaceAll("'", "")+'\n'+cont_abs.replaceAll("'", "")+'\n'+cont_relat.replaceAll("'", "");
//    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup bgroup_sex;
    private arterial_tension.customs.Button btn_mainmenu;
    private arterial_tension.customs.Button btn_mainmenu1;
    private arterial_tension.customs.Button btn_next;
    private arterial_tension.customs.Button btn_next2;
    private arterial_tension.customs.Button btn_previous2;
    private arterial_tension.customs.Button btn_previous3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JPanel jp_biometric;
    private javax.swing.JPanel jp_footer2;
    private javax.swing.JPanel jp_footer3;
    private javax.swing.JPanel jp_footer5;
    private javax.swing.JPanel jp_m_condition1;
    private javax.swing.JPanel jp_mcondition2;
    private arterial_tension.customs.MaterialTabbed tabbed;
    // End of variables declaration//GEN-END:variables

}
