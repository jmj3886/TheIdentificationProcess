package IdentificationProcess;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class Anthro3 extends javax.swing.JFrame {

    static public javax.swing.JLabel Age;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JProgressBar AgeProgressBar;
    static public javax.swing.JLabel Case;
    private javax.swing.JLabel CaseLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    static public javax.swing.JLabel Race;
    private javax.swing.JLabel RaceLabel;
    private javax.swing.JProgressBar RaceProgressBar;
    private javax.swing.JRadioButton ZygomaticTestRadioButton1;
    private javax.swing.JRadioButton ZygomaticTestRadioButton2;
    private javax.swing.JRadioButton ZygomaticTestRadioButton3;
    static public javax.swing.JLabel Sex;
    private javax.swing.JLabel SexLabel;
    private javax.swing.JProgressBar SexProgressBar;
    private javax.swing.JLabel SkullLogo1;
    private javax.swing.JLabel SkullLogo2;
    static public javax.swing.JLabel Stature;
    private javax.swing.JLabel StatureLabel;
    private javax.swing.JProgressBar StatureProgressBar;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel ZygomaticTestCenterLabel;
    private javax.swing.JLabel ZygomaticTestPic;
    private javax.swing.JLabel ZygomaticTestOrLabel;
    private javax.swing.JLabel ZygomaticTestLabel;
    private javax.swing.JLabel TitleAgeLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleRaceLabel;
    private javax.swing.JLabel TitleSexLabel;
    private javax.swing.JLabel TitleStatureLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel holder;
    private javax.swing.JLabel holder2;
    private javax.swing.JLabel BabyTeethTestLabel;
    private javax.swing.JLabel BabyTeethTestPic;
    private javax.swing.JRadioButton BirthRadioButton;
    private javax.swing.JRadioButton M6RadioButton; 
    private javax.swing.JRadioButton M9RadioButton;
    private javax.swing.JRadioButton Y1RadioButton; 
    private javax.swing.JRadioButton M18RadioButton;
    private javax.swing.JRadioButton Y2RadioButton; 
    private javax.swing.JRadioButton Y3RadioButton; 
    private javax.swing.JRadioButton Y4RadioButton; 
    private javax.swing.JRadioButton Y5RadioButton; 
    private javax.swing.JRadioButton Y6RadioButton; 
    private javax.swing.JRadioButton Y7RadioButton; 
    private javax.swing.JRadioButton Y8RadioButton; 
    private javax.swing.JRadioButton Y9RadioButton; 
    private javax.swing.JRadioButton Y10RadioButton;
    private javax.swing.JRadioButton Y11RadioButton;
    private javax.swing.JRadioButton Y12RadioButton;
    private javax.swing.JRadioButton Y15RadioButton;
    private javax.swing.JRadioButton Y21RadioButton;
    private javax.swing.JRadioButton Y35RadioButton;
    private javax.swing.JRadioButton TeethNARadioButton;
    private javax.swing.JLabel TeethTestDescription;
    private javax.swing.JLabel PubicTestLabel;
    private javax.swing.JLabel PubicTestDescription;
    private javax.swing.JLabel EPTestLabel;
    private javax.swing.JLabel EPTestDescription;
    private javax.swing.JLabel ProximalLabel;
    private javax.swing.JLabel DistalLabel;
    private javax.swing.JRadioButton DistalRadioButton1;
    private javax.swing.JRadioButton DistalRadioButton2;
    private javax.swing.JRadioButton DistalRadioButton3;
    private javax.swing.JRadioButton DistalRadioButton4;
    private javax.swing.JLabel FemurLabel;
    private javax.swing.JLabel HumerusLabel;
    private javax.swing.JLabel RadiusLabel;
    private javax.swing.JLabel ClavicleLabel;
    private javax.swing.JLabel ProgTestLabel;
    private javax.swing.JLabel ProgTestDescription;
    private javax.swing.JLabel ProgPic;
    private javax.swing.JLabel SillTestLabel;
    private javax.swing.JLabel SillTestDescription;
    private javax.swing.JLabel SpineTestLabel;
    private javax.swing.JLabel SpineTestDescription;
    private javax.swing.JLabel biteTestLabel;
    private javax.swing.JLabel biteTestDescription;
    private javax.swing.JLabel IncisorsTestLabel;
    private javax.swing.JLabel IncisorsTestDescription;
    private javax.swing.JLabel ForeheadTestLabel;
    private javax.swing.JLabel ForeheadTestDescription;
    private javax.swing.JLabel ChinTestLabel;
    private javax.swing.JLabel ChinTestDescription;
    private javax.swing.JLabel ProtubeTestLabel;
    private javax.swing.JLabel ProtubeTestDescription;
    private javax.swing.JLabel MastoidTestLabel;
    private javax.swing.JLabel MastoidTestDescription;
    private javax.swing.JLabel HipTestLabel;
    private javax.swing.JLabel HipTestDescription;
    private javax.swing.JLabel SciaticTestLabel;
    private javax.swing.JLabel SciaticTestDescription;
    private javax.swing.JLabel StatureTestLabel;
    private javax.swing.JLabel StatureTestDescription;
    private javax.swing.JLabel StaturePic;
    private javax.swing.JTextField StatureTextBox;
    private javax.swing.JLabel LengthLabel;
    private javax.swing.JButton Back;
    private javax.swing.JLabel TibiaLabel;
    private javax.swing.JLabel FibulaLabel;
    private javax.swing.JLabel UlnaLabel;
    private javax.swing.JLabel Radius2Label;
    private javax.swing.JLabel FinishLabel;
    private javax.swing.JLabel FinishDescription;
    private javax.swing.JButton FinishButton;
    private Stature stature;
    static Anthro4 anthro;
    private double stat1, stat2, stat3, stat4, stat5, stat6;
    private String tempR1 = "", tempR2 = "", tempR3 = "",tempR4 = "", tempR5 = "", tempR6 = "", tempS1 = "", tempS2 = "", tempS3 = "", tempS4 = "", tempS5 = "", tempS6 = "", tempR62 = "", tempR22 = "";
    private int test, teeth, skip, pick, skip2, cauc, negr, mong, male, female;
    private ArrayList<String> age, tempA1, tempA2, tempA3, tempA4, tempA5, tempA6;
    Toolkit tk = Toolkit.getDefaultToolkit();
    int xSize = ((int) tk.getScreenSize().getWidth());  
    int ySize = ((int) tk.getScreenSize().getHeight());
    
    public Anthro3() {
        setTitle("The Identification Process");
        setResizable(false);        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Pics/SkullLogo2.png")));
        initComponents();
        int xWindow = getWidth();
        int yWindow = getHeight();
        setLocation(((xSize/2) - xWindow/2),((ySize/2) - yWindow/2));
    }

    private void initComponents() {
                
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Panel1 = new javax.swing.JPanel();
        AgeProgressBar = new javax.swing.JProgressBar();
        RaceProgressBar = new javax.swing.JProgressBar();
        SexProgressBar = new javax.swing.JProgressBar();
        StatureProgressBar = new javax.swing.JProgressBar();
        TitleAgeLabel = new javax.swing.JLabel();
        TitleRaceLabel = new javax.swing.JLabel();
        TitleSexLabel = new javax.swing.JLabel();
        TitleStatureLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        SkullLogo2 = new javax.swing.JLabel();
        SkullLogo1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Submit = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        IDLabel = new javax.swing.JLabel();
        CaseLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        RaceLabel = new javax.swing.JLabel();
        SexLabel = new javax.swing.JLabel();
        StatureLabel = new javax.swing.JLabel();
        Stature = new javax.swing.JLabel();
        Sex = new javax.swing.JLabel();
        Race = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Case = new javax.swing.JLabel();
        holder = new javax.swing.JLabel();
        holder2 = new javax.swing.JLabel();
        BabyTeethTestLabel   = new javax.swing.JLabel();
        BabyTeethTestPic     = new javax.swing.JLabel();
        BirthRadioButton     = new javax.swing.JRadioButton();
        M6RadioButton        = new javax.swing.JRadioButton();
        M9RadioButton        = new javax.swing.JRadioButton();
        Y1RadioButton        = new javax.swing.JRadioButton();
        M18RadioButton       = new javax.swing.JRadioButton();
        Y2RadioButton        = new javax.swing.JRadioButton();
        Y3RadioButton        = new javax.swing.JRadioButton();
        Y4RadioButton        = new javax.swing.JRadioButton();
        Y5RadioButton        = new javax.swing.JRadioButton();
        Y6RadioButton        = new javax.swing.JRadioButton();
        Y7RadioButton        = new javax.swing.JRadioButton();
        Y8RadioButton        = new javax.swing.JRadioButton();
        Y9RadioButton        = new javax.swing.JRadioButton();
        Y10RadioButton       = new javax.swing.JRadioButton();
        Y11RadioButton       = new javax.swing.JRadioButton();
        Y12RadioButton       = new javax.swing.JRadioButton();
        Y15RadioButton       = new javax.swing.JRadioButton();
        Y21RadioButton       = new javax.swing.JRadioButton();
        Y35RadioButton       = new javax.swing.JRadioButton();
        TeethNARadioButton   = new javax.swing.JRadioButton();
        TeethTestDescription = new javax.swing.JLabel();
        PubicTestLabel = new javax.swing.JLabel();
        PubicTestDescription = new javax.swing.JLabel();
        ProximalLabel = new javax.swing.JLabel();
        DistalLabel = new javax.swing.JLabel();
        DistalRadioButton1 = new javax.swing.JRadioButton();
        DistalRadioButton2 = new javax.swing.JRadioButton();
        DistalRadioButton3 = new javax.swing.JRadioButton();
        DistalRadioButton4 = new javax.swing.JRadioButton();
        ZygomaticTestLabel = new javax.swing.JLabel();
        ZygomaticTestPic = new javax.swing.JLabel();
        ZygomaticTestCenterLabel = new javax.swing.JLabel();
        ZygomaticTestRadioButton1 = new javax.swing.JRadioButton();
        ZygomaticTestRadioButton2 = new javax.swing.JRadioButton();
        ZygomaticTestOrLabel = new javax.swing.JLabel();
        ZygomaticTestRadioButton3 = new javax.swing.JRadioButton();
        age = new ArrayList();
        EPTestLabel = new javax.swing.JLabel();
        EPTestDescription = new javax.swing.JLabel();
        FemurLabel = new javax.swing.JLabel();   
        HumerusLabel = new javax.swing.JLabel();
        RadiusLabel = new javax.swing.JLabel();
        ClavicleLabel = new javax.swing.JLabel();
        ProgTestLabel = new javax.swing.JLabel();
        ProgTestDescription = new javax.swing.JLabel();
        ProgPic = new javax.swing.JLabel();    
        SillTestLabel = new javax.swing.JLabel();
        SillTestDescription = new javax.swing.JLabel();
        SpineTestLabel = new javax.swing.JLabel();
        SpineTestDescription = new javax.swing.JLabel();
        biteTestLabel = new javax.swing.JLabel();
        biteTestDescription = new javax.swing.JLabel();
        IncisorsTestLabel = new javax.swing.JLabel();
        IncisorsTestDescription = new javax.swing.JLabel();
        ForeheadTestLabel = new javax.swing.JLabel();
        ForeheadTestDescription = new javax.swing.JLabel();
        ChinTestLabel = new javax.swing.JLabel();
        ChinTestDescription = new javax.swing.JLabel();
        ProtubeTestLabel = new javax.swing.JLabel();
        ProtubeTestDescription = new javax.swing.JLabel();
        MastoidTestLabel = new javax.swing.JLabel();
        MastoidTestDescription = new javax.swing.JLabel();
        HipTestLabel = new javax.swing.JLabel();
        HipTestDescription = new javax.swing.JLabel();
        SciaticTestLabel = new javax.swing.JLabel();
        SciaticTestDescription = new javax.swing.JLabel();
        StatureTestLabel = new javax.swing.JLabel();
        StatureTestDescription = new javax.swing.JLabel();
        StaturePic = new javax.swing.JLabel();
        StatureTextBox = new javax.swing.JTextField();
        LengthLabel = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        stature = new Stature();
        TibiaLabel = new javax.swing.JLabel();
        FibulaLabel = new javax.swing.JLabel();
        UlnaLabel = new javax.swing.JLabel();
        Radius2Label = new javax.swing.JLabel();
        FinishLabel = new javax.swing.JLabel();
        FinishDescription = new javax.swing.JLabel();
        FinishButton = new javax.swing.JButton();
        tempA1 = new ArrayList();
        tempA2 = new ArrayList();
        tempA3 = new ArrayList();
        tempA4 = new ArrayList();
        tempA5 = new ArrayList();
        tempA6 = new ArrayList();
                
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(102, 102, 102));
        
        
        
        AgeProgressBar.setMaximum(6);

        RaceProgressBar.setMaximum(6);

        SexProgressBar.setMaximum(6);

        StatureProgressBar.setMaximum(6);

        TitleAgeLabel.setFont(new java.awt.Font("Serif", 1, 18)); 
        TitleAgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleAgeLabel.setText("Age");

        TitleRaceLabel.setFont(new java.awt.Font("Serif", 1, 18)); 
        TitleRaceLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleRaceLabel.setText("Race");

        TitleSexLabel.setFont(new java.awt.Font("Serif", 1, 18));
        TitleSexLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleSexLabel.setText("Sex");

        TitleStatureLabel.setFont(new java.awt.Font("Serif", 1, 18));
        TitleStatureLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleStatureLabel.setText("Stature");

        TitleLabel.setFont(new java.awt.Font("Parchment", 1, 65));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("The Identification Process");

        SkullLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkullLogo.png")));

        SkullLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkullLogo2.png")));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(TitleAgeLabel)
                .addGap(143, 143, 143)
                .addComponent(TitleRaceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleSexLabel)
                .addGap(139, 139, 139)
                .addComponent(TitleStatureLabel)
                .addGap(86, 86, 86))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(AgeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(RaceProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(SexProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(StatureProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(SkullLogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleLabel)
                .addGap(51, 51, 51)
                .addComponent(SkullLogo2)
                .addGap(29, 29, 29))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SkullLogo2)
                        .addComponent(SkullLogo1))
                    .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleAgeLabel)
                    .addComponent(TitleRaceLabel)
                    .addComponent(TitleSexLabel)
                    .addComponent(TitleStatureLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatureProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SexProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RaceProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Panel2.setBackground(new java.awt.Color(153, 153, 153));
        Panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        Back.setFont(new java.awt.Font("Serif", 0, 12));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/next1.png")));
        Back.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                    new Anthro4().setVisible(true);
                    setVisible(false);
                }
                if(test == 1){
                    
                    BabyTeethTestLabel.setVisible(true);  
                    M6RadioButton.setVisible(true);       
                    Y1RadioButton.setVisible(true);      
                    Y2RadioButton.setVisible(true);       
                    Y4RadioButton.setVisible(true);       
                    Y7RadioButton.setVisible(true);       
                    Y9RadioButton.setVisible(true);      
                    Y11RadioButton.setVisible(true);      
                    Y15RadioButton.setVisible(true);      
                    Y35RadioButton.setVisible(true);  
                    TeethTestDescription.setVisible(true);
                    PubicTestLabel.setVisible(false);
                    PubicTestDescription.setVisible(false);
                    BabyTeethTestPic.setVisible(false);
                    AgeProgressBar.setValue(0);
                    BirthRadioButton.setText("<html>Birth<br>+ or - 2 Months</html>");
                    M9RadioButton.setText("<html>9 Months<br>+ or - 3 Months</html>");
                    Y1RadioButton.setText("<html>1 Year<br>+ or - 4 Months</html>");
                    M18RadioButton.setText("<html>18 Monthes<br>+ or - 6 Months</html>");
                    Y2RadioButton.setText("<html>2 Years<br>+ or - 8 Months</html>");
                    Y3RadioButton.setText("<html>3 Years<br>+ or - 12 Months</html>");
                    Y4RadioButton.setText("<html>4 Years<br>+ or - 12 Months</html>");
                    Y5RadioButton.setText("<html>5 Years<br>+ or - 16 Months</html>");
                    Y6RadioButton.setText("<html>6 Years<br>+ or - 24 Months</html>");
                    Y8RadioButton.setText("<html>8 Years<br>+ or - 24 Months</html>");
                    Y10RadioButton.setText("<html>10 Years<br>+ or - 30 Months</html>");
                    Y12RadioButton.setText("<html>12 Years<br>+ or - 30 Months</html>");
                    Y21RadioButton.setText("<html>21 Years</html>");
                    TeethNARadioButton.setSelected(true);
                    Age.setText(tempA1.get(0) + " - " + tempA1.get(tempA1.size() - 1) + " Years Old");
                        if(tempA1.size() == 1){
                            Age.setText(tempA1.get(0) + " Years Old");
                        }
                    test--;
                }
                if(test == 2){
                    PubicTestLabel.setVisible(true);
                    PubicTestDescription.setVisible(true);
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Pubic.jpg")));
                    BirthRadioButton.setVisible(true);
                    M9RadioButton.setVisible(true);
                    M18RadioButton.setVisible(true);
                    Y3RadioButton.setVisible(true);
                    Y5RadioButton.setVisible(true);
                    Y6RadioButton.setVisible(true);
                    Y8RadioButton.setVisible(true);
                    Y10RadioButton.setVisible(true);
                    Y12RadioButton.setVisible(true);
                    Y21RadioButton.setVisible(true);
                    TeethNARadioButton.setVisible(true);
                    AgeProgressBar.setValue(1);
                    Y9RadioButton.setVisible(true);
                    Y1RadioButton.setVisible(false);
                    Y2RadioButton.setVisible(false);
                    Y4RadioButton.setVisible(false);
                    DistalRadioButton1.setVisible(false);
                    Y11RadioButton.setVisible(true);
                    DistalRadioButton2.setVisible(false);
                    Y15RadioButton.setVisible(true);
                    DistalRadioButton3.setVisible(false);
                    DistalRadioButton4.setVisible(false);
                    EPTestLabel.setVisible(false);
                    EPTestDescription.setVisible(false);
                    ProximalLabel.setVisible(false);
                    DistalLabel.setVisible(false);
                    FemurLabel.setVisible(false);                    
                    TeethNARadioButton.setSelected(true);
                    BirthRadioButton.setText("<html>18 - 19 Years Old<p align=\"center\">\"Rugged\"");
                    M9RadioButton.setText("<html>20 - 21 Years Old<p align=\"center\">\"Finely Textured Ridges\"");
                    M18RadioButton.setText("<html>22 - 24 Years Old<p align=\"center\">\"Dorsal Plateau\"");
                    Y3RadioButton.setText("<html>25 - 26 Years Old<p align=\"center\">\"Beveling\"");
                    Y5RadioButton.setText("<html>27 - 30 Years Old<p align=\"center\">\"Ossifying Nodule\"");
                    Y6RadioButton.setText("<html>30 - 35 Years Old<p align=\"center\">\"Oval Outline\"");
                    Y8RadioButton.setText("<html>35 - 39 Years Old<p align=\"center\">\"Fine Grain\"");
                    Y10RadioButton.setText("<html>39 - 44 Years Old<p align=\"center\">\"Smooth\"");
                    Y12RadioButton.setText("<html>45 - 50 Years Old<p align=\"center\">\"Rimmed\"");
                    Y21RadioButton.setText("<html>50+ Years Old<p align=\"center\">\"Fused\"");
                    Age.setText(tempA2.get(0) + " - " + tempA2.get(tempA2.size() - 1) + " Years Old");
                        if(tempA2.size() == 1){
                            Age.setText(tempA2.get(0) + " Years Old");
                        }
                    test--;
                }
                if(test == 3){
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Femur.jpg")));
                        FemurLabel.setVisible(true);
                        HumerusLabel.setVisible(false);
                        Y5RadioButton.setSelected(true);
                        DistalRadioButton4.setSelected(true);
                        AgeProgressBar.setValue(2);
                        Age.setText(tempA3.get(0) + " - " + tempA3.get(tempA3.size() - 1) + " Years Old");
                        if(tempA3.size() == 1){
                            Age.setText(tempA3.get(0) + " Years Old");
                        }
                        test--;
                }
                if(test == 4){
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Humerus.jpg")));
                        HumerusLabel.setVisible(true);
                        RadiusLabel.setVisible(false);
                        Y5RadioButton.setSelected(true);
                        DistalRadioButton4.setSelected(true);
                        AgeProgressBar.setValue(3);
                        Age.setText(tempA4.get(0) + " - " + tempA4.get(tempA4.size() - 1) + " Years Old");
                        if(tempA4.size() == 1){
                            Age.setText(tempA4.get(0) + " Years Old");
                        }
                        test--;
                }
                if(test == 5){
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Radius.jpg")));
                        RadiusLabel.setVisible(true);
                        ClavicleLabel.setVisible(false);
                        Y5RadioButton.setSelected(true);
                        DistalRadioButton4.setSelected(true);                        
                        DistalRadioButton1.setVisible(true);
                        DistalRadioButton1.setText("Not Fused");
                        Y11RadioButton.setVisible(false);
                        DistalRadioButton2.setVisible(true);
                        DistalRadioButton2.setText("Fusing");
                        Y15RadioButton.setVisible(false);
                        DistalRadioButton3.setVisible(true);
                        DistalRadioButton3.setText("Fused");
                        DistalRadioButton4.setVisible(true);
                        DistalRadioButton4.setText("Not Applicable");
                        DistalRadioButton4.setSelected(true);
                        Y2RadioButton.setVisible(true);
                        Y2RadioButton.setText("Fusing");
                        ProximalLabel.setText("<html><u>Proximal</u></html>");
                        DistalLabel.setVisible(true);
                        AgeProgressBar.setValue(4);
                        Age.setText(tempA5.get(0) + " - " + tempA5.get(tempA5.size() - 1) + " Years Old");
                        if(tempA5.size() == 1){
                            Age.setText(tempA5.get(0) + " Years Old");
                        }
                        Race.setText("");
                        test--;
                }
                if(test == 6){
                        BabyTeethTestPic.setVisible(true);
                        ProgPic.setVisible(false);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Clavicle.jpg")));
                        ClavicleLabel.setVisible(true);
                        Y5RadioButton.setSelected(true);
                        DistalRadioButton4.setSelected(true);
                        AgeProgressBar.setValue(5);
                        Y1RadioButton.setVisible(true);
                        Y1RadioButton.setText("Not Fused");
                        Y4RadioButton.setVisible(true);
                        Y4RadioButton.setText("Fused");
                        Y9RadioButton.setVisible(false);
                        Y2RadioButton.setVisible(false);
                        Y5RadioButton.setText("Not Applicable");
                        Y5RadioButton.setSelected(true);
                        EPTestLabel.setVisible(true);
                        EPTestDescription.setVisible(true);
                        ProximalLabel.setVisible(true);
                        ProgTestLabel.setVisible(false);
                        ProgTestDescription.setVisible(false);
                        M6RadioButton.setVisible(false);
                        Y10RadioButton.setVisible(false);
                        Y5RadioButton.setVisible(true);
                        ProximalLabel.setText("<html><u>Sternal</u></html>");
                        Age.setText(tempA6.get(0) + " - " + tempA6.get(tempA6.size() - 1) + " Years Old");
                        if(tempA6.size() == 1){
                            Age.setText(tempA6.get(0) + " Years Old");
                        }
                        if(tempR1.equals("Cauc")){
                                cauc--;
                        }
                        if(tempR1.equals("Mong")){
                            mong--;
                        }
                        if(tempR1.equals("Negr")){
                            negr--;
                        }  
                        Race.setText("");
                        test--;
                }
                if(test == 7){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MongoProg.jpg")));
                        BabyTeethTestPic.setVisible(false);
                        ClavicleLabel.setVisible(false);
                        DistalLabel.setVisible(false);
                        ProximalLabel.setVisible(false);
                        EPTestLabel.setVisible(false);
                        EPTestDescription.setVisible(false);
                        Y5RadioButton.setVisible(false);
                        Y10RadioButton.setVisible(true);
                        Y1RadioButton.setVisible(false);
                        Y2RadioButton.setVisible(false);
                        Y4RadioButton.setVisible(false);
                        M6RadioButton.setVisible(true);
                        Y1RadioButton.setVisible(true);
                        Y2RadioButton.setVisible(true);
                        DistalRadioButton1.setVisible(false);
                        DistalRadioButton2.setVisible(false);
                        DistalRadioButton3.setVisible(false);
                        DistalRadioButton4.setVisible(false);
                        ProgTestLabel.setVisible(true);
                        ProgTestDescription.setVisible(true);
                        Y10RadioButton.setSelected(true);
                        Y10RadioButton.setText("Not Applicable");
                        M6RadioButton.setText("<html>Caucasoid<p align=\"center\">\"None - Straight\"");
                        Y1RadioButton.setText("<html>Negroid<p align=\"center\">\"Yes - Forward Lean\"");
                        Y2RadioButton.setText("<html>Mongoloid<p align=\"center\">\"None - Straight\"");
                        RaceProgressBar.setValue(0);
                        ZygomaticTestLabel.setVisible(false);
                        ZygomaticTestPic.setVisible(false);
                        ZygomaticTestCenterLabel.setVisible(false); 
                        ZygomaticTestRadioButton1.setVisible(false);
                        ZygomaticTestRadioButton2.setVisible(false);
                        ZygomaticTestOrLabel.setVisible(false);
                        ZygomaticTestRadioButton3.setVisible(false);
                        ZygomaticTestRadioButton3.setSelected(false);
                        if(tempR2.equals("Cauc")){
                                cauc--;
                        }
                        if(tempR2.equals("Mong")){
                            mong--;
                        }
                        if(tempR22.equals("Negr")){
                            negr--;
                        }  
                        test--;
                }
                if(test == 8){
                        ProgPic.setVisible(false);
                        ZygomaticTestLabel.setVisible(true);
                        ZygomaticTestPic.setVisible(true);
                        ZygomaticTestCenterLabel.setVisible(true); 
                        ZygomaticTestRadioButton1.setVisible(true);
                        ZygomaticTestRadioButton2.setVisible(true);
                        ZygomaticTestOrLabel.setVisible(true);
                        ZygomaticTestRadioButton3.setVisible(true);                      
                        M6RadioButton.setVisible(false);
                        Y1RadioButton.setVisible(false);
                        Y2RadioButton.setVisible(false);                        
                        Y10RadioButton.setVisible(false);
                        Y10RadioButton.setSelected(true);
                        SillTestLabel.setVisible(false);
                        SillTestDescription.setVisible(false);
                        RaceProgressBar.setValue(1);
                        if(tempR3.equals("Cauc")){
                                cauc--;
                        }
                        if(tempR3.equals("Mong")){
                            mong--;
                        }
                        if(tempR3.equals("Negr")){
                            negr--;
                        }  
                        test--;
                }
                if(test == 9){
                        SillTestLabel.setVisible(true);
                        ProgPic.setVisible(false);
                        BabyTeethTestPic.setVisible(false);
                        SillTestDescription.setVisible(true); 
                        SpineTestLabel.setVisible(false);
                        SpineTestDescription.setVisible(false);
                        Y10RadioButton.setSelected(true);
                        Y10RadioButton.setText("Not Applicable");
                        M6RadioButton.setText("<html>Caucasoid<p align=\"center\">\"High Sill\"");
                        Y1RadioButton.setText("<html>Negroid<p align=\"center\">\"Nasal Guttering\"");
                        Y2RadioButton.setText("<html>Mongoloid<p align=\"center\">\"Medium Sill\"");
                        RaceProgressBar.setValue(2);
                        if(tempR4.equals("Cauc")){
                                cauc--;
                        }
                        if(tempR4.equals("Mong")){
                            mong--;
                        }
                        if(tempR4.equals("Negr")){
                            negr--;
                        }  
                        test--;
                }
                if(test == 10){
                        ProgPic.setVisible(false);
                        BabyTeethTestPic.setVisible(false);
                        Y10RadioButton.setSelected(true);
                        biteTestLabel.setVisible(false);
                        biteTestDescription.setVisible(false);
                        SpineTestLabel.setVisible(true);
                        SpineTestDescription.setVisible(true);
                        RaceProgressBar.setValue(3);     
                        Y10RadioButton.setText("Not Applicable");
                        M6RadioButton.setText("<html>Caucasoid<p align=\"center\">\"Sharp Point\"");
                        Y1RadioButton.setText("<html>Negroid<p align=\"center\">\"Rounded Point\"");
                        Y2RadioButton.setText("<html>Mongoloid<p align=\"center\">\"Medium Point\"");
                        if(tempR5.equals("Cauc")){
                                cauc--;
                        }
                        if(tempR5.equals("Mong")){
                            mong--;
                        }
                        if(tempR5.equals("Negr")){
                            negr--;
                        }  
                        test--;
                }
                if(test == 11){
                        ProgPic.setVisible(false);
                        BabyTeethTestPic.setVisible(false);
                        Y1RadioButton.setVisible(true);
                        Y10RadioButton.setSelected(true);
                        biteTestLabel.setVisible(true);
                        biteTestDescription.setVisible(true);
                        IncisorsTestLabel.setVisible(false);
                        IncisorsTestDescription.setVisible(false);                        
                        RaceProgressBar.setValue(4);
                        Y10RadioButton.setText("Not Applicable");
                        M6RadioButton.setText("<html>Caucasoid<p align=\"center\">\"Overbite\"");
                        Y1RadioButton.setText("<html>Negroid<p align=\"center\">\"Overbite\"");
                        Y2RadioButton.setText("<html>Mongoloid<p align=\"center\">\"Even Bite\"");
                        if(tempR6.equals("Cauc")){
                                cauc--;
                        }
                        if(tempR6.equals("Mong")){
                            mong--;
                        }
                        if(tempR62.equals("Negr")){
                            negr--;
                        }
                        test--;
                }
                if(test == 12){
                        BabyTeethTestPic.setVisible(false);
                        IncisorsTestLabel.setVisible(true);
                        IncisorsTestDescription.setVisible(true);
                        Y10RadioButton.setSelected(true); 
                        ForeheadTestLabel.setVisible(false);
                        ForeheadTestDescription.setVisible(false);
                        RaceProgressBar.setValue(5);                        
                        M6RadioButton.setText("<html>Flat<p align=\"center\">\"Caucasoid/Negroid\"");
                        Y2RadioButton.setText("<html>Shoveled<p align=\"center\">\"Mongoloid\"");
                        if(tempS1.equals("Male")){
                            male--;
                        }
                        if(tempS1.equals("Fem")){
                            female--;
                        }                            
                        Sex.setText("");
                        test--;
                }
                if(test == 13){
                        BabyTeethTestPic.setVisible(true);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Forehead.jpg")));
                        Y10RadioButton.setSelected(true); 
                        ForeheadTestLabel.setVisible(true);
                        ForeheadTestDescription.setVisible(true);
                        ChinTestLabel.setVisible(false);
                        ChinTestDescription.setVisible(false);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Slanted\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Vertical\"");
                        SexProgressBar.setValue(0);
                        if(tempS2.equals("Male")){
                            male--;
                        }
                        if(tempS2.equals("Fem")){
                            female--;
                        }
                        test--;
                }
                if(test == 14){
                        BabyTeethTestPic.setVisible(true);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Chin.jpg")));
                        Y10RadioButton.setSelected(true); 
                        ChinTestLabel.setVisible(true);
                        ChinTestDescription.setVisible(true);
                        ProtubeTestLabel.setVisible(false);
                        ProtubeTestDescription.setVisible(false);                        
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Square\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Pointed\"");
                        SexProgressBar.setValue(1);
                        if(tempS3.equals("Male")){
                            male--;
                        }
                        if(tempS3.equals("Fem")){
                            female--;
                        }
                        test--;
                }
                if(test == 15){
                        BabyTeethTestPic.setVisible(true);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Protube.jpg")));
                        Y10RadioButton.setSelected(true); 
                        ProtubeTestLabel.setVisible(true);
                        ProtubeTestDescription.setVisible(true);
                        MastoidTestLabel.setVisible(false);
                        MastoidTestDescription.setVisible(false);                        
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Large Protuberance\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Small Protuberance\"");
                        SexProgressBar.setValue(2);
                        if(tempS4.equals("Male")){
                            male--;
                        }
                        if(tempS4.equals("Fem")){
                            female--;
                        }
                        test--;
                }
                if(test == 16){
                        BabyTeethTestPic.setVisible(true);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Mast.jpg")));
                        Y10RadioButton.setSelected(true);
                        MastoidTestLabel.setVisible(true);
                        MastoidTestDescription.setVisible(true);
                        HipTestLabel.setVisible(false);
                        HipTestDescription.setVisible(false);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Large Process\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Small Process\"");
                        SexProgressBar.setValue(3);
                        if(tempS5.equals("Male")){
                            male--;
                        }
                        if(tempS5.equals("Fem")){
                            female--;
                        }
                        test--;
                }
                if(test == 17){
                        BabyTeethTestPic.setVisible(false);
                        ProgPic.setVisible(false);
                        Y10RadioButton.setSelected(true); 
                        HipTestLabel.setVisible(true);
                        HipTestDescription.setVisible(true);
                        SciaticTestLabel.setVisible(false);
                        SciaticTestDescription.setVisible(false);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Narrow\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Wide\"");
                        SexProgressBar.setValue(4);
                        if(tempS6.equals("Male")){
                            male--;
                        }
                        if(tempS6.equals("Fem")){
                            female--;
                        }
                        test--;
                }
                if(test == 18){
                        BabyTeethTestPic.setVisible(false);  
                        ProgPic.setVisible(true);
                        ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Sciatic.jpg")));
                        Y10RadioButton.setSelected(true);
                        SciaticTestLabel.setVisible(true);
                        SciaticTestDescription.setVisible(true);
                        M6RadioButton.setVisible(true);
                        Y2RadioButton.setVisible(true);
                        Y10RadioButton.setVisible(true);
                        Y10RadioButton.setSelected(true);
                        StatureTestLabel.setVisible(false);
                        FemurLabel.setVisible(false);
                        LengthLabel.setVisible(false);
                        StatureTestDescription.setVisible(false);
                        StatureTextBox.setVisible(false);
                        StaturePic.setVisible(false);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Small\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Large\"");
                        SexProgressBar.setValue(5);
                        Stature.setText("");
                        test--;
                }
                if(test == 19){
                        ProgPic.setVisible(false);   
                        Y2RadioButton.setSelected(true);
                        FemurLabel.setVisible(true);
                        HumerusLabel.setVisible(false);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Femur2.jpg")));
                        SexProgressBar.setValue(6);
                        StatureProgressBar.setValue(0);
                        Stature.setText("");
                        if(stat1 > 0){
                            Stature.setText(stature.convertToInches(stat1));
                        }
                        test--;
                }
                if(test == 20){
                        ProgPic.setVisible(false);   
                        Y2RadioButton.setSelected(true);
                        HumerusLabel.setVisible(true);
                        TibiaLabel.setVisible(false);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Humerus2.png")));
                        StatureProgressBar.setValue(1);
                        Stature.setText("");
                        if(stat2 > 0){
                            Stature.setText(stature.convertToInches(stat2));
                        }
                        test--;
                }
                if(test == 21){
                        ProgPic.setVisible(false);   
                        Y2RadioButton.setSelected(true);
                        TibiaLabel.setVisible(true);
                        FibulaLabel.setVisible(false);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Tibia2.png")));
                        StatureProgressBar.setValue(2);
                        Stature.setText("");
                        if(stat3 > 0){
                            Stature.setText(stature.convertToInches(stat3));
                        }
                        test--;
                }
                if(test == 22){
                        ProgPic.setVisible(false); 
                        Y2RadioButton.setSelected(true);
                        FibulaLabel.setVisible(true);
                        Radius2Label.setVisible(false);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Fibula.png")));
                        StatureProgressBar.setValue(3);
                        Stature.setText("");
                        if(stat4 > 0){
                            Stature.setText(stature.convertToInches(stat4));
                        }
                        test--;
                }
                if(test == 23){
                        ProgPic.setVisible(false);
                        Stature.setText("");
                        Y2RadioButton.setSelected(true);
                        Radius2Label.setVisible(true);
                        UlnaLabel.setVisible(false);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Radius2.png")));
                        StatureProgressBar.setValue(4);
                        Stature.setText("");
                        if(stat5 > 0){
                            Stature.setText(stature.convertToInches(stat5));
                        }
                        test--;
                }
                if(test == 24){
                        ProgPic.setVisible(false);   
                        Stature.setText("");
                        Y2RadioButton.setSelected(true);
                        M6RadioButton.setVisible(true);
                        Y2RadioButton.setVisible(true);
                        UlnaLabel.setVisible(true);
                        StatureTestLabel.setVisible(true);
                        StatureTestDescription.setVisible(true);
                        StaturePic.setVisible(true);
                        LengthLabel.setVisible(true);
                        StatureTextBox.setVisible(true);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Ulna2.png")));
                        StatureProgressBar.setValue(5);
                        Stature.setText("");
                        if(stat6 > 0){
                            Stature.setText(stature.convertToInches(stat6));
                        }
                        Submit.setVisible(false);
                        test--;
                }
            }
        });
        
        Submit.setFont(new java.awt.Font("Serif", 0, 12));
        Submit.setText("Submit");
        
        Submit.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 24){                    
                    Log.readTest = 0;
                    Log.Case.clear();
                    Log.Age.clear();
                    Log.Race.clear();
                    Log.Sex.clear();
                    Log.Stature.clear();
                    new Anthro4().setVisible(true);
                    setVisible(false);
                }
                if(test == 23){
                    if(M6RadioButton.isSelected() == true){
                                if(!StatureTextBox.getText().equals("") && !Race.getText().equals("") && !Sex.getText().equals("")){

                                    double hieght = stature.hieght(Race.getText(), Sex.getText(), "Ulna", StatureTextBox.getText());
                                    String tall = stature.convertToInches(hieght);
                                    if(stat6 + 4 > stat5 || stat6 - 4 < stat5){
                                        Stature.setText(tall);
                                        stat6 = hieght;
                                    }else{
                                        stat6 = stat5;
                                    }
                                }
                            }else{
                            stat6 = stat5;
                        }

                        
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/skel.png")));
                        FinishLabel.setVisible(true);
                        FinishDescription.setVisible(true);
                        FinishButton.setVisible(true);
                        Submit.setText("Done");
                        StatureProgressBar.setValue(6);
                        M6RadioButton.setVisible(false);
                        Y2RadioButton.setVisible(false);
                        UlnaLabel.setVisible(false);
                        StatureTestLabel.setVisible(false);
                        StatureTestDescription.setVisible(false);
                        LengthLabel.setVisible(false);
                        StatureTextBox.setVisible(false);
                        test++;
                }
                if(test == 22){
                    if(M6RadioButton.isSelected() == true){
                                if(!StatureTextBox.getText().equals("") && !Race.getText().equals("") && !Sex.getText().equals("")){

                                    double hieght = stature.hieght(Race.getText(), Sex.getText(), "Radius", StatureTextBox.getText());
                                    String tall = stature.convertToInches(hieght);
                                    if(stat5 + 4 > stat4 || stat5 - 4 < stat4){
                                        Stature.setText(tall);
                                        stat5 = hieght;
                                    }else{
                                        stat5 = stat4;
                                    }
                                }
                            }else{
                            stat5 = stat4;
                        }

                            
                        UlnaLabel.setVisible(true);                        
                        Radius2Label.setVisible(false); 
                        Y2RadioButton.setSelected(true);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Ulna2.png")));
                        StatureProgressBar.setValue(5);
                        StatureTextBox.setText("");
                        test++;
                }
                if(test == 21){
                    if(M6RadioButton.isSelected() == true){
                                if(!StatureTextBox.getText().equals("") && !Race.getText().equals("") && !Sex.getText().equals("")){

                                    double hieght = stature.hieght(Race.getText(), Sex.getText(), "Fibula", StatureTextBox.getText());
                                    String tall = stature.convertToInches(hieght);
                                    if(stat4 + 4 > stat3 || stat4 - 4 < stat3){
                                        Stature.setText(tall);
                                        stat4 = hieght;
                                    }else{
                                        stat4 = stat3;
                                    }
                                }
                            }else{
                            stat4 = stat3;
                        }

                            
                        Radius2Label.setVisible(true);                        
                        FibulaLabel.setVisible(false); 
                        Y2RadioButton.setSelected(true);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Radius2.png")));
                        StatureProgressBar.setValue(4);
                        StatureTextBox.setText("");
                        test++;
                }
                if(test == 20){
                    if(M6RadioButton.isSelected() == true){
                                if(!StatureTextBox.getText().equals("") && !Race.getText().equals("") && !Sex.getText().equals("")){

                                    double hieght = stature.hieght(Race.getText(), Sex.getText(), "Tibia", StatureTextBox.getText());
                                    String tall = stature.convertToInches(hieght);
                                    if(stat3 + 4 > stat2 || stat3 - 4 < stat2){
                                        Stature.setText(tall);
                                        stat3 = hieght;
                                    }else{
                                        stat3 = stat2;
                                    }
                                }
                            }else{
                            stat3 = stat2;
                        }

                            
                        FibulaLabel.setVisible(true);                        
                        TibiaLabel.setVisible(false); 
                        Y2RadioButton.setSelected(true);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Fibula.png")));
                        StatureProgressBar.setValue(3);
                        StatureTextBox.setText("");
                        test++;
                }
                if(test == 19){
                        if(M6RadioButton.isSelected() == true){
                            if(!StatureTextBox.getText().equals("") && !Race.getText().equals("") && !Sex.getText().equals("")){

                                double hieght = stature.hieght(Race.getText(), Sex.getText(), "Humerus", StatureTextBox.getText());
                                String tall = stature.convertToInches(hieght);                                
                                if(stat2 + 4 > stat1 || stat2 - 4 < stat1){
                                    Stature.setText(tall);
                                    stat2 = hieght;
                                }else{
                                    stat2 = stat1;
                                }

                            }
                        }else{
                            stat2 = stat1;
                        }


                    TibiaLabel.setVisible(true);
                    HumerusLabel.setVisible(false); 
                    Y2RadioButton.setSelected(true);
                    StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Tibia2.png")));
                    StatureProgressBar.setValue(2);
                    StatureTextBox.setText("");
                    test++;


                    } 
                    if(test == 18){
                        if(M6RadioButton.isSelected() == true){
                            if(!StatureTextBox.getText().equals("") && !Race.getText().equals("") && !Sex.getText().equals("")){

                                double hieght = stature.hieght(Race.getText(), Sex.getText(), "Femur", StatureTextBox.getText());
                                String tall = stature.convertToInches(hieght);
                                Stature.setText(tall);
                                stat1 = hieght;
                            }
                        }
                    
                    HumerusLabel.setVisible(true);
                    FemurLabel.setVisible(false); 
                    Y2RadioButton.setSelected(true);
                    StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Humerus2.png")));
                    StatureProgressBar.setValue(1);
                    StatureTextBox.setText("");
                    test++;
                    
                    
                } 
                if(test == 17){
                        if(M6RadioButton.isSelected() == true){
                            male++;
                            tempS6 = "Male";
                        } if(Y2RadioButton.isSelected() == true){
                            female++;                            
                            tempS6 = "Female";
                        }
                        if(male > female){
                            Sex.setText("Male");
                        }
                        if(female > male){
                            Sex.setText("Female");
                        }
                        ProgPic.setVisible(false);
                        Y10RadioButton.setSelected(false); 
                        SciaticTestLabel.setVisible(false);
                        SciaticTestDescription.setVisible(false);
                        Y10RadioButton.setVisible(false);
                        M6RadioButton.setVisible(true);
                        Y2RadioButton.setVisible(true);   
                        Y2RadioButton.setSelected(true);
                        M6RadioButton.setText("Applicable");
                        Y2RadioButton.setText("Not Applicable");
                        StatureTestLabel.setVisible(true);
                        FemurLabel.setVisible(true);
                        LengthLabel.setVisible(true);
                        StatureTestDescription.setVisible(true);
                        StatureTextBox.setVisible(true);
                        StaturePic.setVisible(true);
                        StaturePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Femur2.jpg")));
                        SexProgressBar.setValue(6);
                        test++;
                }
                if(test == 16){
                        if(M6RadioButton.isSelected() == true){
                            male++;
                            tempS5 = "Male";
                        } if(Y2RadioButton.isSelected() == true){
                            female++;                            
                            tempS5 = "Female";
                        } 
                        if(male > female){
                            Sex.setText("Male");
                        }
                        if(female > male){
                            Sex.setText("Female");
                        }
                        BabyTeethTestPic.setVisible(false);  
                        ProgPic.setVisible(true);
                        ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Sciatic.jpg")));
                        Y10RadioButton.setSelected(true); 
                        HipTestLabel.setVisible(false);
                        HipTestDescription.setVisible(false);
                        SciaticTestLabel.setVisible(true);
                        SciaticTestDescription.setVisible(true);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Small\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Large\"");
                        SexProgressBar.setValue(5);
                        test++;
                }
                if(test == 15){
                        if(M6RadioButton.isSelected() == true){
                            male++;
                            tempS4 = "Male";
                        } if(Y2RadioButton.isSelected() == true){
                            female++;                            
                            tempS4 = "Female";
                        }
                        if(male > female){
                            Sex.setText("Male");
                        }
                        if(female > male){
                            Sex.setText("Female");
                        }
                        BabyTeethTestPic.setVisible(false);
                        Y10RadioButton.setSelected(true); 
                        MastoidTestLabel.setVisible(false);
                        MastoidTestDescription.setVisible(false);
                        HipTestLabel.setVisible(true);
                        HipTestDescription.setVisible(true);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Narrow\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Wide\"");
                        SexProgressBar.setValue(4);
                        test++;
                }
                if(test == 14){
                        if(M6RadioButton.isSelected() == true){
                            male++;
                            tempS3 = "Male";
                        } if(Y2RadioButton.isSelected() == true){
                            female++;                            
                            tempS3 = "Female";
                        } 
                        if(male > female){
                            Sex.setText("Male");
                        }
                        if(female > male){
                            Sex.setText("Female");
                        }
                        BabyTeethTestPic.setVisible(true);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Mast.jpg")));
                        Y10RadioButton.setSelected(true); 
                        ProtubeTestLabel.setVisible(false);
                        ProtubeTestDescription.setVisible(false);
                        MastoidTestLabel.setVisible(true);
                        MastoidTestDescription.setVisible(true);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Large Process\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Small Process\"");
                        SexProgressBar.setValue(3);
                        test++;
                }
                if(test == 13){
                        if(M6RadioButton.isSelected() == true){
                            male++;
                            tempS2 = "Male";
                        } if(Y2RadioButton.isSelected() == true){
                            female++;                            
                            tempS2 = "Female";
                        } 
                        if(male > female){
                            Sex.setText("Male");
                        }
                        if(female > male){
                            Sex.setText("Female");
                        }
                        BabyTeethTestPic.setVisible(true);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Protube.jpg")));
                        Y10RadioButton.setSelected(true); 
                        ChinTestLabel.setVisible(false);
                        ChinTestDescription.setVisible(false);
                        ProtubeTestLabel.setVisible(true);
                        ProtubeTestDescription.setVisible(true);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Large Protuberance\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Small Protuberance\"");
                        SexProgressBar.setValue(2);
                        test++;
                }
                if(test == 12){
                        if(M6RadioButton.isSelected() == true){
                            male++;
                            tempS1 = "Male";
                        } if(Y2RadioButton.isSelected() == true){
                            female++;
                            
                            tempS1 = "Female";
                        } 
                        if(male > female){
                            Sex.setText("Male");
                        }
                        if(female > male){
                            Sex.setText("Female");
                        }
                        BabyTeethTestPic.setVisible(true);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Chin.jpg")));
                        Y10RadioButton.setSelected(true); 
                        ForeheadTestLabel.setVisible(false);
                        ForeheadTestDescription.setVisible(false);
                        ChinTestLabel.setVisible(true);
                        ChinTestDescription.setVisible(true);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Square\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Pointed\"");
                        SexProgressBar.setValue(1);
                        test++;
                }
                if(test == 11){
                        if(M6RadioButton.isSelected() == true){
                            cauc++;
                            tempR6 = "Cauc";
                            negr++;
                            tempR62 = "Negr";
                        }
                        if(Y2RadioButton.isSelected() == true){
                            mong++;
                            tempR6 = "Mong";
                        } 
                            if(cauc > negr && cauc > mong){
                                Race.setText("Caucasoid");
                            }
                            if(negr > cauc && negr > mong){
                                Race.setText("Negroid");
                            }
                            if(mong > cauc && mong > negr){
                                Race.setText("Mongoloid");
                            } 
                        BabyTeethTestPic.setVisible(true);
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Forehead.jpg")));
                        IncisorsTestLabel.setVisible(false);
                        IncisorsTestDescription.setVisible(false);
                        Y10RadioButton.setSelected(true); 
                        ForeheadTestLabel.setVisible(true);
                        ForeheadTestDescription.setVisible(true);
                        M6RadioButton.setText("<html>Male<p align=\"center\">\"Slanted\"");
                        Y2RadioButton.setText("<html>Female<p align=\"center\">\"Vertical\"");
                        RaceProgressBar.setValue(6);
                        test++;
                }
                if(test == 10){
                        if(M6RadioButton.isSelected() == true){
                            cauc++;
                            tempR5 = "Cauc";
                        }
                        if(Y1RadioButton.isSelected() == true){
                            negr++;
                            tempR5 = "Negr";
                        }
                        if(Y2RadioButton.isSelected() == true){
                            mong++;
                            tempR5 = "Mong";
                        } 
                            if(cauc > negr && cauc > mong){
                                Race.setText("Caucasoid");
                            }
                            if(negr > cauc && negr > mong){
                                Race.setText("Negroid");
                            }
                            if(mong > cauc && mong > negr){
                                Race.setText("Mongoloid");
                            }  
                        ProgPic.setVisible(false);
                        Y1RadioButton.setVisible(false);
                        Y10RadioButton.setSelected(true);
                        biteTestLabel.setVisible(false);
                        biteTestDescription.setVisible(false);
                        SpineTestLabel.setVisible(false);
                        SpineTestDescription.setVisible(false);
                        IncisorsTestLabel.setVisible(true);
                        IncisorsTestDescription.setVisible(true);
                        M6RadioButton.setText("<html>Flat<p align=\"center\">\"Caucasoid/Negroid\"");
                        Y2RadioButton.setText("<html>Shoveled<p align=\"center\">\"Mongoloid\"");
                        RaceProgressBar.setValue(5);
                        test++;
                }
                if(test == 9){
                        if(M6RadioButton.isSelected() == true){
                            cauc++;
                            tempR4 = "Cauc";
                        }
                        if(Y1RadioButton.isSelected() == true){
                            negr++;
                            tempR4 = "Negr";
                        }
                        if(Y2RadioButton.isSelected() == true){
                            mong++;
                            tempR4 = "Mong";
                        } 
                            if(cauc > negr && cauc > mong){
                                Race.setText("Caucasoid");
                            }
                            if(negr > cauc && negr > mong){
                                Race.setText("Negroid");
                            }
                            if(mong > cauc && mong > negr){
                                Race.setText("Mongoloid");
                            }  
                        ProgPic.setVisible(false);
                        BabyTeethTestPic.setVisible(false);
                        Y10RadioButton.setSelected(true);
                        biteTestLabel.setVisible(true);
                        biteTestDescription.setVisible(true);
                        SpineTestLabel.setVisible(false);
                        SpineTestDescription.setVisible(false);
                        RaceProgressBar.setValue(4);                                                
                        Y10RadioButton.setText("Not Applicable");
                        M6RadioButton.setText("<html>Caucasoid<p align=\"center\">\"Overbite\"");
                        Y1RadioButton.setText("<html>Negroid<p align=\"center\">\"Overbite\"");
                        Y2RadioButton.setText("<html>Mongoloid<p align=\"center\">\"Even Bite\"");
                        test++;
                }
                if(test == 8){
                        if(M6RadioButton.isSelected() == true){
                            cauc++;
                            tempR3 = "Cauc";
                        }
                        if(Y1RadioButton.isSelected() == true){
                            negr++;
                            tempR3 = "Negr";
                        }
                        if(Y2RadioButton.isSelected() == true){
                            mong++;
                            tempR3 = "Mong";
                        }
                            if(cauc > negr && cauc > mong){
                                Race.setText("Caucasoid");
                            }
                            if(negr > cauc && negr > mong){
                                Race.setText("Negroid");
                            }
                            if(mong > cauc && mong > negr){
                                Race.setText("Mongoloid");
                            }
                        SillTestLabel.setVisible(false);
                        ProgPic.setVisible(false);
                        BabyTeethTestPic.setVisible(false);
                        SillTestDescription.setVisible(false); 
                        SpineTestLabel.setVisible(true);
                        SpineTestDescription.setVisible(true);
                        Y10RadioButton.setSelected(true);                        
                        Y10RadioButton.setText("Not Applicable");
                        M6RadioButton.setText("<html>Caucasoid<p align=\"center\">\"Sharp Point\"");
                        Y1RadioButton.setText("<html>Negroid<p align=\"center\">\"Rounded Point\"");
                        Y2RadioButton.setText("<html>Mongoloid<p align=\"center\">\"Medium Point\"");
                        RaceProgressBar.setValue(3);
                        test++;
                }
                if(test == 7){
                    if(ZygomaticTestRadioButton1.isSelected() == true){
                        cauc++;
                        negr++;
                        tempR2 = "Cauc";
                        tempR22 = "Negr";
                    }
                    if(ZygomaticTestRadioButton2.isSelected() == true){
                        mong++;
                        tempR2 = "Mong";
                    }
                            if(cauc > negr && cauc > mong){
                                Race.setText("Caucasoid");
                            }
                            if(negr > cauc && negr > mong){
                                Race.setText("Negroid");
                            }
                            if(mong > cauc && mong > negr){
                                Race.setText("Mongoloid");
                            }
                        ZygomaticTestLabel.setVisible(false);
                        ZygomaticTestPic.setVisible(false);
                        ZygomaticTestCenterLabel.setVisible(false); 
                        ZygomaticTestRadioButton1.setVisible(false);
                        ZygomaticTestRadioButton2.setVisible(false);
                        ZygomaticTestOrLabel.setVisible(false);
                        ZygomaticTestRadioButton3.setVisible(false);                      
                        M6RadioButton.setVisible(true);
                        Y1RadioButton.setVisible(true);
                        Y2RadioButton.setVisible(true);                        
                        Y10RadioButton.setVisible(true);
                        Y10RadioButton.setSelected(true);
                        SillTestLabel.setVisible(true);
                        SillTestDescription.setVisible(true);
                        Y10RadioButton.setText("Not Applicable");
                        M6RadioButton.setText("<html>Caucasoid<p align=\"center\">\"High Sill\"");
                        Y1RadioButton.setText("<html>Negroid<p align=\"center\">\"Nasal Guttering\"");
                        Y2RadioButton.setText("<html>Mongoloid<p align=\"center\">\"Medium Sill\"");
                        RaceProgressBar.setValue(2);
                        test++;
                }
                if(test == 6){
                    if(M6RadioButton.isSelected() == true){
                        cauc++;
                                tempR1 = "Cauc";
                    }
                    if(Y1RadioButton.isSelected() == true){
                        negr++;
                                tempR1 = "Negr";
                    }
                    if(Y2RadioButton.isSelected() == true){
                        mong++;
                                tempR1 = "Mong";
                    }
                            if(cauc > negr && cauc > mong){
                                Race.setText("Caucasoid");
                            }
                            if(negr > cauc && negr > mong){
                                Race.setText("Negroid");
                            }
                            if(mong > cauc && mong > negr){
                                Race.setText("Mongoloid");
                            }
                        ProgTestLabel.setVisible(false);
                        ProgPic.setVisible(false);
                        BabyTeethTestPic.setVisible(false);
                        ProgTestDescription.setVisible(false);
                        M6RadioButton.setVisible(false);
                        Y1RadioButton.setVisible(false);
                        Y2RadioButton.setVisible(false);
                        Y10RadioButton.setVisible(false);
                        ZygomaticTestLabel.setVisible(true);
                        ZygomaticTestPic.setVisible(true);
                        ZygomaticTestCenterLabel.setVisible(true); 
                        ZygomaticTestRadioButton1.setVisible(true);
                        ZygomaticTestRadioButton2.setVisible(true);
                        ZygomaticTestOrLabel.setVisible(true);
                        ZygomaticTestRadioButton3.setVisible(true);
                        ZygomaticTestRadioButton3.setSelected(true);
                        RaceProgressBar.setValue(1);
                        test++;                    
                }
                if(test == 5){
                   if(Y1RadioButton.isSelected() == true){
                        if(age.contains("24") && age.get(age.size() - 1).compareTo("24") >= 0){                                
                                for(int i = age.indexOf("24") + 1; i < age.size(); i = age.indexOf("24") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip = 1;
                        }
                    }
                    if(Y4RadioButton.isSelected() == true){
                        if(age.contains("25") && age.get(0).compareTo("25") <= 0){
                                for(int i = age.indexOf("25") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip = 1;
                        }                        
                    }
                    if(skip == 0 && skip2 == 0){                        
                        ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MongoProg.jpg")));
                        BabyTeethTestPic.setVisible(false);
                        ClavicleLabel.setVisible(false);
                        DistalLabel.setVisible(false);
                        ProximalLabel.setVisible(false);
                        EPTestLabel.setVisible(false);
                        EPTestDescription.setVisible(false);
                        Y5RadioButton.setVisible(false);
                        Y10RadioButton.setVisible(true);
                        Y1RadioButton.setVisible(false);
                        Y2RadioButton.setVisible(false);
                        Y4RadioButton.setVisible(false);
                        M6RadioButton.setVisible(true);
                        Y1RadioButton.setVisible(true);
                        Y2RadioButton.setVisible(true);
                        DistalRadioButton1.setVisible(false);
                        DistalRadioButton2.setVisible(false);
                        DistalRadioButton3.setVisible(false);
                        DistalRadioButton4.setVisible(false);
                        ProgTestLabel.setVisible(true);
                        ProgTestDescription.setVisible(true);
                        Y10RadioButton.setSelected(true);
                        Y10RadioButton.setText("Not Applicable");
                        M6RadioButton.setText("<html>Caucasoid<p align=\"center\">\"None - Straight\"");
                        Y1RadioButton.setText("<html>Negroid<p align=\"center\">\"Yes - Forward Lean\"");
                        Y2RadioButton.setText("<html>Mongoloid<p align=\"center\">\"None - Straight\"");
                        AgeProgressBar.setValue(6);                        
                        if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                        test++;
                        for(int i = 0; i < age.size(); i++){
                            tempA6.add(age.get(i));
                        }
                    }
                    skip = 0;
                    skip2 = 0;
                }
                if(test == 4){
                   if(Y1RadioButton.isSelected() == true){
                        if(age.contains("15") && age.get(age.size() - 1).compareTo("15") >= 0){                                
                                for(int i = age.indexOf("15") + 1; i < age.size(); i = age.indexOf("15") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip = 1;
                        }
                    }
                    if(Y2RadioButton.isSelected() == true){
                        if(age.contains("16")){
                             for(int i = age.indexOf("16") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;                                
                            }
                         if(age.contains("19")){
                                for(int i = age.indexOf("19") + 1; i < age.size(); i = age.indexOf("19") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                         }                            
                         if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                    }
                    if(Y4RadioButton.isSelected() == true){
                        if(age.contains("20") && age.get(0).compareTo("20") <= 0){
                                for(int i = age.indexOf("20") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip = 1;
                        }                        
                    }
                    if(DistalRadioButton1.isSelected() == true){
                        if(age.contains("15") && age.get(age.size() - 1).compareTo("15") >= 0){                                
                                for(int i = age.indexOf("15") + 1; i < age.size(); i = age.indexOf("15") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip2 = 1;
                        }
                    }
                    if(DistalRadioButton2.isSelected() == true){
                         if(age.contains("16")){
                             for(int i = age.indexOf("16") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;                                
                            }
                         if(age.contains("23")){
                                for(int i = age.indexOf("23") + 1; i < age.size(); i = age.indexOf("23") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;
                            }                            
                         if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                    }
                    if(DistalRadioButton3.isSelected() == true){
                       if(age.contains("24") && age.get(0).compareTo("24") <= 0){
                                for(int i = age.indexOf("24") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;
                        }else{
                            skip2 = 1;
                        }  
                    }
                    if(skip == 0 && skip2 == 0){
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Clavicle.jpg")));
                        RadiusLabel.setVisible(false);
                        ClavicleLabel.setVisible(true);
                        Y5RadioButton.setSelected(true);
                        DistalRadioButton2.setVisible(false);
                        Y2RadioButton.setVisible(false);
                        DistalRadioButton1.setVisible(false);
                        DistalRadioButton3.setVisible(false);
                        DistalRadioButton4.setVisible(false);
                        DistalLabel.setVisible(false);
                        ProximalLabel.setText("<html><u>Sternal</html>");
                        DistalRadioButton4.setSelected(true);
                        AgeProgressBar.setValue(5);                        
                        if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                        test++;
                        for(int i = 0; i < age.size(); i++){
                            tempA5.add(age.get(i));
                        }
                    }
                    skip = 0;
                    skip2 = 0;
                }
                if(test == 3){
                    if(Y1RadioButton.isSelected() == true){
                        if(age.contains("15") && age.get(age.size() - 1).compareTo("15") >= 0){                                
                                for(int i = age.indexOf("15") + 1; i < age.size(); i = age.indexOf("15") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip = 1;
                        }
                    }
                    if(Y2RadioButton.isSelected() == true){
                        if(age.contains("16")){
                             for(int i = age.indexOf("16") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;                                
                            }
                         if(age.contains("24")){
                                for(int i = age.indexOf("24") + 1; i < age.size(); i = age.indexOf("24") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                         }                            
                         if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                    }
                    if(Y4RadioButton.isSelected() == true){
                        if(age.contains("25") && age.get(0).compareTo("25") <= 0){
                                for(int i = age.indexOf("25") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip = 1;
                        }                        
                    }
                    if(DistalRadioButton1.isSelected() == true){
                        if(age.contains("11") && age.get(age.size() - 1).compareTo("11") >= 0){                                
                                for(int i = age.indexOf("9") + 1; i < age.size(); i = age.indexOf("11") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip2 = 1;
                        }
                    }
                    if(DistalRadioButton2.isSelected() == true){
                         if(age.contains("12")){
                             for(int i = age.indexOf("12") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;                                
                            }
                         if(age.contains("20")){
                                for(int i = age.indexOf("20") + 1; i < age.size(); i = age.indexOf("20") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;
                            }                            
                         if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                    }
                    if(DistalRadioButton3.isSelected() == true){
                       if(age.contains("21") && age.get(0).compareTo("21") <= 0){
                                for(int i = age.indexOf("21") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;
                        }else{
                            skip2 = 1;
                        }  
                    }
                    
                    if(skip == 0 && skip2 == 0){
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Radius.jpg")));
                        HumerusLabel.setVisible(false);
                        RadiusLabel.setVisible(true);
                        Y5RadioButton.setSelected(true);
                        DistalRadioButton4.setSelected(true);                                                
                        if(age.get(0).equals(age.get(age.size() - 1))){
                            Age.setText(age.get(0) + " Years Old");
                        }
                        AgeProgressBar.setValue(4);
                        test++;
                        for(int i = 0; i < age.size(); i++){
                            tempA4.add(age.get(i));
                        }
                    }
                    skip = 0;
                    skip2 = 0;
                }
                if(test == 2){
                    if(Y1RadioButton.isSelected() == true){
                        if(age.contains("13")){                                
                                for(int i = age.indexOf("13") + 1; i < age.size(); i = age.indexOf("13") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip = 1;
                        }
                    }
                    if(Y2RadioButton.isSelected() == true){
                        if(age.contains("14")){
                             for(int i = age.indexOf("14") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;                                
                            }
                         if(age.contains("20")){
                                for(int i = age.indexOf("20") + 1; i < age.size(); i = age.indexOf("20") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                         }                            
                         if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                    }
                    if(Y4RadioButton.isSelected() == true){
                        if(age.contains("21") && age.get(0).compareTo("21") <= 0){
                                for(int i = age.indexOf("21") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip = 1;
                        }                        
                    }
                    if(DistalRadioButton1.isSelected() == true){
                        if(age.contains("9")){                                
                                for(int i = age.indexOf("9") + 1; i < age.size(); i = age.indexOf("9") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip = 0;
                        }else{
                            skip2 = 1;
                        }
                    }
                    if(DistalRadioButton2.isSelected() == true){
                         if(age.contains("10")){
                             for(int i = age.indexOf("10") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;                                
                            }
                         if(age.contains("23")){
                                for(int i = age.indexOf("23") + 1; i < age.size(); i = age.indexOf("23") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;
                            }                            
                         if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                    }
                    if(DistalRadioButton3.isSelected() == true){
                       if(age.contains("24")){
                                for(int i = age.indexOf("24") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                skip2 = 0;
                        }else{
                            skip2 = 1;
                        }  
                    }
                    if(skip == 0 && skip2 == 0){
                        BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Humerus.jpg")));
                        FemurLabel.setVisible(false);
                        HumerusLabel.setVisible(true);
                        Y5RadioButton.setSelected(true);
                        DistalRadioButton4.setSelected(true);
                        AgeProgressBar.setValue(3);                        
                        if(age.size() == 1){
                            Age.setText(age.get(0) + " Years Old");
                        }
                        test++;
                        for(int i = 0; i < age.size(); i++){
                            tempA3.add(age.get(i));
                        }
                    }
                    skip = 0;
                    skip2 = 0;
                }
                if(test == 1){
                    if(TeethNARadioButton.isSelected() == true){
                        teeth = 1;
                    }
                    if(teeth == 1){
                        if(BirthRadioButton.isSelected() == true){
                            for(int i = age.indexOf("18") - 1; i >= 0; i--){
                                age.remove(i);
                            }
                            if(age.get(age.size() - 1).compareTo("18") > 0){
                                for(int i = age.indexOf("19") + 1; i < age.size(); i = age.indexOf("19") + 1){
                                    age.remove(i);
                                }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 2;
                                skip = 0;
                            }else{
                                Age.setText(age.get(0) + " Years Old");
                                skip = 0;
                            }
                            
                        }
                        if(M9RadioButton.isSelected() == true){
                            if(pick == 1){
                                for(int i = age.indexOf("20") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("21") + 1; i < age.size(); i = age.indexOf("21") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 2;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(M18RadioButton.isSelected() == true){
                            if(pick == 1){
                                for(int i = age.indexOf("22") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("24") + 1; i < age.size(); i = age.indexOf("24") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 2;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(Y3RadioButton.isSelected() == true){
                            if(pick == 2){
                                for(int i = age.indexOf("25") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("26") + 1; i < age.size(); i = age.indexOf("26") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 3;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(Y5RadioButton.isSelected() == true){
                            if(pick == 2){
                                for(int i = age.indexOf("27") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("30") + 1; i < age.size(); i = age.indexOf("30") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 3;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(Y6RadioButton.isSelected() == true){
                            if(pick == 2){
                                for(int i = age.indexOf("30") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("35") + 1; i < age.size(); i = age.indexOf("35") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 3;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(Y8RadioButton.isSelected() == true){
                            if(pick == 2){
                                for(int i = age.indexOf("35") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("39") + 1; i < age.size(); i = age.indexOf("39") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 3;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(Y10RadioButton.isSelected() == true){
                            if(pick == 2){
                                for(int i = age.indexOf("39") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("44") + 1; i < age.size(); i = age.indexOf("44") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 3;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(Y12RadioButton.isSelected() == true){
                            if(pick == 2){
                                for(int i = age.indexOf("45") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("50") + 1; i < age.size(); i = age.indexOf("50") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                                pick = 3;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(Y21RadioButton.isSelected() == true){
                            if(pick == 2){
                                for(int i = age.indexOf("50") - 1; i >= 0; i--){
                                    age.remove(i);
                                }
                                for(int i = age.indexOf("50") + 1; i < age.size(); i = age.indexOf("50") + 1){
                                        age.remove(i);
                                    }
                                Age.setText(age.get(0) + "+ Years Old");
                                pick = 3;
                                skip = 0;
                            }else{
                                skip = 1;
                            }
                        }
                        if(skip == 0){
                            PubicTestLabel.setVisible(false);
                            PubicTestDescription.setVisible(false);
                            BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Femur.jpg")));
                            BirthRadioButton.setVisible(false);
                            M9RadioButton.setVisible(false);
                            M18RadioButton.setVisible(false);
                            Y3RadioButton.setVisible(false);
                            Y5RadioButton.setVisible(true);
                            Y6RadioButton.setVisible(false);
                            Y8RadioButton.setVisible(false);
                            Y10RadioButton.setVisible(false);
                            Y12RadioButton.setVisible(false);
                            Y21RadioButton.setVisible(false);
                            TeethNARadioButton.setVisible(false);
                            AgeProgressBar.setValue(2);         
                            Y1RadioButton.setVisible(true);
                            Y1RadioButton.setText("Not Fused");
                            Y2RadioButton.setVisible(true);
                            Y2RadioButton.setText("Fusing");
                            Y4RadioButton.setVisible(true);
                            Y4RadioButton.setText("Fused");
                            Y9RadioButton.setVisible(false);
                            Y5RadioButton.setText("Not Applicable");
                            Y5RadioButton.setSelected(true);
                            DistalRadioButton1.setVisible(true);
                            DistalRadioButton1.setText("Not Fused");
                            Y11RadioButton.setVisible(false);
                            DistalRadioButton2.setVisible(true);
                            DistalRadioButton2.setText("Fusing");
                            Y15RadioButton.setVisible(false);
                            DistalRadioButton3.setVisible(true);
                            DistalRadioButton3.setText("Fused");
                            DistalRadioButton4.setVisible(true);
                            DistalRadioButton4.setText("Not Applicable");
                            DistalRadioButton4.setSelected(true);
                            ProximalLabel.setText("<html><u>Proximal</html>");
                            EPTestLabel.setVisible(true);
                            EPTestDescription.setVisible(true);
                            ProximalLabel.setVisible(true);
                            DistalLabel.setVisible(true);
                            FemurLabel.setVisible(true);
                            for(int i = 0; i < age.size(); i++){
                            tempA2.add(age.get(i));
                        }
                            test++;
                        }
                    }
                }
                if(test == 0){
                    
                    age.clear();
                    
                    if(BirthRadioButton.isSelected() == true){
                        age.add("Birth");
                        age.add("2 Months");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(M6RadioButton.isSelected() == true){
                        age.add("3 Months");
                        age.add("6 Months");
                        age.add("8 Months");
                        age.add("9 Months");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Old");
                    }
                    if(M9RadioButton.isSelected() == true){
                        age.add("6 Months");
                        age.add("8 Months");
                        age.add("9 Months");
                        age.add("10 Months");
                        age.add("11 Months");
                        age.add("1");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y1RadioButton.isSelected() == true){
                        age.add("8 Months");
                        age.add("9 Months");
                        age.add("10 Months");
                        age.add("11 Months");
                        age.add("1");
                        age.add("16 Months");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Old");
                    }
                    if(M18RadioButton.isSelected() == true){
                        age.add("1");
                        age.add("16 Months");
                        age.add("18 Months");
                        age.add("2");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y2RadioButton.isSelected() == true){
                        age.add("16 Months");
                        age.add("18 Months");
                        age.add("2");
                        age.add("3");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y3RadioButton.isSelected() == true){
                        age.add("2");
                        age.add("3");
                        age.add("4");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y4RadioButton.isSelected() == true){
                        age.add("3");
                        age.add("4");
                        age.add("5");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y5RadioButton.isSelected() == true){
                        age.add("4");
                        age.add("5");
                        age.add("6");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y6RadioButton.isSelected() == true){
                        age.add("4");
                        age.add("5");
                        age.add("6");
                        age.add("7");
                        age.add("8");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y7RadioButton.isSelected() == true){
                        age.add("5");
                        age.add("6");
                        age.add("7");
                        age.add("8");
                        age.add("9");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y8RadioButton.isSelected() == true){
                        age.add("6");
                        age.add("7");
                        age.add("8");
                        age.add("9");
                        age.add("10");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y9RadioButton.isSelected() == true){
                        age.add("7");
                        age.add("8");
                        age.add("9");
                        age.add("10");
                        age.add("11");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y10RadioButton.isSelected() == true){
                        age.add("7");
                        age.add("8");
                        age.add("9");
                        age.add("10");
                        age.add("11");
                        age.add("12");
                        age.add("13");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y11RadioButton.isSelected() == true){
                        age.add("8");
                        age.add("9");
                        age.add("10");
                        age.add("11");
                        age.add("12");
                        age.add("13");
                        age.add("14");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y12RadioButton.isSelected() == true){
                        age.add("9");
                        age.add("10");
                        age.add("11");
                        age.add("12");
                        age.add("13");
                        age.add("14");
                        age.add("15");
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y15RadioButton.isSelected() == true){
                        age.add("12");
                        age.add("13");
                        age.add("14");
                        age.add("15");
                        age.add("16");
                        age.add("17");
                        age.add("18");
                        teeth = 1;
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y21RadioButton.isSelected() == true){
                        age.add("18");
                        age.add("19");
                        age.add("20");
                        age.add("21");
                        age.add("22");
                        age.add("23");
                        age.add("24");
                        teeth = 1;                        
                        pick = 1;
                        Age.setText(age.get(0) + " - " + age.get(age.size() - 1) + " Years Old");
                    }
                    if(Y35RadioButton.isSelected() == true){
                        for(int i = 25; i <= 50; i++){
                            age.add(i + "");
                        }
                        teeth = 1;
                        pick = 2;
                        Age.setText(age.get(0) + " - 50" + " Years Old");
                    }
                    if(TeethNARadioButton.isSelected() == true){
                        age.add("Birth");
                        age.add("2 Months");
                        age.add("3 Months");
                        age.add("6 Months");
                        age.add("8 Months");
                        age.add("9 Months");
                        age.add("10 Months");
                        age.add("11 Months");
                        age.add("1");                        
                        age.add("16 Months");
                        age.add("18 Months");
                        age.add("2");
                        for(int i = 3; i <= 60; i++){
                            age.add(i + "");
                        }
                        teeth = 1;
                    }
                    BabyTeethTestLabel.setVisible(false);  
                    M6RadioButton.setVisible(false);       
                    Y1RadioButton.setVisible(false);      
                    Y2RadioButton.setVisible(false);       
                    Y4RadioButton.setVisible(false);       
                    Y7RadioButton.setVisible(false);       
                    Y9RadioButton.setVisible(false);      
                    Y11RadioButton.setVisible(false);      
                    Y15RadioButton.setVisible(false);      
                    Y35RadioButton.setVisible(false);  
                    TeethTestDescription.setVisible(false);
                    PubicTestLabel.setVisible(true);
                    PubicTestDescription.setVisible(true);
                    BabyTeethTestPic.setVisible(true);
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Pubic.jpg")));
                    AgeProgressBar.setValue(1);
                    BirthRadioButton.setText("<html>18 - 19 Years Old<p align=\"center\">\"Rugged\"");
                    M9RadioButton.setText("<html>20 - 21 Years Old<p align=\"center\">\"Finely Textured Ridges\"");
                    M18RadioButton.setText("<html>22 - 24 Years Old<p align=\"center\">\"Dorsal Plateau\"");
                    Y3RadioButton.setText("<html>25 - 26 Years Old<p align=\"center\">\"Beveling\"");
                    Y5RadioButton.setText("<html>27 - 30 Years Old<p align=\"center\">\"Ossifying Nodule\"");
                    Y6RadioButton.setText("<html>30 - 35 Years Old<p align=\"center\">\"Oval Outline\"");
                    Y8RadioButton.setText("<html>35 - 39 Years Old<p align=\"center\">\"Fine Grain\"");
                    Y10RadioButton.setText("<html>39 - 44 Years Old<p align=\"center\">\"Smooth\"");
                    Y12RadioButton.setText("<html>45 - 50 Years Old<p align=\"center\">\"Rimmed\"");
                    Y21RadioButton.setText("<html>50+ Years Old<p align=\"center\">\"Fused\"");
                    TeethNARadioButton.setSelected(true);
                    for(int i = 0; i < age.size(); i++){
                            tempA1.add(age.get(i));
                        }
                    test++;
                }
            }
        });

        Panel3.setBackground(new java.awt.Color(204, 204, 204));
        Panel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        IDLabel.setFont(new java.awt.Font("Serif", 1, 24));
        IDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDLabel.setText("<html><u>  I.D.</u></html>");

        CaseLabel.setFont(new java.awt.Font("Serif", 0, 18));
        CaseLabel.setText("Case:");

        AgeLabel.setFont(new java.awt.Font("Serif", 0, 18)); 
        AgeLabel.setText("Age:");

        RaceLabel.setFont(new java.awt.Font("Serif", 0, 18));
        RaceLabel.setText("Race:");

        SexLabel.setFont(new java.awt.Font("Serif", 0, 18));
        SexLabel.setText("Sex:");

        StatureLabel.setFont(new java.awt.Font("Serif", 0, 18));
        StatureLabel.setText("Stature:");

        Stature.setFont(new java.awt.Font("Serif", 0, 12));

        Sex.setFont(new java.awt.Font("Serif", 0, 12));

        Race.setFont(new java.awt.Font("Serif", 0, 12)); 

        Age.setFont(new java.awt.Font("Serif", 0, 12)); 

        Case.setFont(new java.awt.Font("Serif", 0, 12));

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatureLabel)
                            .addComponent(SexLabel)
                            .addComponent(RaceLabel)
                            .addComponent(AgeLabel)
                            .addComponent(CaseLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Case)
                            .addComponent(Race)
                            .addComponent(Sex)
                            .addComponent(Stature))))
                .addContainerGap(46, Short.MAX_VALUE))
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(holder2)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(Age)
                .addContainerGap(0, Short.MAX_VALUE)))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaseLabel)
                    .addComponent(Case))
                .addGap(18, 18, 18)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel))
                .addGap(18, 18, 18)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RaceLabel)
                    .addComponent(Race))
                .addGap(18, 18, 18)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexLabel)
                    .addComponent(Sex))
                .addGap(18, 18, 18)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatureLabel)
                    .addComponent(Stature))
                .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(holder2)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(Age)
                .addContainerGap(0, Short.MAX_VALUE)))
        );
        holder.setText("");
        holder2.setText("");
        
        BabyTeethTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        BabyTeethTestLabel.setText("<html><u>Teeth Formation Test</u></html>");
        
        TeethTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        TeethTestDescription.setText("<html><p align=\"center\">For this test look at the skull’s mandible and <br>and maxilla to see the teeth that are present. Each of the ages listed <br> in the test will show a picture that displays the average formation <br> and wear patterns of teeth in that range. Look closely at the size, wear,<br> and amount of teeth in the skull. If you do not have a skull or<br>cannot determine the correct dentition select not applicable and continue.</p></html>");
        
        ButtonGroup TeethTestGroup = new ButtonGroup();
        TeethTestGroup.add(BirthRadioButton);
        TeethTestGroup.add(M6RadioButton);
        TeethTestGroup.add(M9RadioButton);
        TeethTestGroup.add(Y1RadioButton);
        TeethTestGroup.add(M18RadioButton);
        TeethTestGroup.add(Y2RadioButton);
        TeethTestGroup.add(Y3RadioButton);
        TeethTestGroup.add(Y4RadioButton);
        TeethTestGroup.add(Y5RadioButton);
        TeethTestGroup.add(Y6RadioButton);
        TeethTestGroup.add(Y7RadioButton);
        TeethTestGroup.add(Y8RadioButton);
        TeethTestGroup.add(Y9RadioButton);
        TeethTestGroup.add(Y10RadioButton);
        TeethTestGroup.add(Y11RadioButton);
        TeethTestGroup.add(Y12RadioButton);
        TeethTestGroup.add(Y15RadioButton);
        TeethTestGroup.add(Y21RadioButton);
        TeethTestGroup.add(Y35RadioButton);
        TeethTestGroup.add(TeethNARadioButton);
        
        
        BirthRadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        BirthRadioButton.setText("<html>Birth<br>+ or - 2 Months</html>");
        BirthRadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {   if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethB.jpg")));
                }
            }
        });
        
        M6RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        M6RadioButton.setText("<html>6 Months<br>+ or - 3 Months</html>");
        M6RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethM6.jpg")));
                }
                if(test == 6){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/CaucaProg.jpg")));
                    BabyTeethTestPic.setVisible(false);
                    ProgPic.setVisible(true);
                }
                if(test == 8){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/CaucaSill.jpg")));
                    ProgPic.setVisible(true);
                }
                if(test == 9){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/CaucaSpine.jpg")));
                    BabyTeethTestPic.setVisible(false);
                    ProgPic.setVisible(true);
                }
                if(test == 10){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/CaucaBite.png")));
                    ProgPic.setVisible(true);
                }
                if(test == 11){
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Incisors.png")));
                    BabyTeethTestPic.setVisible(true);
                }
                if(test == 16){
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Malehip.jpg")));
                    BabyTeethTestPic.setVisible(true);
                }
            }
        });
        
        M9RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        M9RadioButton.setText("<html>9 Months<br>+ or - 3 Months</html>");
        M9RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethM9.jpg")));
                }
            }
        });
        
        Y1RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y1RadioButton.setText("<html>1 Year<br>+ or - 4 Months</html>");
        Y1RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY1.jpg")));
                }
                if(test == 6){
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/NegroProg.jpg")));
                    BabyTeethTestPic.setVisible(true);
                    ProgPic.setVisible(false);
                }
                if(test == 8){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/NegroSill.jpg")));
                    ProgPic.setVisible(true);
                }
                if(test == 9){
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/NegroSpine.jpg")));
                    BabyTeethTestPic.setVisible(true);
                    ProgPic.setVisible(false);
                }
                if(test == 10){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/NegroBite.png")));
                    ProgPic.setVisible(true);
                }
            }
        });
        
        M18RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        M18RadioButton.setText("<html>18 Monthes<br>+ or - 6 Months</html>");
        M18RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethM18.jpg")));
                }
            }
        });
        
        Y2RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y2RadioButton.setText("<html>2 Years<br>+ or - 8 Months</html>");
        Y2RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY2.jpg")));
                }
                if(test == 6){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MongoProg.jpg")));
                    BabyTeethTestPic.setVisible(false);
                    ProgPic.setVisible(true);
                }
                if(test == 8){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MongoSill.jpg")));
                    ProgPic.setVisible(true);
                }
                if(test == 9){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MongoSpine.jpg")));
                    BabyTeethTestPic.setVisible(false);
                    ProgPic.setVisible(true);
                }
                if(test == 10){
                    ProgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MongoBite.png")));
                    ProgPic.setVisible(true);
                }
                if(test == 11){
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/IncisorsShovel.png")));
                    BabyTeethTestPic.setVisible(true);
                }
                if(test == 16){
                    BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Femalehip.jpg")));
                    BabyTeethTestPic.setVisible(true);
                }
            }
        });
        
        Y3RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y3RadioButton.setText("<html>3 Years<br>+ or - 12 Months</html>");
        Y3RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY3.jpg")));
                }
            }
        });
        
        Y4RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y4RadioButton.setText("<html>4 Years<br>+ or - 12 Months</html>");
        Y4RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY4.jpg")));
                }
            }
        });
        
        Y5RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y5RadioButton.setText("<html>5 Years<br>+ or - 16 Months</html>");
        Y5RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY5.jpg")));
                }
            }
        });
        
        Y6RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y6RadioButton.setText("<html>6 Years<br>+ or - 24 Months</html>");
        Y6RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY6.jpg")));
                }
            }
        });
        
        Y7RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y7RadioButton.setText("<html>7 Years<br>+ or - 24 Months</html>");
        Y7RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY7.jpg")));
                }
            }
        });
        
        Y8RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y8RadioButton.setText("<html>8 Years<br>+ or - 24 Months</html>");
        Y8RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY8.jpg")));
                }
            }
        });
        
        Y9RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y9RadioButton.setText("<html>9 Years<br>+ or - 24 Months</html>");
        Y9RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY9.jpg")));
                }
            }
        });
        
        Y10RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y10RadioButton.setText("<html>10 Years<br>+ or - 30 Months</html>");
        Y10RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY10.jpg")));
                }
                if(test == 6){
                    ProgPic.setVisible(false);
                    BabyTeethTestPic.setVisible(false);
                }
                if(test == 8){ 
                    ProgPic.setVisible(false);
                }
                if(test == 9){
                    ProgPic.setVisible(false);
                    BabyTeethTestPic.setVisible(false);
                }
                if(test == 10){
                    ProgPic.setVisible(false);
                }
                if(test == 11){
                    BabyTeethTestPic.setVisible(false);
                }
                if(test == 16){
                    BabyTeethTestPic.setVisible(false);
                }
            }
        });
        
        Y11RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y11RadioButton.setText("<html>11 Years<br>+ or - 30 Months</html>");
        Y11RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY11.jpg")));
                }
            }
        });
        
        Y12RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y12RadioButton.setText("<html>12 Years<br>+ or - 30 Months</html>");
        Y12RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY12.jpg")));
                }
            }
        });
        
        Y15RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y15RadioButton.setText("<html>15 Years<br>+ or - 36 Months</html>");
        Y15RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY15.jpg")));
                }
            }
        });
        
        Y21RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y21RadioButton.setText("<html>21 Years</html>");
        Y21RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY21.jpg")));
                }
            }
        });
        
        Y35RadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        Y35RadioButton.setText("<html>35 Years</html>");
        Y35RadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  
                if(test == 0){
                BabyTeethTestPic.setVisible(true);
                BabyTeethTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/TeethY35.jpg")));
                }
            }
        });
        
        TeethNARadioButton.setFont(new java.awt.Font("Serif", 0, 12));
        TeethNARadioButton.setText("<html>Not Applicable</html>");
        TeethNARadioButton.setSelected(true);
        TeethNARadioButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {  if(test == 0){
                   BabyTeethTestPic.setVisible(false);
               }
            }
        });
        
        PubicTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        PubicTestLabel.setText("<html><u>Pubic Symphysis Test</u></html>");
        PubicTestLabel.setVisible(false);
        
        PubicTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        PubicTestDescription.setText("<html><p align=\"center\">For this test look at the pubic symphysis located<br>at the joint between the left and right coxal bones. You will need<br> to determine the wear and fusion patterns of this area. As the body<br> moves the joint slides back and forth making the area smoother as the<br> years continue and by 50 the area has essentially ossified and fused.<br>If you do not have a coxal bone or cannot determine the<br>correct wear select not applicable and continue.</p></html>");        
        PubicTestDescription.setVisible(false);
        
        EPTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        EPTestLabel.setText("<html><u>Epiphyseal Plates Test</u></html>");
        EPTestLabel.setVisible(false);
        
        EPTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        EPTestDescription.setText("<html><p align=\"center\">For this test you must look at the proximal and <br>distal epiphyseal plates on four of the body’s long bones. The first<br>is the Femur, the second the Humerus, the third the Radius, and<br>the last the Clavicle, you must determine whether the plate has started<br>fusing, is fusing, or has finished fusing. If you do not have one<br>of these bones or cannot determine the correct<br>ossification select not applicable and continue.</p></html>");        
        EPTestDescription.setVisible(false);    
        
        ProximalLabel.setFont(new java.awt.Font("serif", 0, 18));
        ProximalLabel.setText("<html><u>Proximal</u></html>");
        ProximalLabel.setVisible(false);
        
        DistalLabel.setFont(new java.awt.Font("serif", 0, 18));
        DistalLabel.setText("<html><u>Distal</u></html>");
        DistalLabel.setVisible(false);
        
        ButtonGroup distal = new ButtonGroup();
        distal.add(DistalRadioButton1);
        distal.add(DistalRadioButton2);
        distal.add(DistalRadioButton3);
        distal.add(DistalRadioButton4);
        
        DistalRadioButton1.setFont(new java.awt.Font("Serif", 0, 12));
        DistalRadioButton1.setVisible(false); 
        
        DistalRadioButton2.setFont(new java.awt.Font("Serif", 0, 12));
        DistalRadioButton2.setVisible(false); 
        
        DistalRadioButton3.setFont(new java.awt.Font("Serif", 0, 12));
        DistalRadioButton3.setVisible(false);
        
        DistalRadioButton4.setFont(new java.awt.Font("Serif", 0, 12));
        DistalRadioButton4.setVisible(false);
        
        FemurLabel.setFont(new java.awt.Font("serif", 0, 18));
        FemurLabel.setText("<html><u>Femur</u></html>");
        FemurLabel.setVisible(false);
        
        HumerusLabel.setFont(new java.awt.Font("serif", 0, 18));
        HumerusLabel.setText("<html><u>Humerus</u></html>");
        HumerusLabel.setVisible(false);
        
        TibiaLabel.setFont(new java.awt.Font("serif", 0, 18));
        TibiaLabel.setText("<html><u>Tibia</u></html>");
        TibiaLabel.setVisible(false);
        
        FibulaLabel.setFont(new java.awt.Font("serif", 0, 18));
        FibulaLabel.setText("<html><u>Fibula</u></html>");
        FibulaLabel.setVisible(false);
        
        UlnaLabel.setFont(new java.awt.Font("serif", 0, 18));
        UlnaLabel.setText("<html><u>Ulna</u></html>");
        UlnaLabel.setVisible(false);
        
        RadiusLabel.setFont(new java.awt.Font("serif", 0, 18));
        RadiusLabel.setText("<html><u>Radius</u></html>");
        RadiusLabel.setVisible(false);
        
        Radius2Label.setFont(new java.awt.Font("serif", 0, 18));
        Radius2Label.setText("<html><u>Radius</u></html>");
        Radius2Label.setVisible(false);
        
        ClavicleLabel.setFont(new java.awt.Font("serif", 0, 18));
        ClavicleLabel.setText("<html><u>Clavicle</u></html>");
        ClavicleLabel.setVisible(false);
        
        ProgTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        ProgTestLabel.setText("<html><u>Prognathism Test</u></html>");
        ProgTestLabel.setVisible(false);
        
        ProgTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        ProgTestDescription.setText("<html><p align=\"center\">For this test you must use a straight rod such as<br>a pencil and place it vertically across the mandible and maxilla in line<br>with the nasal septum. You must now look at the angle in which<br> the rod is tilted. If the rod is completely vertical or only slightly tilted<br>forward the skull is most likely Caucasoid or Mongoloid. If the<br>rod is tilted forward at a noticeable angle then the skull is<br>most likely Negroid. If you do not have a skull or cannot determine if it<br>has prognathism select not applicable and continue.</p></html>");        
        ProgTestDescription.setVisible(false);    
        
        ProgPic.setVisible(false);
        
        ButtonGroup ZygoButton = new ButtonGroup();
        ZygoButton.add(ZygomaticTestRadioButton1);
        ZygoButton.add(ZygomaticTestRadioButton2);
        ZygoButton.add(ZygomaticTestRadioButton3);
                
        ZygomaticTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        ZygomaticTestLabel.setText("<html><u>Zygomatic Space Test</u></html>");
        ZygomaticTestLabel.setVisible(false);

        ZygomaticTestPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/HorizontalPencil.png")));
        ZygomaticTestPic.setVisible(false);
        
        ZygomaticTestCenterLabel.setFont(new java.awt.Font("Serif", 0, 12)); 
        ZygomaticTestCenterLabel.setText("<html><p align=\"center\">For this test take a straight rod such as a pencil <br>and place it horizontally along the top of the maxilla just below the <br>anterior nasal spine. Then try to place your index fingers on the zygomatic bone <br>underneath the rod. If there is enough space the skull is either Caucasoid or <br>Negroid. If there is very little to no space the skull is Mongoloid.If you do<br>not have a skull or cannot determine the correct space<br>select not applicable and continue.</p></html>");
        ZygomaticTestCenterLabel.setVisible(false);
        
        ZygomaticTestRadioButton1.setFont(new java.awt.Font("Serif", 0, 12));
        ZygomaticTestRadioButton1.setText("<html><p align=\"center\">No Space<br>\"Caucasoid/Negroid\"</p></html>");
        ZygomaticTestRadioButton1.setVisible(false);
        
        ZygomaticTestRadioButton2.setFont(new java.awt.Font("Serif", 0, 12));
        ZygomaticTestRadioButton2.setText("<html><p align=\"center\">Space<br>\"Mongoloid\"</p></html>");
        ZygomaticTestRadioButton2.setVisible(false);

        ZygomaticTestOrLabel.setFont(new java.awt.Font("Serif", 0, 12)); 
        ZygomaticTestOrLabel.setText("OR");
        ZygomaticTestOrLabel.setVisible(false);

        ZygomaticTestRadioButton3.setFont(new java.awt.Font("Serif", 0, 12));
        ZygomaticTestRadioButton3.setText("Not Applicable");
        ZygomaticTestRadioButton3.setVisible(false);
        
        SillTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        SillTestLabel.setText("<html><u>Nasal Sill Test</u></html>");
        SillTestLabel.setVisible(false);
        
        SillTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        SillTestDescription.setText("<html><p align=\"center\">For this test you must look at the junction between<br>the nose and the maxilla. The division between these two parts is<br>called the nasal sill. To check if there is a sill run your finger up<br>into the nose on the maxilla. If there is a bump, ledge, or sill, then the<br>skull has a nasal sill. Both Caucasoid and Mongoloid skulls have nasal<br>sills. If there is no sill it is known as nasal guttering. This<br>occurs in Negroid skulls. If you do not have a skull or cannot<br>determine if there is a nasal sill select not applicable and continue</p></html> ");        
        SillTestDescription.setVisible(false);
        
        SpineTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        SpineTestLabel.setText("<html><u>Anterior Nasal Spine Test</u></html>");
        SpineTestLabel.setVisible(false);
        
        SpineTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        SpineTestDescription.setText("<html><p align=\"center\">For this test you must look at the upper part of the<br>maxilla were it joins with the nose. In line with the  nasal septum<br>should be the process call the anterior nasal spine. In Caucasoids<br>this process is very sharp and pronounce while in Mongoloids it is less<br>pronounced, and in Negroid skulls the process is rounded and less<br>visible. If you do not have a skull or cannot determine the<br>sharpness of the spine select not applicable and continue.</p></html>");        
        SpineTestDescription.setVisible(false);
        
        biteTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        biteTestLabel.setText("<html><u>Bite Test</u></html>");
        biteTestLabel.setVisible(false);
        
        biteTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        biteTestDescription.setText("<html><p align=\"center\">For this test you must look at the bite pattern of<br>the skull. In both a Caucasoid and Negroid skull there should be a<br>visible overbite in the maxilla. However, in a Mongoloid<br>skull the bite pattern has an even tooth to tooth bite. If you do not have a<br>skull or the bite pattern to your specific skull cannot be determined<br>select not applicable and continue</p></html>");        
        biteTestDescription.setVisible(false);

        IncisorsTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        IncisorsTestLabel.setText("<html><u>Incisor Shoveling Test</u></html>");
        IncisorsTestLabel.setVisible(false);
        
        IncisorsTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        IncisorsTestDescription.setText("<html><p align=\"center\">For this test you must look at the  shape of the<br>skull’s incisors. In Mongoloid skulls the incisors have a shape known<br>as shoveling. The teeth have a spade or shovel shape along with<br>more pronounce edges. In both Caucasoid and Negroid skulls the incisors<br>have a flat, smooth shape. If you do not have a skull or cannot determine<br>if your specific skull has incisor shoveling select<br>not applicable and continue.</p></html>");        
        IncisorsTestDescription.setVisible(false);

        ForeheadTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        ForeheadTestLabel.setText("<html><u>Forehead Test</u></html>");
        ForeheadTestLabel.setVisible(false);
        
        ForeheadTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        ForeheadTestDescription.setText("<html><p align=\"center\">For this test look at the forehead of your skull to<br>help determine the sex. As is shown, in most males the forehead is<br>slanted or has a very distinct curve. While in most females the forehead<br>has a very vertical and straight slope before curving to the top of the<br>skull. If you do not have a skull or the slant of your specific skull is<br>not evident enough to make a clear determination select<br>not applicable and continue.</p></html>");        
        ForeheadTestDescription.setVisible(false);
        
        ChinTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        ChinTestLabel.setText("<html><u>Chin Shape Test</u></html>");
        ChinTestLabel.setVisible(false);
        
        ChinTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        ChinTestDescription.setText("<html><p align=\"center\">For this test look at the skull's mandible and in particular<br>the end of the chin. As can be seen in the picture most males<br>have a square and broad chin like the example on the left. Whereas,<br>most females have a very pointed chin like the example on the right.<br>If you do not have a skull or cannot be sure whether your specific skull<br>has a square or pointed chin select not applicable and continue.</p></html>");        
        ChinTestDescription.setVisible(false);
        
        ProtubeTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        ProtubeTestLabel.setText("<html><u>Occipital protuberance Test</u></html>");
        ProtubeTestLabel.setVisible(false);
        
        ProtubeTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        ProtubeTestDescription.setText("<html><p align=\"center\">For this test look at the External Occipital Protuberance,<br>located on the occipital bone at the back of the skull. In most<br>males this process will be fairly large and pointed. While in most<br>female this is a rather smaller process and is usually rounded and less<br>noticeable than its male counterpart. If you do not have a skull or<br>cannot determine the correct size of the process select<br>not applicable and continue.</p></html>");        
        ProtubeTestDescription.setVisible(false);
        
        MastoidTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        MastoidTestLabel.setText("<html><u>Mastiod Process Test</u></html>");
        MastoidTestLabel.setVisible(false);
        
        MastoidTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        MastoidTestDescription.setText("<html><p align=\"center\">For this test look at the mastoid process located<br>on the side of the skull below the temporal bone. What you will need<br>to determine is the size of the process. In most males this is a large<br>bony process that sits behind the ear. While in females the process is<br>much smaller. If you do not have a skull or cannot determine the size of<br>the process select not applicable and continue.</p></html>");        
        MastoidTestDescription.setVisible(false);
        
        HipTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        HipTestLabel.setText("<html><u>Pelvis Test</u></html>");
        HipTestLabel.setVisible(false);
        
        HipTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        HipTestDescription.setText("<html><p align=\"center\">For this test you must look at the general size and<br>shape of the pelvis. What you need to look for are larger and wider<br>anterior superior iliac spines. These will indicate that your<br>remains are female. Whereas, a male pelvis is narrower and smaller because<br>they do not need to bare children. If you do not have a pelvis or cannot<br>be sure of the shape of the pelvis select not applicable and continue.</p></html>");        
        HipTestDescription.setVisible(false);
        
        SciaticTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        SciaticTestLabel.setText("<html><u>Sciatic Notch Test</u></html>");
        SciaticTestLabel.setVisible(false);
        
        SciaticTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        SciaticTestDescription.setText("<html><p align=\"center\">For this test must look at the sciatic notch located<br>on the posterior side of the coxal bone. To perform this test you<br>need to take your finger and place it inside of the notch, if there is<br>plenty of room, the remains are female if not, they are male. This is because<br>women need to have a larger notch to birth children. If you do not<br>have a coxal bone or cannot determine whether the sciatic<br>notch is large or not select not applicable and continue.</p></html>");        
        SciaticTestDescription.setVisible(false);
        
        StatureTestLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        StatureTestLabel.setText("<html><u>Stature Test</u></html>");
        StatureTestLabel.setVisible(false);
        
        StatureTestDescription.setFont(new java.awt.Font("serif", 0, 12));
        StatureTestDescription.setText("<html><p align=\"center\">For this test you will be determining stature by<br>measuring the length of the six long bones. The first is the femur, the<br>second the tibia, the third the fibula, the fourth the humerus, the<br>fifth the radius, and last the ulna. You will measure the length from the<br>proximal epiphysis to the distal epiphysis in centimeters and enter it into<br>the designated box. If you do not have one of the bones or<br>cannot determine the length select not applicable and continue on to the next.</p></html>");        
        StatureTestDescription.setVisible(false);    
        
        StaturePic.setVisible(false);
        
        LengthLabel.setFont(new java.awt.Font("serif", 0, 18));
        LengthLabel.setText("<html><u>Length</u></html>");
        LengthLabel.setVisible(false);
        
        StatureTextBox.setFont(new java.awt.Font("serif", 0, 12));
        StatureTextBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StatureTextBox.setVisible(false);
        
        FinishLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 48));
        FinishLabel.setText("<html><u>I.D. Complete</u></html>");
        FinishLabel.setVisible(false);
        
        FinishDescription.setFont(new java.awt.Font("serif", 0, 12));
        FinishDescription.setText("<html><p align=\"center\">Click the save button to store the I.D. in the case<br>log and press done when finished. Thank You for using<br>Identification Process, we are always looking for donations to help the cause<br>of creating free, cirriculm assitance programs. We are developing the second<br>generation of The Identification Process, with more in depth description,<br>printable forms, and connection to the Missing Persons database, and the best,<br>pictures of decaying flesh. The tentative release stands at September 6, 2013.</p></html>");        
        FinishDescription.setVisible(false);    
        
        FinishButton.setFont(new java.awt.Font("Serif", 0, 12));
        FinishButton.setText("Save");
        FinishButton.setVisible(false);
        FinishButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {                   
                try {
                    Save.Save();
                } catch (Exception ex) {
                }
                System.out.println(Log.entries);
            }
        });
        
        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addComponent(ZygomaticTestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addComponent(ZygomaticTestPic)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addComponent(ZygomaticTestCenterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addComponent(ZygomaticTestRadioButton3)
                                .addGap(231, 231, 231)))
                        .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addComponent(Submit)
                        .addGap(67, 67, 67))))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(BabyTeethTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(BabyTeethTestPic)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(holder)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BirthRadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(M6RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(M9RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Y1RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(M18RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Y2RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Y3RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Y4RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Y5RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y6RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y7RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y8RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y9RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y10RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y11RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y12RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y15RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y21RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(Y35RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(TeethNARadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(TeethTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(PubicTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(PubicTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(EPTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(EPTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ProximalLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(DistalLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(DistalRadioButton1)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(DistalRadioButton2)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(DistalRadioButton3)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(DistalRadioButton4)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(FemurLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(HumerusLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(RadiusLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(ClavicleLabel)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(ProgTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(ProgTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(ProgPic)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ZygomaticTestRadioButton1)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(ZygomaticTestRadioButton2)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(ZygomaticTestOrLabel)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(SillTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(SillTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(SpineTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(SpineTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))              
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(biteTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(biteTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))              
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(IncisorsTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(IncisorsTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))              
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(ForeheadTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(ForeheadTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))              
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(ChinTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(ChinTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))              
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ProtubeTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(ProtubeTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))              
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(MastoidTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(MastoidTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(HipTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(HipTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(SciaticTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(SciaticTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(StatureTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(StatureTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(StaturePic)
                .addContainerGap(0, Short.MAX_VALUE)))                 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(StatureTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)))                  
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(LengthLabel)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Back)
                .addContainerGap(0, Short.MAX_VALUE))) 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(TibiaLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(FibulaLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(UlnaLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(Radius2Label)
                .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(FinishLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(FinishDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(FinishButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit)
                .addContainerGap())
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ZygomaticTestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ZygomaticTestPic)
                .addGap(38, 38, 38)
                .addComponent(ZygomaticTestCenterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZygomaticTestRadioButton1)
                    .addComponent(ZygomaticTestRadioButton2)
                    .addComponent(ZygomaticTestOrLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ZygomaticTestRadioButton3)
                .addContainerGap(41, Short.MAX_VALUE))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BabyTeethTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(BabyTeethTestPic)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(holder)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(BirthRadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(M6RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(M9RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(Y1RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(M18RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(Y2RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(Y3RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(Y4RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(Y5RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Y6RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Y7RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Y8RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(Y9RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(Y10RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(Y11RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(Y12RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(Y15RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(Y21RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(Y35RadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(TeethNARadioButton)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(TeethTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(PubicTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PubicTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(EPTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(EPTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(ProximalLabel)
                .addContainerGap(0, Short.MAX_VALUE))).addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(DistalLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(DistalRadioButton1)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(DistalRadioButton2)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(DistalRadioButton3)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(DistalRadioButton4)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(FemurLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(HumerusLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(RadiusLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(ClavicleLabel)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ProgTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(ProgTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(ProgPic)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(SillTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(SillTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(SpineTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(SpineTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(biteTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(biteTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(IncisorsTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(IncisorsTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ForeheadTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(ForeheadTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ChinTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(ChinTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ProtubeTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(ProtubeTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(MastoidTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(MastoidTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(HipTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(HipTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(SciaticTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(SciaticTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(StatureTestLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(StatureTestDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(StaturePic)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(StatureTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(LengthLabel)
                .addContainerGap(0, Short.MAX_VALUE))) 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(Back)
                .addContainerGap(0, Short.MAX_VALUE)))  
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(TibiaLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(FibulaLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(UlnaLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Radius2Label)
                .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(FinishLabel)
                .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(FinishDescription)
                .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(FinishButton)
                .addContainerGap(0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(Anthro3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anthro3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anthro3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anthro3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anthro3().setVisible(true);
            }
        });
    }    
}