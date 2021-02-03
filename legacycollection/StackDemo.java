/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legacycollection;

import java.util.Enumeration;
import java.util.Stack;

/**
 *
 * @author HP
 */
class StackDemo {

    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Enumeration e1 = st.elements();
        while (e1.hasMoreElements()) {
            System.out.println(e1.nextElement() + " ");
        }
        st.pop();
        st.pop();
        System.out.println("After popping out element");
        
        Enumeration e2 = st.elements();
        while (e2.hasMoreElements()) {
            System.out.print(e2.nextElement() + " ");
        }
    }
}
