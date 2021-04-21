/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingandawttest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class WelcomeFrame {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Manual Frame");
        jFrame.setSize(800, 500);
        //jFrame.setLocationRelativeTo(jFrame);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Adding Panel
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        
        //Nested JPanel
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        jPanel1.setBackground(Color.GREEN);
        
        //Adding Image
        BufferedImage img = ImageIO.read(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\Object-Oriented-Programming\\Object-Oriented-Programming\\BuiltinFrameVsFrame\\src\\swingandawttest\\OOP.png"));
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        jPanel1.add(imgLabel);
        jPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Welcome Label
        JLabel wlcmLabel = new JLabel("Welcome to Java GUI ");
        wlcmLabel.setFont(new Font("Verdana", Font.PLAIN, 28));
       // jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
        jPanel2.add(wlcmLabel);

        
        //Enter Button
        JButton enterBtn = new JButton("Enter to Our System");
        enterBtn.setFont(new Font("Arial", Font.PLAIN, 30));
        jPanel2.add(enterBtn);
        enterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 jFrame.dispose();
                 JSecondFrame secondFrame = new JSecondFrame();
                 secondFrame.setVisible(true);
                 
            }
        });
        
        //Adding panels to container panel
        //jPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanel.add(jPanel1);
        jPanel.add(jPanel2);
        
        /**
         * Panel Border
         */
        //jPanel1.setBorder(BorderFactory.createTitledBorder("demo"));
        
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
        
                
    }
    
}
