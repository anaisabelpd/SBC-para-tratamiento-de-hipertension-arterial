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

public class TestWindow extends javax.swing.JFrame {

    public TestWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(this.getIconImage());
        tf_age.requestFocus();
        enabled_tabs(false);
    }

    @Override
    public final Image getIconImage() {
        Image res = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("arterial_tension/images/icon.png"));
        return res;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroup_coordination = new javax.swing.ButtonGroup();
        bgroup_flexibility = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        tabbed = new arterial_tension.customs.MaterialTabbed();
        jp_biometric = new javax.swing.JPanel();
        jp_footer5 = new javax.swing.JPanel();
        btn_next = new arterial_tension.customs.Button();
        btn_mainmenu = new arterial_tension.customs.Button();
        jLabel2 = new javax.swing.JLabel();
        tf_age = new arterial_tension.customs.TextField();
        tf_weight = new arterial_tension.customs.TextField();
        tf_height = new arterial_tension.customs.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_age1 = new arterial_tension.customs.TextField();
        jLabel11 = new javax.swing.JLabel();
        tf_age2 = new arterial_tension.customs.TextField();
        jp_coordination = new javax.swing.JPanel();
        jp_footer1 = new javax.swing.JPanel();
        btn_next1 = new arterial_tension.customs.Button();
        btn_previous1 = new arterial_tension.customs.Button();
        rb_coo_1 = new arterial_tension.customs.RadioButton();
        rb_coo_2 = new arterial_tension.customs.RadioButton();
        rb_coo_3 = new arterial_tension.customs.RadioButton();
        rb_coo_5 = new arterial_tension.customs.RadioButton();
        rb_coo_4 = new arterial_tension.customs.RadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jp_flexibility = new javax.swing.JPanel();
        jp_footer2 = new javax.swing.JPanel();
        btn_next2 = new arterial_tension.customs.Button();
        btn_previous2 = new arterial_tension.customs.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        rb_fle_1 = new arterial_tension.customs.RadioButton();
        rb_fle_2 = new arterial_tension.customs.RadioButton();
        rb_fle_3 = new arterial_tension.customs.RadioButton();
        rb_fle_4 = new arterial_tension.customs.RadioButton();
        rb_fle_5 = new arterial_tension.customs.RadioButton();
        rb_fle_6 = new arterial_tension.customs.RadioButton();
        jp_strength = new javax.swing.JPanel();
        jp_footer3 = new javax.swing.JPanel();
        btn_next3 = new arterial_tension.customs.Button();
        btn_previous3 = new arterial_tension.customs.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        tf_repeat = new arterial_tension.customs.TextField();
        jLabel7 = new javax.swing.JLabel();
        jp_resistance = new javax.swing.JPanel();
        jp_footer4 = new javax.swing.JPanel();
        btn_finish = new arterial_tension.customs.Button();
        btn_previous4 = new arterial_tension.customs.Button();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jl_msg = new javax.swing.JLabel();
        tf_pulse1 = new arterial_tension.customs.TextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_pulse2 = new arterial_tension.customs.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Condición Física");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Edad");

        tf_age.setToolTipText("Inserte su edad");
        tf_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_ageKeyReleased(evt);
            }
        });

        tf_weight.setToolTipText("Inserte su peso en kilogramos");
        tf_weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_weightKeyReleased(evt);
            }
        });

        tf_height.setToolTipText("Inserte su altura en centímetros");
        tf_height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_heightKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Altura (cm)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Peso (kg)");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Complete los siguientes campos:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("TA Diastolica");

        tf_age1.setToolTipText("Inserte su edad");
        tf_age1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_age1KeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("TA Sistolica");

        tf_age2.setToolTipText("Inserte su edad");
        tf_age2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_age2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jp_biometricLayout = new javax.swing.GroupLayout(jp_biometric);
        jp_biometric.setLayout(jp_biometricLayout);
        jp_biometricLayout.setHorizontalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_biometricLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_height, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(tf_weight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_age2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_age1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(356, 356, 356))))
        );
        jp_biometricLayout.setVerticalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_biometricLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(tf_age2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tf_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tf_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jp_footer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Formulario 1", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_body-scale.png")), jp_biometric); // NOI18N

        jp_coordination.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer1.setBackground(new java.awt.Color(255, 255, 255));

        btn_next1.setBackground(new java.awt.Color(102, 255, 0));
        btn_next1.setForeground(new java.awt.Color(255, 255, 255));
        btn_next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_arrow-right.png"))); // NOI18N
        btn_next1.setText("Siguiente");
        btn_next1.setToolTipText("Siguiente prueba");
        btn_next1.setFocusPainted(false);
        btn_next1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next1.setIconTextGap(12);
        btn_next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next1ActionPerformed(evt);
            }
        });

        btn_previous1.setBackground(new java.awt.Color(102, 255, 0));
        btn_previous1.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_arrow-left.png"))); // NOI18N
        btn_previous1.setText("Anterior");
        btn_previous1.setToolTipText("Prueba anterior");
        btn_previous1.setFocusPainted(false);
        btn_previous1.setIconTextGap(12);
        btn_previous1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previous1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer1Layout = new javax.swing.GroupLayout(jp_footer1);
        jp_footer1.setLayout(jp_footer1Layout);
        jp_footer1Layout.setHorizontalGroup(
            jp_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_next1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer1Layout.setVerticalGroup(
            jp_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jp_footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        bgroup_coordination.add(rb_coo_1);
        rb_coo_1.setSelected(true);
        rb_coo_1.setText("<html>No mantiene el equilibrio sobre un pie ni tan siquiera balanceándose o no es capaz de mantener <br> la posición durante cinco segundos.");
        rb_coo_1.setActionCommand("No mantiene el equilibrio");
        rb_coo_1.setFocusPainted(false);
        rb_coo_1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_1.setIconTextGap(8);

        bgroup_coordination.add(rb_coo_2);
        rb_coo_2.setText("Mantiene el equilibrio al menos cinco segundos, aunque sea necesario balancearse.");
        rb_coo_2.setActionCommand("Mantiene el equilibrio al menos cinco segundos");
        rb_coo_2.setFocusPainted(false);
        rb_coo_2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_2.setIconTextGap(8);

        bgroup_coordination.add(rb_coo_3);
        rb_coo_3.setText("Mantiene el equilibrio por lo menos diez segundos, aunque sea balanceándose en algún momento.");
        rb_coo_3.setActionCommand("Mantiene el equilibrio por lo menos diez segundos");
        rb_coo_3.setFocusPainted(false);
        rb_coo_3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_3.setIconTextGap(8);

        bgroup_coordination.add(rb_coo_5);
        rb_coo_5.setText("<html>Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima <br> de la cabeza, aunque sea balanceándose.");
        rb_coo_5.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_5.setFocusPainted(false);
        rb_coo_5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_5.setIconTextGap(8);

        bgroup_coordination.add(rb_coo_4);
        rb_coo_4.setText("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados, aunque sea balanceándose.");
        rb_coo_4.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados");
        rb_coo_4.setFocusPainted(false);
        rb_coo_4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_4.setIconTextGap(8);

        jScrollPane1.setBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Hay que descalzarse sobre una superficie lisa y no deslizante y levantar una pierna sin que esta entre en contacto con la pierna de apoyo. Mientras dura el ejercicio, las manos se mantienen apoyadas sin esfuerzo en las caderas. Se da como buena aquella posición que es capaz de mantenerse sin tener que hacer movimientos compensatorios para evitar perder el equilibrio.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Seleccione:");

        javax.swing.GroupLayout jp_coordinationLayout = new javax.swing.GroupLayout(jp_coordination);
        jp_coordination.setLayout(jp_coordinationLayout);
        jp_coordinationLayout.setHorizontalGroup(
            jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_coordinationLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_coordinationLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_coordinationLayout.createSequentialGroup()
                        .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_coo_5, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                            .addComponent(rb_coo_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        jp_coordinationLayout.setVerticalGroup(
            jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_coordinationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(rb_coo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_coo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_coo_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_coo_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_coo_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jp_footer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        tabbed.addTab("Formulario 2", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_equanimity.png")), jp_coordination); // NOI18N

        jp_flexibility.setBackground(new java.awt.Color(255, 255, 255));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jScrollPane2.setBorder(null);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(6);
        jTextArea2.setText("Sentarse en el suelo con la espalda recta, las piernas juntas y rectas, los brazos estirados hacia adelante. Los pies se mantienen en ángulo recto. Se inclina la parte superior del cuerpo hacia delante lentamente tanto como se pueda.\nSe comprueba cuál es la posición que se es capaz de mantener sin dolor durante cinco segundos y se observa la distancia que hay entre los dedos de las manos y los dedos de los pies.\n");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Seleccione:");

        bgroup_flexibility.add(rb_fle_1);
        rb_fle_1.setSelected(true);
        rb_fle_1.setText("La distancia entre los dedos de las manos y los dedos de los pies es más de un palmo.");
        rb_fle_1.setActionCommand("Mas de un palmo");
        rb_fle_1.setFocusPainted(false);
        rb_fle_1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_fle_1.setIconTextGap(8);

        bgroup_flexibility.add(rb_fle_2);
        rb_fle_2.setText("La distancia es aproximadamente de un palmo.");
        rb_fle_2.setActionCommand("Aproximadamente un palmo");
        rb_fle_2.setFocusPainted(false);
        rb_fle_2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_fle_2.setIconTextGap(8);

        bgroup_flexibility.add(rb_fle_3);
        rb_fle_3.setText("La distancia equivale a la longitud del dedo índice.");
        rb_fle_3.setActionCommand("Longitud del dedo indice");
        rb_fle_3.setFocusPainted(false);
        rb_fle_3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_fle_3.setIconTextGap(8);

        bgroup_flexibility.add(rb_fle_4);
        rb_fle_4.setText("El dedo índice toca las puntas de los dedos de los pies.");
        rb_fle_4.setActionCommand("El dedo indice toca la punta de los pies");
        rb_fle_4.setFocusPainted(false);
        rb_fle_4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_fle_4.setIconTextGap(8);

        bgroup_flexibility.add(rb_fle_5);
        rb_fle_5.setText("Las puntas de los dedos de las manos se tocan con las puntas de los dedos de los pies.");
        rb_fle_5.setActionCommand("Las puntas de los dedos de las manos se tocan con las puntas de los dedos de los pies");
        rb_fle_5.setFocusPainted(false);
        rb_fle_5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_fle_5.setIconTextGap(8);

        bgroup_flexibility.add(rb_fle_6);
        rb_fle_6.setText("Las manos cubren los dedos de los pies en toda su longitud.");
        rb_fle_6.setActionCommand("Las manos cubren los dedos de los pies");
        rb_fle_6.setFocusPainted(false);
        rb_fle_6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_fle_6.setIconTextGap(8);

        javax.swing.GroupLayout jp_flexibilityLayout = new javax.swing.GroupLayout(jp_flexibility);
        jp_flexibility.setLayout(jp_flexibilityLayout);
        jp_flexibilityLayout.setHorizontalGroup(
            jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_flexibilityLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_flexibilityLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_flexibilityLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jp_flexibilityLayout.createSequentialGroup()
                        .addComponent(rb_fle_1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_flexibilityLayout.createSequentialGroup()
                        .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_fle_6, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_fle_5, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_fle_4, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_fle_3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_fle_2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jp_flexibilityLayout.setVerticalGroup(
            jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_flexibilityLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_fle_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_fle_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_fle_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_fle_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_fle_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_fle_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jp_footer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Fomrulario 3", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_diet.png")), jp_flexibility); // NOI18N

        jp_strength.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer3.setBackground(new java.awt.Color(255, 255, 255));

        btn_next3.setBackground(new java.awt.Color(102, 255, 0));
        btn_next3.setForeground(new java.awt.Color(255, 255, 255));
        btn_next3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_arrow-right.png"))); // NOI18N
        btn_next3.setText("Siguiente");
        btn_next3.setToolTipText("Siguiente prueba");
        btn_next3.setFocusPainted(false);
        btn_next3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next3.setIconTextGap(12);
        btn_next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next3ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jp_footer3Layout = new javax.swing.GroupLayout(jp_footer3);
        jp_footer3.setLayout(jp_footer3Layout);
        jp_footer3Layout.setHorizontalGroup(
            jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_next3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer3Layout.setVerticalGroup(
            jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp_footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane3.setBorder(null);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(9);
        jTextArea3.setText("Tumbarse de espaldas con las rodillas flexionadas y las plantas de los pies en contacto con el suelo. Los brazos reposan al lado del cuerpo y en contacto con este. Los dedos de las manos apuntan a los pies. Se hace una marca en el suelo en el punto exacto en donde finalizan los dedos de las manos. Luego se hace otra señal a 10 cm del punto anterior y en dirección a los pies. Ahora se tienen que levantar la cabeza y los hombros hasta que se sea capaz de llegar a la segunda marca. Después se vuelve a la posición inicial, pero sin dejar reposar la cabeza en el suelo y manteniendo la tensión abdominal.\nUn movimiento completo dura alrededor de tres segundos. Se repite el ejercicio tantas veces como sea posible.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setAlignmentX(0.0F);
        jTextArea3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea3.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea3);

        tf_repeat.setToolTipText("Inserte la cantidad de repeticiones");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Complete con la cantidad de repeticiones:");

        javax.swing.GroupLayout jp_strengthLayout = new javax.swing.GroupLayout(jp_strength);
        jp_strength.setLayout(jp_strengthLayout);
        jp_strengthLayout.setHorizontalGroup(
            jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_strengthLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jp_strengthLayout.setVerticalGroup(
            jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_strengthLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(tf_repeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jp_footer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Formulario 4", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_three-dumbell.png")), jp_strength); // NOI18N

        jp_resistance.setBackground(new java.awt.Color(255, 255, 255));

        jp_footer4.setBackground(new java.awt.Color(255, 255, 255));

        btn_finish.setBackground(new java.awt.Color(102, 255, 0));
        btn_finish.setForeground(new java.awt.Color(255, 255, 255));
        btn_finish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_check.png"))); // NOI18N
        btn_finish.setText("Finalizar");
        btn_finish.setToolTipText("Finalizar diagnóstico");
        btn_finish.setFocusPainted(false);
        btn_finish.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_finish.setIconTextGap(12);
        btn_finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finishActionPerformed(evt);
            }
        });

        btn_previous4.setBackground(new java.awt.Color(102, 255, 0));
        btn_previous4.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_arrow-left.png"))); // NOI18N
        btn_previous4.setText("Anterior");
        btn_previous4.setToolTipText("Prueba anterior");
        btn_previous4.setFocusPainted(false);
        btn_previous4.setIconTextGap(12);
        btn_previous4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previous4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_footer4Layout = new javax.swing.GroupLayout(jp_footer4);
        jp_footer4.setLayout(jp_footer4Layout);
        jp_footer4Layout.setHorizontalGroup(
            jp_footer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_previous4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jp_footer4Layout.setVerticalGroup(
            jp_footer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_footer4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp_footer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_finish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previous4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane4.setBorder(null);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(6);
        jTextArea4.setText("Lo primero que se debe hacer es tomarse el pulso. Para ello se cuentan los latidos en una muñeca durante 30 segundos. A continuación, hay que colocarse ante un escalón doble -unos 35 cm de altura- para subirlo y bajarlo con una pierna. Tras tres minutos se cambia la pierna. \nTras finalizar el ejercicio se mide de nuevo el pulso. De este segundo resultado se resta el valor del pulso en reposo.\n");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setAlignmentX(0.0F);
        jTextArea4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea4.setFocusable(false);
        jScrollPane4.setViewportView(jTextArea4);

        jl_msg.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        tf_pulse1.setToolTipText("Inserte la cantidad de pulsaciones antes de iniciar");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Pulso antes de iniciar el ejercicio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Pulso al finalizar el ejercicio:");

        tf_pulse2.setToolTipText("Inserte la cantidad de pulsaciones al finalizar");

        javax.swing.GroupLayout jp_resistanceLayout = new javax.swing.GroupLayout(jp_resistance);
        jp_resistance.setLayout(jp_resistanceLayout);
        jp_resistanceLayout.setHorizontalGroup(
            jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_resistanceLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_resistanceLayout.createSequentialGroup()
                        .addComponent(jl_msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jp_resistanceLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_resistanceLayout.createSequentialGroup()
                        .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_pulse2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_pulse1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jp_resistanceLayout.setVerticalGroup(
            jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_resistanceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jl_msg)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_pulse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_pulse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jp_footer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Formulario 5", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_run.png")), jp_resistance); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next1ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next1ActionPerformed

    private void btn_previous1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous1ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous1ActionPerformed

    private void btn_next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next2ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next2ActionPerformed

    private void btn_previous2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous2ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous2ActionPerformed

    private void btn_next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next3ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next3ActionPerformed

    private void btn_previous3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous3ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous3ActionPerformed

    private void btn_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finishActionPerformed
        actionFinish();
    }//GEN-LAST:event_btn_finishActionPerformed

    private void btn_previous4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous4ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous4ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainmenuActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_mainmenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void tf_ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ageKeyReleased
        if (is_biometric_valid()){
            enabled_tabs(true);
            // mostar mensaje con la cantidad de repeticiones a hacer
            double weight = Double.parseDouble(tf_weight.getText());
            jl_msg.setText("Dado su peso corporal ("+ weight +"kg), usted debe realizar el ejercicio indicado con "+ repeats(weight) +" repeticiones.");
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_ageKeyReleased

    private void tf_weightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_weightKeyReleased
        if (is_biometric_valid()){
            enabled_tabs(true);
            // mostar mensaje con la cantidad de repeticiones a hacer
            double weight = Double.parseDouble(tf_weight.getText());
            jl_msg.setText("Dado su peso corporal ("+ weight +"kg), usted debe realizar el ejercicio indicado con "+ repeats(weight) +" repeticiones.");
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_weightKeyReleased

    private void tf_heightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_heightKeyReleased
        if (is_biometric_valid()){
            enabled_tabs(true);
            // mostar mensaje con la cantidad de repeticiones a hacer
            double weight = Double.parseDouble(tf_weight.getText());
            jl_msg.setText("Dado su peso corporal ("+ weight +"kg), usted debe realizar el ejercicio indicado con "+ repeats(weight) +" repeticiones.");
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_heightKeyReleased

    private void tf_age1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_age1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_age1KeyReleased

    private void tf_age2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_age2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_age2KeyReleased

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
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestWindow().setVisible(true);
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
    
    private void actionFinish() {
        double weight = Double.parseDouble(tf_weight.getText());
        double height = Double.parseDouble(tf_height.getText())/100;
        if (is_biometric_valid() && is_strenght_valid() && is_resistance_valid()) {
            // obtener datos insertados 
            int age = Integer.parseInt(tf_age.getText());
            String option_coordination = optionSelected(bgroup_coordination);
            String option_flexibility = optionSelected(bgroup_flexibility);
            int strenght_repeats = Integer.parseInt(tf_repeat.getText());
            int heart_rate = heart_rate_difference();
            // consultar el SBC
            String[] msg = connect_with_SBC(age, weight, height, option_coordination, option_flexibility, strenght_repeats, heart_rate);
            // mostar dialogo con resultado
            ResultDialog rw = new ResultDialog(null, true);
            rw.setPoints(msg[0]);
            rw.setMessage(msg[1]);
            rw.setVisible(true);
            // accion a realizar
            if (rw.getAction().equals("menu")){
                MainWindow mw = new MainWindow();
                mw.setVisible(true);
                this.dispose();
            }else{           
                clean_fields();
                tf_age.requestFocus();
                enabled_tabs(false);
                tabbed.setSelectedIndex(0);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No ha completado todas las pruebas, compruebe los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String optionSelected(ButtonGroup button_group){
        ButtonModel selectedButtonModel = button_group.getSelection();
        return selectedButtonModel.getActionCommand();
    }
    
    private boolean isInteger(String input){
        String regex = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
    
    private boolean isFloat(String input){
        String regex = "^\\d+(\\.\\d+)?$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
    
    private boolean is_biometric_valid(){
        String age = tf_age.getText();
        String weight = tf_weight.getText();
        String height = tf_height.getText();
        if (isInteger(age) && isFloat(weight) && isFloat(height)){
            if (Integer.parseInt(age) > 0 && Double.parseDouble(weight) > 0 && Double.parseDouble(height) > 0){
                return true;
            }           
        }
        return false;
    }
    
    private boolean is_strenght_valid(){
        String repeat = tf_repeat.getText();
        return isInteger(repeat) && Integer.parseInt(repeat) > 0;
    }
    
    private boolean is_resistance_valid(){
        String pulse1 = tf_pulse1.getText();
        String pulse2 = tf_pulse2.getText();
        return isInteger(pulse1) && Integer.parseInt(pulse1) > 0
                && isInteger(pulse2) && Integer.parseInt(pulse2) > 0;
    }
    
    private int repeats(double weight){
        int repeat = 0;
        if (weight <= 60){
            repeat = 30;
        }else if(weight <= 80){
            repeat = 25;
        }else{
            repeat = 20;
        }
        return repeat;
    }
    
    private void enabled_tabs(boolean enabled){
        tabbed.setEnabledAt(1, enabled);
        tabbed.setEnabledAt(2, enabled);
        tabbed.setEnabledAt(3, enabled);
        tabbed.setEnabledAt(4, enabled);
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
    
    private int heart_rate_difference(){
        int pulse1 = Integer.parseInt(tf_pulse1.getText());
        int pulse2 =  Integer.parseInt(tf_pulse2.getText());     
        return (pulse2*2) - (pulse1*2);       
    }
    
    private void clean_fields(){
        tf_age.setText("");
        tf_weight.setText("");
        tf_height.setText("");
        rb_coo_1.setSelected(true);
        rb_fle_1.setSelected(true);
        tf_repeat.setText("");
        tf_pulse1.setText("");
        tf_pulse2.setText("");       
    }
    
    private String[] connect_with_SBC(int age, double weight, double height, String coordination, String flexibility, int strong, int resistence){
        String[] files = new String[1];
        files[0] = "src/arterial_tension/SBC.pl";
        Connection c = new Connection(files);

        String[] res = c.condition(age, weight, height, coordination, flexibility, strong, resistence);
        return res;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup bgroup_coordination;
    private javax.swing.ButtonGroup bgroup_flexibility;
    private arterial_tension.customs.Button btn_finish;
    private arterial_tension.customs.Button btn_mainmenu;
    private arterial_tension.customs.Button btn_next;
    private arterial_tension.customs.Button btn_next1;
    private arterial_tension.customs.Button btn_next2;
    private arterial_tension.customs.Button btn_next3;
    private arterial_tension.customs.Button btn_previous1;
    private arterial_tension.customs.Button btn_previous2;
    private arterial_tension.customs.Button btn_previous3;
    private arterial_tension.customs.Button btn_previous4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel jl_msg;
    private javax.swing.JPanel jp_biometric;
    private javax.swing.JPanel jp_coordination;
    private javax.swing.JPanel jp_flexibility;
    private javax.swing.JPanel jp_footer1;
    private javax.swing.JPanel jp_footer2;
    private javax.swing.JPanel jp_footer3;
    private javax.swing.JPanel jp_footer4;
    private javax.swing.JPanel jp_footer5;
    private javax.swing.JPanel jp_resistance;
    private javax.swing.JPanel jp_strength;
    private arterial_tension.customs.RadioButton rb_coo_1;
    private arterial_tension.customs.RadioButton rb_coo_2;
    private arterial_tension.customs.RadioButton rb_coo_3;
    private arterial_tension.customs.RadioButton rb_coo_4;
    private arterial_tension.customs.RadioButton rb_coo_5;
    private arterial_tension.customs.RadioButton rb_fle_1;
    private arterial_tension.customs.RadioButton rb_fle_2;
    private arterial_tension.customs.RadioButton rb_fle_3;
    private arterial_tension.customs.RadioButton rb_fle_4;
    private arterial_tension.customs.RadioButton rb_fle_5;
    private arterial_tension.customs.RadioButton rb_fle_6;
    private arterial_tension.customs.MaterialTabbed tabbed;
    private arterial_tension.customs.TextField tf_age;
    private arterial_tension.customs.TextField tf_age1;
    private arterial_tension.customs.TextField tf_age2;
    private arterial_tension.customs.TextField tf_height;
    private arterial_tension.customs.TextField tf_pulse1;
    private arterial_tension.customs.TextField tf_pulse2;
    private arterial_tension.customs.TextField tf_repeat;
    private arterial_tension.customs.TextField tf_weight;
    // End of variables declaration//GEN-END:variables

}
