package tw.org.iii;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel { //設計寫字版
public  MyPanel(){
    System.out.println("MyPanel()");
}

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint()");
    }

    @Override
    protected void paintComponent(Graphics g) { //graphics = canvas
        super.paintComponent(g);
        System.out.println("paintComponent()");

        Graphics2D g2d = (Graphics2D)g;

        setBackground(Color.black);

        g2d.setColor(Color.YELLOW); //畫筆的顏色
        g2d.setStroke(new BasicStroke(2)); //畫筆的粗細

//        g2d.drawOval(100, 100, 40, 40);
//        g2d.fillOval(200, 200, 40, 40);
        g2d.drawLine(0,0,300,300);
    }
}
