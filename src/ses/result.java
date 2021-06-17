package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class result{

    JFrame f = new JFrame();


    public result(){
        f = new JFrame("Enrollment System");

        JLabel header = new JLabel();
        header.setBounds(0, 0, 720, 80);
        header.setIcon(new ImageIcon("src/ses/header.png"));
        f.add(header);

        JPanel topPanel = new JPanel();
        topPanel.setBounds(0,0,1280,70);
        topPanel.setBackground(Color.WHITE);
        f.add(topPanel);

        Font label1 = new Font("Serif", Font.BOLD, 20);
        Font label2 = new Font("SansSerif", Font.PLAIN, 17);
        Font label3  = new Font("SansSerif", Font.ITALIC, 15);

        JLabel loginText = new JLabel("PASSERS");
        loginText.setBounds(990, 110, 450, 70);
        loginText.setForeground(Color.decode("#47597e"));
        loginText.setFont(new Font("Sans", Font.BOLD, 30));
        f.add(loginText);

        JLabel LRNlabel = new JLabel("Enter your LRN:");
        LRNlabel.setBounds(900, 180, 200, 70);
        LRNlabel.setFont(new Font("Sans", Font.BOLD, 15));
        LRNlabel.setForeground(Color.decode("#293b5f"));
        f.add(LRNlabel);

        JTextField n = new JTextField();
        n.setBounds(900, 240, 190, 30 );
        n.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,1));
        n.setFont(label2);
        f.add(n);

        JButton searchBtn = new JButton("Search");
        searchBtn.setBounds(1100, 240, 120, 30);
        searchBtn.setFont(new Font("Sans", Font.BOLD, 15));
        searchBtn.setBackground(Color.decode("#B2AB8C"));
        searchBtn.setForeground(Color.WHITE);
        f.add(searchBtn);


        ButtonGroup c1 = new ButtonGroup();
        c1.add(searchBtn);


        searchBtn.addActionListener(new ActionListener() {
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
                                nem.setBounds(900, 300, 350, 25);
                                nem.setFont(label2);
                                neym.toUpperCase();
                                nem.setVisible(false);
                                f.add(nem);

                                JLabel nt = new JLabel();
                                nt.setBounds(1000, 340, 500, 25);
                                nt.setText("<html><u>Sample Email</u></html>");
                                nt.setFont(new Font("SansSerif", Font.PLAIN, 15));
                                nt.setVisible(false);
                                f.add(nt);

                                JLabel un = new JLabel("STUDENT ID: " + rs.getString("studID"));
                                un.setBounds(900, 380, 350, 25);
                                un.setFont(label2);
                                un.setVisible(false);
                                f.add(un);

                                JLabel ps = new JLabel("PASSWORD: " + rs.getString("password"));
                                ps.setBounds(900, 420, 350, 25);
                                ps.setFont(label2);
                                ps.setVisible(false);
                                f.add(ps);

                                JLabel ntt = new JLabel();
                                ntt.setBounds(900, 470, 500, 25);
                                ntt.setText("<html><u>We advise to change your password upon logging in.</u></html>");
                                ntt.setFont(new Font("SansSerif", Font.ITALIC, 13));
                                ntt.setVisible(false);
                                f.add(ntt);

                                nem.setVisible(true);
                                nt.setVisible(true);
                                un.setVisible(true);
                                ps.setVisible(true);
                                ntt.setVisible(true);

                            } else {
                                JLabel sor = new JLabel("Sorry, no record found.");
                                sor.setBounds(900, 300, 350, 25);
                                sor.setFont(label2);
                                sor.setVisible(false);
                                f.add(sor);
                                sor.setVisible(true);

                                c1.clearSelection();
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


        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(900, 570, 130, 35);
        clearBtn.setFont(new Font("Sans", Font.BOLD, 15));
        clearBtn.setBackground(Color.decode("#293B5F"));
        clearBtn.setForeground(Color.WHITE);
        f.add(clearBtn);
            clearBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new result();
                    f.dispose();
                }
            });

        JButton backBtn = new JButton("Back to login");
        backBtn.setBounds(1090, 570, 130, 35);
        backBtn.setFont(new Font("Sans", Font.BOLD, 15));
        backBtn.setBackground(Color.decode("#293B5F"));
        backBtn.setForeground(Color.WHITE);
        f.add(backBtn);
            backBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new login();
                    f.dispose();
                }
            });


        JLabel loginPic = new JLabel();
        loginPic.setBounds(20,100, 840, 540);
        loginPic.setIcon(new ImageIcon("src/ses/loginPic.png"));
        f.add(loginPic);

        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(20,100, 840, 540);

        JPanel border = new JPanel();
        border.setBounds(845, 100, 400,540);
        border.setBackground(new Color(0,0,0,0));
        border.setBorder(BorderFactory.createLineBorder(Color.decode("#293b5f"), 3));
        f.add(border);



        f.add(leftPanel);
        f.setSize(1280,720);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        new result();
    }
}
