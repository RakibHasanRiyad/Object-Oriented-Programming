/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagraphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
import java.awt.*;
import javax.swing.JFrame;

public class Flags extends Canvas {

    public void paint(Graphics g) {

         //Colors the background white - makes a rectangle same size as canvas that is white
		 g.setColor(Color.GREEN);
		 g.fillRect(0, 0, 600, 400);
		 //Makes the red circle for the flag
		 g.setColor(Color.RED);
		 g.fillOval(200, 100, 200, 200);

    }

    public static void main(String[] args) {
        Flags m = new Flags();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(600, 400);
        //f.setLayout(null);  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
