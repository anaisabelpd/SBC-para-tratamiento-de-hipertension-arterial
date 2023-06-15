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


public class TestWindow extends javax.swing.JFrame {
    List<JCheckBox> checkBoxList_rfactors = new ArrayList<>();
    List<JCheckBox> checkBoxList_rmconditons = new ArrayList<>();
    
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        bgroup_sex = new javax.swing.ButtonGroup();
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
        rb_man = new arterial_tension.customs.RadioButton();
        rb_woman = new arterial_tension.customs.RadioButton();
        jp_m_condition1 = new javax.swing.JPanel();
        jp_footer2 = new javax.swing.JPanel();
        btn_next2 = new arterial_tension.customs.Button();
        btn_previous2 = new arterial_tension.customs.Button();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jp_mcondition2 = new javax.swing.JPanel();
        jp_footer3 = new javax.swing.JPanel();
        btn_next3 = new arterial_tension.customs.Button();
        btn_previous3 = new arterial_tension.customs.Button();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jp_resistance = new javax.swing.JPanel();
        jp_footer4 = new javax.swing.JPanel();
        btn_finish = new arterial_tension.customs.Button();
        btn_previous4 = new arterial_tension.customs.Button();
        jl_msg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox_LOD = new javax.swing.JCheckBox();
        jCheckBox_DM = new javax.swing.JCheckBox();

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

