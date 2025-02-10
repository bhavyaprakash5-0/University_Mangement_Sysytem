package project;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    public Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        add(Image);
        t = new Thread(this);
        t.start();
        setLocation(450,120);
        setSize(450,450);
        setVisible(true);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            setVisible(false);
            // call next frame
            new Login();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
