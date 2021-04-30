/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagraphics;

/**
 *
 * @author HP
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flags2D extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawString("Flags of Different Countries\n", 100, 20);

        
        //flag of Bangladesh
        g2d.setColor(new Color(0, 255, 0));
        g2d.fillRect(10, 45, 90, 60);
        g2d.setColor(new Color(255, 0, 0));
        g2d.fillOval(30, 55, 40, 40);
        
        
        //flag of India
        g2d.setColor(new Color(255,143,28));
        g2d.fillRect(150, 45, 90, 20);
        g2d.setColor(new Color(255, 255, 215));
        g2d.fillRect(150, 65, 90, 20);
        g2d.setColor(new Color(37,14,98));
        g2d.fillOval(185, 67, 15, 15);
        g2d.setColor(new Color(80,158,47));
        g2d.fillRect(150, 85, 90, 20);
        
        //flag of India
        // draw the green space 
        g2d.setColor(Color.blue); 
        g2d.fillRect(290, 0, 600, 600);
        // draw the green space
        g2d.setColor(Color.GREEN); 
        g2d.fillRect(340, 50, 150, 200);
        // draw the white space
        g2d.setColor(Color.WHITE); 
        g2d.fillRect(200, 50, 150, 200);

    }

    public static void main(String[] args) {
        Flags2D rects = new Flags2D();
        JFrame frame = new JFrame("Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rects);
        frame.setSize(360, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
