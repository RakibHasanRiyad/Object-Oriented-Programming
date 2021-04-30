/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_package;

/**
 *
 * @author HP
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class JProgressBarDemo {

    public static void main(String[] args) {
        final Timer timer;
        final JProgressBar progressBar = new JProgressBar();
        final JButton button = new JButton("Start");
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.add(progressBar);
        f.add(button);

        ActionListener updateProBar = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                int val = progressBar.getValue();
                if (val >= 100) {
                    //  timer.stop();
                    button.setText("End");
                    return;
                }
                progressBar.setValue(++val);
            }
        };
        timer = new Timer(50, updateProBar);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timer.isRunning()) {
                    timer.stop();
                    button.setText("Start");
                } else if (button.getText() != "End") {
                    timer.start();
                    button.setText("Stop");
                }
            }
        });
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
