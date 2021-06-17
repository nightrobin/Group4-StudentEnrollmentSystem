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
        personal.setSize(1280, 720);
        personal.setLayout(null);
        personal.getContentPane().setBackground(Color.decode("#f8f5f1"));
        personal.setResizable(false);
        personal.setLocationRelativeTo(null);


        Font label1 = new Font("Serif", Font.BOLD, 18);
        Font label2 = new Font("SansSerif", Font.PLAIN, 16);


        JLabel title = new JLabel("PERSONAL INFORMATION");
        title.setBounds(20, 5, 400, 50);
        title.setSize(400, 50);
        title.setFont(label1);


        JLabel name = new JLabel("NAME");
        name.setBounds(30, 40, 100, 25);
        name.setSize(150, 40);
        name.setFont(label2);

        JTextField lName = new JTextField();
        lName.setBounds(100, 45, 300, 30);
        lName.setFont(label2);
        lName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel LastName = new JLabel("LAST NAME*");
        LastName.setBounds(200, 65, 200, 25);
        LastName.setSize(150, 40);
        LastName.setFont(label2);


        JTextField fName = new JTextField();
        fName.setBounds(420, 45, 300, 30);
        fName.setFont(label2);
        fName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel FirstName = new JLabel("FIRST NAME*");
        FirstName.setBounds(520, 65, 320, 25);
        FirstName.setSize(150, 40);
        FirstName.setFont(label2);

        JTextField mName = new JTextField();
        mName.setBounds(740, 45, 300, 30);
        mName.setFont(label2);
        mName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel MiddleName = new JLabel("MIDDLE NAME");
        MiddleName.setBounds(840, 65, 320, 25);
        MiddleName.setSize(150, 40);
        MiddleName.setFont(label2);

        JComboBox<String> nExten = new JComboBox<>();
        nExten.setBounds(1060, 45, 150, 30);
        nExten.setFont(label2);
        nExten.addItem("");
        nExten.addItem("Sr.");
        nExten.addItem("Jr.");
        nExten.addItem("III");
        nExten.addItem("IV");
        nExten.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel extensions = new JLabel("NAME EXTENSION");
        extensions.setBounds(1065, 75, 150, 25);
        extensions.setFont(label2);


        JLabel lr = new JLabel("LEARNER REFERENCE NUMBER*");
        lr.setBounds(40, 110, 312, 25);
        lr.setFont(label2);

        JTextField LRN = new JTextField();
        LRN.setBounds(300, 110, 300, 30);
        LRN.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        LRN.setFont(label2);

        JLabel sek = new JLabel("SEX*");
        sek.setBounds(840, 110, 50, 30);
        sek.setFont(label2);


        JRadioButton ml = new JRadioButton("MALE");
        ml.setBounds(910, 110, 100, 30);
        ml.setFont(label2);
        ml.setBorderPainted(true);
        JRadioButton fl = new JRadioButton("FEMALE");
        fl.setBounds(1010, 110, 100, 30);
        fl.setFont(label2);
        fl.setBorderPainted(true);
        ButtonGroup sex = new ButtonGroup();
        sex.add(ml);
        sex.add(fl);

        JLabel bd = new JLabel("BIRTHDATE (YEAR/MONTH/DAY)*");
        bd.setBounds(40, 150, 260, 25);
        bd.setFont(label2);

        JTextField db = new JTextField();
        db.setBounds(300,150,300,30);
        Date b = new Date(121, 5, 6);
        SimpleDateFormat b1 = new SimpleDateFormat(" yyyy-MM-dd");
        db.setText(b1.format(b));
        db.setFont(label2);
        db.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel age = new JLabel("AGE*");
        age.setBounds(840, 150, 150, 25);
        age.setFont(label2);

        JTextField age1 = new JTextField();
        age1.setBounds(910, 150, 300,30);
        age1.setFont(label2);
        age1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel add = new JLabel("ADDRESS*");
        add.setBounds(40, 190,150,25);
        add.setFont(label2);

        JTextField add1 = new JTextField();
        add1.setBounds(300, 190, 300, 30);
        add1.setFont(label2);
        add1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel height = new JLabel("HEIGHT (cm)*");
        height.setBounds(780, 190, 100, 25);
        height.setFont(label2);

        JTextField height1 = new JTextField();
        height1.setBounds(910, 190, 300, 30);
        height1.setFont(label2);
        height1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel citi = new JLabel("CITIZENSHIP*");
        citi.setBounds(40, 230, 100, 25);
        citi.setFont(label2);

        JTextField citi1 = new JTextField();
        citi1.setBounds(300, 230, 300, 30);
        citi1.setFont(label2);
        citi1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel wei = new JLabel("WEIGHT (kg)*");
        wei.setBounds(780, 230, 100, 25);
        wei.setFont(label2);

        JTextField wei1 = new JTextField();
        wei1.setBounds(910, 230, 300, 30);
        wei1.setFont(label2);
        wei1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel rel = new JLabel("RELIGION");
        rel.setFont(label2);
        rel.setBounds(40, 270, 100, 25);

        JTextField rel1 = new JTextField();
        rel1.setBounds(300, 270, 300, 25);
        rel1.setFont(label2);
        rel1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel cs = new JLabel("CIVIL STATUS*");
        cs.setBounds(770, 270, 120, 25);
        cs.setFont(label2);

        JComboBox <String> cs1 = new JComboBox<>();
        cs1.addItem("Single");
        cs1.addItem("Married");
        cs1.addItem("Divorced");
        cs1.addItem("Widowed");
        cs1.setBounds(910, 270, 300, 30);
        cs1.setFont(label2);
        cs1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel cp = new JLabel("CELLPHONE NUMBER");
        cp.setFont(label2);
        cp.setBounds(40, 310, 200, 25);

        JTextField cp1 = new JTextField();
        cp1.setBounds(300, 310, 300, 30);
        cp1.setFont(label2);
        cp1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel ea = new JLabel("EMAIL ADDRESS*");
        ea.setBounds(750, 310, 150, 25);
        ea.setFont(label2);

        JTextField ea1 = new JTextField();
        ea1.setBounds(910, 310, 300, 30);
        ea1.setFont(label2);
        ea1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));

        JLabel fbg = new JLabel("FAMILY BACKGROUND");
        fbg.setFont(label1);
        fbg.setSize(400, 50);
        fbg.setBounds(20, 330, 400, 50);

        JLabel ft = new JLabel("FATHER'S NAME*");
        ft.setBounds(40, 370, 200, 25);
        ft.setFont(label2);

        JTextField ft1 = new JTextField();
        ft1.setBounds(300, 370, 300, 30);
        ft1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        ft1.setFont(label2);

        JLabel mt = new JLabel("MOTHER'S NAME*");
        mt.setBounds(750, 370, 200, 25);
        mt.setFont(label2);

        JTextField mt1 = new JTextField();
        mt1.setBounds(910, 370, 300, 30);
        mt1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        mt1.setFont(label2);

        JLabel fpn = new JLabel("CONTACT NUMBER*");
        fpn.setBounds(40, 410, 200, 25);
        fpn.setFont(label2);

        JTextField fpn1 = new JTextField();
        fpn1.setBounds(300, 410, 300, 30);
        fpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        fpn1.setFont(label2);

        JLabel mpn = new JLabel("CONTACT NUMBER*");
        mpn.setBounds(730, 410, 200, 25);
        mpn.setFont(label2);

        JTextField mpn1 = new JTextField();
        mpn1.setBounds(910, 410, 300, 30);
        mpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        mpn1.setFont(label2);

        JLabel gbg = new JLabel("GUARDIAN'S NAME");
        gbg.setBounds(40, 450, 200, 25);
        gbg.setFont(label2);

        JTextField gbg1 = new JTextField();
        gbg1.setBounds(300, 450, 300, 30);
        gbg1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        gbg1.setFont(label2);

        JLabel gpn = new JLabel("GUARDIAN'S CONTACT");
        gpn.setBounds(700, 450, 200, 25);
        gpn.setFont(label2);

        JTextField gpn1 = new JTextField();
        gpn1.setBounds(910, 450, 300, 30);
        gpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        gpn1.setFont(label2);


        JLabel educ = new JLabel("EDUCATIONAL BACKGROUND");
        educ.setFont(label1);
        educ.setSize(400, 50);
        educ.setBounds(20, 470, 400, 50);

        JLabel catt = new JLabel("CATEGORY*");
        catt.setBounds(40, 510, 100, 25);
        catt.setFont(label2);

        JRadioButton k12 = new JRadioButton("K-12 ");
        k12.setBounds(300, 510, 70, 30);
        k12.setFont(label2);
        k12.setBorderPainted(true);
        JRadioButton oc = new JRadioButton("OLD CURRICULUM");
        oc.setBounds(370, 510, 200, 30);
        oc.setFont(label2);
        oc.setBorderPainted(true);
        JRadioButton als = new JRadioButton("ALS");
        als.setBounds(570, 510, 65, 30);
        als.setFont(label2);
        als.setBorderPainted(true);
        JRadioButton wbg = new JRadioButton("WITH COLLEGE BACKGROUND");
        wbg.setBounds(635, 510, 280, 30);
        wbg.setFont(label2);
        wbg.setBorderPainted(true);
        ButtonGroup cat = new ButtonGroup();
        cat.add(k12);
        cat.add(oc);
        cat.add(als);
        cat.add(wbg);

        JLabel lsa = new JLabel("LAST SCHOOL ATTENDED*");
        lsa.setBounds(40, 550, 220, 25);
        lsa.setFont(label2);

        JComboBox<String> lsa1 = new JComboBox<>();
        lsa1.addItem("SENIOR HIGH SCHOOL");
        lsa1.addItem("HIGH SCHOOL (OLD CURR.)");
        lsa1.addItem("ALS");
        lsa1.setBounds(300, 550, 300, 25);
        lsa1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        lsa1.setFont(label2);

        JLabel lsa2 = new JLabel("SCHOOL NAME*");
        lsa2.setBounds(750, 550, 175, 25);
        lsa2.setFont(label2);

        JTextField lsa3 = new JTextField();
        lsa3.setBounds(910, 550, 300, 30);
        lsa3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        lsa3.setFont(label2);

        JLabel lsa4 = new JLabel("SCHOOL ADDRESS*");
        lsa4.setBounds(40, 590, 175, 25);
        lsa4.setFont(label2);

        JTextField lsa5 = new JTextField();
        lsa5.setBounds(300, 590, 300, 30);
        lsa5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        lsa5.setFont(label2);

        JLabel lsa6 = new JLabel("AVERAGE*");
        lsa6.setBounds(790, 590, 160, 25);
        lsa6.setFont(label2);

        JTextField lsa7 = new JTextField();
        lsa7.setBounds(910, 590, 300, 30);
        lsa7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        lsa7.setFont(label2);

        Font label3  = new Font("SansSerif", Font.ITALIC, 15);

        JLabel nt = new JLabel();
        nt.setBounds(60, 650, 500, 20);
        nt.setFont(label3);
        nt.setText("<html><u>Note: Kindly double check your infotmation. All fiedls with '*' are required.</u></html>");
        personal.add(nt);

        JButton bck = new JButton("Back to Log In");
        bck.setBounds(1025, 635, 115, 30);
        bck.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        bck.setBackground(Color.decode("#cdc7be"));
        bck.setForeground(Color.decode("#293b5f"));
        bck.setFont(label2);
        personal.add(bck);

        bck.addActionListener(e -> {
            new login();
            personal.dispose();
        });


        JButton next = new JButton("NEXT");
        next.setBounds(1150, 635, 100, 30);
        next.setFont(label1);
        next.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        next.setForeground(Color.decode("#293b5f"));
        next.setBackground(Color.decode("#cdc7be"));


        next.addActionListener(e -> {


            String lstname = lName.getText();
            String frstname = fName.getText();
            String mddlename = mName.getText();
            String nameExten = String.valueOf(nExten.getSelectedItem());
            String lren = LRN.getText();
            String sexx = null;
            if (ml.isSelected()){
                sexx = "Male";
            }
            else if (fl.isSelected()){
                sexx = "Female";
            }
            else {
                JOptionPane.showMessageDialog(null, "Required Field/s is/are empty");
            }
            String sex1 = sexx;
            String dbb = db.getText();
            String bpp = add1.getText();
            String agee1 = age.getText();
            String hh =  height1.getText();
            String citizen = citi1.getText();
            String w = wei1.getText();
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
            String categg = null;
            if (k12.isSelected()){
                categg = "K-12";
            }
            else if (oc.isSelected()){
                categg = "Old Curriculum";
            }else if (als.isSelected()){
                categg = "ALS";
            }else if (wbg.isSelected()){
                categg = "With College Background";
            } else {
                JOptionPane.showMessageDialog(null, "Required Field/s is/are empty");
            }
            String categ1 = categg;
            String cat1 = String.valueOf(lsa1.getSelectedItem());
            String schname = lsa3.getText();
            String schadd= lsa5.getText();
            String av = lsa7.getText();

            if (lstname.isEmpty() || frstname.isEmpty()  || lren.isEmpty() || dbb.isEmpty() || agee1.isEmpty() || hh.isEmpty() || citizen.isEmpty() || w.isEmpty() || civil.isEmpty() || em.isEmpty() ||
                    fath.isEmpty() || moth.isEmpty() || fathnum.isEmpty() || mothnum.isEmpty() || cat1.isEmpty() || schname.isEmpty() || schadd.isEmpty() || av.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Required Field/s is/are empty");
            } else {

                long lren1 = Long.parseLong(lren);
                int agee = Integer.parseInt(age1.getText());
                int heightt = Integer.parseInt(height1.getText());
                int weigh = Integer.parseInt(wei1.getText());
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
                                "gnum, categ, schcategory,lschname,lschadd,ave)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                        insert.setString(1, lstname);
                        insert.setString(2, frstname);
                        insert.setString(3, mddlename);
                        insert.setString(4, nameExten);
                        insert.setLong(5, lren1);
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
                        insert.setString(23, categ1);
                        insert.setString(24, cat1);
                        insert.setString(25, schname);
                        insert.setString(26, schadd);
                        insert.setInt(27, average);
                        insert.executeUpdate();

                        new chooseCourse(lren1);
                        personal.dispose();

                    }

                } catch(ClassNotFoundException | SQLException classNotFoundException){
                    classNotFoundException.printStackTrace();
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
