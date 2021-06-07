package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import static javax.swing.JOptionPane.showMessageDialog;

public class perInfo {

    private JFrame personal = new JFrame("Personal Information");

    public perInfo(){
        personal.setSize(1500, 1000);
        personal.setLayout(null);


        Font label1 = new Font("Serif", Font.BOLD, 18);
        Font label2 = new Font("SansSerif", Font.PLAIN, 16);
        Font label3 = new Font("SansSerif", Font.PLAIN, 16);


        JLabel title = new JLabel("PERSONAL INFORMATION");
        title.setBounds(20, 5, 400, 50);
        title.setSize(400, 50);
        title.setFont(label1);

        JLabel name = new JLabel("NAME");
        name.setBounds(60, 60, 100, 25);
        name.setSize(150, 40);
        name.setFont(label2);

        JTextField lName = new JTextField();
        lName.setBounds(150, 65, 300, 30);
        lName.setFont(label3);
        lName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel LastName = new JLabel("LAST NAME");
        LastName.setBounds(255, 90, 200, 25);
        LastName.setSize(150, 40);
        LastName.setFont(label2);

        JTextField fName = new JTextField();
        fName.setBounds(480, 65, 300, 30);
        fName.setFont(label3);
        fName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel FirstName = new JLabel("FIRST NAME");
        FirstName.setBounds(585, 90, 320, 25);
        FirstName.setSize(150, 40);
        FirstName.setFont(label2);

        JTextField mName = new JTextField();
        mName.setBounds(810, 65, 300, 30);
        mName.setFont(label3);
        mName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel MiddleName = new JLabel("MIDDLE NAME");
        MiddleName.setBounds(910, 90, 320, 25);
        MiddleName.setSize(150, 40);
        MiddleName.setFont(label2);

        JComboBox<String> nExten = new JComboBox<>();
        nExten.setBounds(1140, 65, 200, 30);
        nExten.setFont(label3);
        nExten.addItem("");
        nExten.addItem("Sr.");
        nExten.addItem("Jr.");
        nExten.addItem("III");
        nExten.addItem("IV");
        nExten.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel extensions = new JLabel("NAME EXTENSION");
        extensions.setBounds(1165, 95, 150, 25);
        extensions.setFont(label2);


        JLabel lr = new JLabel("LEARNER REFERENCE NUMBER");
        lr.setBounds(75, 148, 312, 25);
        lr.setFont(label2);

        JTextField LRN = new JTextField();
        LRN.setBounds(350, 145, 300, 30);
        LRN.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        LRN.setFont(label3);

        JLabel sek = new JLabel("SEX");
        sek.setBounds(900, 140, 50, 30);
        sek.setFont(label2);


        JRadioButton ml = new JRadioButton("MALE");
        ml.setBounds(1030, 140, 100, 30);
        ml.setFont(label2);
        ml.setBorderPainted(true);
        JRadioButton fl = new JRadioButton("FEMALE");
        fl.setBounds(1130, 140, 100, 30);
        fl.setFont(label2);
        fl.setBorderPainted(true);
        ButtonGroup sex = new ButtonGroup();
        sex.add(ml);
        sex.add(fl);

        JLabel bd = new JLabel("BIRTHDATE (YEAR/MONTH/DAY)");
        bd.setBounds(75, 200, 260, 25);
        bd.setFont(label2);

        JTextField db = new JTextField();
        db.setBounds(350,200,300,30);
        Date b = new Date(121, 5, 6);
        SimpleDateFormat b1 = new SimpleDateFormat(" yyyy-MM-dd");
        db.setText(b1.format(b));
        db.setFont(label2);
        db.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel age = new JLabel("AGE");
        age.setBounds(900, 200, 150, 25);
        age.setFont(label2);

        JTextField age1 = new JTextField();
        age1.setBounds(1030, 200, 300,30);
        age1.setFont(label3);
        age1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel add = new JLabel("ADDRESS");
        add.setBounds(75, 260,150,25);
        add.setFont(label2);

        JTextField add1 = new JTextField();
        add1.setBounds(350, 260, 300, 30);
        add1.setFont(label3);
        add1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel height = new JLabel("HEIGHT (cm)");
        height.setBounds(900, 260, 100, 25);
        height.setFont(label2);

        JTextField height1 = new JTextField();
        height1.setBounds(1030, 260, 300, 30);
        height1.setFont(label3);
        height1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel citi = new JLabel("CITIZENSHIP");
        citi.setBounds(75, 320, 100, 25);
        citi.setFont(label2);

        JTextField citi1 = new JTextField();
        citi1.setBounds(350, 320, 300, 30);
        citi1.setFont(label3);
        citi1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel wei = new JLabel("WEIGHT (kg)");
        wei.setBounds(900, 320, 100, 25);
        wei.setFont(label2);

        JTextField wei1 = new JTextField();
        wei1.setBounds(1030, 320, 300, 30);
        wei1.setFont(label3);
        wei1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel rel = new JLabel("RELIGION");
        rel.setFont(label2);
        rel.setBounds(75, 380, 100, 25);

        JTextField rel1 = new JTextField();
        rel1.setBounds(350, 380, 300, 25);
        rel1.setFont(label3);
        rel1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel cs = new JLabel("CIVIL STATUS");
        cs.setBounds(900, 380, 120, 25);
        cs.setFont(label2);

        JComboBox <String> cs1 = new JComboBox<>();
        cs1.addItem("Single");
        cs1.addItem("Married");
        cs1.addItem("Divorced");
        cs1.addItem("Widowed");
        cs1.setBounds(1030, 380, 300, 30);
        cs1.setFont(label2);
        cs1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel cp = new JLabel("CELLPHONE NUMBER");
        cp.setFont(label2);
        cp.setBounds(75, 440, 200, 25);

        JTextField cp1 = new JTextField();
        cp1.setBounds(350, 440, 300, 30);
        cp1.setFont(label3);
        cp1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel ea = new JLabel("EMAIL ADDRESS");
        ea.setBounds(875, 440, 150, 25);
        ea.setFont(label2);

        JTextField ea1 = new JTextField();
        ea1.setBounds(1030, 440, 300, 30);
        ea1.setFont(label3);
        ea1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel fbg = new JLabel("FAMILY BACKGROUND");
        fbg.setFont(label1);
        fbg.setSize(400, 50);
        fbg.setBounds(20, 500, 400, 50);

        JLabel ft = new JLabel("FATHER'S NAME");
        ft.setBounds(75, 560, 200, 25);
        ft.setFont(label2);

        JTextField ft1 = new JTextField();
        ft1.setBounds(350, 560, 300, 30);
        ft1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        ft1.setFont(label3);

        JLabel mt = new JLabel("MOTHER'S NAME");
        mt.setBounds(880, 560, 200, 25);
        mt.setFont(label2);

        JTextField mt1 = new JTextField();
        mt1.setBounds(1030, 560, 300, 30);
        mt1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        mt1.setFont(label3);

        JLabel fpn = new JLabel("CONTACT NUMBER");
        fpn.setBounds(75, 620, 200, 25);
        fpn.setFont(label2);

        JTextField fpn1 = new JTextField();
        fpn1.setBounds(350, 620, 300, 30);
        fpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        fpn1.setFont(label3);

        JLabel mpn = new JLabel("CONTACT NUMBER");
        mpn.setBounds(860, 620, 200, 25);
        mpn.setFont(label2);

        JTextField mpn1 = new JTextField();
        mpn1.setBounds(1030, 620, 300, 30);
        mpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        mpn1.setFont(label3);

        JLabel gbg = new JLabel("GUARDIAN'S NAME");
        gbg.setBounds(75, 680, 200, 25);
        gbg.setFont(label2);

        JTextField gbg1 = new JTextField();
        gbg1.setBounds(350, 680, 300, 30);
        gbg1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        gbg1.setFont(label3);

        JLabel gpn = new JLabel("GUARDIAN'S CONTACT");
        gpn.setBounds(835, 680, 200, 25);
        gpn.setFont(label3);

        JTextField gpn1 = new JTextField();
        gpn1.setBounds(1030, 680, 300, 30);
        gpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        gpn1.setFont(label3);


        JLabel educ = new JLabel("EDUCATIONAL BACKGROUND");
        educ.setFont(label1);
        educ.setSize(400, 50);
        educ.setBounds(20, 740, 400, 50);

        JLabel catt = new JLabel("CATEGORY");
        catt.setBounds(75, 780, 100, 25);
        catt.setFont(label2);

        JRadioButton k12 = new JRadioButton("K-12 ");
        k12.setBounds(350, 780, 70, 30);
        k12.setFont(label2);
        k12.setBorderPainted(true);
        JRadioButton oc = new JRadioButton("OLD CURRICULUM");
        oc.setBounds(420, 780, 200, 30);
        oc.setFont(label2);
        oc.setBorderPainted(true);
        JRadioButton als = new JRadioButton("ALS");
        als.setBounds(620, 780, 65, 30);
        als.setFont(label2);
        als.setBorderPainted(true);
        JRadioButton wbg = new JRadioButton("WITH COLLEGE BACKGROUND");
        wbg.setBounds(685, 780, 280, 30);
        wbg.setFont(label2);
        wbg.setBorderPainted(true);
        ButtonGroup cat = new ButtonGroup();
        cat.add(k12);
        cat.add(oc);
        cat.add(als);
        cat.add(wbg);

        JLabel lsa = new JLabel("LAST SCHOOL ATTENDED");
        lsa.setBounds(75, 840, 220, 25);
        lsa.setFont(label2);

        JComboBox<String> lsa1 = new JComboBox<>();
        lsa1.addItem("SENIOR HIGH SCHOOL");
        lsa1.addItem("HIGH SCHOOL (OLD CURR.)");
        lsa1.addItem("ALS");
        lsa1.setBounds(350, 840, 300, 25);
        lsa1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        lsa1.setFont(label3);

        JLabel lsa2 = new JLabel("SCHOOL NAME");
        lsa2.setBounds(890, 840, 175, 25);
        lsa2.setFont(label2);

        JTextField lsa3 = new JTextField();
        lsa3.setBounds(1030, 840, 300, 30);
        lsa3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        lsa3.setFont(label3);

        JLabel lsa4 = new JLabel("SCHOOL ADDRESS");
        lsa4.setBounds(75, 880, 175, 25);
        lsa4.setFont(label2);

        JTextField lsa5 = new JTextField();
        lsa5.setBounds(350, 880, 300, 30);
        lsa5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        lsa5.setFont(label3);

        JLabel lsa6 = new JLabel("AVERAGE");
        lsa6.setBounds(900, 880, 160, 25);
        lsa6.setFont(label2);

        JTextField lsa7 = new JTextField();
        lsa7.setBounds(1030, 880, 300, 30);
        lsa7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        lsa7.setFont(label3);


        JButton next = new JButton("NEXT");
        next.setBounds(1380, 900, 80, 40);
        next.setFont(label2);


        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (fName.getText().isEmpty() || lName.getText().isEmpty() || LRN.getText().isEmpty() ) {
                    showMessageDialog(null, "Field/s is/are empty");
                } else {


                    String lstname = lName.getText();
                    String frstname = fName.getText();
                    String mddlename = mName.getText();
                    String nameExten = String.valueOf(nExten.getSelectedItem());
                    long lren = Long.parseLong(LRN.getText());
                    String sexx = null;
                    if (ml.isSelected()){
                        sexx = "Male";
                    }
                    else if (fl.isSelected()){
                        sexx = "Female";
                    }
                    String sex1 = sexx;
                    String dbb = db.getText();
                    int agee = Integer.parseInt(age1.getText());
                    String bpp = add1.getText();
                    int heightt = Integer.parseInt(height1.getText());
                    String citizen = citi1.getText();
                    int weigh = Integer.parseInt(wei1.getText());
                    String reli1 = rel1.getText();
                    String civil = String.valueOf(cs1.getSelectedItem());
                    String cnum = cp1.getText();
                    String em = ea1.getText();
                    String fath = ft1.getText();
                    String moth = mt1.getText();
                    String fathnum = fpn1.getText();
                    String mothnum = mpn1.getText();
                    String guardian = gbg1.getText();
                    String gum = gpn1.getText();
                    String cat = String.valueOf(lsa1.getSelectedItem());
                    String schname = lsa3.getText();
                    String schadd= lsa5.getText();
                    int average = Integer.parseInt(lsa7.getText());


                    Connection con1;
                    PreparedStatement insert;
                    Statement st;

                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con1 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
                        st = con1.createStatement();

                        String sql = "SELECT * FROM `personalinfo` WHERE `lastname`= '"+ lstname + "' AND `firstname` = '"+ frstname +"' AND `middlename` = '" + mddlename + "' AND `lrn` = '" + lren +"'";
                        ResultSet rs = st.executeQuery(sql);

                        if (rs.next()) {
                            showMessageDialog(null, "You are already registered");
                        } else {

                            insert = con1.prepareStatement("insert into " +
                                    "personalInfo(lastname, firstname, middlename, nExtension, lrn, seks, birthdate, age, address, height, citizenship, weight, religion, civil_status, cpnum, email, fathername, mothername,fathernum, mothernum, gname," +
                                    "gnum, schcategory,lschname,lschadd,ave)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                            insert.setString(1, lstname);
                            insert.setString(2, frstname);
                            insert.setString(3, mddlename);
                            insert.setString(4, nameExten);
                            insert.setLong(5, lren);
                            insert.setString(6, sex1);
                            insert.setString(7, dbb);
                            insert.setInt(8, agee);
                            insert.setString(9,bpp);
                            insert.setInt(10, heightt);
                            insert.setString(11, citizen);
                            insert.setInt(12, weigh);
                            insert.setString(13, reli1);
                            insert.setString(14, civil);
                            insert.setString(15, cnum);
                            insert.setString(16, em);
                            insert.setString(17, fath);
                            insert.setString(18, moth);
                            insert.setString(19, fathnum);
                            insert.setString(20, mothnum);
                            insert.setString(21, guardian);
                            insert.setString(22, gum);
                            insert.setString(23, cat);
                            insert.setString(24,schname);
                            insert.setString(25, schadd);
                            insert.setInt(26, average);
                            insert.executeUpdate();

                            new Enroll();
                            personal.dispose();

                        }

                    } catch(ClassNotFoundException | SQLException classNotFoundException){
                        classNotFoundException.printStackTrace();
                    }

                }
            }
        });


        personal.add(title);
        personal.add(name);
        personal.add(lName);
        personal.add(LastName);
        personal.add(fName);
        personal.add(FirstName);
        personal.add(mName);
        personal.add(MiddleName);
        personal.add(nExten);
        personal.add(extensions);
        personal.add(next);
        personal.add(LRN);
        personal.add(lr);
        personal.add(sek);
        personal.add(ml);
        personal.add(fl);
        personal.add(bd);
        personal.add(db);
        personal.add(age);
        personal.add(age1);
        personal.add(add);
        personal.add(add1);
        personal.add(height);
        personal.add(height1);
        personal.add(citi);
        personal.add(citi1);
        personal.add(wei);
        personal.add(wei1);
        personal.add(rel);
        personal.add(rel1);
        personal.add(cs);
        personal.add(cs1);
        personal.add(cp);
        personal.add(cp1);
        personal.add(ea);
        personal.add(ea1);
        personal.add(fbg);
        personal.add(mt);
        personal.add(mt1);
        personal.add(ft);
        personal.add(ft1);
        personal.add(fpn);
        personal.add(fpn1);
        personal.add(mpn);
        personal.add(mpn1);
        personal.add(gbg);
        personal.add(gbg1);
        personal.add(gpn);
        personal.add(gpn1);
        personal.add(ea1);
        personal.add(educ);
        personal.add(catt);
        personal.add(k12);
        personal.add(oc);
        personal.add(wbg);
        personal.add(als);
        personal.add(lsa);
        personal.add(lsa1);
        personal.add(lsa2);
        personal.add(lsa3);
        personal.add(lsa4);
        personal.add(lsa5);
        personal.add(lsa6);
        personal.add(lsa7);


        personal.setVisible(true);
    }

    public static void main(String[] args) {

        new perInfo();
    }



}

