package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class enrollProcess extends JFrame{
    JMenu menu;
    JMenuItem i1, i2, i3;

    public enrollProcess(String sid){

        JFrame f = new JFrame("Enrollment System");
        JPanel mainPanel=new JPanel();
        mainPanel.setBounds(0,0,1280,720);

        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Enrollment Process");
        i1.addActionListener(e -> {
            new viewSched(sid);
            f.dispose();
        });

        i2 = new JMenuItem("View Information");
        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new viewInfo(sid);
                f.dispose();
            }
        });

        i3 = new JMenuItem("Logout");
        i3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection con11;
                PreparedStatement update;
                Statement st1;

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con11 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
                    st1 = con11.createStatement();

                    String sql = "SELECT * FROM personalinfo WHERE studID = '" +sid+ "'";
                    ResultSet rs = st1.executeQuery(sql);

                    String es = "Enrolled";
                    if (rs.next()) {
                        if (rs.getString("enrollStatus").equals(es)) {
                            new login();
                            f.dispose();
                        } else{
                            JOptionPane.showMessageDialog(null,"You are not yet enrolled, You are going to be redirected to Enroll Tab.");
                            new viewSched(sid);
                            f.dispose();
                        }

                    }

                } catch (ClassNotFoundException | SQLException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
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

        JLabel header = new JLabel();
        header.setBounds(275, 0, 720, 80);
        header.setIcon(new ImageIcon("src/ses/header.png"));
        f.add(header);

        JLabel user = new JLabel("Logged in as Student No." + sid);
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
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new viewSched(sid);
                f.dispose();
            }
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
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new assessment(sid);
                f.dispose();
            }
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
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
                Statement st = con1.createStatement();
                PreparedStatement update;

                String es = "Enrolled";
                update = con1.prepareStatement("UPDATE personalInfo SET enrollStatus = ? WHERE studID = '" + Long.parseLong(sid) +"'");
                update.setString(1, es);
                update.executeUpdate();
                    new regForm(sid);
                    f.dispose();

        } catch (ClassNotFoundException | SQLException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
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

        JPanel background = new JPanel();
        background.setBounds(580, 270, 400,200);
        background.setBackground(Color.decode("#b2ab8c"));

        JLabel enrolled = new JLabel("You are officially enrolled!");
        enrolled.setBounds(592, 275, 450, 70);
        enrolled.setForeground(Color.WHITE);
        enrolled.setFont(new Font("Sans", Font.BOLD, 30));
        f.add(enrolled);

        JLabel statement1 = new JLabel("Start of Class will be on March 15, 2020", SwingConstants.CENTER);
        statement1.setBounds(582, 300, 400, 100);
        statement1.setForeground(Color.WHITE);
        statement1.setFont(new Font("Serif", Font.PLAIN, 17));
        f.add(statement1);

        JLabel statement2 = new JLabel("<html> <center> You may now proceed to step 4 <br/> to save your registration form. </center> </html", SwingConstants.CENTER);
        statement2.setBounds(582, 370, 400, 100);
        statement2.setForeground(Color.WHITE);
        statement2.setFont(new Font("Serif", Font.PLAIN, 13));
        f.add(statement2);

        f.add(background);
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

    public static void main(String args[])
    {

    }
}
