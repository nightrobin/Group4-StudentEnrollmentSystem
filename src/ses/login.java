package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class login{

    private final JFrame f;

    public login(){
        f = new JFrame("Enrollment System");
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0,0,1280,720);

        JLabel header = new JLabel();
        header.setBounds(0, 0, 720, 80);
        header.setIcon(new ImageIcon("src/ses/header.png"));
        f.add(header);

        JPanel topPanel = new JPanel();
        topPanel.setBounds(0,0,1280,70);
        topPanel.setBackground(Color.WHITE);
        f.add(topPanel);

        Font label2 = new Font("Dialog", Font.PLAIN, 15);

        JLabel loginText = new JLabel("LOGIN");
        loginText.setBounds(1000, 110, 450, 70);
        loginText.setForeground(Color.decode("#47597e"));
        loginText.setFont(new Font("Sans", Font.BOLD, 30));
        f.add(loginText);

        JLabel SNlabel = new JLabel("Student Number:");
        SNlabel.setBounds(900, 180, 200, 70);
        SNlabel.setFont(new Font("Sans", Font.BOLD, 15));
        SNlabel.setForeground(Color.decode("#293b5f"));
        f.add(SNlabel);

        JTextField SNField = new JTextField();
        SNField.setBounds(900, 240, 300, 30 );
        SNField.setFont(label2);
        f.add(SNField);

        JLabel PWlabel = new JLabel("Password:");
        PWlabel.setBounds(900, 260, 200, 70);
        PWlabel.setFont(new Font("Sans", Font.BOLD, 15));
        PWlabel.setForeground(Color.decode("#293b5f"));
        f.add(PWlabel);

        JPasswordField PWField = new JPasswordField();
        PWField.setBounds(900, 320, 300, 30 );
        SNField.setFont(label2);
        f.add(PWField);


        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(900, 380, 300, 40);
        loginButton.setFont(new Font("Sans", Font.BOLD, 15));
        loginButton.setBackground(Color.decode("#47597e"));
        loginButton.setForeground(Color.WHITE);
        f.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String sid = SNField.getText();
                String ps = PWField.getText();


                if (sid.isEmpty() || ps.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Required Field/s is/are Empty.");
                } else if(sid.length() <= 5) {
                    JOptionPane.showMessageDialog(null, "Invalid Student Number.");
                }
                else {
                    Connection con1;
                    Statement st;
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con1 = DriverManager.getConnection("jdbc:mysql://localhost/ses", "root", "");
                        st = con1.createStatement();

                        String sql = "SELECT * FROM personalInfo WHERE studID = '" + sid + "' AND password = '" + ps + "'";
                        ResultSet rs = st.executeQuery(sql);

                        if (rs.next()) {
                            new logIntabs(rs.getString("studID"));
                            f.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Student Number or Password Incorrect");
                        }

                    } catch (ClassNotFoundException | SQLException classNotFoundException) {

                    }
                }
            }
        });

        JLabel note = new JLabel("<html> <center> <i> Note: For new students, click</i> </center> </html", SwingConstants.CENTER);
        note.setBounds(880, 520, 300, 40);
        note.setFont(new Font("Sans", Font.PLAIN, 15));
        f.add(note);

        JLabel newStudent = new JLabel("<html> <center> <i> <u>here.</u> </i> </center> </html");
        newStudent.setBounds(1130, 525, 300, 30);
        newStudent.setFont(new Font("Sans", Font.BOLD, 15));
        newStudent.setForeground(Color.decode("#293b5f"));
        f.add(newStudent);
        newStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new perInfo();
                f.dispose();
            }

        });


        JLabel loginPic = new JLabel();
        loginPic.setBounds(20,100, 840, 540);
        loginPic.setIcon(new ImageIcon("src/ses/loginPic.png"));
        f.add(loginPic);

        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(20,100, 840, 540);
        leftPanel.setBackground(Color.decode("#293b5f"));
        f.add(leftPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(840,100, 400, 540);
        rightPanel.setBackground(Color.white);
        f.add(rightPanel);

        f.add(mainPanel);
        f.setSize(1280,720);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        new login();
    }
}
