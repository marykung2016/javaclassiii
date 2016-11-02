package tw.org.iii;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mary20 extends JFrame {
    private JButton open, save, exit;

    public Mary20(){
        //super();
        super("my Jframe");
        setSize(640, 480);
        setLayout(new FlowLayout());

        open = new JButton("Open");
        save = new JButton("Save");
        exit = new JButton("Exit");
        add(open); add(save); add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        setVisible(true);
    }
    public static void main(String[] args){
        Mary20 b1 = new Mary20();

    }
}
