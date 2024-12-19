package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame  {
    //-------Obj-------//
    JFrame frame = new JFrame();
    RoundButton UserBtnLogin = new RoundButton();
    RoundButton AdminBtnLogin = new RoundButton();
    JLabel labelUser = new JLabel("Customer");
    JLabel labelAdmin = new JLabel("Manager");

    public MainFrame() {
        //-------Modifies-------//
        frame.setTitle("ITE Restaurant");
        frame.setSize(600, 800);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0x3db3ac));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //-------User Button Login-------//
        UserBtnLogin.setBounds(420, 20, 150, 150);
//        ImageIcon iconUser = new ImageIcon("C:\\Users\\CodeFather\\Pictures\\ImageProject-3-\\profile.png");
//        Image imgUser = iconUser.getImage();
//        Image scaledImgUser = imgUser.getScaledInstance(UserBtnLogin.getWidth(), UserBtnLogin.getHeight(), Image.SCALE_AREA_AVERAGING);
//        iconUser = new ImageIcon(scaledImgUser);
//        UserBtnLogin.setIcon(iconUser);
        //-------Admin Button Login-------//
        AdminBtnLogin.setBounds(25, 550, 150, 150);
//        ImageIcon iconAdmin = new ImageIcon("C:\\Users\\CodeFather\\Pictures\\ImageProject-3-\\profile.png");
//        Image imgAdmin = iconAdmin.getImage();
//        Image scaledImgAdmin = imgAdmin.getScaledInstance(AdminBtnLogin.getWidth(), AdminBtnLogin.getHeight(), Image.SCALE_AREA_AVERAGING);
//        iconAdmin = new ImageIcon(scaledImgAdmin);
//        AdminBtnLogin.setIcon(iconAdmin);

        //-------User Label Login-------//
        labelUser.setBounds(433, 170, 160, 40);
        labelUser.setFont(new Font("Arial", Font.BOLD, 28));
        //-------Admin Label Login-------//
        labelAdmin.setBounds(45, 700, 160, 40);
        labelAdmin.setFont(new Font("Arial", Font.BOLD, 28));

        frame.add(UserBtnLogin);
        frame.add(AdminBtnLogin);
        frame.add(labelAdmin);
        frame.add(labelUser);
        frame.setVisible(true);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);

        // تعيين لون الخط
        g.setColor(Color.BLACK);

        // رسم الخط من النقطة (50, 50) إلى النقطة (250, 250)
        g.drawLine(50, 50, 250, 250);
    }
}