        rb_man.setBackground(new java.awt.Color(102, 255, 0));
        bgroup_sex.add(rb_man);
        rb_man.setSelected(true);
        rb_man.setText("Hombre");
        rb_man.setToolTipText("Hombre");
        rb_man.setFocusPainted(false);
        rb_man.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_man.setIconTextGap(8);
        rb_man.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_manActionPerformed(evt);
            }
        });
        rb_man.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rb_manKeyReleased(evt);
            }
        });

        rb_woman.setBackground(new java.awt.Color(102, 255, 0));
        bgroup_sex.add(rb_woman);
        rb_woman.setText("Mujer");
        rb_woman.setToolTipText("Mujer");
        rb_woman.setFocusPainted(false);
        rb_woman.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rb_woman.setIconTextGap(8);
        rb_woman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rb_manKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jp_biometricLayout = new javax.swing.GroupLayout(jp_biometric);
        jp_biometric.setLayout(jp_biometricLayout);
        jp_biometricLayout.setHorizontalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_biometricLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jp_biometricLayout.createSequentialGroup()
                        .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2)
                            .addComponent(rb_man, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_woman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addGroup(jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(tf_ta_sistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(tf_ta_diastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_biometricLayout.setVerticalGroup(
            jp_biometricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_biometricLayout.createSequentialGroup()
                .addGap(48, 48, 48)
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
                        .addComponent(rb_man, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_woman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jp_footer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Datos del paciente", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_body-scale.png")), jp_biometric); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)
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
        jLabel13.setText("Seleccione a partir de los factores de riesgo que presenta el paciente:");

        jCheckBox18.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox18.setText("Gota");
        jCheckBox18.setToolTipText("Gota");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jCheckBox19.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox19.setText("Asma");
        jCheckBox19.setToolTipText("Síndrome metabólico");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jCheckBox20.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox20.setText("Bloqueo AV grado II");
        jCheckBox20.setToolTipText("Consumo de tabaco");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        jCheckBox21.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox21.setText("Bloqueo AV grado III");
        jCheckBox21.setToolTipText("Consumo de alcohol");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jCheckBox22.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox22.setText("Disfunción del VI grave");
        jCheckBox22.setToolTipText("Consumo de alcohol");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });

        jCheckBox23.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox23.setText("Insuficiencia renal grave");
        jCheckBox23.setToolTipText("Consumo de alcohol");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jCheckBox24.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox24.setText("Estenosis arterial renal bilateral");
        jCheckBox24.setToolTipText("Consumo de alcohol");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jCheckBox25.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox25.setText("Hiperpotasemia");
        jCheckBox25.setToolTipText("LOD");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });

        jCheckBox26.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox26.setText("Angioedema");
        jCheckBox26.setToolTipText("Antecedentes familiares");
        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });

        jCheckBox27.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox27.setText("Bloqueo trifascicular");
        jCheckBox27.setToolTipText("Sobrepeso");
        jCheckBox27.setDisabledIcon(rb_man.getDisabledIcon());
        jCheckBox27.setDisabledSelectedIcon(rb_man.getDisabledSelectedIcon());
        jCheckBox27.setIcon(rb_man.getIcon());
        jCheckBox27.setSelectedIcon(rb_man.getSelectedIcon());
        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_m_condition1Layout = new javax.swing.GroupLayout(jp_m_condition1);
        jp_m_condition1.setLayout(jp_m_condition1Layout);
        jp_m_condition1Layout.setHorizontalGroup(
            jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_m_condition1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jp_m_condition1Layout.createSequentialGroup()
                        .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jCheckBox18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_m_condition1Layout.setVerticalGroup(
            jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_m_condition1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox27))
                .addGap(18, 18, 18)
                .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox26))
                .addGap(18, 18, 18)
                .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox25))
                .addGap(18, 18, 18)
                .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox24))
                .addGap(18, 18, 18)
                .addGroup(jp_m_condition1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jp_footer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Condicion Medica", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_diet.png")), jp_m_condition1); // NOI18N

        jp_mcondition2.setBackground(new java.awt.Color(255, 255, 255));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Seleccione a partir de los factores de riesgo que presenta el paciente:");

        jCheckBox8.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox8.setText("Embarazo");
        jCheckBox8.setToolTipText("Embarazo");
        jCheckBox8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox8StateChanged(evt);
            }
        });
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jCheckBox8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCheckBox8PropertyChange(evt);
            }
        });

        jCheckBox9.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox9.setText("Síndrome metabólico");
        jCheckBox9.setToolTipText("Síndrome metabólico");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox10.setText("Intolerancia a la glucosa");
        jCheckBox10.setToolTipText("Consumo de tabaco");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox11.setText("Atletas en activo");
        jCheckBox11.setToolTipText("Consumo de alcohol");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox12.setText("Taquiarritmia");
        jCheckBox12.setToolTipText("LOD");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox13.setText("Bradicardia");
        jCheckBox13.setToolTipText("Antecedentes familiares");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox14.setText("EAP");
        jCheckBox14.setToolTipText("Sobrepeso");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox15.setText("Insuficiencia cardiaca");
        jCheckBox15.setToolTipText("Consumo de alcohol");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jCheckBox16.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox16.setText("EPOC");
        jCheckBox16.setToolTipText("Consumo de alcohol");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jCheckBox17.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox17.setText("Insuficiencia renal grave");
        jCheckBox17.setToolTipText("Consumo de alcohol");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_mcondition2Layout = new javax.swing.GroupLayout(jp_mcondition2);
        jp_mcondition2.setLayout(jp_mcondition2Layout);
        jp_mcondition2Layout.setHorizontalGroup(
            jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_mcondition2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jp_mcondition2Layout.createSequentialGroup()
                        .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBox11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox17, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jCheckBox15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_mcondition2Layout.setVerticalGroup(
            jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_mcondition2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox14))
                .addGap(18, 18, 18)
                .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox13))
                .addGap(18, 18, 18)
                .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox12))
                .addGap(18, 18, 18)
                .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox15))
                .addGap(18, 18, 18)
                .addGroup(jp_mcondition2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jp_footer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Condicion Medica", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_three-dumbell.png")), jp_mcondition2); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)
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

        jl_msg.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Seleccione a partir de los factores de riesgo que presenta el paciente:");

        jCheckBox1.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox1.setText("Dieta malsana");
        jCheckBox1.setToolTipText("Dieta malsana");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox2.setText("Inactividad física");
        jCheckBox2.setToolTipText("Inactividad física");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox3.setText("Consumo de tabaco");
        jCheckBox3.setToolTipText("Consumo de tabaco");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox4.setText("Antecedentes familiares");
        jCheckBox4.setToolTipText("Antecedentes familiares");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox5.setText("Sobrepeso");
        jCheckBox5.setToolTipText("Sobrepeso");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox6.setText("Consumo de alcohol");
        jCheckBox6.setToolTipText("Consumo de alcohol");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox_LOD.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox_LOD.setText("LOD");
        jCheckBox_LOD.setToolTipText("LOD");
        jCheckBox_LOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_LODActionPerformed(evt);
            }
        });

        jCheckBox_DM.setBackground(new java.awt.Color(102, 255, 0));
        jCheckBox_DM.setText("Diabetis mellitus");
        jCheckBox_DM.setToolTipText("Consumo de alcohol");
        jCheckBox_DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_resistanceLayout = new javax.swing.GroupLayout(jp_resistance);
        jp_resistance.setLayout(jp_resistanceLayout);
        jp_resistanceLayout.setHorizontalGroup(
            jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_footer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_resistanceLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jl_msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jp_resistanceLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jp_resistanceLayout.createSequentialGroup()
                        .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_LOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_DM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_resistanceLayout.setVerticalGroup(
            jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_resistanceLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox5))
                .addGap(18, 18, 18)
                .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addGap(18, 18, 18)
                .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox_LOD))
                .addGap(18, 18, 18)
                .addGroup(jp_resistanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox_DM))
                .addGap(44, 44, 44)
                .addComponent(jl_msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jp_footer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed.addTab("Factores de riesgo", new javax.swing.ImageIcon(getClass().getResource("/arterial_tension/images/icon_run.png")), jp_resistance); // NOI18N

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

    private void jCheckBox_LODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_LODActionPerformed
        checkBoxList_rfactors.add(jCheckBox_LOD);
    }//GEN-LAST:event_jCheckBox_LODActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        checkBoxList_rfactors.add(jCheckBox6);
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        checkBoxList_rfactors.add(jCheckBox5);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        checkBoxList_rfactors.add(jCheckBox4);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        checkBoxList_rfactors.add(jCheckBox3);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        checkBoxList_rfactors.add(jCheckBox2);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        checkBoxList_rfactors.add(jCheckBox1);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btn_previous4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous4ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous4ActionPerformed

    private void btn_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finishActionPerformed
        actionFinish();
    }//GEN-LAST:event_btn_finishActionPerformed

    private void btn_previous2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous2ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous2ActionPerformed

    private void btn_next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next2ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next2ActionPerformed

    private void tf_ta_diastolicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ta_diastolicaKeyReleased
        if (is_biometric_valid()){
            enabled_tabs(true);
            
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_ta_diastolicaKeyReleased

    private void tf_ta_sistolicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ta_sistolicaKeyReleased
        if (is_biometric_valid()){
            enabled_tabs(true);
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_ta_sistolicaKeyReleased

    private void tf_ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ageKeyReleased
        if (is_biometric_valid()){
            enabled_tabs(true);
        }else{
            enabled_tabs(false);
        }
    }//GEN-LAST:event_tf_ageKeyReleased

    private void btn_mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainmenuActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_mainmenuActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_previous3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previous3ActionPerformed
        transactionsPrevious();
    }//GEN-LAST:event_btn_previous3ActionPerformed

    private void btn_next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next3ActionPerformed
        transactionsNext();
    }//GEN-LAST:event_btn_next3ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox8);
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox9);
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox10);
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox11);
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox12);
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox13);
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox14);
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox15);
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox16);
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox17);
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox18);
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox19);
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox20);
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox21);
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox22);
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox23);
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox24);
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox25);
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox26ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox26);
    }//GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
        checkBoxList_rmconditons.add(jCheckBox27);
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void rb_manKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rb_manKeyReleased
        
    }//GEN-LAST:event_rb_manKeyReleased

    private void rb_manActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_manActionPerformed
        //jCheckBox8.setEnabled(false);
    }//GEN-LAST:event_rb_manActionPerformed

    private void jCheckBox_DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DMActionPerformed
        checkBoxList_rfactors.add(jCheckBox_DM);
    }//GEN-LAST:event_jCheckBox_DMActionPerformed

    private void jCheckBox8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCheckBox8PropertyChange
        if(rb_man.isSelected())
            jCheckBox8.setEnabled(false);
        if(rb_woman.isSelected())
            jCheckBox8.setEnabled(true);
    }//GEN-LAST:event_jCheckBox8PropertyChange

    private void jCheckBox8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox8StateChanged
        
    }//GEN-LAST:event_jCheckBox8StateChanged

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
        if(rb_man.isSelected())
            jCheckBox8.setEnabled(false);
        if(rb_woman.isSelected())
            jCheckBox8.setEnabled(true);
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
        if (is_biometric_valid()) {
            // obtener datos insertados 
            int age = Integer.parseInt(tf_age.getText());
            int diastolica = Integer.parseInt(tf_ta_diastolica.getText());
            int sistolica = Integer.parseInt(tf_ta_sistolica.getText());
            List<String> rmconditons = new ArrayList<>();
            for(JCheckBox checkbox: checkBoxList_rmconditons){
                rmconditons.add("'"+checkbox.getText()+"'");
                //System.out.println(checkbox.getText());
            }
            List<String> rfactors = new ArrayList<>();
            for(JCheckBox checkbox: checkBoxList_rfactors){
                rfactors.add("'"+checkbox.getText()+"'");
            }            
            if(rb_woman.isSelected()){
                if(age>15 && age <50){
                    rfactors.add("'Mujer en edad fertil'");
                }
            }
            
            // consultar el SBC
            String msg = connect_with_SBC(diastolica,sistolica,rmconditons.toString(),rfactors.toString());
            // mostar dialogo con resultado
            ResultDialog rw = new ResultDialog(null, true);
//            rw.setPoints(msg[0]);
            rw.setMessage(msg);
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
        
    private boolean isInteger(String input){
        String regex = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
    
    
    private boolean is_biometric_valid(){
        String age = tf_age.getText();
        String ta_diastolica = tf_ta_diastolica.getText();
        String ta_sistolica = tf_ta_sistolica.getText();
        if (isInteger(age) && isInteger(ta_diastolica) && isInteger(ta_sistolica)){
            if (Integer.parseInt(age) > 17 && Integer.parseInt(ta_diastolica) > 0 && Integer.parseInt(ta_sistolica) > 0){
                return true;
            }           
        }
        return false;
    }
    
    private void enabled_tabs(boolean enabled){
        tabbed.setEnabledAt(1, enabled);
        tabbed.setEnabledAt(2, enabled);
        tabbed.setEnabledAt(3, enabled);
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
        for(JCheckBox checkbox: checkBoxList_rmconditons){
                checkbox.setSelected(false);
                //System.out.println(checkbox.getText());
        }
        for(JCheckBox checkbox: checkBoxList_rfactors){
                checkbox.setSelected(false);
                //System.out.println(checkbox.getText());
        }
        checkBoxList_rmconditons.clear();
        checkBoxList_rfactors.clear();   
    }
    
    private String connect_with_SBC(int ta_diastolica, int ta_sitolica, String m_conditions, String r_factors){
        String[] files = new String[1];
        files[0] = "prolog/SBC.pl";
        Connection c = new Connection(files);
        String cat_aux = c.categoria(ta_diastolica, ta_sitolica);
        String cat = "Categoria: "+cat_aux;
        String rcv = "Riego cardriovascular: "+c.rcv(r_factors, cat_aux);
        String estrategia = "Estrategia: "+c.propuesta_estrategia_terapeutica(r_factors, cat_aux);
        String cont_abs = "Contraindiaciones absolutas: "+c.contraind_a(m_conditions);
        String cont_relat = "Contraindicaiones relativa: "+c.contraind_r(m_conditions);
        
        return cat.replaceAll("'", "")+'\n'+rcv.replaceAll("'", "")+'\n'+estrategia.replaceAll("'", "")+'\n'+cont_abs.replaceAll("'", "")+'\n'+cont_relat.replaceAll("'", "");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup bgroup_sex;
    private arterial_tension.customs.Button btn_finish;
    private arterial_tension.customs.Button btn_mainmenu;
    private arterial_tension.customs.Button btn_next;
    private arterial_tension.customs.Button btn_next2;
    private arterial_tension.customs.Button btn_next3;
    private arterial_tension.customs.Button btn_previous2;
    private arterial_tension.customs.Button btn_previous3;
    private arterial_tension.customs.Button btn_previous4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckBox_DM;
    private javax.swing.JCheckBox jCheckBox_LOD;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jl_msg;
    private javax.swing.JPanel jp_biometric;
    private javax.swing.JPanel jp_footer2;
    private javax.swing.JPanel jp_footer3;
    private javax.swing.JPanel jp_footer4;
    private javax.swing.JPanel jp_footer5;
    private javax.swing.JPanel jp_m_condition1;
    private javax.swing.JPanel jp_mcondition2;
    private javax.swing.JPanel jp_resistance;
    private arterial_tension.customs.RadioButton rb_man;
    private arterial_tension.customs.RadioButton rb_woman;
    private arterial_tension.customs.MaterialTabbed tabbed;
    private arterial_tension.customs.TextField tf_age;
    private arterial_tension.customs.TextField tf_ta_diastolica;
    private arterial_tension.customs.TextField tf_ta_sistolica;
    // End of variables declaration//GEN-END:variables

}
