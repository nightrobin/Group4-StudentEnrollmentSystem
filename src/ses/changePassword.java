package ses;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Objects;
import java.util.stream.Stream;

public class changePassword extends JFrame{
    JMenu menu;
    JMenuItem i1, i2, i3;


    public changePassword(String studentNum){

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
        i2.addActionListener(e -> {
            new viewInfo(studentNum);
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

        Font label1 = new Font("SansSerif", Font.BOLD, 12);
        Font label2 = new Font("Dialog", Font.BOLD, 15);
        Font label3 = new Font("Sans", Font.BOLD, 17);

        JPanel topPanel = new JPanel();
        topPanel.setBounds(270,0,1280,70);
        topPanel.setBackground(Color.WHITE);

        JLabel user = new JLabel("Logged in as Student No. " + studentNum);
        user.setBounds(1040, 0, 300, 30);
        user.setFont(label1);
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
        b2.addActionListener(actionEvent -> {
            new updateInfo(studentNum);
            f.dispose();
        });

        JButton b3 = new JButton("CHANGE PASSWORD");
        b3.setForeground(Color.WHITE);
        b3.setBounds(   9, 180, 250, 65);
        b3.setBackground(Color.decode("#47597e"));
        b3.setFont(new Font("Sans", Font.BOLD, 17));
        f.add(b3);

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

        JPanel panelBorder = new JPanel();
        panelBorder.setBounds(550, 200, 500,300);
        panelBorder.setBackground(Color.WHITE);
        panelBorder.setBorder(BorderFactory.createTitledBorder("Change your Password Utility"));
        panelBorder.setFont(label3);


        JLabel studentnumLabel = new JLabel("Student Number: " + studentNum);
        studentnumLabel.setBounds(670, 220, 250, 50);
        studentnumLabel.setFont(new Font("Sans", Font.PLAIN, 12));
        studentnumLabel.setForeground(Color.RED);
        studentnumLabel.setFont(label2);
        f.add(studentnumLabel);


        JLabel currentPass = new JLabel("Current Password: ");
        currentPass.setBounds(620, 260, 150, 50);
        currentPass.setFont(label2);
        f.add(currentPass);

        JLabel newPass = new JLabel("New Password: ");
        newPass.setBounds(620, 285, 150, 50);
        newPass.setFont(label2);
        f.add(newPass);

        JLabel confirmPass = new JLabel("Confirm Password: ");
        confirmPass.setBounds(620, 310, 150, 50);
        confirmPass.setFont(label2);
        f.add(confirmPass);


        JPasswordField currentPassField = new JPasswordField();
        currentPassField.setBounds(770, 275, 215, 20);
        currentPassField.setBorder(BorderFactory.createLineBorder(Color.decode("#47597e"),1));
        f.add(currentPassField);

        JPasswordField newPassField = new JPasswordField();
        newPassField.setBounds(770, 300, 215, 20);
        newPassField.setBorder(BorderFactory.createLineBorder(Color.decode("#47597e"),1));
        f.add(newPassField);

        JPasswordField confirmPassField = new JPasswordField();
        confirmPassField.setBounds(770, 325, 215, 20);
        confirmPassField.setBorder(BorderFactory.createLineBorder(Color.decode("#47597e"),1));
        f.add(confirmPassField);


        JButton updateButton = new JButton("Update Password");
        updateButton.setBounds(750, 375, 150, 25);
        updateButton.setBorder(BorderFactory.createLineBorder(Color.decode("#47597e"),1));
        updateButton.setBackground(Color.decode("#dbe6fd"));
        f.add(updateButton);
        updateButton.addActionListener(actionEvent -> {

            String cpw = currentPassField.getText();
            String npw = newPassField.getText();
            String cw = confirmPassField.getText();
            long sid = Long.parseLong(studentNum);

            Connection con1;
            Statement st;
            int pwlength = 8;

            if (Stream.of(cpw, npw, cw).anyMatch(String::isEmpty)){
                JOptionPane.showMessageDialog(null, "Required Field/s is/are empty.");
            } else if (!npw.equals(cw)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match.");
            } else if (Objects.equals(npw, cpw) && Objects.equals(cw, cpw)) {
                JOptionPane.showMessageDialog(null, "New password cannot be the same as your existing password.");
            } else if (npw.length() < pwlength){
                JOptionPane.showMessageDialog(null, "Passwords must be at least 8 to 20 characters.");
            } else {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
                    st = con1.createStatement();
                    PreparedStatement update;

                    String sql = "SELECT * FROM personalInfo WHERE studID = '" + sid + "' AND password = '" + cpw + "'";
                    ResultSet rs = st.executeQuery(sql);

                    boolean has_results = rs.next();

                    if(has_results) {
                        do {

                        } while (rs.next());
                        update = con1.prepareStatement("UPDATE personalInfo SET password = ? WHERE studID = '" + sid + "'");
                        update.setString(1, npw);
                        update.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Password updated successfully.");
                        new changePassword(studentNum);
                        f.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Current Password entered is incorrect.");

                    }
                } catch (ClassNotFoundException | SQLException classNotFoundException) {

                }
            }

        });


        JLabel notePass = new JLabel("Note: Make your password be at least 8-20 characters.");
        notePass.setFont(new Font("Sans", Font.PLAIN, 12));
        notePass.setBounds(675, 420, 350, 50);
        f.add(notePass);

        f.add(panelBorder);
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