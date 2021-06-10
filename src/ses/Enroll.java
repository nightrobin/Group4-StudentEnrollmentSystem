package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;

import static javax.swing.JOptionPane.OK_CANCEL_OPTION;

public class Enroll {
    private JFrame en = new JFrame("Enrollment");

    public Enroll(long lren){
        en.setSize(1280,720);
        en.getContentPane().setBackground(Color.decode("#cdc7be"));
        en.setLayout(null);
        en.setResizable(false);
        en.setLocationRelativeTo(null);


        JPanel ne = new JPanel();
        ne.setBounds(10, 10, 640, 665);
        ne.setBackground(Color.decode("#f8f5f1"));
        ne.setLayout(null);

        Font label1 = new Font("Serif", Font.BOLD, 20);
        Font label2 = new Font("SansSerif", Font.PLAIN, 17);
        Font label3 = new Font("SansSerif", Font.PLAIN, 12);



        Connection con1;
        Statement st;

        long nlr = lren;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");

            String query = "SELECT * FROM personalInfo WHERE lrn = '"+nlr+"'";

            st = con1.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){


                JLabel app = new JLabel("APPLYING AS: " + rs.getString("lastname") + ", " +rs.getString("firstname")+ " " + rs.getString("middlename"));
                app.setBounds(20,10,300, 15);
                app.setFont(label3);
                en.add(app);

                JLabel cou = new JLabel("LIST OF AVAILABLE COURSES");
                cou.setBounds(20, 25, 300, 35);
                cou.setFont(label1);
                ne.add(cou);
                en.add(cou);

                JLabel cau = new JLabel("COLLEGE OF ARCHITECTURE AND URBAN PLANNING");
                cau.setBounds(25, 75, 500, 25);
                cau.setFont(label2);
                ne.add(cau);
                en.add(cau);

                JLabel cau1 = new JLabel("Bachelor of Science in Architecture - BS Arch");
                cau1.setBounds(40, 110, 500, 25);
                cau1.setFont(label2);
                ne.add(cau1);
                en.add(cau1);

                JLabel cet = new JLabel("COLLEGE OF ENGINEERING AND TECHNOLOGY");
                cet.setBounds(25, 150, 500, 25);
                cet.setFont(label2);
                ne.add(cet);
                en.add(cet);

                JLabel cet1 = new JLabel("Bachelor of Science in Chemical Engineering - BSCHE");
                cet1.setBounds(40, 185, 500, 25);
                cet1.setFont(label2);
                ne.add(cet1);
                en.add(cet1);

                JLabel cet2 = new JLabel("Bachelor of Science in Civil Engineering - BSCE");
                cet2.setBounds(40, 210, 500, 25);
                cet2.setFont(label2);
                ne.add(cet2);
                en.add(cet2);

                JLabel cet3 = new JLabel("Bachelor of Science in Computer Engineering - BS CpE");
                cet3.setBounds(40, 235, 500, 25);
                cet3.setFont(label2);
                ne.add(cet3);
                en.add(cet3);

                JLabel cet4 = new JLabel("Bachelor of Science in Computer Science - BSCS");
                cet4.setBounds(40, 260, 500, 25);
                cet4.setFont(label2);
                ne.add(cet4);
                en.add(cet4);

                JLabel cet5 = new JLabel("Bachelor of Science in Electrical Engineering - BSEE");
                cet5.setBounds(40, 285, 500, 25);
                cet5.setFont(label2);
                ne.add(cet5);
                en.add(cet5);

                JLabel cet6 = new JLabel("Bachelor of Science in Electronics Engineering - BS ECE");
                cet6.setBounds(40, 310, 500, 25);
                cet6.setFont(label2);
                ne.add(cet6);
                en.add(cet6);

                JLabel cet7 = new JLabel("Bachelor of Science in Information Technology - BSIT");
                cet7.setBounds(40, 335, 400, 25);
                cet7.setFont(label2);
                ne.add(cet7);
                en.add(cet7);

                JLabel cet8 = new JLabel("Bachelor of Science in Manufacturing Engineering - BSMFGE");
                cet8.setBounds(40, 360, 500, 25);
                cet8.setFont(label2);
                ne.add(cet8);
                en.add(cet8);

                JLabel cet9 = new JLabel("Bachelor of Science in Mechanical Engineering - BSME");
                cet9.setBounds(40, 385, 500, 25);
                cet9.setFont(label2);
                ne.add(cet9);
                en.add(cet9);

                JLabel chass = new JLabel("COLLEGE OF HUMANITIES, ARTS, AND SOCIAL SCIENCES");
                chass.setBounds(25, 425, 500, 25);
                chass.setFont(label2);
                ne.add(chass);
                en.add(chass);

                JLabel chass1 = new JLabel("Bachelor of Arts in Communication - BAC");
                chass1.setBounds(40, 460, 500, 25);
                chass1.setFont(label2);
                ne.add(chass1);
                en.add(chass1);

                JLabel chass2 = new JLabel("Bachelor of Arts in Communication Major in Public Relations - BAC-PR");
                chass2.setBounds(40, 485, 500, 25);
                chass2.setFont(label2);
                ne.add(chass2);
                en.add(chass2);

                JLabel chass3 = new JLabel("Bachelor of Arts in Public Relations - BAPR");
                chass3.setBounds(40, 510, 500, 25);
                chass3.setFont(label2);
                ne.add(chass3);
                en.add(chass3);

                JLabel chass4 = new JLabel("Bachelor of Science in Social Work - BS SW");
                chass4.setBounds(40, 535, 500, 25);
                chass4.setFont(label2);
                ne.add(chass4);
                en.add(chass4);

                JLabel bsn = new JLabel("COLLEGE OF NURSING");
                bsn.setBounds(25, 575, 500, 25);
                bsn.setFont(label2);
                ne.add(bsn);
                en.add(bsn);

                JLabel bsn1 = new JLabel("Bachelor of Science in Nursing - BSN");
                bsn1.setBounds(40, 610, 500, 25);
                bsn1.setFont(label2);
                ne.add(bsn1);
                en.add(bsn1);

                String courses [] = {
                        //College of Architecture and Urban Planning
                        "Bachelor of Science in Architecture - BS Arch",
                        //COLLEGE OF ENGINEERING AND TECHNOLOGY
                        "Bachelor of Science in Chemical Engineering - BSCHE",
                        "Bachelor of Science in Civil Engineering - BSCE",
                        "Bachelor of Science in Computer Engineering - BS CpE",
                        "Bachelor of Science in Computer Science - BSCS",
                        "Bachelor of Science in Electrical Engineering - BSEE",
                        "Bachelor of Science in Electronics Engineering - BS ECE",
                        "Bachelor of Science in Information Technology - BSIT",
                        "Bachelor of Science in Manufacturing Engineering - BSMFGE",
                        "Bachelor of Science in Mechanical Engineering - BSME",
                        //COLLEGE OF HUMANITIES, ARTS, AND SOCIAL SCIENCES
                        "Bachelor of Arts in Communication - BAC",
                        "Bachelor of Arts in Communication Major in Public Relations - BAC-PR",
                        "Bachelor of Arts in Public Relations - BAPR",
                        "Bachelor of Science in Social Work - BS SW",
                        //COLLEGE OF NURSING
                        "Bachelor of Science in Nursing - BSN"};





                JPanel coo = new JPanel();
                coo.setBounds(650, 10, 615, 665);
                coo.setBackground(Color.decode("#f4eee8"));
                coo.setLayout(null);

                JLabel sc = new JLabel("SELECT COURSE");
                sc.setFont(label1);
                sc.setBounds(680, 15, 200, 25);
                coo.add(sc);

                JLabel perst = new JLabel("FIRST CHOICE");
                perst.setBounds(675, 100, 150, 30);
                perst.setFont(label2);
                coo.add(perst);

                JComboBox<String> course1 = new JComboBox<>(courses);
                course1.setBounds(20,130, 575, 35);
                course1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));
                course1.setBackground(Color.decode("#cdc7be"));
                course1.setFont(label2);
                coo.add(course1);

                JLabel sekond = new JLabel("SECOND CHOICE");
                sekond.setBounds(675, 200, 150, 30);
                sekond.setFont(label2);
                ne.add(sekond);

                JComboBox<String> course2 = new JComboBox<>(courses);
                course2.setBounds(20,230, 575, 35);
                course2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                course2.setBackground(Color.decode("#cdc7be"));
                course2.setFont(label2);
                coo.add(course2);

                JLabel terd = new JLabel("THIRD CHOICE");
                terd.setBounds(675, 300, 150, 30);
                terd.setFont(label2);
                ne.add(terd);

                JComboBox<String> course3 = new JComboBox<>(courses);
                course3.setBounds(20,330, 575, 35);
                course3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                course3.setBackground(Color.decode("#cdc7be"));
                course3.setFont(label2);
                coo.add(course3);

                Random ran = new Random();
                String v = "2021";
                long n = ran.nextInt(100000)+1;
                String val = String.valueOf(n);
                JLabel rann = new JLabel(v + val);

                JButton submit = new JButton("SUBMIT APPLICATION");
                submit.setBounds(20,600, 575, 35);
                submit.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                submit.setBackground(Color.decode("#cdc7be"));
                submit.setFont(label2);
                coo.add(submit);
                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String cour = String.valueOf(course1.getSelectedItem());
                        String cour2 = String.valueOf(course2.getSelectedItem());
                        String cour3 = String.valueOf(course3.getSelectedItem());
                        String ids = String.valueOf(rann);



                        if (cour == cour2 || cour2 == cour3 || cour == cour3) {
                            JOptionPane.showMessageDialog(null, "Each choices must be different!");
                        } else {
                            Connection con1;
                            PreparedStatement insert;
                            Statement st;

                            try {
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                con1 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
                                st = con1.createStatement();



                                insert = con1.prepareStatement("UPDATE personalInfo SET course = ? AND username = ? AND password = ? WHERE lrn = '" + nlr +"'");
                                insert.setString(1, cour);
                                insert.setString(2, ids);
                                insert.setString(3, ids);
                                insert.executeUpdate();

                                JOptionPane.showMessageDialog(null, "Application Submitted");

                                new login();
                                en.dispose();

                            } catch (ClassNotFoundException | SQLException classNotFoundException) {
                                classNotFoundException.printStackTrace();
                            }
                        }

                    }

                });


                en.add(cau);
                en.add(cou);
                en.add(perst);
                en.add(sekond);
                en.add(terd);
                en.add(ne);
                en.add(sc);
                en.add(coo);
                en.setVisible(true);

            }


        } catch (ClassNotFoundException | SQLException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }

    }




    public static void main(String[] args) {
    }

}
