package IdentificationProcess;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anthro4 extends javax.swing.JFrame {
    
    private javax.swing.JLabel AgeLabel;
    public javax.swing.JTextField CurrentCase;
    private javax.swing.JLabel CurrentCaseLabel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Panel2;
    private javax.swing.JLabel PreviousCase;
    private javax.swing.JButton PreviousCaseButton;
    private javax.swing.JLabel PreviousCaseLabel;
    private javax.swing.JLabel RaceLabel;
    private javax.swing.JLabel SexLabel;
    private javax.swing.JLabel SkullLogo;
    private javax.swing.JLabel SkullLogo2;
    private javax.swing.JButton Start;
    private javax.swing.JLabel StatementLabel;
    private javax.swing.JLabel StatureLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton jButton2;
    Toolkit tk = Toolkit.getDefaultToolkit();
    int xSize = ((int) tk.getScreenSize().getWidth());  
    int ySize = ((int) tk.getScreenSize().getHeight());
        
    public Anthro4() {
        setTitle("The Identification Process");
        setResizable(false);        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Pics/SkullLogo2.png")));
        initComponents();
        int xWindow = getWidth();
        int yWindow = getHeight();
        setLocation(((xSize/2) - xWindow/2),((ySize/2) - yWindow/2));
    }

    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        RaceLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        StatureLabel = new javax.swing.JLabel();
        SexLabel = new javax.swing.JLabel();
        SkullLogo = new javax.swing.JLabel();
        SkullLogo2 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        StatementLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        CurrentCase = new javax.swing.JTextField();
        PreviousCaseLabel = new javax.swing.JLabel();
        PreviousCase = new javax.swing.JLabel();
        PreviousCaseButton = new javax.swing.JButton();
        CurrentCaseLabel = new javax.swing.JLabel();
        
        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(102, 102, 102));
        Panel.setPreferredSize(new java.awt.Dimension(771, 154));

        TitleLabel.setFont(new java.awt.Font("Parchment", 1, 65)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("The Identification Process");

        RaceLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        RaceLabel.setForeground(new java.awt.Color(255, 255, 255));
        RaceLabel.setText("Race");

        AgeLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        AgeLabel.setText("Age");

        StatureLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        StatureLabel.setForeground(new java.awt.Color(255, 255, 255));
        StatureLabel.setText("Stature");

        SexLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        SexLabel.setForeground(new java.awt.Color(255, 255, 255));
        SexLabel.setText("Sex");

        SkullLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkullLogo2.png"))); // NOI18N

        SkullLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkullLogo.png"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(AgeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RaceLabel)
                        .addGap(150, 150, 150)
                        .addComponent(SexLabel)
                        .addGap(139, 139, 139)
                        .addComponent(StatureLabel)
                        .addGap(82, 82, 82))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(SkullLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TitleLabel)
                        .addGap(49, 49, 49)
                        .addComponent(SkullLogo2)
                        .addGap(27, 27, 27))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel)
                    .addComponent(SkullLogo2)
                    .addComponent(SkullLogo))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel)
                    .addComponent(RaceLabel)
                    .addComponent(SexLabel)
                    .addComponent(StatureLabel))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Panel2.setBackground(new java.awt.Color(153, 153, 153));
        Panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkeletonLogo.png"))); // NOI18N

        StatementLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Logo.png"))); // NOI18N

        DescriptionLabel.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        DescriptionLabel.setText("<html><p align=\"center\"><font size=\"5\">Welcome</font>, <br>The following program takes you trough the <br>basic process that anthopologists use to identify human remains.<br>You will learn how to use the techniques and what each <br>finds out about your set of remains. In the end you will <br>be able to identify the big four Age, Race, Sex, <br>and Stature. If you wish to view cases done by previous<br> students please feel free. When you wish to begin your journey<br> into forensic anthropology enter your case number <br>and start your identification.</p></html>");

        Start.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Start.setText("Start Identification");
        Start.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {   
                Anthro3 anthro = new Anthro3();
                anthro.setVisible(true);
                anthro.Case.setText(CurrentCase.getText());
                setVisible(false);
            }
        });

        CurrentCase.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        CurrentCase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CurrentCase.setText("13 - 2");

        PreviousCaseLabel.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        PreviousCaseLabel.setText("Last Case:");

        PreviousCase.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        
        System.out.println(Log.readTest);
        FileRead read = new FileRead();
        read.main();
        System.out.println(Log.readTest);
        Log.readTest = 1;
        System.out.println(Log.readTest);
        CurrentCase.setText("13 - " + (Log.entries + 1));
        PreviousCase.setText("13 - " + Log.entries);

        PreviousCaseButton.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        PreviousCaseButton.setText("<html><p align=\"center\">View Previous<br>Cases</p></html>");
        PreviousCaseButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {   
                List2 list2 = new List2();
                list2.setVisible(true);
            }
        });

        CurrentCaseLabel.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        CurrentCaseLabel.setText("Current Case");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StatementLabel)
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoLabel)
                .addGap(64, 64, 64)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CurrentCase)
                            .addComponent(Start))
                        .addGap(46, 46, 46))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(PreviousCaseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CurrentCaseLabel)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(PreviousCase)
                                .addGap(18, 18, 18)
                                .addComponent(PreviousCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(49, 49, 49))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(StatementLabel)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PreviousCaseLabel)
                            .addComponent(PreviousCase)
                            .addComponent(PreviousCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(CurrentCaseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CurrentCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Start)
                        .addGap(75, 75, 75))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogoLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Anthro4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anthro4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anthro4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anthro4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anthro4().setVisible(true);
            }
        });
    }
}
