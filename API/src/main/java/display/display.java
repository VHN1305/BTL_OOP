package display;

import javax.swing.*;
import java.awt.*;

public class display extends JFrame {
    public display(){
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setSize(900,900);
        jFrame.setTitle("Menu");

        JLabel jLabel1 = new JLabel("Chọn URL:", JLabel.CENTER);
        JLabel jLabel2 = new JLabel("Chọn API:", JLabel.CENTER);
        jLabel1.setBounds(75,100,100,50);
        jLabel2.setBounds(75,200,100,50);
        jLabel1.setForeground(Color.BLACK);
        jLabel2.setForeground(Color.BLACK);
//        jLabel1.getVerticalAlignment();
        jLabel1.setOpaque(true);
        jLabel2.setOpaque(true);
        jLabel1.setBackground(Color.ORANGE);
        jLabel2.setBackground(Color.ORANGE);

        JComboBox jComboBox = new JComboBox<>();

        jFrame.add(jLabel1);
        jFrame.add(jLabel2);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

}
