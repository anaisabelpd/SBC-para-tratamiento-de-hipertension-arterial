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
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_ta_sistolica = new arterial_tension.customs.TextField();
        jLabel11 = new javax.swing.JLabel();
        tf_ta_diastolica = new arterial_tension.customs.TextField();
        jLabel12 = new javax.swing.JLabel();
        rb_coo_13 = new arterial_tension.customs.RadioButton();
        rb_coo_22 = new arterial_tension.customs.RadioButton();
        jp_coordination = new javax.swing.JPanel();
        jp_footer1 = new javax.swing.JPanel();
        btn_next1 = new arterial_tension.customs.Button();
        btn_previous1 = new arterial_tension.customs.Button();
        rb_coo_1 = new arterial_tension.customs.RadioButton();
        rb_coo_2 = new arterial_tension.customs.RadioButton();
        rb_coo_3 = new arterial_tension.customs.RadioButton();
        rb_coo_5 = new arterial_tension.customs.RadioButton();
        rb_coo_4 = new arterial_tension.customs.RadioButton();
        jLabel1 = new javax.swing.JLabel();
        rb_coo_7 = new arterial_tension.customs.RadioButton();
        rb_coo_8 = new arterial_tension.customs.RadioButton();
        rb_coo_9 = new arterial_tension.customs.RadioButton();
        rb_coo_10 = new arterial_tension.customs.RadioButton();
        rb_coo_11 = new arterial_tension.customs.RadioButton();
        jp_flexibility = new javax.swing.JPanel();
        jp_footer2 = new javax.swing.JPanel();
        btn_next2 = new arterial_tension.customs.Button();
        btn_previous2 = new arterial_tension.customs.Button();
        jLabel6 = new javax.swing.JLabel();
        rb_coo_14 = new arterial_tension.customs.RadioButton();
        rb_coo_15 = new arterial_tension.customs.RadioButton();
        rb_coo_16 = new arterial_tension.customs.RadioButton();
        rb_coo_17 = new arterial_tension.customs.RadioButton();
        rb_coo_18 = new arterial_tension.customs.RadioButton();
        rb_coo_19 = new arterial_tension.customs.RadioButton();
        rb_coo_20 = new arterial_tension.customs.RadioButton();
        rb_coo_21 = new arterial_tension.customs.RadioButton();
        rb_coo_6 = new arterial_tension.customs.RadioButton();
        rb_coo_12 = new arterial_tension.customs.RadioButton();
        jp_strength = new javax.swing.JPanel();
        jp_footer3 = new javax.swing.JPanel();
        btn_next3 = new arterial_tension.customs.Button();
        btn_previous3 = new arterial_tension.customs.Button();
        jLabel7 = new javax.swing.JLabel();
        rb_coo_23 = new arterial_tension.customs.RadioButton();
        rb_coo_24 = new arterial_tension.customs.RadioButton();
        rb_coo_25 = new arterial_tension.customs.RadioButton();
        rb_coo_26 = new arterial_tension.customs.RadioButton();
        rb_coo_27 = new arterial_tension.customs.RadioButton();
        rb_coo_28 = new arterial_tension.customs.RadioButton();
        rb_coo_29 = new arterial_tension.customs.RadioButton();
        jp_resistance = new javax.swing.JPanel();
        jp_footer4 = new javax.swing.JPanel();
        btn_finish = new arterial_tension.customs.Button();
        btn_previous4 = new arterial_tension.customs.Button();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jl_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Hipertension Arterial");
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

        tf_age.setToolTipText("Inserte su edad(mayor que 18 y menor de 55)");
        tf_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_ageKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Complete los siguientes campos:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("PA Diastólica");

        tf_ta_sistolica.setToolTipText("Inserte la TA Sistolica");
        tf_ta_sistolica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_ta_sistolicaKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("PA Sistólica");

        tf_ta_diastolica.setToolTipText("Inserte la TA Diastolica");
        tf_ta_diastolica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_ta_diastolicaKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setText("Sexo");

        rb_coo_13.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_13.setText("Hombre");
        rb_coo_13.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_13.setFocusPainted(false);
        rb_coo_13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_13.setIconTextGap(8);

        rb_coo_22.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_22.setText("Mujer");
        rb_coo_22.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_22.setFocusPainted(false);
        rb_coo_22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_22.setIconTextGap(8);

        javax.swing.GroupLayout jp_biometricLayout = new javax.swing.GroupLayout(jp_biometric);
        jp_biometric.setLayout(jp_biometricLayout);
        jp_biometricLayout.setHorizontalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_biometricLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2)
                            .addComponent(rb_coo_13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(tf_ta_sistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(tf_ta_diastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(418, 447, Short.MAX_VALUE))
        );
        jp_biometricLayout.setVerticalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_biometricLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ta_sistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_ta_diastolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addComponent(rb_coo_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_coo_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jp_footer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Datos del paciente", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_body-scale.png")), jp_biometric); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
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

        rb_coo_1.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_1.setSelected(true);
        rb_coo_1.setText("Gota");
        rb_coo_1.setActionCommand("No mantiene el equilibrio");
        rb_coo_1.setFocusPainted(false);
        rb_coo_1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_1.setIconTextGap(8);
        rb_coo_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_coo_1ActionPerformed(evt);
            }
        });

        rb_coo_2.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_2.setText("Asma");
        rb_coo_2.setActionCommand("Mantiene el equilibrio al menos cinco segundos");
        rb_coo_2.setFocusPainted(false);
        rb_coo_2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_2.setIconTextGap(8);

        rb_coo_3.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_3.setText("Bloqueo AV grado II");
        rb_coo_3.setActionCommand("Mantiene el equilibrio por lo menos diez segundos");
        rb_coo_3.setFocusPainted(false);
        rb_coo_3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_3.setIconTextGap(8);

        rb_coo_5.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_5.setText("Disfunción del VI grave");
        rb_coo_5.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_5.setFocusPainted(false);
        rb_coo_5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_5.setIconTextGap(8);

        rb_coo_4.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_4.setText("Bloqueo AV grado III");
        rb_coo_4.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados");
        rb_coo_4.setFocusPainted(false);
        rb_coo_4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_4.setIconTextGap(8);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Seleccione a partir de las enfermedades, situaciones o padecimientos que presenta el paciente:");

        rb_coo_7.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_7.setText("Bloqueo trifascicular");
        rb_coo_7.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_7.setFocusPainted(false);
        rb_coo_7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_7.setIconTextGap(8);

        rb_coo_8.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_8.setText("Angioedema");
        rb_coo_8.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_8.setFocusPainted(false);
        rb_coo_8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_8.setIconTextGap(8);

        rb_coo_9.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_9.setText("Hiperpotasemia");
        rb_coo_9.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_9.setFocusPainted(false);
        rb_coo_9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_9.setIconTextGap(8);

        rb_coo_10.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_10.setText("Estenosis arterial renal bilateral");
        rb_coo_10.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_10.setFocusPainted(false);
        rb_coo_10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_10.setIconTextGap(8);

        rb_coo_11.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_11.setText("Insuficiencia renal aguda");
        rb_coo_11.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_11.setFocusPainted(false);
        rb_coo_11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_11.setIconTextGap(8);

        javax.swing.GroupLayout jp_coordinationLayout = new javax.swing.GroupLayout(jp_coordination);
        jp_coordination.setLayout(jp_coordinationLayout);
        jp_coordinationLayout.setHorizontalGroup(
            jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_coordinationLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_coordinationLayout.createSequentialGroup()
                        .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rb_coo_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rb_coo_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_coordinationLayout.setVerticalGroup(
            jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_coordinationLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_coordinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jp_footer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        tabbed.addTab("Condición Medica", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_equanimity.png")), jp_coordination); // NOI18N

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Seleccione a partir de las enfermedades, situaciones o padecimientos que presenta el paciente:");

        rb_coo_14.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_14.setText("Embarazo");
        rb_coo_14.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_14.setFocusPainted(false);
        rb_coo_14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_14.setIconTextGap(8);

        rb_coo_15.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_15.setText("Síndrome metabólico");
        rb_coo_15.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_15.setFocusPainted(false);
        rb_coo_15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_15.setIconTextGap(8);

        rb_coo_16.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_16.setText("Intolerancia a la glucosa");
        rb_coo_16.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_16.setFocusPainted(false);
        rb_coo_16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_16.setIconTextGap(8);

        rb_coo_17.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_17.setText("Atletas en activo");
        rb_coo_17.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_17.setFocusPainted(false);
        rb_coo_17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_17.setIconTextGap(8);

        rb_coo_18.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_18.setText("EAP");
        rb_coo_18.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_18.setFocusPainted(false);
        rb_coo_18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_18.setIconTextGap(8);

        rb_coo_19.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_19.setText("EPOC");
        rb_coo_19.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_19.setFocusPainted(false);
        rb_coo_19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_19.setIconTextGap(8);

        rb_coo_20.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_20.setText("Bradicardia");
        rb_coo_20.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_20.setFocusPainted(false);
        rb_coo_20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_20.setIconTextGap(8);

        rb_coo_21.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_21.setText("Taquiarritmia");
        rb_coo_21.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_21.setFocusPainted(false);
        rb_coo_21.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_21.setIconTextGap(8);

        rb_coo_6.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_6.setText("Insuficiencia cardiaca");
        rb_coo_6.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_6.setFocusPainted(false);
        rb_coo_6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_6.setIconTextGap(8);

        rb_coo_12.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_12.setText("Insuficiencia renal grave");
        rb_coo_12.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_12.setFocusPainted(false);
        rb_coo_12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_12.setIconTextGap(8);

        javax.swing.GroupLayout jp_flexibilityLayout = new javax.swing.GroupLayout(jp_flexibility);
        jp_flexibility.setLayout(jp_flexibilityLayout);
        jp_flexibilityLayout.setHorizontalGroup(
            jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_flexibilityLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jp_flexibilityLayout.createSequentialGroup()
                        .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rb_coo_18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rb_coo_12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_coo_20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(rb_coo_21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(rb_coo_19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(rb_coo_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jp_flexibilityLayout.setVerticalGroup(
            jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_flexibilityLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jp_flexibilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jp_footer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Condición Medica", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_diet.png")), jp_flexibility); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Seleccione a partir de los factores de riesgo que presenta el paciente:");

        rb_coo_23.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_23.setText("Dieta malsana");
        rb_coo_23.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_23.setFocusPainted(false);
        rb_coo_23.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_23.setIconTextGap(8);

        rb_coo_24.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_24.setText("Inactividad física");
        rb_coo_24.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_24.setFocusPainted(false);
        rb_coo_24.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_24.setIconTextGap(8);

        rb_coo_25.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_25.setText("Consumo de tabaco");
        rb_coo_25.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_25.setFocusPainted(false);
        rb_coo_25.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_25.setIconTextGap(8);

        rb_coo_26.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_26.setText("Consumo de alcohol");
        rb_coo_26.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_26.setFocusPainted(false);
        rb_coo_26.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_26.setIconTextGap(8);

        rb_coo_27.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_27.setText("Sobrepeso");
        rb_coo_27.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_27.setFocusPainted(false);
        rb_coo_27.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_27.setIconTextGap(8);

        rb_coo_28.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_28.setText("Antecedentes familiares");
        rb_coo_28.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_28.setFocusPainted(false);
        rb_coo_28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_28.setIconTextGap(8);

        rb_coo_29.setBackground(new java.awt.Color(102, 255, 0));
        rb_coo_29.setText("LOD");
        rb_coo_29.setActionCommand("Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza");
        rb_coo_29.setFocusPainted(false);
        rb_coo_29.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_coo_29.setIconTextGap(8);
        rb_coo_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_coo_29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_strengthLayout = new javax.swing.GroupLayout(jp_strength);
        jp_strength.setLayout(jp_strengthLayout);
        jp_strengthLayout.setHorizontalGroup(
            jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_strengthLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jp_strengthLayout.createSequentialGroup()
                            .addComponent(rb_coo_23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(65, 65, 65)
                            .addComponent(rb_coo_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(157, 157, 157))
                        .addComponent(jLabel7))
                    .addGroup(jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rb_coo_24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_coo_25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_coo_26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_coo_27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_coo_28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_strengthLayout.setVerticalGroup(
            jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_strengthLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addGroup(jp_strengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coo_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_coo_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(rb_coo_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(rb_coo_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(rb_coo_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(rb_coo_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(rb_coo_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jp_footer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Factores de riesgo", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_three-dumbell.png")), jp_strength); // NOI18N

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jp_resistanceLayout.setVerticalGroup(
            jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_resistanceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jl_msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
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
            .addComponent(tabbed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
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
        //actionFinish();
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
//            double weigth = Double.parseDouble(tf_weigth.getText());
//            jl_msg.setText("Dado su peso corporal ("+ weigth +"kg), usted debe realizar el ejercicio indicado con "+ repeats(weigth) +" repeticiones.");
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_ageKeyReleased

    private void tf_ta_sistolicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ta_sistolicaKeyReleased
        if (is_biometric_valid()){
            enabled_tabs(true);
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_ta_sistolicaKeyReleased

    private void rb_coo_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_coo_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_coo_1ActionPerformed

    private void tf_ta_diastolicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ta_diastolicaKeyReleased
        if (is_biometric_valid()){
            enabled_tabs(true);
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_ta_diastolicaKeyReleased

    private void rb_coo_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_coo_29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_coo_29ActionPerformed

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
    
//    private void actionFinish() {
////        double weigth = Double.parseDouble(tf_weigth.getText());
////        double height = Double.parseDouble(tf_height.getText())/100;
//        if (is_biometric_valid() && is_strenght_valid() && is_resistance_valid()) {
//            // obtener datos insertados 
//            int age = Integer.parseInt(tf_age.getText());
//            String option_coordination = optionSelected(bgroup_coordination);
//            String option_flexibility = optionSelected(bgroup_flexibility);
//            int strenght_repeats = Integer.parseInt(tf_repeat.getText());
//            int heart_rate = heart_rate_difference();
//            // consultar el SBC
////            String[] msg = connect_with_SBC(age, weigth, height, option_coordination, option_flexibility, strenght_repeats, heart_rate);
//            // mostar dialogo con resultado
//            ResultDialog rw = new ResultDialog(null, true);
////            rw.setPoints(msg[0]);
////            rw.setMessage(msg[1]);
//            rw.setVisible(true);
//            // accion a realizar
//            if (rw.getAction().equals("menu")){
//                MainWindow mw = new MainWindow();
//                mw.setVisible(true);
//                this.dispose();
//            }else{           
//                clean_fields();
//                tf_age.requestFocus();
//                enabled_tabs(false);
//                tabbed.setSelectedIndex(0);
//            }
//        }else{
//            JOptionPane.showMessageDialog(this, "No ha completado todas las pruebas, compruebe los campos.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    
    private String optionSelected(ButtonGroup button_group){
        ButtonModel selectedButtonModel = button_group.getSelection();
        return selectedButtonModel.getActionCommand();
    }
    
    private boolean isInteger(String input){
        String regex = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
    
//    private boolean isFloat(String input){
//        String regex = "^\\d+(\\.\\d+)?$";
//        Pattern pattern = Pattern.compile(regex);
//        return pattern.matcher(input).matches();
//    }
    
    private boolean is_biometric_valid(){
        String age = tf_age.getText();
        String ta_diastolica = tf_ta_diastolica.getText();
        String ta_sistolica = tf_ta_sistolica.getText();
        
        if (isInteger(age) && isInteger(ta_diastolica) && isInteger(ta_sistolica)){
            if (Integer.parseInt(age) > 0 && Integer.parseInt(ta_diastolica) > 0 && Integer.parseInt(ta_sistolica) > 0){
                return true;
            }           
        }
        return false;
    }
    
//    private boolean is_strenght_valid(){
//        String repeat = tf_repeat.getText();
//        return isInteger(repeat) && Integer.parseInt(repeat) > 0;
//    }
    
//    private boolean is_resistance_valid(){
//        String pulse1 = tf_pulse1.getText();
//        String pulse2 = tf_pulse2.getText();
//        return isInteger(pulse1) && Integer.parseInt(pulse1) > 0
//                && isInteger(pulse2) && Integer.parseInt(pulse2) > 0;
//    }
    
//    private int repeats(double weigth){
//        int repeat = 0;
//        if (weigth <= 60){
//            repeat = 30;
//        }else if(weigth <= 80){
//            repeat = 25;
//        }else{
//            repeat = 20;
//        }
//        return repeat;
//    }
    
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
    
//    private int heart_rate_difference(){
//        int pulse1 = Integer.parseInt(tf_pulse1.getText());
//        int pulse2 =  Integer.parseInt(tf_pulse2.getText());     
//        return (pulse2*2) - (pulse1*2);       
//    }
    
    private void clean_fields(){
        tf_age.setText("");
        tf_ta_diastolica.setText("");
        tf_ta_sistolica.setText("");
        rb_coo_1.setSelected(true);
//        rb_fle_1.setSelected(true);
//        tf_repeat.setText("");
//        tf_pulse1.setText("");
//        tf_pulse2.setText("");       
    }
    
    private String[] connect_with_SBC(int age, double weigth, double height, String coordination, String flexibility, int strong, int resistence){
        String[] files = new String[1];
        files[0] = "src/arterial_tension/SBC.pl";
        Connection c = new Connection(files);

        String[] res = c.condition(age, weigth, height, coordination, flexibility, strong, resistence);
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane4;
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
    private arterial_tension.customs.RadioButton rb_coo_10;
    private arterial_tension.customs.RadioButton rb_coo_11;
    private arterial_tension.customs.RadioButton rb_coo_12;
    private arterial_tension.customs.RadioButton rb_coo_13;
    private arterial_tension.customs.RadioButton rb_coo_14;
    private arterial_tension.customs.RadioButton rb_coo_15;
    private arterial_tension.customs.RadioButton rb_coo_16;
    private arterial_tension.customs.RadioButton rb_coo_17;
    private arterial_tension.customs.RadioButton rb_coo_18;
    private arterial_tension.customs.RadioButton rb_coo_19;
    private arterial_tension.customs.RadioButton rb_coo_2;
    private arterial_tension.customs.RadioButton rb_coo_20;
    private arterial_tension.customs.RadioButton rb_coo_21;
    private arterial_tension.customs.RadioButton rb_coo_22;
    private arterial_tension.customs.RadioButton rb_coo_23;
    private arterial_tension.customs.RadioButton rb_coo_24;
    private arterial_tension.customs.RadioButton rb_coo_25;
    private arterial_tension.customs.RadioButton rb_coo_26;
    private arterial_tension.customs.RadioButton rb_coo_27;
    private arterial_tension.customs.RadioButton rb_coo_28;
    private arterial_tension.customs.RadioButton rb_coo_29;
    private arterial_tension.customs.RadioButton rb_coo_3;
    private arterial_tension.customs.RadioButton rb_coo_4;
    private arterial_tension.customs.RadioButton rb_coo_5;
    private arterial_tension.customs.RadioButton rb_coo_6;
    private arterial_tension.customs.RadioButton rb_coo_7;
    private arterial_tension.customs.RadioButton rb_coo_8;
    private arterial_tension.customs.RadioButton rb_coo_9;
    private arterial_tension.customs.MaterialTabbed tabbed;
    private arterial_tension.customs.TextField tf_age;
    private arterial_tension.customs.TextField tf_ta_diastolica;
    private arterial_tension.customs.TextField tf_ta_sistolica;
    // End of variables declaration//GEN-END:variables

}
