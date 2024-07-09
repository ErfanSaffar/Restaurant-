import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Restaurant implements ActionListener {
    JFrame frame = new JFrame("Restaurant");
    JButton orders = new JButton("سفارشات");
    JButton customers = new JButton("مشتریان");
    JButton menu = new JButton("منو");
    JButton add = new JButton("افزودن غذا به منو");
    JButton signout = new JButton("خروج");
    Font font = new Font("Fixedsys Regular",Font.BOLD,20);
    JLabel text1 = new JLabel("خوش آمدید");

    public Restaurant(){
        /////////////////////////////////// Frame ///////////////////////////////////
        frame.setDefaultCloseOperation(3);
        frame.setSize(1200,800);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        frame.setVisible(true);

        /////////////////////////////////// Text ////////////////////////////////////
        text1.setFont(font);
        text1.setBounds(550 , 80 , 1000 , 100);
        frame.add(text1);

        //////////////////////////////// make buttons ///////////////////////////////
        menu.setBounds(150,500,200,80);
        menu.setFont(font);
        menu.addActionListener(this);
        frame.add(menu);

        orders.setBounds(360,500,200,80);
        orders.setFont(font);
        orders.addActionListener(this);
        orders.setBackground(Color.PINK);
        frame.add(orders);

        customers.setBounds(570,500,200,80);
        customers.setFont(font);
        customers.addActionListener(this);
        customers.setBackground(Color.green);
        frame.add(customers);

        signout.setBounds(780,500,200,80);
        signout.setFont(font);
        signout.addActionListener(this);
        signout.setBackground(Color.red);
        frame.add(signout);

        add.setBounds(465,350,200,80);
        add.setFont(font);
        add.addActionListener(this);
        add.setBackground(Color.orange);
        frame.add(add);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu) {
            ShowMenu x = new ShowMenu();
        } else if (e.getSource() == orders) {
            frame.dispose();
            ShowOrders x = new ShowOrders();
        } else if (e.getSource() == signout) {
            frame.dispose();
        } else if (e.getSource() == customers) {
            frame.dispose();
            ShowCustomers x = new ShowCustomers();
        } else if (e.getSource() == add) {
            frame.dispose();
            AddFood x = new AddFood();

            }
        }
    }

