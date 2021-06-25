package Homework5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerView {
    private JFrame frame;

    public TimerView(){
        frame = new JFrame();
        JButton createButton = createButton();

        frame.add(createButton);

        frame.setSize(400,500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }


    public static void main(String[] args) {
        new TimerView();
    }

    private JButton createButton(){
        JButton button = new JButton("Start");
        button.setBounds(250,100,100, 40);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("HI");
            }
        });

        return button;
    }

}
