package ses;

import javax.swing.*;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class viewSched extends JFrame{
    JMenu menu;
    JMenuItem i1, i2, i3;
    private final JFrame f;

    public viewSched(String studentNum){
        f = new JFrame("Enrollment System");
        JPanel mainPanel=new JPanel();
        mainPanel.setBounds(0,0,1280,720);

        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Enrollment Process");


        i2 = new JMenuItem("View Information");

        i3 = new JMenuItem("Logout");
        i3.addActionListener(e -> {
            new login();
            f.setVisible(false);
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

        JLabel user = new JLabel("Logged in as Student No. "+studentNum);
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
        b2.addActionListener(actionEvent -> {
            new assessment(studentNum);
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
            new enrollProcess(studentNum);
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
            new regForm(studentNum);
            f.dispose();
        });

        JButton backButton = new JButton("BACK");
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(   9, 605, 250, 35);
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

        JLabel classSchedule = new JLabel("CLASS SCHEDULE");
        classSchedule.setBounds(625, 100, 450, 70);
        classSchedule.setForeground(Color.decode("#293b5f"));
        classSchedule.setFont(new Font("Serif", Font.BOLD, 30));
        f.add(classSchedule);


        JLabel subjectCode = new JLabel("SUBJECT CODE");
        subjectCode.setBounds(380, 170, 130, 20);
        subjectCode.setFont(new Font("Sans", Font.BOLD, 13));
        subjectCode.setForeground(Color.WHITE);
        f.add(subjectCode);

        JLabel sec = new JLabel("SEC.");
        sec.setBounds(494, 170, 130, 20);
        sec.setFont(new Font("Sans", Font.BOLD, 13));
        sec.setForeground(Color.WHITE);
        f.add(sec);

        JLabel subjectTitle = new JLabel("SUBJECT TITLE");
        subjectTitle.setBounds(650, 170, 130, 20);
        subjectTitle.setFont(new Font("Sans", Font.BOLD, 13));
        subjectTitle.setForeground(Color.WHITE);
        f.add(subjectTitle);

        JLabel units = new JLabel("UNITS");
        units.setBounds(883, 170, 130, 20);
        units.setFont(new Font("Sans", Font.BOLD, 13));
        units.setForeground(Color.WHITE);
        f.add(units);

        JLabel days = new JLabel("DAYS");
        days.setBounds(936, 170, 130, 20);
        days.setFont(new Font("Sans", Font.BOLD, 13));
        days.setForeground(Color.WHITE);
        f.add(days);

        JLabel time = new JLabel("TIME");
        time.setBounds(1030, 170, 130, 20);
        time.setFont(new Font("Sans", Font.BOLD, 13));
        time.setForeground(Color.WHITE);
        f.add(time);

        JLabel room = new JLabel("ROOM");
        room.setBounds(1120, 170, 130, 20);
        room.setFont(new Font("Sans", Font.BOLD, 13));
        room.setForeground(Color.WHITE);
        f.add(room);

        JPanel header = new JPanel();
        header.setBounds(370, 165, 800, 30);
        header.setBackground(Color.decode("#47597e"));
        f.add(header);


        JTable sched = new JTable();
        sched.setBounds(370, 200, 800, 400);
        sched.setBackground(Color.decode("#b2ab8c"));
        sched.setForeground(Color.WHITE);
        sched.setFont(new Font("Sans", Font.BOLD, 15));
        sched.setEnabled(false);
        f.add(sched);



        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
            Statement st2 = con.createStatement();
            ResultSet rs2 = st2.executeQuery("SELECT * FROM personalinfo where studID ='"+ studentNum +"'");

            if (rs2.next()) {
                String schedsett = rs2.getString("sched");


                ResultSet rs = st2.executeQuery("SELECT subjectCode, section, subjectTitle, units, days, time, room FROM schedules where sets='"+ schedsett+"'");
                sched.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                TableColumnModel columnModel = sched.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(120);
                columnModel.getColumn(1).setPreferredWidth(40);
                columnModel.getColumn(2).setPreferredWidth(350);
                columnModel.getColumn(3).setPreferredWidth(50);
                columnModel.getColumn(4).setPreferredWidth(50);
                columnModel.getColumn(5).setPreferredWidth(130);
                columnModel.getColumn(6).setPreferredWidth(60);
                sched.setRowHeight(30);



            }

        }
        catch (Exception e){JOptionPane.showMessageDialog(null,"Error!","Error",JOptionPane.ERROR_MESSAGE);}



        f.add(bodyPanel);
        f.add(topPanel);
        f.add(menuPanel);
        f.add(mainPanel);
        f.setSize(1280,720);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
    }
}
