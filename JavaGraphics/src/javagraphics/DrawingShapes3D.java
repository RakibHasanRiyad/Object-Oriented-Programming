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
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawingShapes3D extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing 3D");
        Canvas canvas = new DrawingShapes3D();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {

        
        g.setColor(new Color(255,202,205));
        g.fill3DRect(10, 10, 100, 100, false);
        g.fill3DRect(12, 12, 100 - 10, 100 - 10, true);
        
        //
        g.setColor(new Color(255,202,205));
        g.fill3DRect(10, 170, 100, 100, false);
        g.fill3DRect(12, 170, 100 - 10, 100 - 10, true);
        
         //
        g.setColor(new Color(255,202,205));
        int x [] = {300, 375, 450};
        int y [] = {300, 150, 300}; 
        g.fillPolygon(x, y, 3);
        g.setColor(new Color(255,222,205));
        int x1 [] = {305, 385, 460};
        int y1 [] = {300, 150, 300}; 
        g.fillPolygon(x1, y1, 3);
        
        g.fill3DRect(12, 170, 100 - 10, 100 - 10, true);
        
        
        
        
        
        
    }
}
