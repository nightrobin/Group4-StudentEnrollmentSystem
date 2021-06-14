package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class updateInfo extends JFrame{
    JMenu menu;
    JMenuItem i1, i2, i3;

    public updateInfo(String studentNum){

        JFrame f = new JFrame("Enrollment System");
        JPanel mainPanel=new JPanel();
        mainPanel.setBounds(0,0,1280,720);

        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Enrollment Process");
        i1.addActionListener(e -> {
            new viewSched(studentNum);
            f.dispose();
        });

        i2 = new JMenuItem("View Information");
        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new viewInfo(studentNum);
                f.dispose();
            }
        });

        i3 = new JMenuItem("Logout");
        i3.addActionListener(e -> {
            new login();
            f.dispose();
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

        JLabel user = new JLabel("Logged in as Student No. " + studentNum);
        user.setBounds(1000, 0, 300, 30);
        f.add(user);



        JPanel menuPanel = new JPanel();
        menuPanel.setBounds(0,0,270,720);
        menuPanel.setBackground(Color.decode("#293b5f"));

        JButton b1 = new JButton("VIEW INFORMATION");
        b1.setForeground(Color.WHITE);
        b1.setBounds(   9, 20, 250, 65);
        b1.setBackground(Color.decode("#47597e"));
        b1.setFont(new Font("Sans", Font.BOLD, 17));
        f.add(b1);
        b1.addActionListener(actionEvent -> {
            new viewInfo(studentNum);
            f.dispose();
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
        b3.addActionListener(actionEvent -> {
            new changePassword(studentNum);
            f.dispose();
        });

        JButton backButton = new JButton("BACK");
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(   9, 615, 250, 35);
        backButton.setBackground(Color.decode("#b2ab8c"));
        backButton.setForeground(Color.WHITE);
        backButton.setFont(new Font("Sans", Font.BOLD, 17));
        f.add(backButton);
        backButton.addActionListener(actionEvent -> {
            new logIntabs(studentNum);
            f.dispose();
        });

        JPanel bodyPanel = new JPanel();
        bodyPanel.setBounds(303,103,930,530);
        bodyPanel.setBackground(Color.WHITE);

        Font label1 = new Font("Serif", Font.BOLD, 17);
        Font label2 = new Font("SansSerif", Font.BOLD, 14);
        Font label3 = new Font("SansSerif", Font.PLAIN, 14);
        int c1 = 330;
        int c2 = 560;
        int c3 = 810;
        int c4 = 970;


        JLabel title = new JLabel("PERSONAL INFORMATION");
        title.setBounds(313, 106, 400, 30);
        title.setFont(label1);


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
            Statement st = con1.createStatement();
            PreparedStatement update;

            long sid = Long.parseLong(String.valueOf(studentNum));

            String sql = "SELECT * FROM personalInfo WHERE studID = '" + sid + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                JLabel name = new JLabel("NAME");
                name.setBounds(320, 145, 100, 25);
                name.setFont(label3);

                JTextField lName = new JTextField(rs.getString("lastname"));
                lName.setBounds(375, 140, 230, 30);
                lName.setFont(label2);
                lName.setBackground(Color.decode("#293b5f"));
                lName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
                lName.setEnabled(false);

                JLabel LastName = new JLabel("LAST NAME*");
                LastName.setBounds(450, 165, 150, 40);
                LastName.setFont(label3);

                JTextField fName = new JTextField(rs.getString("firstname"));
                fName.setBounds(620, 140, 230, 30);
                fName.setFont(label2);
                fName.setBackground(Color.decode("#293b5f"));
                fName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
                fName.setEnabled(false);

                JLabel FirstName = new JLabel("FIRST NAME*");
                FirstName.setBounds(700, 165, 150, 40);
                FirstName.setFont(label3);

                JTextField mName = new JTextField(rs.getString("middlename"));
                mName.setBounds(865, 140, 230, 30);
                mName.setFont(label2);
                mName.setBackground(Color.decode("#293b5f"));
                mName.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
                mName.setEnabled(false);

                JLabel MiddleName = new JLabel("MIDDLE NAME");
                MiddleName.setBounds(940, 165, 150, 40);
                MiddleName.setFont(label3);

                JComboBox<String> nExten = new JComboBox<>();
                nExten.setBounds(1110, 140, 100, 30);
                nExten.setFont(label2);
                nExten.addItem("");
                nExten.addItem("Sr.");
                nExten.addItem("Jr.");
                nExten.addItem("III");
                nExten.addItem("IV");
                nExten.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
                nExten.setBackground(Color.decode("#dbe6fd"));
                nExten.setEnabled(false);

                JLabel extensions = new JLabel("NAME EXTENSION");
                extensions.setBounds(1100, 165, 150, 40);
                extensions.setFont(label3);


                JLabel lr = new JLabel("LEARNER REFERENCE NUMBER*");
                lr.setBounds(c1, 205, 312, 25);
                lr.setFont(label3);

                JTextField LRN = new JTextField(rs.getString("lrn"));
                LRN.setBounds(c2, 205, 230, 30);
                LRN.setBackground(Color.decode("#293b5f"));
                LRN.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
                LRN.setEnabled(false);
                LRN.setFont(label2);

                JLabel sek = new JLabel("SEX*");
                sek.setBounds(c3, 205, 50, 30);
                sek.setFont(label3);


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
                ml.setEnabled(false);
                fl.setEnabled(false);

                JLabel bd = new JLabel("BIRTHDATE (YEAR/MONTH/DAY)*");
                bd.setBounds(c1, 245, 260, 25);
                bd.setFont(label3);

                JTextField db = new JTextField(rs.getString("birthdate"));
                db.setBounds(c2, 245, 230, 30);
                db.setFont(label2);
                db.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel age = new JLabel("AGE*");
                age.setBounds(c3, 245, 150, 25);
                age.setFont(label3);

                JTextField age1 = new JTextField(rs.getString("age"));
                age1.setBounds(c4, 245, 230, 30);
                age1.setFont(label2);
                age1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel add = new JLabel("ADDRESS*");
                add.setBounds(c1, 285, 150, 25);
                add.setFont(label3);

                JTextField add1 = new JTextField(rs.getString("address"));
                add1.setBounds(c2, 285, 230, 30);
                add1.setFont(label2);
                add1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel height = new JLabel("HEIGHT (cm)*");
                height.setBounds(c3, 285, 100, 25);
                height.setFont(label3);

                JTextField height1 = new JTextField(rs.getString("height"));
                height1.setBounds(c4, 285, 230, 30);
                height1.setFont(label2);
                height1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel citi = new JLabel("CITIZENSHIP*");
                citi.setBounds(c1, 325, 100, 25);
                citi.setFont(label3);

                JTextField citi1 = new JTextField(rs.getString("citizenship"));
                citi1.setBounds(c2, 325, 230, 30);
                citi1.setFont(label2);
                citi1.setEnabled(false);
                citi1.setBackground(Color.decode("#293b5f"));
                citi1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel wei = new JLabel("WEIGHT (kg)*");
                wei.setBounds(c3, 325, 100, 25);
                wei.setFont(label3);

                JTextField wei1 = new JTextField(rs.getString("weight"));
                wei1.setBounds(c4, 325, 230, 30);
                wei1.setFont(label2);
                wei1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel rel = new JLabel("RELIGION");
                rel.setFont(label3);
                rel.setBounds(c1, 365, 100, 25);

                JTextField rel1 = new JTextField(rs.getString("religion"));
                rel1.setBounds(c2, 365, 230, 30);
                rel1.setFont(label2);
                rel1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel cs = new JLabel("CIVIL STATUS*");
                cs.setBounds(c3, 365, 120, 25);
                cs.setFont(label3);

                JComboBox<String> cs1 = new JComboBox<>();
                cs1.addItem("Single");
                cs1.addItem("Married");
                cs1.addItem("Divorced");
                cs1.addItem("Widowed");
                cs1.setBounds(c4, 365, 230, 30);
                cs1.setFont(label2);
                cs1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));

                JLabel cp = new JLabel("CELLPHONE NUMBER");
                cp.setFont(label3);
                cp.setBounds(c1, 405, 200, 25);

                JTextField cp1 = new JTextField(rs.getString("cpnum"));
                cp1.setBounds(c2, 405, 230, 30);
                cp1.setFont(label2);
                cp1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel ea = new JLabel("EMAIL ADDRESS*");
                ea.setBounds(c3, 405, 150, 25);
                ea.setFont(label3);

                JTextField ea1 = new JTextField(rs.getString("email"));
                ea1.setBounds(c4, 405, 230, 30);
                ea1.setFont(label2);
                ea1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));

                JLabel fbg = new JLabel("FAMILY BACKGROUND");
                fbg.setFont(label1);
                fbg.setBounds(313, 440, 400, 20);

                JLabel ft = new JLabel("FATHER'S NAME*");
                ft.setBounds(c1, 470, 200, 25);
                ft.setFont(label3);

                JTextField ft1 = new JTextField(rs.getString("fathername"));
                ft1.setBounds(c2, 470, 230, 30);
                ft1.setBackground(Color.decode("#293b5f"));
                ft1.setEnabled(false);
                ft1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));
                ft1.setFont(label2);

                JLabel mt = new JLabel("MOTHER'S NAME*");
                mt.setBounds(c3, 470, 200, 25);
                mt.setFont(label3);

                JTextField mt1 = new JTextField(rs.getString("mothername"));
                mt1.setBounds(c4, 470, 230, 30);
                mt1.setBackground(Color.decode("#293b5f"));
                mt1.setEnabled(false);
                mt1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));
                mt1.setFont(label2);

                JLabel fpn = new JLabel("CONTACT NUMBER*");
                fpn.setBounds(c1, 510, 200, 25);
                fpn.setFont(label3);

                JTextField fpn1 = new JTextField(rs.getString("fathernum"));
                fpn1.setBounds(c2, 510, 230, 30);
                fpn1.setBorder(BorderFactory.createLineBorder(Color.decode("#dbe6fd"), 2));
                fpn1.setFont(label2);

                JLabel mpn = new JLabel("CONTACT NUMBER*");
                mpn.setBounds(c3, 510, 200, 25);
                mpn.setFont(label3);

                JTextField mpn1 = new JTextField(rs.getString("mothernum"));
                mpn1.setBounds(c4, 510, 230, 30);
                mpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
                mpn1.setFont(label2);

                JLabel gbg = new JLabel("GUARDIAN'S NAME");
                gbg.setBounds(c1, 550, 200, 25);
                gbg.setFont(label3);

                JTextField gbg1 = new JTextField(rs.getString("gname"));
                gbg1.setBounds(c2, 550, 230, 30);
                gbg1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
                gbg1.setFont(label2);

                JLabel gpn = new JLabel("GUARDIAN'S CONTACT");
                gpn.setBounds(c3, 550, 200, 25);
                gpn.setFont(label3);

                JTextField gpn1 = new JTextField(rs.getString("gnum"));
                gpn1.setBounds(c4, 550, 230, 30);
                gpn1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
                gpn1.setFont(label2);

                JButton updateBtn = new JButton("UPDATE");
                updateBtn.setBounds(1080, 590, 120, 30);
                updateBtn.setFont(new Font("Sans", Font.BOLD, 17));
                updateBtn.setForeground(Color.WHITE);
                updateBtn.setBackground(Color.decode("#293b5f"));
                updateBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {

                        Connection con11;
                        PreparedStatement update;
                        Statement st1;


                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            con11 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
                            st1 = con11.createStatement();

                            update = con11.prepareStatement("UPDATE personalInfo SET birthdate = ?, age = ?, address = ?, height = ?, weight = ?, religion = ?, civil_status = ?, " +
                                    "cpnum = ?, email = ?, fathernum = ?, mothernum = ?, gname = ?, gnum = ? WHERE studID = '" + studentNum +"'");
                            update.setString(1,db.getText());
                            update.setInt(2, Integer.parseInt(age1.getText()));
                            update.setString(3, add1.getText());
                            update.setInt(4, Integer.parseInt(height1.getText()));
                            update.setInt(5, Integer.parseInt(wei1.getText()));
                            update.setString(6, rel1.getText());
                            update.setString(7, String.valueOf(cs1.getSelectedItem()));
                            update.setLong(8, Long.parseLong(cp1.getText()));
                            update.setString(9, ea1.getText());
                            update.setLong(10,Long.parseLong(fpn1.getText()));
                            update.setLong(11,Long.parseLong(mpn1.getText()));
                            update.setString(12, gbg1.getText());
                            update.setString(13, gpn1.getText());
                            update.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Updated Successfully.");
                            new updateInfo(studentNum);
                            f.dispose();

                        } catch (ClassNotFoundException | SQLException classNotFoundException){
                            classNotFoundException.printStackTrace();
                        }

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


            }
        }   catch (ClassNotFoundException | SQLException classNotFoundException) {

        }
        f.add(bodyPanel);
        f.add(topPanel);
        f.add(menuPanel);
        f.add(mainPanel);
        f.setSize(1280,720);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setResizable(false);

    }

    public static void main(String[] args) {

    }
}

