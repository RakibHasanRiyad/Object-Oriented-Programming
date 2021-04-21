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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class LayoutDemo {
    //-----------------------------------------------------------------
    //  Sets up a frame containing a tabbed pane. The panel on each
    //  tab demonstrates a different layout manager.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);

        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Intro", new IntroPanel());
        tp.addTab("Flow", new FlowPanel());
        tp.addTab("Border", new BorderPanel());
        tp.addTab("Grid", new GridPanel());
        tp.addTab("Box", new BoxPanel());
        tp.addTab("Special Features", new SpecialFeature() );

        frame.getContentPane().add(tp);

        frame.pack();
        frame.setVisible(true);
    }
}

class IntroPanel extends JPanel {

    public IntroPanel() {
        setBackground(Color.green);
        add(new JLabel("Layout Manager Demonstration"));
        add(new JLabel("Choose a tab to see an example of a layout manager"));
    }
}

class FlowPanel extends JPanel {

    public FlowPanel() {
        setLayout(new FlowLayout());
        setBackground(Color.green);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        //JButton b6 = new JButton("Button 6");
        //JButton b7 = new JButton("Button 7");
        //JButton b8 = new JButton("Button 8");
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        //add(b6);
        //add(b7);
        //add(b8);
    }
}

class SpecialFeature extends JPanel {

    public SpecialFeature() {
        setLayout(new FlowLayout());
        setBackground(Color.green);
        JButton b1 = new JButton("Compute");
        b1.setToolTipText("Calculate size.");
        
        JButton b2 = new JButton("Mnemonic");
        b2.setMnemonic('C');
        
        JButton b3 = new JButton("Button 3");
        b3.setEnabled(false);
        
        
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
       
    }
}


class BorderPanel extends JPanel {

    public BorderPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.green);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.NORTH);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.WEST);
    }
}

class GridPanel extends JPanel {

    public GridPanel() {
        setLayout(new GridLayout(2, 3));
        setBackground(Color.green);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}

class BoxPanel extends JPanel {

    public BoxPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.green);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        b5.setEnabled(true);
        
        add(b1);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(b2);
        add(Box.createVerticalGlue());
        add(b3);
        add(b4);
        add(Box.createVerticalStrut(10));
        add(b5);
    }
}
