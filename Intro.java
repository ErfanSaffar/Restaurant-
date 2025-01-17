import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Intro implements ActionListener {

    JFrame frame = new JFrame("Restaurant");
    Font font = new Font("Fixedsys Regular",Font.ITALIC,20);
    JButton manager = new JButton("مدیریت");
    JButton customer = new JButton("پنل سفارش غذا");
    JLabel text = new JLabel("به کافه رامین خوش آمدید");

    public Intro(){
        /////////////////////////////////// Frame ///////////////////////////////////
        frame.setDefaultCloseOperation(3);
        frame.setSize(1200,800);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(195, 94, 94));
        frame.setVisible(true);

        /////////////////////////////////// Text ////////////////////////////////////
        text.setFont(font);
        text.setBounds(500 , 80 , 1000 , 100);
        frame.add(text);

        ///////////////////////// make buttons //////////////////////////
        manager.setBounds(150,500,300,100);
        manager.setFont(font);
        manager.addActionListener(this);
        frame.add(manager);

        customer.setBounds(700,500,300,100);
        customer.setFont(font);
        customer.addActionListener(this);
        frame.add(customer);

    }

    public static void main(String[] args) {
        Intro x = new Intro();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==manager){
            frame.dispose();
            ManagerIntro x = new ManagerIntro();
        }
        else if(e.getSource()==customer){
            frame.dispose();
            CoustomerFrame x = new CoustomerFrame();
        }
    }
}