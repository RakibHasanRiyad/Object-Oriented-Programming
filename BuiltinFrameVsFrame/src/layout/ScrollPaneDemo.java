/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

/**
 *
 * @author HP
 */
import java.awt.*;
import javax.swing.*;

public class ScrollPaneDemo {
    //-----------------------------------------------------------------
    //  Presents a frame containing a scroll pane used to view a large
    //  map of the Philadelphia subway system.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        // SEPTA = SouthEast Pennsylvania Transit Authority
        JFrame frame = new JFrame("Dhaka Map");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("dhaka.jpg");
        JLabel imageLabel = new JLabel(image);

        JScrollPane sp = new JScrollPane(imageLabel);
        sp.setPreferredSize(new Dimension(450, 400));

        frame.getContentPane().add(sp);
        frame.pack();
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }
}
