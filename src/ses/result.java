package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class result {
    JFrame r = new JFrame();

    public result() {

        r.setSize(640, 360);
        r.setLayout(null);
        r.setResizable(false);
        r.setLocationRelativeTo(null);

        Font label1 = new Font("Serif", Font.BOLD, 20);
        Font label2 = new Font("SansSerif", Font.PLAIN, 17);
        Font label3  = new Font("SansSerif", Font.ITALIC, 15);

        JLabel pa = new JLabel("PASSERS");
        pa.setBounds(20, 10, 300, 30);
        pa.setFont(label1);

        JLabel ex = new JLabel("ENTER LRN TO CHECK RESULTS");
        ex.setBounds(160, 50, 300, 25);
        ex.setFont(label2);

        JTextField n = new JTextField();
        n.setBounds(150, 80, 300, 30);
        n.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        n.setFont(label2);



        JButton c = new JButton("Search");
        c.setBounds(475, 80, 100, 30);
        c.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        c.setBackground(Color.decode("#cdc7be"));
        c.setFont(label2);

        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nrl = n.getText();


                try {
                    if (nrl.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No LRN entered.");
                    }
                    else {
                        Connection con1;
                        Statement st;
                        long rnl = Long.parseLong(n.getText());
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            con1 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
                            st = con1.createStatement();

                            String sql = "SELECT * FROM personalInfo WHERE lrn = '" + rnl + "'";
                            ResultSet rs = st.executeQuery(sql);

                            if (rs.next()) {
                                String neym = rs.getString("lastname") + ", " + rs.getString("firstname") + " " + rs.getString("middlename");

                                JLabel nem = new JLabel(neym);
                                nem.setBounds(200, 150, 350, 25);
                                nem.setFont(label2);
                                neym.toUpperCase();
                                nem.setVisible(false);
                                r.add(nem);

                                JLabel nt = new JLabel();
                                nt.setBounds(250, 180, 500, 25);
                                nt.setText("<html><u>Sample Email</u></html>");
                                nt.setFont(label3);
                                nt.setVisible(false);
                                r.add(nt);

                                JLabel un = new JLabel("STUDENT ID: " + rs.getString("studID"));
                                un.setBounds(200, 210, 350, 25);
                                un.setFont(label2);
                                un.setVisible(false);
                                r.add(un);

                                JLabel ps = new JLabel("PASSWORD: " + rs.getString("password"));
                                ps.setBounds(200, 240, 350, 25);
                                ps.setFont(label2);
                                ps.setVisible(false);
                                r.add(ps);

                                JLabel ntt = new JLabel();
                                ntt.setBounds(150, 270, 500, 25);
                                ntt.setText("<html><u>We advise to change your password upon logging in.</u></html>");
                                ntt.setFont(label3);
                                ntt.setVisible(false);
                                r.add(ntt);

                                nem.setVisible(true);
                                nt.setVisible(true);
                                un.setVisible(true);
                                ps.setVisible(true);
                                ntt.setVisible(true);
                            }
                            else {
                                JLabel sor = new JLabel("Sorry, no record found.");
                                sor.setBounds(250, 150, 350, 25);
                                sor.setFont(label2);
                                sor.setVisible(true);
                                r.add(sor);
                            }
                        } catch (ClassNotFoundException | SQLException classNotFoundException) {
                            classNotFoundException.printStackTrace();
                        }
                    }
                } catch (NumberFormatException ignore) {
                    JOptionPane.showMessageDialog(null, "Invalid input.");
                }
            }
        });

        r.add(pa);
        r.add(ex);
        r.add(n);
        r.add(c);
        r.setVisible(true);
    }


    public static void main(String[] args) {
       new result();
    }
}