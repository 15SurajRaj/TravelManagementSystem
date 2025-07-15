import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame {
    String username;

    public static void main(String[] args) {
        new Home("").setVisible(true);
    }

    public Home(String username) {
        super("Tourist Info Management System");
        this.username = username;
        setForeground(Color.CYAN);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

        JLabel l1 = new JLabel("Tourist Info Management System");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
        l1.setBounds(300, 50, 1000, 100);
        NewLabel.add(l1);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu m1 = new JMenu("CUSTOMER");
        m1.setForeground(Color.BLUE);
        menuBar.add(m1);

        JMenuItem mi1 = new JMenuItem("ADD CUSTOMER");
        JMenuItem mi2 = new JMenuItem("UPDATE CUSTOMER DETAIL");
        JMenuItem mi3 = new JMenuItem("VIEW CUSTOMER DETAILS");
        JMenuItem mi4 = new JMenuItem("DELETE CUSTOMER DETAILS");

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        mi1.addActionListener(ae -> {
            try {
                new AddCustomer(username).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mi2.addActionListener(ae -> {
            try {
                new UpdateCustomer(username).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mi3.addActionListener(ae -> {
            try {
                // ⚠️ Ensure Signup is the intended class here
                new Signup().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mi4.addActionListener(ae -> {
            try {
                new DeleteCustomer().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        JMenu m2 = new JMenu("PACKAGES");
        m2.setForeground(Color.RED);
        menuBar.add(m2);

        JMenuItem mi6 = new JMenuItem("CHECK PACKAGE");
        JMenuItem mi7 = new JMenuItem("BOOK PACKAGE");
        JMenuItem mi5 = new JMenuItem("VIEW PACKAGE");

        m2.add(mi6);
        m2.add(mi7);
        m2.add(mi5);

        mi6.addActionListener(ae -> {
            try {
                new CheckPackage().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mi7.addActionListener(ae -> {
            try {
                new BookPackage(username).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mi5.addActionListener(ae -> {
            try {
                new ViewPackage(username).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        JMenu m3 = new JMenu("HOTELS");
        m3.setForeground(Color.BLUE);
        menuBar.add(m3);

        JMenuItem mi8 = new JMenuItem("BOOK HOTELS");
        JMenuItem mi9 = new JMenuItem("VIEW HOTELS");
        JMenuItem mi10 = new JMenuItem("VIEW BOOKED HOTEL");

        m3.add(mi8);
        m3.add(mi9);
        m3.add(mi10);

        mi8.addActionListener(ae -> {
            try {
                new BookHotel(username).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mi9.addActionListener(ae -> {
            try {
                new CheckHotels().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mi10.addActionListener(ae -> {
            try {
                new ViewBookedHotel(username).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        JMenu m4 = new JMenu("DESTINATION");
        m4.setForeground(Color.RED);
        menuBar.add(m4);

        JMenuItem mi11 = new JMenuItem("DESTINATION");
        m4.add(mi11);

        mi11.addActionListener(ae -> {
            try {
                new Destination().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.BLUE);
        menuBar.add(m5);

        JMenuItem mi12 = new JMenuItem("PAY USING PAYTM");
        m5.add(mi12);

        mi12.addActionListener(ae -> {
            try {
                new Payment().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.RED);
        menuBar.add(m6);

        JMenuItem mi13 = new JMenuItem("NOTEPAD");
        JMenuItem mi14 = new JMenuItem("CALCULATOR");

        m6.add(mi13);
        m6.add(mi14);

        mi13.addActionListener(ae -> {
            try {
                new ProcessBuilder("notepad.exe").start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mi14.addActionListener(ae -> {
            try {
                new ProcessBuilder("calc.exe").start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.BLUE);
        menuBar.add(m7);

        JMenuItem mi15 = new JMenuItem("ABOUT");
        m7.add(mi15);

        mi15.addActionListener(ae -> {
            try {
                new About().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
}
