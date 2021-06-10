package ses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class assessment extends JFrame {
    JMenu menu;
    JMenuItem i1, i2, i3;
    private JFrame f;
    public JLabel studentNum;

    public assessment(){

            f = new JFrame("Enrollment System");
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
                                    b3.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent actionEvent) {
                                            new enrollProcess();
                                            f.setVisible(false);
                                        }
                                    });

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

                        JLabel sem = new JLabel("Receipt Number:");
                        sem.setBounds(320, 100, 100, 50);
                        f.add(sem);

                        JTextField semField = new JTextField("");
                        semField.setBounds(428, 115, 110, 20);
                        f.add(semField);

                        JButton Gobutton = new JButton("Go");
                        Gobutton.setBounds(545, 113, 50, 22);
                        f.add(Gobutton);

                        JLabel paymentStatus = new JLabel("");
                        paymentStatus.setBounds(1050, 100, 100, 50);
                        f.add(paymentStatus);

                        JLabel payment = new JLabel("");
                        payment.setBounds(1150, 100, 100, 50);
                        f.add(payment);

                        //value ng x para madaling baguhin
                        int x_title = 500;
                        int x_sub1 = 550;
                        int x_sub2 = 920;

                            JLabel tuition_fee = new JLabel("");
                            tuition_fee.setBounds(x_title, 135, 100, 50);
                            f.add(tuition_fee);

                                JLabel description1 = new JLabel("");
                                description1.setBounds(x_sub1, 155, 70, 50);
                                f.add(description1);

                                JLabel tf = new JLabel("");
                                tf.setBounds(x_sub1, 170, 150, 50);
                                f.add(tf);

                                JLabel amount = new JLabel("");
                                amount.setBounds(x_sub2, 155, 70, 50);
                                f.add(amount);

                                JLabel a1 = new JLabel("");
                                a1.setBounds(x_sub2, 170, 150, 50);
                                f.add(a1);

                                JLabel a2 = new JLabel("");
                                a2.setBounds(x_sub2, 185, 150, 50);
                                a2.setForeground(Color.RED);
                                f.add(a2);

                            JLabel miscellaneous_fee = new JLabel("");
                            miscellaneous_fee.setBounds(x_title, 205, 150, 50);
                            f.add(miscellaneous_fee);

                                JLabel description2 = new JLabel("");
                                description2.setBounds(x_sub1, 220, 70, 50);
                                f.add(description2);

                                JLabel amount2 = new JLabel("");
                                amount2.setBounds(x_sub2, 220, 70, 50);
                                f.add(amount2);

                                JLabel cultural = new JLabel("");
                                cultural.setBounds(x_sub1, 235, 150, 50);
                                f.add(cultural);

                                JLabel a3 = new JLabel("");
                                a3.setBounds(x_sub2, 235, 150, 50);
                                f.add(a3);

                                JLabel library_fee = new JLabel("");
                                library_fee.setBounds(x_sub1, 250, 150, 50);
                                f.add(library_fee);

                                JLabel a4 = new JLabel("");
                                a4.setBounds(x_sub2, 250, 150, 50);
                                f.add(a4);

                                JLabel medical_fee = new JLabel("");
                                medical_fee.setBounds(x_sub1, 265, 150, 50);
                                f.add(medical_fee);

                                JLabel a5 = new JLabel("");
                                a5.setBounds(x_sub2, 265, 150, 50);
                                f.add(a5);

                                JLabel guidance_fee = new JLabel("");
                                guidance_fee.setBounds(x_sub1, 280, 150, 50);
                                f.add(guidance_fee);

                                JLabel a6 = new JLabel("");
                                a6.setBounds(x_sub2, 280, 150, 50);
                                f.add(a6);

                                JLabel athletic_fee = new JLabel("");
                                athletic_fee.setBounds(x_sub1, 295, 150, 50);
                                f.add(athletic_fee);

                                JLabel a7 = new JLabel("");
                                a7.setBounds(x_sub2, 295, 150, 50);
                                f.add(a7);

                                JLabel student_welfare = new JLabel("");
                                student_welfare.setBounds(x_sub1, 310, 150, 50);
                                f.add(student_welfare);

                                JLabel a8 = new JLabel("");
                                a8.setBounds(x_sub2, 310, 150, 50);
                                f.add(a8);

                                JLabel registration_fee = new JLabel("");
                                registration_fee.setBounds(x_sub1, 325, 150, 50);
                                f.add(registration_fee);

                                JLabel a9 = new JLabel("");
                                a9.setBounds(x_sub2, 325, 150, 50);
                                f.add(a9);

                                JLabel a10 = new JLabel("");
                                a10.setBounds(x_sub2, 340, 150, 50);
                                a10.setForeground(Color.RED);
                                f.add(a10);

                            JLabel lab_fee = new JLabel("");
                            lab_fee.setBounds(x_title, 360, 150, 50);
                            f.add(lab_fee);

                                JLabel description3 = new JLabel("");
                                description3.setBounds(x_sub1, 375, 70, 50);
                                f.add(description3);

                                JLabel amount3 = new JLabel("");
                                amount3.setBounds(x_sub2, 375, 70, 50);
                                f.add(amount3);

                                JLabel other = new JLabel("");
                                other.setBounds(x_sub1, 390, 200, 50);
                                f.add(other);

                                JLabel a11 = new JLabel("");
                                a11.setBounds(x_sub2, 390, 70, 50);
                                f.add(a11);

                                JLabel comp_subj = new JLabel("");
                                comp_subj.setBounds(x_sub1, 405, 250, 50);
                                f.add(comp_subj);

                                JLabel a12 = new JLabel("");
                                a12.setBounds(x_sub2, 405, 70, 50);
                                f.add(a12);

                                JLabel a13 = new JLabel("");
                                a13.setBounds(x_sub2, 420, 70, 50);
                                a13.setForeground(Color.RED);
                                f.add(a13);

                            JLabel other_fee = new JLabel("");
                            other_fee.setBounds(x_title, 440, 150, 50);
                            f.add(other_fee);

                                JLabel description4 = new JLabel("");
                                description4.setBounds(x_sub1, 455, 70, 50);
                                f.add(description4);

                                JLabel amount4 = new JLabel("");
                                amount4.setBounds(x_sub2, 455, 70, 50);
                                f.add(amount4);

                                JLabel nstp = new JLabel("");
                                nstp.setBounds(x_sub1, 470, 70, 50);
                                f.add(nstp);

                                JLabel a14 = new JLabel("");
                                a14.setBounds(x_sub2, 470, 70, 50);
                                f.add(a14);

                                JLabel dev_fund = new JLabel("");
                                dev_fund.setBounds(x_sub1, 485, 150, 50);
                                f.add(dev_fund);

                                JLabel a15 = new JLabel("");
                                a15.setBounds(x_sub2, 485, 70, 50);
                                f.add(a15);

                                JLabel pf = new JLabel("");
                                pf.setBounds(x_sub1, 500, 150, 50);
                                f.add(pf);

                                JLabel a16 = new JLabel("");
                                a16.setBounds(x_sub2, 500, 70, 50);
                                f.add(a16);

                                JLabel a17 = new JLabel("");
                                a17.setBounds(x_sub2, 515, 70, 50);
                                a17.setForeground(Color.red);
                                f.add(a17);

                                JLabel total = new JLabel("");
                                total.setBounds(x_sub1, 540, 150, 50);
                                total.setForeground(Color.red);
                                total.setFont(new Font("Sans", Font.BOLD, 15));
                                f.add(total);

                                JLabel a18 = new JLabel("");
                                a18.setBounds(x_sub2, 540, 70, 50);
                                a18.setForeground(Color.red);
                                a18.setFont(new Font("Sans", Font.BOLD, 15));
                                f.add(a18);

        Gobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                paymentStatus.setText("Payment Status:");
                payment.setText("Fully paid");
                tuition_fee.setText("TUITION FEE");
                description1.setText("Description");
                tf.setText("Tuition Fee(24.00 units)");
                amount.setText("Amount");
                a1.setText("7032.00");
                a2.setText("7032.00");
                miscellaneous_fee.setText("MISCELLANEOUS FEE ");
                description2.setText("Description");
                amount2.setText("Amount");
                cultural.setText("Cultural Activity");
                a3.setText("74.00");
                library_fee.setText("library Fee");
                a4.setText("732.00");
                medical_fee.setText("Medical/Dental Fee");
                a5.setText("293.00");
                guidance_fee.setText("Guidance Fee");
                a6.setText("146.00");
                athletic_fee.setText("Athletic Fee with PE");
                a7.setText("293.00");
                student_welfare.setText("Student Welfare");
                a8.setText("74.00");
                registration_fee.setText("Registration Fee");
                a9.setText("74.00");
                a10.setText("1686.00");
                lab_fee.setText("LABORATORY FEE ");
                description3.setText("Description");
                amount3.setText("Amount");
                other.setText("All other subjects with Laboratory");
                a11.setText("438.00");
                comp_subj.setText("Computer Subjects with Hands-on/Thesis");
                a12.setText("1755.00");
                a13.setText("2193.00");
                other_fee.setText("OTHER FEE ");
                description4.setText("Description");
                amount4.setText("Amount");
                nstp.setText("NSTP");
                a14.setText("330.00");
                dev_fund.setText("Development Fund");
                a15.setText("146.00");
                pf.setText("Ang Pamantasan Fee");
                a16.setText("50.00");
                a17.setText("526.00");
                total.setText("Total Amount");
                a18.setText("11,437.00");

            }
        });


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
            new assessment();
        }
}
