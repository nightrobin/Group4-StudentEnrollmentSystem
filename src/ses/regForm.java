package ses;

import javax.swing.*;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.sql.*;

public class regForm {

    JMenu menu;
    JMenuItem i1, i2, i3;
    private final JFrame f;


    public regForm(String sid) {
        f = new JFrame("Enrollment System");
        f.setSize(1280, 720);
        JPanel mainPanel=new JPanel();
        mainPanel.setBounds(0,0,1280,720);

        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Enrollment Process");
        i1.addActionListener(e -> {
                            new viewSched(sid);
                            f.setVisible(false);
        });

        i2 = new JMenuItem("View Information");
        i2.addActionListener(e -> {
            new viewInfo(sid);
            f.dispose();
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

        JLabel user = new JLabel("Logged in as Student No. " +sid);
        user.setBounds(1040, 0, 300, 30);
        f.add(user);

        JPanel menuPanel = new JPanel();
        menuPanel.setBounds(0,0,270,720);
        menuPanel.setBackground(Color.decode("#293b5f"));

        JLabel step1 = new JLabel("Step 1");
        step1.setForeground(Color.WHITE);
        step1.setBounds(9, 0, 150, 50);
        f.add(step1);

        JButton b1 = new JButton("VIEW SCHEDULE");
        b1.setForeground(Color.WHITE);
        b1.setBounds(   9, 40, 250, 65);
        b1.setBackground(Color.decode("#47597e"));
        b1.setFont(new Font("Sans", Font.BOLD, 17));
        f.add(b1);
        b1.addActionListener(actionEvent -> {
            new viewSched(sid);
            f.dispose();
        });

        JLabel step2 = new JLabel("Step 2");
        step2.setForeground(Color.WHITE);
        step2.setBounds(9, 100, 150, 50);
        f.add(step2);

        JButton b2 = new JButton("VIEW ASSESSMENT");
        b2.setForeground(Color.WHITE);
        b2.setBounds(   9, 140, 250, 65);
        b2.setBackground(Color.decode("#47597e"));
        b2.setFont(new Font("Sans", Font.BOLD, 17));
        f.add(b2);

        b2.addActionListener(e -> {
            new assessment(sid);
            f.dispose();
        });

        JLabel step3 = new JLabel("Step 3");
        step3.setForeground(Color.WHITE);
        step3.setBounds(9, 200, 150, 50);
        f.add(step3);

        JButton b3 = new JButton("REGISTER");
        b3.setForeground(Color.WHITE);
        b3.setBounds(   9, 240, 250, 65);
        b3.setBackground(Color.decode("#47597e"));
        b3.setFont(new Font("Sans", Font.BOLD, 17));
        f.add(b3);
        b3.addActionListener(actionEvent -> {
            new enrollProcess(sid);
            f.dispose();
        });

        JLabel step4 = new JLabel("Step 4");
        step4.setForeground(Color.WHITE);
        step4.setBounds(9, 300, 150, 50);
        f.add(step4);

        JButton b4 = new JButton("<HTML> <center> VIEW REGISTRATION <br/> FORM </center> </HTML>");
        b4.setForeground(Color.WHITE);
        b4.setBounds(   9, 340, 250, 65);
        b4.setBackground(Color.decode("#47597e"));
        b4.setFont(new Font("Sans", Font.BOLD, 17));
        f.add(b4);
        b4.addActionListener(actionEvent -> {
            new regForm(sid);
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
            new logIntabs(sid);
            f.dispose();
        });

        JPanel bodyPanel = new JPanel();
        bodyPanel.setBounds(303,103,930,530);
        bodyPanel.setBackground(Color.WHITE);

        Font l1 = new Font("Serif", Font.BOLD, 20);
        Font l2 = new Font("Serif", Font.BOLD, 15);
        Font l3 = new Font("SansSerif", Font.PLAIN, 11);
        Font l4 = new Font("SansSerif", Font.PLAIN, 13);

        Connection con11;
        Statement st1;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con11 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
            st1 = con11.createStatement();

            String sql = "SELECT * FROM personalinfo WHERE studID = '" +sid+ "'";
            ResultSet rs = st1.executeQuery(sql);

            if(rs.next()) {
                JLabel schname = new JLabel("ROBINSON UNIVERSITY");
                schname.setBounds(330, 115, 250, 30);
                schname.setFont(l2);
                f.add(schname);

                JLabel h1 = new JLabel("STUDENT ENROLLMENT RECORD");
                h1.setBounds(620, 115, 400, 35);
                h1.setFont(l1);
                f.add(h1);

                JLabel h2 = new JLabel("1st Semester");
                h2.setBounds(635, 140, 150, 25);
                h2.setFont(l2);
                f.add(h2);

                JLabel h3 = new JLabel("School Year");
                h3.setBounds(755, 140, 100, 25);
                h3.setFont(l4);
                f.add(h3);

                JLabel h4 = new JLabel("2021-2022");
                h4.setBounds(865, 140, 100, 25);
                h4.setFont(l2);
                f.add(h4);

                JLabel sn = new JLabel("<html> <font size = 4>&nbsp; Student No.  </font><br><font size=5> &nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("studID") + "</font></html>");
                sn.setBounds(345, 170, 200, 50);
                sn.setFont(l2);
                sn.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                f.add(sn);

                JLabel sname = new JLabel("<html> <font size = 4>&nbsp; Student Name  </font><br><font size=5>  &nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("lastname").toUpperCase() +", " +
                        rs.getString("firstname").toUpperCase() + " " + rs.getString("middlename").toUpperCase()  +" </font></html>");
                sname.setBounds(545, 170, 450, 50);
                sname.setFont(l2);
                sname.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                f.add(sname);

                JLabel st = new JLabel("<html> <font size = 4>&nbsp; Student Type  </font><br><font size=5> &nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("studType") + "</font></html>");
                st.setBounds(995, 170, 100, 50);
                st.setFont(l2);
                st.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                f.add(st);

                JLabel yl = new JLabel("<html> <font size = 4>&nbsp; Year Level  </font><br><font size=5> &nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("yrlvl") + "</font></html>");
                yl.setBounds(1095, 170, 100, 50);
                yl.setFont(l2);
                yl.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                f.add(yl);


                JLabel cl = new JLabel("<html> <font size = 4>&nbsp; College  </font><br><font size=5> &nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("college") + "</font></html>");
                cl.setBounds(345, 220, 200, 50);
                cl.setFont(l2);
                cl.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                f.add(cl);

                JLabel co = new JLabel("<html> <font size = 4>&nbsp; Course  </font><br><font size=5>  &nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("course")   +" </font></html>");
                co.setBounds(545, 220, 450, 50);
                co.setFont(l2);
                co.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                f.add(co);

                JLabel rg = new JLabel("<html> <font size = 4>&nbsp; Registration Status </font><br><font size=5> &nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("regStatus") + "</font></html>");
                rg.setBounds(995, 220, 200, 50);
                rg.setFont(l2);
                rg.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                f.add(rg);

                JLabel ass = new JLabel("<html> <font size = 4><b>&nbsp; Tuition Fees &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 7,032 </b>" +
                                    "<br>&nbsp;&nbsp; Tuition Fee  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 7,032 <br>" +
                                    "<b>&nbsp; Miscellaneous Fees 1,686.00 </b><br>" +
                                    "&nbsp;&nbsp; Library Fee &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 732.00 <br>" +
                                    "&nbsp;&nbsp; Athletic Fee with PE &nbsp;&nbsp;&nbsp;&nbsp; 293.00 <br>" +
                                    "&nbsp;&nbsp; Registration Fee &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp; 74.00 <br>" +
                                    "&nbsp;&nbsp; Medical/Dental Fee &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 293.00 <br>" +
                                    "&nbsp;&nbsp; Student Welfare &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 74.00 <br>" +
                                    "&nbsp;&nbsp; Cultural Activity &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 74.00 <br>" +
                                    "&nbsp;&nbsp; Guidance Fee &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp; 146.00 <br>" +
                                    "&nbsp; <b> Other Fees &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 526.00 </b> <br>" +
                                    "&nbsp;&nbsp; NSTP &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 330.00 <br>" +
                                    "<br> <b> TOTAL AMOUNT DUE  11,437.00 </b></font> </html>");
                ass.setFont(l4);
                ass.setBounds(975, 275, 220, 320);
                ass.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
                f.add(ass);

                JLabel classSchedule = new JLabel("CLASS SCHEDULE");
                classSchedule.setBounds(530, 270, 450, 30);
                classSchedule.setFont(l1);
                f.add(classSchedule);


                JLabel subjectCode = new JLabel("SUBJECT CODE");
                subjectCode.setBounds(345, 300, 130, 20);
                subjectCode.setFont(l3);
                f.add(subjectCode);

                JLabel sec = new JLabel("SEC.");
                sec.setBounds(438, 300, 75, 20);
                sec.setFont(l3);
                f.add(sec);

                JLabel subjectTitle = new JLabel("SUBJECT TITLE");
                subjectTitle.setBounds(550, 300, 130, 20);
                subjectTitle.setFont(l3);
                f.add(subjectTitle);

                JLabel units = new JLabel("UNITS");
                units.setBounds(728, 300, 100, 20);
                units.setFont(l3);
                f.add(units);

                JLabel days = new JLabel("DAYS");
                days.setBounds(773, 300, 130, 20);
                days.setFont(l3);
                f.add(days);

                JLabel time = new JLabel("TIME");
                time.setBounds(845, 300, 130, 20);
                time.setFont(l3);
                f.add(time);

                JLabel room = new JLabel("ROOM");
                room.setBounds(903, 300, 130, 20);
                room.setFont(l3);
                f.add(room);

                JTable sched = new JTable();
                sched.setBounds(347, 320, 600, 300);
                sched.setFont(l3);
                sched.setEnabled(false);
                f.add(sched);

                String schedsett = rs.getString("sched");
                String schedset1 = rs.getString("sched1");


                rs = st1.executeQuery("Select subjectCode, section, subjectTitle, units, days, time, room FROM schedules where sets='"+schedsett+"'");
                sched.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                TableColumnModel columnModel = sched.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(70);
                columnModel.getColumn(1).setPreferredWidth(25);
                columnModel.getColumn(2).setPreferredWidth(245);
                columnModel.getColumn(3).setPreferredWidth(30);
                columnModel.getColumn(4).setPreferredWidth(35);
                columnModel.getColumn(5).setPreferredWidth(80);
                columnModel.getColumn(6).setPreferredWidth(30);
                sched.setRowHeight(30);

        } else {
            JOptionPane.showMessageDialog(null, "An error occurred.");
        }


    } catch (ClassNotFoundException | SQLException classNotFoundException) {
        classNotFoundException.printStackTrace();
    }

        f.add(bodyPanel);
        f.add(topPanel);
        f.add(menuPanel);
        f.add(mainPanel);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
    }
}
