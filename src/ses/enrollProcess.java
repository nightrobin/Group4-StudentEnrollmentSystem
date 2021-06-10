package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class enrollProcess extends JFrame{
    JMenu menu;
    JMenuItem i1, i2, i3;
    public JLabel studentNum;

    public enrollProcess(){

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

                    studentNum = new JLabel("");
                    studentNum.setBounds(1190, 0, 300, 30);
                    f.add(studentNum);


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
                                    //new viewSched();
                                    //f.setVisible(false);
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
                                    new assessment();
                                    f.setVisible(false);
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
                            b4.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent actionEvent) {
                                    //new viewRegForm();
                                    //f.setVisible(false);
                                }
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

                        JLabel statement1 = new JLabel("Start of Class will be on March 15, 2021", SwingConstants.CENTER);
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
        //f.setResizable(false);
    }

    public static void main(String args[])
    {
        new enrollProcess();
    }
}
