package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class updateInfo extends JFrame{
    JMenu menu;
    JMenuItem i1, i2, i3;
    public JLabel studentNum;

    public updateInfo(String studentNum){

        JFrame f = new JFrame("Enrollment System");
            JPanel mainPanel=new JPanel();
            mainPanel.setBounds(0,0,1280,720);

                JMenuBar mb = new JMenuBar();
                    menu = new JMenu("Menu");
                    i1 = new JMenuItem("Enrollment Process");
                        i1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                //new viewSched();
                                //f.setVisible(false);
                            }
                        });

                    i2 = new JMenuItem("View Information");
                        i2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                //new viewInfo();
                                //f.setVisible(false);
                            }
                        });

                    i3 = new JMenuItem("Logout");
                        i3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                //new login();
                                //f.setVisible(false);
                            }
                        });

                    menu.add(i1);
                    menu.addSeparator();
                    menu.add(i2);
                    menu.addSeparator();
                    menu.add(i3);
                    mb.add(menu);
                    f.setJMenuBar(mb);


                JPanel topPanel = new JPanel();
                topPanel.setBounds(270,0,1280,70);
                topPanel.setBackground(Color.WHITE);

                    JLabel user = new JLabel("Logged in as Student No.");
                    user.setBounds(1000, 0, 300, 30);
                    f.add(user);

                    //student number retrieve from the login
                    this.studentNum = new JLabel("");
                    this.studentNum.setBounds(1000, 0, 300, 30);
                    f.add(this.studentNum);

                JPanel menuPanel = new JPanel();
                menuPanel.setBounds(0,0,270,720);
                menuPanel.setBackground(Color.decode("#293b5f"));

                    JButton b1 = new JButton("VIEW INFORMATION");
                    b1.setForeground(Color.WHITE);
                    b1.setBounds(   9, 20, 250, 65);
                    b1.setBackground(Color.decode("#47597e"));
                    b1.setFont(new Font("Sans", Font.BOLD, 17));
                    f.add(b1);
                        b1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                new viewInfo(studentNum);
                                f.setVisible(false);
                            }
                        });

                    JButton b2 = new JButton("UPDATE INFORMATION");
                    b2.setForeground(Color.WHITE);
                    b2.setBounds(   9, 100, 250, 65);
                    b2.setBackground(Color.decode("#47597e"));
                    b2.setFont(new Font("Sans", Font.BOLD, 17));
                    f.add(b2);

                    JButton b3 = new JButton("CHANGE PASSWORD");
                    b3.setForeground(Color.WHITE);
                    b3.setBounds(   9, 180, 250, 65);
                    b3.setBackground(Color.decode("#47597e"));
                    b3.setFont(new Font("Sans", Font.BOLD, 17));
                    f.add(b3);
                        b3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                new changePassword(studentNum);
                                f.setVisible(false);
                            }
                        });

                    JButton backButton = new JButton("BACK");
                    backButton.setForeground(Color.WHITE);
                    backButton.setBounds(   9, 615, 250, 35);
                    backButton.setBackground(Color.decode("#b2ab8c"));
                    backButton.setForeground(Color.WHITE);
                    backButton.setFont(new Font("Sans", Font.BOLD, 17));
                    f.add(backButton);
                    backButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            new logIntabs(studentNum);
                            f.dispose();
                        }
                    });

                JPanel bodyPanel = new JPanel();
                bodyPanel.setBounds(303,103,930,530);
                bodyPanel.setBackground(Color.WHITE);

                Font label1 = new Font("Serif", Font.BOLD, 17);
                Font label2 = new Font("SansSerif", Font.PLAIN, 14);
                int c1 = 330;
                int c2 = 560;
                int c3 = 810;
                int c4 = 970;


                    JLabel title = new JLabel("PERSONAL INFORMATION");
                    title.setBounds(313, 106, 400, 30);
                    title.setFont(label1);

                        JLabel name = new JLabel("NAME");
                        name.setBounds(320, 145, 100, 25);
                        name.setFont(label2);

                        JTextField lName = new JTextField();
                        lName.setBounds(375, 140, 230, 30);
                        lName.setFont(label2);
                        lName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                        lName.setBackground(Color.decode("#dbe6fd"));
                        lName.setEnabled(false);

                        JLabel LastName = new JLabel("LAST NAME*");
                        LastName.setBounds(450, 165, 150, 40);
                        LastName.setFont(label2);

                        JTextField fName = new JTextField();
                        fName.setBounds(620, 140, 230, 30);
                        fName.setFont(label2);
                        fName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                        fName.setBackground(Color.decode("#dbe6fd"));
                        fName.setEnabled(false);

                        JLabel FirstName = new JLabel("FIRST NAME*");
                        FirstName.setBounds(700, 165, 150, 40);
                        FirstName.setFont(label2);

                        JTextField mName = new JTextField();
                        mName.setBounds(865, 140, 230, 30);
                        mName.setFont(label2);
                        mName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                        mName.setBackground(Color.decode("#dbe6fd"));
                        mName.setEnabled(false);

                        JLabel MiddleName = new JLabel("MIDDLE NAME");
                        MiddleName.setBounds(940, 165, 150, 40);
                        MiddleName.setFont(label2);

                        JComboBox<String> nExten = new JComboBox<>();
                        nExten.setBounds(1110, 140, 100, 30);
                        nExten.setFont(label2);
                        nExten.addItem("");
                        nExten.addItem("Sr.");
                        nExten.addItem("Jr.");
                        nExten.addItem("III");
                        nExten.addItem("IV");
                        nExten.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                        nExten.setBackground(Color.decode("#dbe6fd"));
                        nExten.setEnabled(false);

                        JLabel extensions = new JLabel("NAME EXTENSION");
                        extensions.setBounds(1100, 165, 150, 40);
                        extensions.setFont(label2);


                        JLabel lr = new JLabel("LEARNER REFERENCE NUMBER*");
                        lr.setBounds(c1, 205, 312, 25);
                        lr.setFont(label2);

                        JTextField LRN = new JTextField();
                        LRN.setBounds(c2, 205, 230, 30);
                        LRN.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                        LRN.setBackground(Color.decode("#dbe6fd"));
                        LRN.setEnabled(false);

                        LRN.setFont(label2);

                        JLabel sek = new JLabel("SEX*");
                        sek.setBounds(c3, 205, 50, 30);
                        sek.setFont(label2);


                        JRadioButton ml = new JRadioButton("MALE");
                        ml.setBounds(c4, 205, 100, 30);
                        ml.setFont(label2);
                        ml.setBorderPainted(true);
                        JRadioButton fl = new JRadioButton("FEMALE");
                        fl.setBounds(1070, 205, 100, 30);
                        fl.setFont(label2);
                        fl.setBorderPainted(true);
                        ButtonGroup sex = new ButtonGroup();
                        sex.add(ml);
                        sex.add(fl);

                        JLabel bd = new JLabel("BIRTHDATE (YEAR/MONTH/DAY)*");
                        bd.setBounds(c1, 245, 260, 25);
                        bd.setFont(label2);

                        JTextField db = new JTextField();
                        db.setBounds(c2,245,230,30);
                        Date b = new Date(121, 5, 6);
                        SimpleDateFormat bday = new SimpleDateFormat(" yyyy-MM-dd");
                        db.setText(bday.format(b));
                        db.setFont(label2);
                        db.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel age = new JLabel("AGE*");
                        age.setBounds(c3, 245, 150, 25);
                        age.setFont(label2);

                        JTextField age1 = new JTextField();
                        age1.setBounds(c4, 245, 230,30);
                        age1.setFont(label2);
                        age1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel add = new JLabel("ADDRESS*");
                        add.setBounds(c1, 285,150,25);
                        add.setFont(label2);

                        JTextField add1 = new JTextField();
                        add1.setBounds(c2, 285, 230, 30);
                        add1.setFont(label2);
                        add1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel height = new JLabel("HEIGHT (cm)*");
                        height.setBounds(c3, 285, 100, 25);
                        height.setFont(label2);

                        JTextField height1 = new JTextField();
                        height1.setBounds(c4, 285, 230, 30);
                        height1.setFont(label2);
                        height1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel citi = new JLabel("CITIZENSHIP*");
                        citi.setBounds(c1, 325, 100, 25);
                        citi.setFont(label2);

                        JTextField citi1 = new JTextField();
                        citi1.setBounds(c2, 325, 230, 30);
                        citi1.setFont(label2);
                        citi1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel wei = new JLabel("WEIGHT (kg)*");
                        wei.setBounds(c3, 325, 100, 25);
                        wei.setFont(label2);

                        JTextField wei1 = new JTextField();
                        wei1.setBounds(c4, 325, 230, 30);
                        wei1.setFont(label2);
                        wei1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel rel = new JLabel("RELIGION");
                        rel.setFont(label2);
                        rel.setBounds(c1, 365, 100, 25);

                        JTextField rel1 = new JTextField();
                        rel1.setBounds(c2, 365, 230, 30);
                        rel1.setFont(label2);
                        rel1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel cs = new JLabel("CIVIL STATUS*");
                        cs.setBounds(c3, 365, 120, 25);
                        cs.setFont(label2);

                        JComboBox <String> cs1 = new JComboBox<>();
                        cs1.addItem("Single");
                        cs1.addItem("Married");
                        cs1.addItem("Divorced");
                        cs1.addItem("Widowed");
                        cs1.setBounds(c4, 365, 230, 30);
                        cs1.setFont(label2);
                        cs1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel cp = new JLabel("CELLPHONE NUMBER");
                        cp.setFont(label2);
                        cp.setBounds(c1, 405, 200, 25);

                        JTextField cp1 = new JTextField();
                        cp1.setBounds(c2, 405, 230, 30);
                        cp1.setFont(label2);
                        cp1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                        JLabel ea = new JLabel("EMAIL ADDRESS*");
                        ea.setBounds(c3, 405, 150, 25);
                        ea.setFont(label2);

                        JTextField ea1 = new JTextField();
                        ea1.setBounds(c4, 405, 230, 30);
                        ea1.setFont(label2);
                        ea1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

                    JLabel fbg = new JLabel("FAMILY BACKGROUND");
                    fbg.setFont(label1);
                    fbg.setBounds(313, 440, 400, 20);

                        JLabel ft = new JLabel("FATHER'S NAME*");
                        ft.setBounds(c1, 470, 200, 25);
                        ft.setFont(label2);

                        JTextField ft1 = new JTextField();
                        ft1.setBounds(c2, 470, 230, 30);
                        ft1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                        ft1.setFont(label2);

                        JLabel mt = new JLabel("MOTHER'S NAME*");
                        mt.setBounds(c3, 470, 200, 25);
                        mt.setFont(label2);

                        JTextField mt1 = new JTextField();
                        mt1.setBounds(c4, 470, 230, 30);
                        mt1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                        mt1.setFont(label2);

                    JLabel fpn = new JLabel("CONTACT NUMBER*");
                    fpn.setBounds(c1, 510, 200, 25);
                    fpn.setFont(label2);

                    JTextField fpn1 = new JTextField();
                    fpn1.setBounds(c2, 510, 230, 30);
                    fpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                    fpn1.setFont(label2);

                    JLabel mpn = new JLabel("CONTACT NUMBER*");
                    mpn.setBounds(c3, 510, 200, 25);
                    mpn.setFont(label2);

                    JTextField mpn1 = new JTextField();
                    mpn1.setBounds(c4, 510, 230, 30);
                    mpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                    mpn1.setFont(label2);

                    JLabel gbg = new JLabel("GUARDIAN'S NAME");
                    gbg.setBounds(c1, 550, 200, 25);
                    gbg.setFont(label2);

                    JTextField gbg1 = new JTextField();
                    gbg1.setBounds(c2, 550, 230, 30);
                    gbg1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                    gbg1.setFont(label2);

                    JLabel gpn = new JLabel("GUARDIAN'S CONTACT");
                    gpn.setBounds(c3, 550, 200, 25);
                    gpn.setFont(label2);

                    JTextField gpn1 = new JTextField();
                    gpn1.setBounds(c4, 550, 230, 30);
                    gpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                    gpn1.setFont(label2);

                    JButton updateBtn = new JButton("UPDATE");
                    updateBtn.setBounds(1080, 590, 120, 30);
                    updateBtn.setFont(new Font("Sans", Font.BOLD, 17));
                    updateBtn.setForeground(Color.WHITE);
                    updateBtn.setBackground(Color.decode("#293b5f"));
                        updateBtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {

                            }
                        });
                    
        f.add(title);
        f.add(name);
        f.add(lName);
        f.add(LastName);
        f.add(fName);
        f.add(FirstName);
        f.add(mName);
        f.add(MiddleName);
        f.add(nExten);
        f.add(extensions);
        f.add(LRN);
        f.add(lr);
        f.add(sek);
        f.add(ml);
        f.add(fl);
        f.add(bd);
        f.add(db);
        f.add(age);
        f.add(age1);
        f.add(add);
        f.add(add1);
        f.add(height);
        f.add(height1);
        f.add(citi);
        f.add(citi1);
        f.add(wei);
        f.add(wei1);
        f.add(rel);
        f.add(rel1);
        f.add(cs);
        f.add(cs1);
        f.add(cp);
        f.add(cp1);
        f.add(ea);
        f.add(ea1);
        f.add(fbg);
        f.add(mt);
        f.add(mt1);
        f.add(ft);
        f.add(ft1);
        f.add(fpn);
        f.add(fpn1);
        f.add(mpn);
        f.add(mpn1);
        f.add(gbg);
        f.add(gbg1);
        f.add(gpn);
        f.add(gpn1);
        f.add(updateBtn);


        f.add(bodyPanel);
        f.add(topPanel);
        f.add(menuPanel);
        f.add(mainPanel);
        f.setSize(1280,720);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //f.setResizable(false);

    }

    public static void main(String[] args) {

    }
}

