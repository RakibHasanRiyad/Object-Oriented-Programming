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
import javax.swing.event.*;

public class ListPanel extends JPanel {

    private JLabel label;
    private JList list;

    //-----------------------------------------------------------------
    //  Loads the list of image names into the list.
    //-----------------------------------------------------------------
    public ListPanel(JLabel imageLabel) {
        label = imageLabel;

        String[] fileNames = {"circuit.gif",
            "duke.gif",
            "hammock.gif",
            "justin.jpg",
            "kayla.jpg",
            "tiger.jpg",
            "toucan.gif",
            "dhaka.jpg",
            "worldmap.gif"};

        list = new JList(fileNames);
        list.addListSelectionListener(new ListListener());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(list);
        setBackground(Color.white);
    }

    //*****************************************************************
    //  Represents the listener for the list of images.
    //*****************************************************************
    private class ListListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
            if (list.isSelectionEmpty()) {
                label.setIcon(null);
            } else {
                String fileName = (String) list.getSelectedValue();
                ImageIcon image = new ImageIcon(fileName);
                label.setIcon(image);
            }
        }
    }
}
