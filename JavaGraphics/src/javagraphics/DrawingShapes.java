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

public class DrawingShapes extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new DrawingShapes();
        canvas.setSize(1400, 800);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {

        //fillOval(int x, int y, int width, int height)
        g.fillOval(100, 100, 200, 200);
        
        //fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        g.fillArc(100, 400, 50, 50, 0, 90);
        
        //drawing star
        //fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
        int[] x  = {42,52,72,52,60,40,15,28,9,32,42};
        int[] y = {38,62,62,80,105,85,102,75,58,60,38};
        g.fillPolygon(x, y, 11);
        
        //rectangle using polygon
        int a[] = {400,450,400,450};
        int b[]= {400,400,450,450};
        g.fillPolygon(a, b, 4);
        
        
        //fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
        g.fillRoundRect(500, 100, 100, 100, 100, 100);

       
    }
}
