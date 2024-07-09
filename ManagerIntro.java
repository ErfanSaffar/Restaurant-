import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ManagerIntro implements ActionListener {

    JFrame frame = new JFrame("Restaurant");
    JButton signIn = new JButton("ورود");
    JButton back = new JButton("بازگشت");
    Font font = new Font("Fixedsys Regular",Font.ITALIC,20);
    TextField textField1 = new TextField();
    TextField textField2 =new TextField();
    JLabel text = new JLabel("به پنل مدیریت وارد شدید");
    JLabel text1 = new JLabel("شناسه کاربری");
    JLabel text2 = new JLabel("رمز عبور");


    public ManagerIntro(){
        /////////////////////////////////// Frame ///////////////////////////////////
        frame.setDefaultCloseOperation(3);
        frame.setSize(1200,800);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        frame.setVisible(true);

        /////////////////////////////////// Text ////////////////////////////////////
        text.setFont(font);
        text.setBounds(400 , 80 , 1000 , 100);
        frame.add(text);
        text1.setFont(font);
        text1.setBounds(160 , 300 , 200 , 100);
        frame.add(text1);
        text2.setFont(font);
        text2.setBounds(200, 400 , 200 , 100);
        frame.add(text2);

        //////////////////////////////// make buttons ///////////////////////////////
        back.setBounds(70,550,300,100);
        back.setFont(font);
        back.addActionListener(this);
        frame.add(back);

        signIn.setBounds(700,550,300,100);
        signIn.setFont(font);
        signIn.addActionListener(this);
        frame.add(signIn);

        ///////////////////////////////// TextFields ////////////////////////////////////
        textField1.setBounds(700,330,300,40);
        textField1.setFont(font);
        frame.add(textField1);
        textField2.setBounds(700,430,300,40);
        textField2.setFont(font);
        frame.add(textField2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Intro x = new Intro();
        }
        else {
            try {
                FileReader fileReader = new FileReader("signin.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String name = bufferedReader.readLine();
                String password = bufferedReader.readLine();
                if (name.equals(textField1.getText()) && password.equals(textField2.getText())){
                    frame.dispose();
                    Restaurant x = new Restaurant();
                }
                bufferedReader.close();

            } catch (FileNotFoundException ex) {
                System.out.println("HI");
            } catch (IOException ex) {
                System.out.println("hey");
            }
        }
    }
}
