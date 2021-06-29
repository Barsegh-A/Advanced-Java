package Homework5;

import Homework3.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerView {
    private JFrame frame;
    private JButton createButton;
    private JTextField minutesTextField;
    private JTextField secondsTextField;
    private JLabel timerLabel;
    private int minutes;
    private int seconds;
    private Timer timer;
    private Thread timerThread;

    public TimerView(){
        frame = new JFrame();
        createButton = createButton("Start", 200,150,100, 40);
        minutesTextField = getTextField("Minutes", 100, 100, 100, 40);
        secondsTextField = getTextField("Seconds", 300, 100, 100, 40);
        timerLabel = getTimerLabel("00:00", 200, 300, 200, 40);
        frame.add(createButton);
        frame.add(minutesTextField);
        frame.add(secondsTextField);
        frame.add(timerLabel);

        frame.setSize(500,500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }


    public static void main(String[] args) {
        new TimerView();
    }

    private JTextField getTextField(String text, int x, int y, int width, int height){
        JTextField textField = new JTextField(text);
        textField.setBounds(x, y, width, height);
        return textField;
    }

    private JLabel getTimerLabel(String text, int x, int y, int width, int height){
        JLabel timerLabel = new JLabel(text);
        timerLabel.setBounds(x, y, width, height);
        timerLabel.setFont(new Font(null, 0, 36));
        return timerLabel;
    }

    private JButton createButton(String text, int x, int y, int width, int height){
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);

        button.addActionListener(e -> {
            try {
                minutes = Integer.parseInt(minutesTextField.getText());
                seconds = Integer.parseInt(secondsTextField.getText());

                if (seconds >= 60){
                    minutes += seconds/60;
                    seconds = seconds%60;
                }

                timerThread = new Thread(this::startTimer);
                timerThread.start();
            } catch (Exception ex) {

            }
        });

        return button;
    }

    private synchronized void startTimer(){
        StringBuilder sb;
        while(minutes >= 0){
            while(seconds >= 0){
                sb = new StringBuilder();
                if(minutes < 10) sb.append(0);
                sb.append(minutes);
                sb.append(":");
                if(seconds < 10) sb.append(0);
                sb.append(seconds);
                seconds--;
                timerLabel.setText(sb.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            seconds = 59;
            minutes--;
        }
    }

}
