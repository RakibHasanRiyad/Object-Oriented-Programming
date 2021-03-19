/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legacycollection;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector ve = new Vector();
        ve.add(1);
        ve.add(2);
        ve.add(3);
        ve.add(4);
        ve.add(5);
        ve.add(6);
        Enumeration en = ve.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
