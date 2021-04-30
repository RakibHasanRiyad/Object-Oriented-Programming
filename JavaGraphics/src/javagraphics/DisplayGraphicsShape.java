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
import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphicsShape extends Canvas {

    public void paint(Graphics g) {
        //drawing String
        g.drawString("Hello", 40, 40);
        
        //setting background
        setBackground(Color.WHITE);
        
        //drawing rectangle with fill
        g.fillRect(130, 30, 100, 80);
        
        //drawing 
        g.drawOval(30, 130, 50, 60);
        setForeground(Color.RED);
        g.fillOval(130, 130, 50, 60);
        
        //drawing ARC
        g.drawArc(30, 200, 40, 50, 90, 60);
        //setForeground(Color.BLUE);
        //drawing ARC with fill
        g.fillArc(30, 130, 40, 50, 180, 40);

    }

    
    public static void main(String[] args) {
        DisplayGraphicsShape m = new DisplayGraphicsShape();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);
    }

}
