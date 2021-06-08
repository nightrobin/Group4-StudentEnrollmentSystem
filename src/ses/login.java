package ses;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class login extends JFrame {

    private JFrame f;

    public login(){
        f = new JFrame("Enrollment System");
        JPanel mainPanel=new JPanel();
        mainPanel.setBounds(0,0,1280,720);

            JPanel topPanel = new JPanel();
            topPanel.setBounds(0,0,1280,70);
            topPanel.setBackground(Color.WHITE);
            f.add(topPanel);

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
                        f.add(SNField);

                    JLabel PWlabel = new JLabel("Password:");
                    PWlabel.setBounds(900, 260, 200, 70);
                    PWlabel.setFont(new Font("Sans", Font.BOLD, 15));
                    PWlabel.setForeground(Color.decode("#293b5f"));
                    f.add(PWlabel);

                        JTextField PWField = new JTextField();
                        PWField.setBounds(900, 320, 300, 30 );
                        f.add(PWField);


                JButton loginButton = new JButton("LOGIN");
                loginButton.setBounds(900, 380, 300, 30);
                f.add(loginButton);
                loginButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {

                    }
                });

                JButton registerButton = new JButton("REGISTER");
                registerButton.setBounds(900, 420, 300, 30);
                f.add(registerButton);
                registerButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        new perInfo();
                        f.setVisible(false);
                    }
                });

                JLabel note = new JLabel("<html> <center> <i> <u> Note: New students are required to register first.</u> </i> </center> </html", SwingConstants.CENTER);
                note.setBounds(900, 500, 300, 40);
                note.setFont(new Font("Sans", Font.PLAIN, 13));
                f.add(note);


                JLabel enrolled = new JLabel("<html><center> Now Accepting SY 2020-2021 Enrollees!</center></html> ");
                enrolled.setBounds(200, 70, 700, 150);
                enrolled.setForeground(Color.WHITE);
                enrolled.setFont(new Font("Sans", Font.BOLD, 25));
                f.add(enrolled);

            JPanel rightPanel = new JPanel();
            rightPanel.setBounds(20,100, 840, 540);
            rightPanel.setBackground(Color.decode("#293b5f"));
            f.add(rightPanel);

            JPanel leftPanel = new JPanel();
            leftPanel.setBounds(840,100, 400, 540);
            leftPanel.setBackground(Color.white);
            f.add(leftPanel);

        f.add(mainPanel);
        f.setSize(1280,720);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        new login();
    }
}
