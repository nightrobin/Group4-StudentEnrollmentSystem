package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewInfo extends JFrame{
    JMenu menu;
    JMenuItem i1, i2, i3;
    public JLabel studentNum;

    public viewInfo(String studentNum){

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
                            new login();
                            f.dispose();
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

                    JLabel user = new JLabel("Logged in as Student No. " + studentNum);
                    user.setBounds(1000, 0, 300, 30);
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

                        JButton b2 = new JButton("UPDATE INFORMATION");
                        b2.setForeground(Color.WHITE);
                        b2.setBounds(   9, 100, 250, 65);
                        b2.setBackground(Color.decode("#47597e"));
                        b2.setFont(new Font("Sans", Font.BOLD, 17));
                        f.add(b2);
                            b2.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent actionEvent) {
                                    new updateInfo(studentNum);
                                    f.dispose();
                                }
                            });

                        JButton b3 = new JButton("CHANGE PASSWORD");
                        b3.setForeground(Color.WHITE);
                        b3.setBounds(   9, 180, 250, 65);
                        b3.setBackground(Color.decode("#47597e"));
                        b3.setFont(new Font("Sans", Font.BOLD, 17));
                        f.add(b3);
                            b3.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent actionEvent) {
                                    new changePassword(studentNum);
                                    f.dispose();
                                }
                            });

                        JButton backButton = new JButton("BACK");
                        backButton.setForeground(Color.WHITE);
                        backButton.setBounds(   9, 615, 250, 35);
                        backButton.setBackground(Color.decode("#b2ab8c"));
                        backButton.setForeground(Color.WHITE);
                        backButton.setFont(new Font("Sans", Font.BOLD, 17));
                        f.add(backButton);
                        backButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                new logIntabs(studentNum);
                                f.dispose();
                            }
                        });

                JPanel bodyPanel = new JPanel();
                bodyPanel.setBounds(303,103,930,530);
                bodyPanel.setBackground(Color.WHITE);

                    JPanel panelBorder = new JPanel();
                    panelBorder.setBounds(350, 145, 830,388);
                    panelBorder.setBackground(Color.WHITE);
                    panelBorder.setBorder(BorderFactory.createTitledBorder("View my Personal Information"));

                        Font font1 = new Font("Serif", Font.BOLD, 22);
                        Font font2 = new Font("SansSerif", Font.BOLD, 14);

                        JLabel studentnumLabel = new JLabel("STUDENT PROFILE");
                        studentnumLabel.setBounds(458, 250, 250, 50);
                        studentnumLabel.setFont(font1);
                        studentnumLabel.setForeground(Color.decode("#293b5f"));
                        f.add(studentnumLabel);

                        JLabel notePass = new JLabel("<html><center>Your college shall be determined from the degree program indicated  here. If the degree program is erroneous, please contact your respective college's OCS. If all details shown here are correct, you may proceed to the Pre-enlistment Page by clicking the link on the menu bar.</html>");
                        notePass.setFont(new Font("Sans", Font.PLAIN, 13));
                        notePass.setBounds(380, 260, 345, 170);
                        f.add(notePass);

                        int x = 760;
                        int x2 = 920;

                        JLabel SNLabel = new JLabel("Student Number:");
                        SNLabel.setBounds(x, 170, 150, 50);
                        SNLabel.setFont(font2);
                        SNLabel.setForeground(Color.white);
                        f.add(SNLabel);

                        JLabel lastName = new JLabel("Last Name:");
                        lastName.setBounds(x, 190, 150, 50);
                        lastName.setFont(font2);
                        lastName.setForeground(Color.white);
                        f.add(lastName);

                        JLabel firstName = new JLabel("First Name:");
                        firstName.setBounds(x, 210, 150, 50);
                        firstName.setFont(font2);
                        firstName.setForeground(Color.white);
                        f.add(firstName);

                        JLabel middleName = new JLabel("Middle Name:");
                        middleName.setBounds(x, 230, 150, 50);
                        middleName.setFont(font2);
                        middleName.setForeground(Color.white);
                        f.add(middleName);

                        JLabel pedigree = new JLabel("Pedigree:");
                        pedigree.setBounds(x, 250, 150, 50);
                        pedigree.setFont(font2);
                        pedigree.setForeground(Color.white);
                        f.add(pedigree);

                        JLabel gender = new JLabel("Gender:");
                        gender.setBounds(x, 270, 150, 50);
                        gender.setFont(font2);
                        gender.setForeground(Color.white);
                        f.add(gender);

                        JLabel civilStatus = new JLabel("Civil Status:");
                        civilStatus.setBounds(x, 290, 150, 50);
                        civilStatus.setFont(font2);
                        civilStatus.setForeground(Color.white);
                        f.add(civilStatus);

                        JLabel citizenship = new JLabel("Citizenship:");
                        citizenship.setBounds(x, 310, 150, 50);
                        citizenship.setFont(font2);
                        citizenship.setForeground(Color.white);
                        f.add(citizenship);

                        JLabel studentType = new JLabel("Student Type:");
                        studentType.setBounds(x, 330, 150, 50);
                        studentType.setFont(font2);
                        studentType.setForeground(Color.white);
                        f.add(studentType);

                        JLabel regStatus = new JLabel("Registration Status:");
                        regStatus.setBounds(x, 350, 150, 50);
                        regStatus.setFont(font2);
                        regStatus.setForeground(Color.white);
                        f.add(regStatus);

                        JLabel degreeProgram = new JLabel("Degree Program:");
                        degreeProgram.setBounds(x, 370, 150, 50);
                        degreeProgram.setFont(font2);
                        degreeProgram.setForeground(Color.white);
                        f.add(degreeProgram);

                        JLabel yearLevel = new JLabel("Year Level:");
                        yearLevel.setBounds(x, 390, 150, 50);
                        yearLevel.setFont(font2);
                        yearLevel.setForeground(Color.white);
                        f.add(yearLevel);

                        JLabel schoolEmail = new JLabel("Official School Email:");
                        schoolEmail.setBounds(x, 410, 150, 50);
                        schoolEmail.setFont(font2);
                        schoolEmail.setForeground(Color.white);
                        f.add(schoolEmail);

                        JLabel personalEmail = new JLabel("Personal Email:");
                        personalEmail.setBounds(x, 430, 150, 50);
                        personalEmail.setFont(font2);
                        personalEmail.setForeground(Color.white);
                        f.add(personalEmail);

                        JLabel cpNumber = new JLabel("Cellphone Number:");
                        cpNumber.setBounds(x, 450, 150, 50);
                        cpNumber.setFont(font2);
                        cpNumber.setForeground(Color.white);
                        f.add(cpNumber);

                            JLabel SNLabel2 = new JLabel("...");
                            SNLabel2.setBounds(x2, 170, 150, 50);
                            SNLabel2.setFont(font2);
                            SNLabel2.setForeground(Color.white);
                            f.add(SNLabel2);

                            JLabel lastName2 = new JLabel("...");
                            lastName2.setBounds(x2, 190, 150, 50);
                            lastName2.setFont(font2);
                            lastName2.setForeground(Color.white);
                            f.add(lastName2);

                            JLabel firstName2 = new JLabel("...");
                            firstName2.setBounds(x2, 210, 150, 50);
                            firstName2.setFont(font2);
                            firstName2.setForeground(Color.white);
                            f.add(firstName2);

                            JLabel middleName2 = new JLabel("...");
                            middleName2.setBounds(x2, 230, 150, 50);
                            middleName2.setFont(font2);
                            middleName2.setForeground(Color.white);
                            f.add(middleName2);

                            JLabel pedigree2 = new JLabel("...");
                            pedigree2.setBounds(x2, 250, 150, 50);
                            pedigree2.setFont(font2);
                            pedigree2.setForeground(Color.white);
                            f.add(pedigree2);

                            JLabel gender2 = new JLabel("...");
                            gender2.setBounds(x2, 270, 150, 50);
                            gender2.setFont(font2);
                            gender2.setForeground(Color.white);
                            f.add(gender2);

                            JLabel civilStatus2 = new JLabel("...");
                            civilStatus2.setBounds(x2, 290, 150, 50);
                            civilStatus2.setFont(font2);
                            civilStatus2.setForeground(Color.white);
                            f.add(civilStatus2);

                            JLabel citizenship2 = new JLabel("...");
                            citizenship2.setBounds(x2, 310, 150, 50);
                            citizenship2.setFont(font2);
                            citizenship2.setForeground(Color.white);
                            f.add(citizenship2);

                            JLabel studentType2 = new JLabel("...");
                            studentType2.setBounds(x2, 330, 150, 50);
                            studentType2.setFont(font2);
                            studentType2.setForeground(Color.white);
                            f.add(studentType2);

                            JLabel regStatus2 = new JLabel("...");
                            regStatus2.setBounds(x2, 350, 150, 50);
                            regStatus2.setFont(font2);
                            regStatus2.setForeground(Color.white);
                            f.add(regStatus2);

                            JLabel degreeProgram2 = new JLabel("...");
                            degreeProgram2.setBounds(x2, 370, 150, 50);
                            degreeProgram2.setFont(font2);
                            degreeProgram2.setForeground(Color.white);
                            f.add(degreeProgram2);

                            JLabel yearLevel2 = new JLabel("...");
                            yearLevel2.setBounds(x2, 390, 150, 50);
                            yearLevel2.setFont(font2);
                            yearLevel2.setForeground(Color.white);
                            f.add(yearLevel2);

                            JLabel schoolEmail2 = new JLabel("...");
                            schoolEmail2.setBounds(x2, 410, 150, 50);
                            schoolEmail2.setFont(font2);
                            schoolEmail2.setForeground(Color.white);
                            f.add(schoolEmail2);

                            JLabel personalEmail2 = new JLabel("...");
                            personalEmail2.setBounds(x2, 430, 150, 50);
                            personalEmail2.setFont(font2);
                            personalEmail2.setForeground(Color.white);
                            f.add(personalEmail2);

                            JLabel cpNumber2 = new JLabel("...");
                            cpNumber2.setBounds(x2, 450, 150, 50);
                            cpNumber2.setFont(font2);
                            cpNumber2.setForeground(Color.white);
                            f.add(cpNumber2);

                    JPanel background = new JPanel();
                    background.setBounds(744, 175, 400,330);
                    background.setBackground(Color.decode("#b2ab8c"));
                    f.add(background);

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