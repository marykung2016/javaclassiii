//package tw.org.iii;
//
//public class Mary27{
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//    public class Mary27 extends JFrame implements ActionListener{ //10
//
//    private JButton newFile, openFile, saveFile, saveAsFile, exit;//4. 宣告按鈕(配置裡的物件)
//    private JTextArea editor; //8.宣告中間文字編輯器
//    public Mary27(){ //2.定義建構式,進行初始化
//        //super();
//        super("視窗練習");
//        setLayout(new BorderLayout()); //3.
//
//        newFile = new JButton("New"); //5.配置裡的物件具體化出來
//        openFile = new JButton("Open"); //5.配置裡的物件具體化出來
//        saveFile = new JButton("Save"); //5.配置裡的物件具體化出來
//        saveAsFile = new JButton("Save as"); //5.配置裡的物件具體化出來
//        exit = new JButton("Exit"); //5.配置裡的物件具體化出來
//        editor = new JTextArea(); //8. 配置裡的物件具體化出來
//
////        newFile.addActionListener(new MyListener()); //9. 92
////        newFile.addActionListener(this); //10.
//        newFile.addActionListener(new ActionListener() { //11
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//
////以上是north的布局,流水式的布局;以下改為隔間方式布局
//
//        JPanel top = new JPanel(new FlowLayout()); //6.
//        top.add(newFile);top.add(openFile);top.add(saveFile); //6.將東西丟到top隔間裡
//        top.add(saveAsFile);top.add(exit); //6.將東西丟到top隔間裡
//
//        add(top,BorderLayout.NORTH); //7.將top隔間放到north裡面
//        add(editor, BorderLayout.CENTER); //8.將center隔間放到中間
//
//
//        setSize(640, 480); //3.
//        setVisible(true); //3.
//        setDefaultCloseOperation(EXIT_ON_CLOSE); //3.
//
//    }
//    public static void main(String[] args){
//        new Mary27(); //1.建立物件實體
//    }
//
//    public void actionPerformed(ActionEvent e){
//        System.out.println("B");
//    }
//
//}
//class MyListener implements ActionListener{ //91.定義類別
//    @Override
//    public void actionPerformed(ActionEvent e) { //找API
//        System.out.println("A");
//
//    }
//}
