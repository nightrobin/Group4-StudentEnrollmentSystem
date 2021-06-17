package ses;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class logIntabs {

    JFrame lt = new JFrame();

    public logIntabs(String sid) {
        lt.setSize(1280,720);
        lt.setLayout(null);
        lt.setResizable(false);
        lt.setLocationRelativeTo(null);

        Font label1 = new Font("Monospaced", Font.BOLD, 50);
        Font label2 = new Font("Dialog", Font.BOLD, 13);

        JPanel h = new JPanel();
        h.setBounds(0,0,1280,50);
        h.setBackground(Color.WHITE);

        JLabel user = new JLabel("Logged in as Student No. " + sid);
        user.setBounds(10, 2, 300, 30);
        user.setFont(label2);

        JButton info = new JButton("STUDENT INFORMATION");
        info.setBounds(0, 50, 1280, 215);
        info.setBackground(Color.decode("#47597e"));
        info.setFont(label1);
        info.setForeground(Color.decode("#dbe6fd"));
        lt.add(info);

        info.addActionListener(e -> {
            new viewInfo(sid);
            lt.dispose();

        });

        JButton enr = new JButton("ENROLL");
        enr.setBounds(0, 265, 1280, 216);
        enr.setBackground(Color.decode("#dbe6fd"));
        enr.setFont(label1);
        enr.setForeground(Color.decode("#47597e"));
        lt.add(enr);

        enr.addActionListener(e -> {
            new viewSched(sid);
            lt.dispose();
        });

        JButton lg = new JButton("LOGOUT");
        lg.setBounds(0, 475, 1280, 215);
        lg.setBackground(Color.decode("#b2ab8c"));
        lg.setFont(label1);
        lg.setForeground(Color.decode("#293b5f"));
        lt.add(lg);

        lg.addActionListener(e -> {
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
                        lt.dispose();
                    } else{
                        JOptionPane.showMessageDialog(null,"You are not yet enrolled, You are going to be redirected to Enroll Tab.");
                        new viewSched(sid);
                        lt.dispose();
                    }

                }

            } catch (ClassNotFoundException | SQLException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
        });

        lt.add(user);
        lt.add(h);
        lt.setVisible(true);
    }

    public static void main(String[] args) {
    }
}
