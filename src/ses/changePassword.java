package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class changePassword extends JFrame{
    JMenu menu;
    JMenuItem i1, i2, i3;
    public JLabel studentNum;

    public changePassword(){

        JFrame f = new JFrame("Enrollment System");
            JPanel mainPanel=new JPanel();
            mainPanel.setBounds(0,0,1280,720);

                JMenuBar mb = new JMenuBar();
                    menu = new JMenu("Menu");
                    i1 = new JMenuItem("Enrollment Process");
                    i1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            //new viewSched();
                            //f.setVisible(false);
                        }
                    });

                    i2 = new JMenuItem("View Information");
                    i2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            //new viewInfo();
                            //f.setVisible(false);
                        }
                    });

                    i3 = new JMenuItem("Logout");
                    i3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            //new login();
                            //f.setVisible(false);
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

                    JLabel user = new JLabel("Logged in as Student No.");
                    user.setBounds(1040, 0, 300, 30);
                    f.add(user);

                    //student number retrieve from the login
                    studentNum = new JLabel("");
                    studentNum.setBounds(1190, 0, 300, 30);
                    f.add(studentNum);

                JPanel menuPanel = new JPanel();
                menuPanel.setBounds(0,0,270,720);
                menuPanel.setBackground(Color.decode("#293b5f"));


                    JButton b1 = new JButton("VIEW INFORMATION");
                    b1.setForeground(Color.WHITE);
                    b1.setBounds(   9, 20, 250, 65);
                    b1.setBackground(Color.decode("#47597e"));
                    b1.setFont(new Font("Sans", Font.BOLD, 17));
                    f.add(b1);
                        b1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                //new viewInfo();
                                //f.setVisible(false);
                            }
                        });

                    JButton b2 = new JButton("CHANGE PASSWORD");
                    b2.setForeground(Color.WHITE);
                    b2.setBounds(   9, 100, 250, 65);
                    b2.setBackground(Color.decode("#47597e"));
                    b2.setFont(new Font("Sans", Font.BOLD, 17));
                    f.add(b2);


            JPanel bodyPanel = new JPanel();
            bodyPanel.setBounds(303,103,930,530);
            bodyPanel.setBackground(Color.WHITE);

                JPanel panelBorder = new JPanel();
                panelBorder.setBounds(570, 200, 400,200);
                panelBorder.setBackground(Color.WHITE);
                panelBorder.setBorder(BorderFactory.createTitledBorder("Change your Password Utility"));

                    JLabel studentnumLabel = new JLabel("Student Number:");
                    studentnumLabel.setBounds(670, 210, 150, 50);
                    studentnumLabel.setFont(new Font("Sans", Font.PLAIN, 12));
                    studentnumLabel.setForeground(Color.RED);
                    f.add(studentnumLabel);

                    //student number retrieve from the login
                    JLabel studentNumber = new JLabel("");
                    studentNumber.setBounds(530, 205, 150, 50);
                    f.add(studentNumber);


                        JLabel currentPass = new JLabel("Current Password: ");
                        currentPass.setBounds(620, 240, 150, 50);
                        f.add(currentPass);

                        JLabel newPass = new JLabel("New Password: ");
                        newPass.setBounds(620, 265, 150, 50);
                        f.add(newPass);

                        JLabel confirmPass = new JLabel("Confirm Password: ");
                        confirmPass.setBounds(620, 290, 150, 50);
                        f.add(confirmPass);


                        JTextField currentPassField = new JTextField();
                        currentPassField.setBounds(770, 255, 160, 20);
                        f.add(currentPassField);

                        JTextField newPassField = new JTextField();
                        newPassField.setBounds(770, 280, 160, 20);
                        f.add(newPassField);

                        JTextField confirmPassField = new JTextField();
                        confirmPassField.setBounds(770, 305, 160, 20);
                        f.add(confirmPassField);


                        JButton updateButton = new JButton("Update Password");
                        updateButton.setBounds(695, 340, 150, 25);
                        f.add(updateButton);
                            updateButton.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent actionEvent) {

                                }
                            });


                    JLabel notePass = new JLabel("Note: Make your password be at least 8-20 characters.");
                    notePass.setFont(new Font("Sans", Font.PLAIN, 10));
                    notePass.setBounds(650, 360, 350, 50);
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
        //f.setResizable(false);
    }

    public static void main(String args[])
    {
        new changePassword();
    }
}